<!--Footer-->
<footer id="contact" class="page-footer default_color scrollspy">
    <div  id="form" class="container">
        <div class="row">
            <div class="col l6 s12">
                <form class="col s12" action="" method="post">
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="icon_prefix" name="name" type="text" class="validate white-text">
                            <label for="icon_prefix" class="white-text"><?php echo FIRT_NAME; ?></label>
                        </div>
                        <div class="input-field col s6">
                            <input id="icon_email" name="email" type="email" class="validate white-text">
                            <label for="icon_email" class="white-text"><?php echo EMAIL; ?></label>
                        </div>
                        <div class="input-field col s12">
                            <textarea id="icon_prefix2" name="message" class="materialize-textarea white-text"></textarea>
                            <label for="icon_prefix2" class="white-text"><?php echo MESSAGE; ?></label>
                        </div>
                        <div class="col offset-s7 s5">
                            <button class="btn waves-effect waves-light darken-1" type="submit">
			      <?php echo SEND; ?>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col l3 s12">
              <h5 class="white-text" style="opacity:0">EMPTY</h5>
            </div>
            <div class="col l3 s12">
                <h5 class="white-text">
		  <?php echo SOCIAL; ?>
		</h5>
                <ul>
                    <li>
                      <a class="white-text" href="<?php echo TWITTER_URL; ?>" target="_blank">
                        Twitter
                      </a>
                    </li>
                    <li>
                      <a class="white-text" href="<?php echo GOOGLEPLUS_URL; ?>" target="_blank">
                        Google+
                      </a>
                    </li>
                    <li>
                      <a class="white-text" href="<?php echo LINKEDIN_URL; ?>" target="_blank">
                        Linkedin
                      </a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="legal-container">
      <span class="legal-copyright" >© edukera 2013-2018 - <a class="legal-link" href="<?php echo LEGAL_LINK; ?>" target="_blank"><?php echo LEGAL_TEXT; ?></a> - <a class="legal-link" href="<?php echo TAC_LINK; ?>" target="_blank"><?php echo TAC_TEXT; ?></a></span>
    </div>
</footer>
