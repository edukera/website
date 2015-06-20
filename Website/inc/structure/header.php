<?php $url = $_SERVER['PHP_SELF']; ?>
<?php require_once('google/appengine/api/mail/Message.php'); ?>
<?php include_once('lang/trad.php'); ?>
<?php include_once('trait/mail.php'); ?>
<!doctype html>
<!--[if lte IE 7]> <html lang="<?php echo $lang; ?>" class="ie7 old-ie no-js"> <![endif]-->
<!--[if (IE 8)&!(IEMobile)]> <html lang="<?php echo $lang; ?>" class="old-ie no-js"> <![endif]-->
<!--[if (gt IE 8)&!(IEMobile)]><!--> <html lang="<?php echo $lang; ?>" class="no-js" > <!--<![endif]-->

  <head>
    <meta charset="utf-8" />
    <title><?php echo PAGE_TITLE; ?></title>
    <meta name="description" content="<?php echo PAGE_DESC; ?>" />
    <meta name="viewport" content="width=1080" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <link href="theme/img/icons/apple-touch-icon-57x57.png" sizes="57x57" rel="apple-touch-icon" />
    <link href="theme/img/icons/apple-touch-icon-72x72.png" sizes="72x72" rel="apple-touch-icon" />
    <link href="theme/img/icons/apple-touch-icon-114x114.png" sizes="114x114" rel="apple-touch-icon" />
    <link href="theme/img/icons/apple-touch-icon-144x144.png" sizes="144x144" rel="apple-touch-icon" />
    <link rel="icon" type="image/png" href="theme/img/icons/favicon.png">
    <link rel="stylesheet" href="theme/css/vendor/bootstrap.min.css"/>
    <link rel="stylesheet" href="theme/css/global.css"/>
  </head>

  <body role="document">

    <div id="ancreTop">
    </div><!-- #ancreTop -->

    <!--     <ul class="skip-links">
	     <li><a href="#header-top" data-anchor="rating">Rate your school</a></li>
	     <li><a href="#header-top" data-anchor="account">My account</a></li>
	     <li><a href="#header-nav" data-anchor="nav">Go to menu</a></li>
	     <li><a href="#main" data-anchor="main">Go to content</a></li>
    </ul> -->
    <!-- .skip-links -->

    <div id="ie-fallback">
      <a href="http://windows.microsoft.com/fr-fr/internet-explorer/download-ie" title="Mettre à jour Internet Explorer" id="ie-box"></a>
    </div><!-- #ie-fallback -->

    <div class="ie-wp">
      <header id="header" role="banner" class="hidden-print">
	<div class="container">
	  <div class="row">

	    <div class="logo-header-wrapper">
	      <div class="col-md-2 logo-header-content">
		<a href="#section-top" title="<?php echo TITLE_BACK_TOP; ?>" role="link">
		  <img src="theme/img/icons/logo.png" width="154" alt="Logotype Edukera">
		</a>
	      </div><!-- .col-md-2-->
	    </div><!-- .logo-header-wrapper-2-->

	    <div class="col-md-6 col-md-offset-1 tab-header">
	      <ul class="list-inline f-wh f17 fB mt5" role="menu">
		<li class="mr50" role="menuitem">
		  <a href="#section-presentation" class="header-link skip-link" role="link" style="color:whitesmoke"><?php echo NAV_PRESENTATION; ?></a>
		</li>
		<li class="mr50" role="menuitem">
		  <a href="#section-about" class="header-link skip-link" role="link" style="color:whitesmoke"><?php echo NAV_ABOUT; ?></a>
		</li>
	      </ul><!-- .list-inline -->
	    </div><!-- .col-md-6-->

	    <a href="https://edukera.appspot.com" target="_blank" class="btn-connect" role="link"><?php echo NAV_CONNECT_1; ?></a>
	    <!-- <div class="btn-connect" role="link"><?php echo NAV_CONNECT_1; ?></div>-->
	  </div><!-- .row -->
	</div><!-- .container -->
      </header><!-- #header -->
