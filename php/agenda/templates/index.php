<?php
    include_once("../config/url.php");
?>

<?php
    include_once("header.php");
?>

<?php
    include_once("footer.php");
?>

    <html lang="pt_BR">

    <head>
    <meta charset="UTF-8">

        <title>Agenda de Contatos</title>
        <!-- link do bootstrap -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.3/js/bootstrap.min.js">
        <!-- link do icone -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
        <!-- link do css -->
        <link rel="stylesheet" href="<?=$BASE_URL?>/../css/style.css">
    
    </head>

        <body>

        <div class="container">

            <h1 id="main-title"> Minha Agenda </h1>
            <?php if(count($AllContatos) > 0);?>
            <p> Há contatos </p>
            <?php else:?>
            <p id="empty-list-text"> Não há contatos
                <a href="<?">



        </div>

        </body>

    </html>
