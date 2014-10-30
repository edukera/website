<?php

// Email du destinataire
$destinataire  = 'jeremie.maquet@gmail.com';

// Nettoyer et enregistrer ke texte
function Rec($text){
    $text = htmlspecialchars(trim($text), ENT_QUOTES);
    if (1 === get_magic_quotes_gpc()){
        $text = stripslashes($text);
    }
    $text = nl2br($text);
    return $text;
};

// Vérififer syntaxe de l'email
function IsEmail($email){
    $value = preg_match('/^(?:[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+\.)*[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+@(?:(?:(?:[a-zA-Z0-9_](?:[a-zA-Z0-9_\-](?!\.)){0,61}[a-zA-Z0-9_-]?\.)+[a-zA-Z0-9_](?:[a-zA-Z0-9_\-](?!$)){0,61}[a-zA-Z0-9_]?)|(?:\[(?:(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\.){3}(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\]))$/', $email);
    return (($value === 0) || ($value === false)) ? false : true;
}

// Récupération des variables du formulaire
$email     = (isset($_POST['email']))     ? Rec($_POST['email'])     : '';
$message   = (isset($_POST['msg']))   ? Rec($_POST['msg'])   : '';


// Vérification de la syntaxe de l'email
$email = (IsEmail($email)) ? $email : ''; // soit l'email est vide si erroné, soit il vaut l'email entré
$err_formulaire = false; // sert pour remplir le formulaire en cas d'erreur si besoin

// Subjet
$subject = 'Un message vous a été envoyé à partir du site Internet http://www.edukera.com';

// Corps du message
$body     ='';
$body    .= "<span style='text-decoration:underline'>Email</span> <br/><br/> ".$email. "<br/><br/>--<br/><br/>";
$body    .= "<span style='text-decoration:underline'>Message</span> <br/><br/>".$message;

//Headers
$headers  = '';
$headers  = 'MIME-Version: 1.0' . "\n";
$headers .= 'Content-type: text/html; charset=UTF-8' . "\n"; 
$headers .= 'From: Edukera' . "\r\n";        

    if ($_POST['submit']) {
        if (($email != '') && ($message != '')){
            // Envoi du mail
            if (mail($destinataire, $subject, $body, $headers)){
                $form_feedback = '<div class="alert alert-success mb15">'.CONTACT_OK.'</div>';
            }
            else{
                $form_feedback = '<div class="alert alert-danger mb15">'.CONTACT_KO.'</div>';
            };
        }
        else{
            // Si un des 3 champs n'est pas rempli
            $form_feedback = '<div class="alert alert-warning mb15">'.CONTACT_INVALID.'</div>';
            $err_formulaire = true;
        };
    }


?>