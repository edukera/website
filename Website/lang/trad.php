<?php
if(empty($_GET['lang'])){
    $_SESSION['lang'] = "fr";
}else{
    switch($_GET['lang']){
        case "fr":
        $_SESSION['lang'] = "fr";
        break;
        case "en":
        $_SESSION['lang'] = "en";
        break;
    }
}
switch($_SESSION['lang']){
        case "fr":
        $fichier_langage = "lang/fichier_fr.php";
        break;
        case "en":
        $fichier_langage = "lang/fichier_en.php";
        break;
}
include($fichier_langage);
$lang = $_SESSION['lang'];
?>