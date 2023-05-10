<?php
#INCLUI OS DOCUMENTOS CONN.PHP E FUNTCTION.PHP PARA QUE ELES POSSAM FUNFAR AQUI DENTRO
include $_SERVER['DOCUMENT_ROOT'] . '/PHP/grupo-aluno/conn/conn.php';
require_once $_SERVER['DOCUMENT_ROOT'] . '/PHP/grupo-aluno/conn/functions.php';

#CONEXÃO COM O BD
$p = new aluno("aluno", "localhost:3306", "root", "Rosa0107@Diaz");

ob_start(); // inicia o buffer de saída

?>
<!DOCTYPE html>
<html lang="pt-br">

<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Cadastro aluno</title>

   <link href="../css/style.css" rel="stylesheet">

   <!-- BOOTSTRAP 5 -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>

<body>
   <div class="container">
      <?php
      #SE O BOTÃO NÃO FOR APERTADO EXIBE O FORMULARIO DE CADASTRO
      if (!isset($_POST["bt_sub"])) {
      ?>
         <div class="page-wrap">
            <br>
            <header class="header">
               <h1 id="title" class="text-center">Dados e Cadastro de Alunos</h1>
               <p id="description" class="text-center">
                  faça o cadastro do aluno abaixo e consulte a tabela em seguida
               </p>
            </header>
            <div class="form-wrap d-flex justify-content-center">

               <!-- FORMULARIO EM POST = MANDAR -->
               <form id="cadastro" action="" method="POST">

                  <div class="row">
                     <label>
                        <h5 class="text-left mb-4"><strong>dados pessoais</strong></h5>
                     </label>
                     <div class="col-md-8 mb-3">
                        <label class="form-label" for="nome">nome completo</label>
                        <input type="text" class="form-control" name="nome" id="nome" placeholder="escreva seu nome" required>
                     </div>
                     <div class="col-md-4 mb-3">
                        <label class="form-label" for="cpf">CPF</label>
                        <input type="text" class="form-control" name="cpf" id="cpf" placeholder="000.000.000-00" required>
                     </div>
                  </div>
                  <div class="row">
                     <div class="col-md-4 mb-3">
                        <label class="form-label" for="dtnasc">data de nascimento</label>
                        <input type="date" class="form-control" name="dt_nasc" id="dtnasc" required>
                     </div>
                     <div class="col-md-8 mb-3">
                        <label class="form-label" for="endereco">endereço</label>
                        <input type="text" class="form-control" name="endereco" placeholder="avenida, rua, rodovia..." id="endereco" required>
                     </div>
                  </div>

                  <div class="row">
                     <label>
                        <h5 class="text-left mb-4"><strong>informações do curso</strong></h5>
                     </label>
                     <div class="col-md-4 mb-3">
                        <label for="dt_inicio" class="form-label">data de ingresso</label>
                        <input type="date" class="form-control" id="dt_inicio" name="dt_inicio" required>
                     </div>
                     <div class="col-md-2">
                        <div class="form-group">
                           <label class="form-label">semestre</label>
                           <select id="dropdown" name="semestre" class="form-control" required>
                              <option disabled selected value>selecione</option>
                              <option value="1">1º</option>
                              <option value="2">2º</option>
                              <option value="3">3º</option>
                              <option value="4">4º</option>
                              <option value="5">5º</option>
                              <option value="6">6º</option>
                           </select>
                        </div>
                     </div>
                     <div class="col-md-6 mb-3">
                        <div class="form-group">
                           <label class="form-label">curso</label>
                           <select id="dropdown" name="curso" class="form-control" required>
                              <option disabled selected value>selecione</option>
                              <option value="análise e desenvolvimento de sistemas">análise e desenvolvimento de sistemas</option>
                              <option value="ciência de dados">ciência de dados</option>
                              <option value="gestão de tecnologia da informação">gestão de tecnologia da informação</option>
                              <option value="segurança da informação">segurança da informação</option>
                              <option value="tecnologia em banco de dados">tecnologia em banco de dados</option>
                           </select>
                        </div>
                     </div>
                  </div>

                  <div class="mb-4 d-flex justify-content-center">
                     <button type="submit" name="bt_sub" class="btn btn-primary">cadastrar</button>
                  </div>

               <?php
               #FECHA O IF PRA MOSTRAR O FORM E INVOCA O ELSE SE ELE FOR APERTADO
            } else {
               #NAME= POST DO ATRIBUTO, RECUPERA OS VALORES
               $nome = $_POST["nome"];
               $cpf = $_POST["cpf"]; #14 DIGITOS PRA PODER TER PONTO
               $dt_nasc = $_POST["dt_nasc"]; # ano - mes - dia
               $endereco = $_POST["endereco"];
               $semestre = $_POST["semestre"];
               $dt_inicio = $_POST["dt_inicio"]; # ano - mes - dia
               $curso = $_POST["curso"];

               #SE O ELSE FOR, TU TENTA IMPLEMENTAR ESSE CODIGO AI NO SQL BEM MANEIRINHO
               #E USA ESSES VALUES REFERENTES AI
               try {
                  $sql = 'INSERT INTO `aluno`.`aluno` (`nome`,`cpf`,`dt_nasc`,`endereco`,`semestre`,`dt_inicio`,`curso`)  
                  VALUES (:nome,:cpf,:dt_nasc,:endereco,:semestre,:dt_inicio,:curso);';


                  $stmt = $PDO->prepare($sql); #CONSULTA PRA VER SE OS TROÇO BATE

                  #VINCULA OS DADOS PASSADOS O : É DO SQL MSM E O $ É SÓ PRA DEFINIR OQ VAI PRO :
                  #ESTILO UM: "SMT! COM + UM T -> ASSIMILA ISSO PRA MIM (':EU_VOU_PRO_SERASA', $EU_SOU_O_VALOR_Q_MANDAM_PRO_SERASA)
                  $stmt->bindParam(':nome', $nome);
                  $stmt->bindParam(':cpf', $cpf);
                  $stmt->bindParam(':dt_nasc', $dt_nasc);
                  $stmt->bindParam(':endereco', $endereco);
                  $stmt->bindParam(':semestre', $semestre);
                  $stmt->bindParam(':dt_inicio', $dt_inicio);
                  $stmt->bindParam(':curso', $curso);
                  $stmt->execute();

                  #SE A CONTAGEM DO SMT FOR 0 (INPUT JÁ ENVIADO) RETORNA PRA PAGINA
                  if ($stmt->rowCount() > 0) {
                     header('Location: ../pages-crud/form-crd.php');
                     exit();
                  }
               } catch (PDOException $e) {
                  echo 'Erro no banco de dados' . $e->getMessage();
               } catch (Exception $e) {
                  echo 'Erro generico' . $e->getMessage();
               }
            }
               ?>
               </form>
            </div>

            <br><br><br>

            <!-- A TABLE MAIS ODIADA -->
            <div class="table-responsive table-wrap">
               <h4 class="text-center mb-4">alunos cadastrados</h4>
               <table class="table table-bordered table-hover">
                  <thead>
                     <tr>
                        <th scope="col">Nome</th>
                        <th scope="col">CPF</th>
                        <th scope="col">Data de Nascimento</th>
                        <th scope="col">Endereço</th>
                        <th scope="col">Semestre</th>
                        <th scope="col">Data de Ingresso</th>
                        <th scope="col">Curso</th>
                        <th scope="col">Opções</th>
                     </tr>
                  </thead>
                  <tbody>

                     <?php
                     #VAI PROCURAR OS DADOS DE P (OQ ABRIO A CONEXÃO COM O BANCO) E FAZ O FAVOR DE USAR A FUNÇÃO AI
                     $dados = $p->buscarDados();
                     #SE A CONTA FOR MAIOR Q 0 VAI TER UMA TABLE AUTOMATICA ESTILO VINICIUS13
                     if (count($dados) > 0) {
                        for ($i = 0; $i < count($dados); $i++) {
                           echo "<tr>";
                           #PRA CADA LINHA DE DADO VAI REPETIR PRA DAR A TABELINHA
                           foreach ($dados[$i] as $key => $value) {
                              if ($key != "id") {
                                 echo "<td>" . $value . "</td>";
                              }
                           }
                     ?>
                           <td>

                              <!-- OS <A> É PRA CONSEGUIR LINKAR PAGINA PRA CARREGAR COM O id
                  PQ SEM ISSO NÃO DÁ PRA EXCLUIR BB -->
                              <a class="a-dois" href="../pages-crud/form-crd.php?id=<?php echo $dados[$i]['id']; ?>">
                                 <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                    <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5Zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6Z" />
                                    <path d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1ZM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118ZM2.5 3h11V2h-11v1Z" />
                                 </svg>
                              </a>
                              <?php
                              #SE A VARIAVEL ID(CHAVINHA BURRA) ESTIVER LÁ E NÃO FOR VAZIA
                              if (isset($_GET['id']) && !empty($_GET["id"])) {
                                 $id = addslashes($_GET['id']);
                                 $p->excluirAluno($id);
                                 header('Location: ../pages-crud/form-crd.php');
                                 exit(); // Encerra o script para garantir que a exclusão seja registrada
                              }
                              ?>
                              <a class="a-dois" href="../pages-crud/form-u.php?id=<?php echo $dados[$i]['id']; ?>">
                                 <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-input-cursor-text" viewBox="0 0 16 16">
                                    <path fill-rule="evenodd" d="M5 2a.5.5 0 0 1 .5-.5c.862 0 1.573.287 2.06.566.174.099.321.198.44.286.119-.088.266-.187.44-.286A4.165 4.165 0 0 1 10.5 1.5a.5.5 0 0 1 0 1c-.638 0-1.177.213-1.564.434a3.49 3.49 0 0 0-.436.294V7.5H9a.5.5 0 0 1 0 1h-.5v4.272c.1.08.248.187.436.294.387.221.926.434 1.564.434a.5.5 0 0 1 0 1 4.165 4.165 0 0 1-2.06-.566A4.561 4.561 0 0 1 8 13.65a4.561 4.561 0 0 1-.44.285 4.165 4.165 0 0 1-2.06.566.5.5 0 0 1 0-1c.638 0 1.177-.213 1.564-.434.188-.107.335-.214.436-.294V8.5H7a.5.5 0 0 1 0-1h.5V3.228a3.49 3.49 0 0 0-.436-.294A3.166 3.166 0 0 0 5.5 2.5.5.5 0 0 1 5 2z" />
                                    <path d="M10 5h4a1 1 0 0 1 1 1v4a1 1 0 0 1-1 1h-4v1h4a2 2 0 0 0 2-2V6a2 2 0 0 0-2-2h-4v1zM6 5V4H2a2 2 0 0 0-2 2v4a2 2 0 0 0 2 2h4v-1H2a1 1 0 0 1-1-1V6a1 1 0 0 1 1-1h4z" />
                                 </svg>
                              </a>
                           </td>
                     <?php
                           echo "</tr>";
                        }
                     } else {
                        echo "<tr><td colspan='6'>Nenhuma pessoa cadastrada.</td></tr>";
                     }
                     ?>
                  </tbody>
               </table>
            </div>
         </div>
   </div>

</body>
<?php
ob_end_flush(); // Envia o conteúdo do buffer para o navegador e libera a memória usada pelo buffer
?>
</html>