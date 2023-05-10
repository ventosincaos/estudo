<?php
#INCLUI OS DOCUMENTOS CONN.PHP E FUNTCTION.PHP PARA QUE ELES POSSAM FUNFAR AQUI DENTRO
include $_SERVER['DOCUMENT_ROOT'] . '/PHP/grupo-aluno/conn/conn.php';
require_once $_SERVER['DOCUMENT_ROOT'] . '/PHP/grupo-aluno/conn/functions.php';

#CONEXÃO COM O BD
$p = new aluno("aluno", "localhost:3306", "root", "Rosa0107@Diaz");
?>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Editar Cadastro</title>
  <link href="../css/style.css" rel="stylesheet">

  <!-- BOOTSTRAP 5 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>

<body>
  <?php
  #SE O BOTÃO NÃO FOR APERTADO EXIBE O FORMULARIO COM BASE NAS INFORMAÇÕES DO ALUNO 
  if (!isset($_GET["bt_sub"])) {
    $id = $_GET["id"];
    #RECUPERA DADOS VIA FUNCTION LER PESSOA POR MEIO DA CHAVE PRIMARIA (ID)
    $aluno = $p->lerAluno($id)
  ?>
    <div class="container">
      <div class="update-wrap">
        <br>
        <header class="header">
          <h1 id="title" class="text-center">Atualizar Cadastro</h1>
          <p id="description" class="text-center">
            faça o cadastro do aluno abaixo
          </p>
        </header>

        <div class="form-wrap">

          <!-- form update -->
          <form id="update" action="" method="get">

            <div class="row">
              <label>
                <h5 class="text-left mb-4"><strong>dados pessoais</strong></h5>
              </label>
              <div class="col-md-8 mb-3">
                <input type="hidden" name="id" value="<?php echo $id ?>">
                <label class="form-label" for="nome">nome completo</label>
                <input type="text" class="form-control" name="nome" id="nome" placeholder="<?php echo $aluno["nome"]; ?>" value="<?php echo $aluno["nome"]; ?>">
              </div>
              <div class="col-md-4 mb-3">
                <label for="nome">cpf</label>
                <input type="text" class="form-control" name="cpf" id="cpf" placeholder="<?php echo $aluno["cpf"]; ?>" value="<?php echo $aluno["cpf"]; ?>">
              </div>
            </div>

            <div class="row">
              <div class="col-md-4 mb-3">
                <label class="form-label" for="dtnasc">data de nascimento</label>
                <input type="date" class="form-control" name="dt_nasc" id="dtnasc" placeholder="<?php echo $aluno["dt_nasc"]; ?>" value="<?php echo $aluno["dt_nasc"] ?>">
              </div>
              <div class="col-md-8 mb-3">
                <label class="form-label" for="endereco">endereço</label>
                <input type="text" class="form-control" name="endereco" id="endereco" placeholder="<?php echo $aluno["endereco"]; ?>" value="<?php echo $aluno["endereco"]; ?>">
              </div>
            </div>

            <div class="row">
              <label>
                <h5 class="text-left mb-4"><strong>informações do curso</strong></h5>
              </label>
              <div class="col-md-4 mb-3">
                <label for="dt_inicio" class="form-label">data de ingresso</label>
                <input type="date" class="form-control" id="dt_inicio" name="dt_inicio" placeholder="<?php echo $aluno["dt_inicio"]; ?>" value="<?php echo $aluno["dt_inicio"] ?>">
              </div>
              <div class="col-md-2 mb-3">
                <div class="form-group">
                  <label class="form-label">semestre</label>
                  <select id="dropdown" name="semestre" class="form-control" required>
                    <option value="<?php echo $aluno["semestre"]; ?>"><?php echo $aluno["semestre"]; ?>º</option>
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
                    <option value="<?php echo $aluno["curso"]; ?>"><?php echo $aluno["curso"]; ?></option>
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
              <button type="submit" name="bt_sub" value="Alterar" class="btn btn-primary">alterar cadastro</button>
            </div>
          </form>

        </div>
        <br><br>
      </div>

    </div>

  <?php

  } else {

    try {
      $id = $_GET["id"];
      $nome = $_GET["nome"];
      $cpf = $_GET["cpf"];
      $dt_nasc = $_GET["dt_nasc"]; # ano - mes - dia
      $endereco = $_GET["endereco"];
      $semestre = $_GET["semestre"];
      $dt_inicio = $_GET["dt_inicio"]; # ano - mes - dia
      $curso = $_GET["curso"];

      #aqui é usado o pdo pq é um objeto pdo mas se vc for no functions updateAluno -------
      $p->updateAluno($id, $nome, $cpf, $dt_nasc, $endereco, $semestre, $dt_inicio, $curso, $PDO);
      header('Location: ../pages-crud/form-crd.php');
    } catch (PDOException $e) {
      echo 'Erro: ' . $e->getMessage();
    }
  }

  ?>

</body>

</html>