<?php

	header('Content-Type: text/html; charset=utf-8');

	$dados_do_formulario_json = file_get_contents('dados_do_formulario.json');
	$dados_do_formulario = json_decode($dados_do_formulario_json, true);

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>Dados dos Formularios</title>
	
	<style>
		
		body {
			font-family: Arial, sans-serif;
			background-color: rgba(226, 226, 226, 0.555);
		}

		h1 {
			color: #333;
			text-align: center;
			margin-top: 50px;
		}

		table {
			margin: 0 auto;
			max-width: 800px;
			background-color: #FFF;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
			margin-bottom: 20px;
		}

		th, td {
			padding: 8px;
			text-align: left;
			border-bottom: 1px solid #ddd;
		}

		th {
			font-weight: bold;
			background: rgba(226, 226, 226, 0.555);
			border-top-left-radius: 7px;
			border-top-right-radius: 7px;
		}

	</style>

</head>

    <body>

        <h1>Dados dos Formulários</h1>
        <table>

            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Data de Nasc.</th>
                    <th>Endereço</th>
                    <th>Curso</th>
                    <th>Matrícula</th>
                </tr>
            </thead>
            
            <tbody>
                <?php foreach ($dados_do_formulario as $formulario): ?>
                    <tr>
                        <td><?php echo $formulario['nome']; ?></td>
                        <td><?php echo $formulario['data_nascimento']; ?></td>
                        <td><?php echo $formulario['endereco']; ?></td>
                        <td><?php echo $formulario['curso']; ?></td>
                        <td><?php echo $formulario['matricula']; ?></td>
                    </tr>
                <?php endforeach; ?>
            </tbody>

        </table>

    </body>

</html>