<?php
try {
    #cria conexão com o bd e armazena as configurações
$PDO = new PDO("mysql:dbname=aluno;host=localhost:3306","root","Rosa0107@Diaz");
//echo 'conexão ok <br>';
}
catch (PDOException $e) {
    echo "error: com banco de dados" . $e->getMessage();
}
catch (Exception $e) {
    echo "error generico" . $e->getMessage();;
}
