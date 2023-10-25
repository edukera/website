<?php

if (empty($_GET['lang'])) {
    $language = substr($_SERVER['HTTP_ACCEPT_LANGUAGE'], 0, 2);
    switch ($language){
    case "fr":
        $_SESSION['lang'] = "fr";
        break;
    default:
        $_SESSION['lang'] = "en";
        break;
    }
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
