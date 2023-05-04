<?php
   include "../conn/conn.php";
   require_once '../conn/functions.php';
   $p = new Pessoas("agenda", "localhost:3307", "root", "");
?>
<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Editar Cadastro</title>
      <link rel="stylesheet" type="text/css" href="estilo2.css">
   </head>
   <body>
   <?php

    if (!isset($_GET["bt_sub"])) {
        $id_pessoa = $_GET["id_pessoa"];
        $pessoa = $p->lerPessoa($id_pessoa);
        var_dump($pessoa);
    ?>
      <form  action="" method="get">
        <input type="hidden" name="id_pessoa" value="<?php echo $id_pessoa ?>">
        <label for="nome">Nome</label>
        <input type="text" name="ds_nome" id="nome" value="<?php echo $pessoa["ds_nome"]; ?>" >
        <br>
        <input type="radio" name="cd_sexo" id="masc" value="M" <?php echo $pessoa["cd_sexo"]=="M"?"checked":"" ?> >
        <label for="masc">Masculino</label>
        <input type="radio" name="cd_sexo" id="fem" value="F" <?php echo $pessoa["cd_sexo"]=="F"?"checked":"" ?> >
        <label for="fem">Feminino</label>
        <input type="radio" name="cd_sexo" id="ndef" value="N" <?php echo $pessoa["cd_sexo"]=="N"?"checked":"" ?> >
        <label for="ndef">Prefiro não informar</label>
        <br>
        <label for="dtnasc">Data Nascimento</label>
        <input type="date" name="dt_nasc" id="dtnasc" value="<?php echo $pessoa["dt_nasc"] ?>">
        <br>
        <label for="email">E-mail</label>
        <input type="text" name="ds_email" id="email" value="<?php echo $pessoa["ds_email"] ?>">
        <br>
        <label for="telefone">Telefone</label>
        <input type="text" name="nr_telefone" id="telefone"  value="<?php echo $pessoa["nr_telefone"] ?>">
        <br>
        <input type="submit" name="bt_sub" value="Alterar">
      </form>

    <?php

    } else {
  
      try {
        $id_pessoa = $_GET["id_pessoa"];
        $ds_nome = $_GET["ds_nome"];
        $cd_sexo = $_GET["cd_sexo"];
        $dt_nasc = $_GET["dt_nasc"]; # ano - mes - dia
        $nr_telefone = $_GET["nr_telefone"];
        $ds_email = $_GET["ds_email"];
    
        $p->updatePessoa($id_pessoa, $ds_nome, $cd_sexo, $dt_nasc, $nr_telefone, $ds_email, $PDO);
    } catch(PDOException $e) {
        echo 'Erro: ' . $e->getMessage();
    }
  }
    
    ?>

   </body>
</html>