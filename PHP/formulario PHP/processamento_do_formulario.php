<?php

    header('Content-Type: text/html; charset=utf-8');

    if ($_SERVER['REQUEST_METHOD'] === 'POST') {

            $nome = $_POST['nome'];
            $data_nascimento = $_POST['data_nascimento'];
            $endereco = $_POST['endereco'];
            $curso = $_POST['curso'];
            $matricula = $_POST['matricula'];

        $dados_do_formulario_json = file_get_contents('dados_do_formulario.json');
        $dados_do_formulario = json_decode($dados_do_formulario_json, true);

            $novo_formulario = array(
                'nome' => $nome,
                'data_nascimento' => $data_nascimento,
                'endereco' => $endereco,
                'curso' => $curso,
                'matricula' => $matricula);

            $dados_do_formulario[] = $novo_formulario;

        $dados_do_formulario_json = json_encode($dados_do_formulario);

        $arquivo = fopen('dados_do_formulario.json', 'w');
        fwrite($arquivo, $dados_do_formulario_json);
        fclose($arquivo);

    }
    
?>
