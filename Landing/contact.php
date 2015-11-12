<?php require_once('google/appengine/api/mail/Message.php'); ?>

<?php

use \google\appengine\api\mail\Message;

// Nettoyer et enregistrer ke texte
function Rec($text){
    $text = trim($text);
    if (1 === get_magic_quotes_gpc()){
        $text = stripslashes($text);
    }
    return $text;
};

// Vérififer syntaxe de l'email
function IsEmail($email){
    $value = preg_match('/^(?:[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+\.)*[\w\!\#\$\%\&\'\*\+\-\/\=\?\^\`\{\|\}\~]+@(?:(?:(?:[a-zA-Z0-9_](?:[a-zA-Z0-9_\-](?!\.)){0,61}[a-zA-Z0-9_-]?\.)+[a-zA-Z0-9_](?:[a-zA-Z0-9_\-](?!$)){0,61}[a-zA-Z0-9_]?)|(?:\[(?:(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\.){3}(?:[01]?\d{1,2}|2[0-4]\d|25[0-5])\]))$/', $email);
    return (($value === 0) || ($value === false)) ? false : true;
}



    function died($error) {

        // your error code can go here

        echo "We are very sorry, but there were error(s) found with the form you submitted. ";

        echo "These errors appear below.<br /><br />";

        echo $error."<br /><br />";

        echo "Please go back and fix these errors.<br /><br />";

        die();

    }


if(isset($_POST['email'])) {

    if(!isset($_POST['email']) ||

        !isset($_POST['message'])) {

        died('We are sorry, but there appears to be a problem with the form you submitted.');

    }

// Sender email
$sender  = 'noreply@edukera.com';

// Email du destinataire
$destinataire  = 'contact@edukera.com';


// Récupération des variables du formulaire
$email     = (isset($_POST['email']))     ? Rec($_POST['email'])     : '';
$message   = (isset($_POST['message']))   ? Rec($_POST['message'])   : '';
$name      = (isset($_POST['name']))   ? Rec($_POST['name'])   : '';


// Vérification de la syntaxe de l'email
$email = (IsEmail($email)) ? $email : ''; // soit l'email est vide si erroné, soit il vaut l'email entré
$err_formulaire = false; // sert pour remplir le formulaire en cas d'erreur si besoin

// Subjet
$subject = '[WEBSITE] message de '.$email;

// Corps du message
$body     ='';
$body    .= "Email:  ".$email. "\n";
$body    .= "Message from ".$name.":\n".$message;

//Headers
$headers  = '';
$headers  = 'MIME-Version: 1.0' . "\n";
$headers .= 'Content-type: text/html; charset=UTF-8' . "\n";
$headers .= 'From: Edukera' . "\r\n";


    if (($email != '') && ($message != '')){
        try
            {
                $message = new Message();
                $message->setSender($sender);
                $message->addTo($destinataire);
                $message->setSubject($subject);
                $message->setTextBody($body);
                $message->send();
                $form_feedback = '<div class="alert alert-success mb15">'.CONTACT_OK.'</div>';
            } catch (InvalidArgumentException $e) {
                $form_feedback = '<div class="alert alert-danger mb15">'.CONTACT_KO.'</div>';
        }
    }
    else{
        // Si un des 3 champs n'est pas rempli
        $form_feedback = '<div class="alert alert-warning mb15">'.CONTACT_INVALID.'</div>';
        $err_formulaire = true;
    };





?>



<?php

}

?>