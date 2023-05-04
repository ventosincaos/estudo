<?php

class Pessoas {
    private $pdo;

    public function __construct($dbname, $host, $user, $senha)
    {
            try {
                $this->pdo = new PDO("mysql:dbname=".$dbname.";host=".$host,$user,$senha);
            } 
            catch (PDOException $e) {
                echo "error: com banco de dados" . $e->getMessage();
            }
            catch (Exception $e) {
                echo "error generico" . $e->getMessage();
            }
    }

        public function lerPessoa($id_pessoa){

            $sql = 'select ds_nome, ds_email, dt_nasc, cd_sexo, nr_telefone from pessoas where id_pessoa = :id_pessoa';
        
            $statement = $this->pdo->prepare($sql);
            $statement->bindParam(':id_pessoa', $id_pessoa);
            $statement->execute();
            $p = $statement->fetch(PDO::FETCH_ASSOC);
            echo 'LerPessoa<br>';
            var_dump($p);
            return $p;
        }
        public function  buscarDados(){
                    {
                        $res = array();
                        $cmd = $this->pdo->query("SELECT * FROM pessoas ORDER BY ds_nome");
                        $res = $cmd->fetchAll(PDO::FETCH_ASSOC);
                        return $res;
                    }
                }
        public function excluirPessoa($id_pessoa){
                        $cmd = $this->pdo->prepare("DELETE FROM pessoas WHERE id_pessoa=:id_pessoa");
                        $cmd->bindValue(":id_pessoa",$id_pessoa);
                        $cmd->execute();
                    
                }

        public function updatePessoa($id_pessoa, $ds_nome, $cd_sexo, $dt_nasc, $nr_telefone, $ds_email, $conn) {
            try {
                $sql = 'UPDATE pessoas ' .
                        'SET ds_nome = :ds_nome,'.
                        ' ds_email = :ds_email,'.
                        ' dt_nasc = :dt_nasc,'.
                        ' cd_sexo = :cd_sexo,'.
                        ' nr_telefone = :nr_telefone'.
                        ' WHERE `id_pessoa` = :id_pessoa';

                $stmt = $conn->prepare($sql);
                $stmt->bindParam(':ds_nome', $ds_nome);
                $stmt->bindParam(':cd_sexo', $cd_sexo);
                $stmt->bindParam(':dt_nasc', $dt_nasc);
                $stmt->bindParam(':nr_telefone', $nr_telefone);
                $stmt->bindParam(':ds_email', $ds_email);
                $stmt->bindParam(':id_pessoa', $id_pessoa);
                $stmt->execute();
                
                if ($stmt->rowCount()>0) {
                    echo "<p>Registro atualizado com sucesso</p>"; 
                    header('Location: form.php');
                } else {
                    echo 'aqui';
                }
                } catch(PDOException $e) {
                echo 'Erro: ' . $e->getMessage();
                }
        }
}
?>