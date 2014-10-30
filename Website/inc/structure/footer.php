


	<footer id="footer" class="stripped-bg hidden-print">
		<div class="container pt50 pb20">
			<div class="row">
				<div class="col-md-3">
					<ul role="menu">
						<li role="menuitem">
							<a href="#section-presentation" class="f17 fB f-wh footer-link" role="link"><?php echo NAV_PRESENTATION; ?></a>
						</li>
						<li class="mt15" role="menuitem">
							<a href="#section-about" class="f17 fB f-wh footer-link" role="link"><?php echo NAV_ABOUT; ?></a>
							<ul role="menu">
								<li class="mt10" role="menuitem">
									<a href="#section-about" class="f15 f-gy-c footer-link trigger-about" data-trigger="0" role="link"><?php echo NAV_CONTACT; ?></a>
								</li>
								<li class="mt5" role="menuitem">
									<a href="#section-about" class="f15 f-gy-c footer-link trigger-about" data-trigger="1" role="link"><?php echo NAV_TEAM; ?></a>
								</li>
								<li class="mt5" role="menuitem">
									<a href="#section-about" class="f15 f-gy-c footer-link trigger-about" data-trigger="2" role="link"><?php echo NAV_LEGAL; ?></a>
								</li>
							</ul>
						</li>
						<li class="mt15" role="menuitem">
							<a href="#" class="f17 fB f-wh footer-link" target="_blank"><?php echo NAV_SIGN_2; ?></a>
						</li>
					</ul>
				</div><!-- .col-md-3 -->
				<div class="col-md-4 col-md-offset-5 ph0">
					<a href="#" class="media" target="_blank">
						<div class="pull-left">
							<div class="sprite icon-logo"></div>
						</div><!-- .pull-left-->
						<div class="media-body mt5">
							<h2 class="h-like-d f-wh"><?php echo NAV_CONNECT_2; ?> <span class="f-bl-a">edukera</span></h2>
							<p class="f12 f-wh mt5"><?php echo NAV_CONNECT_2_TXT; ?></p>
						</div><!-- .media-body -->
					</a><!-- .media -->
					<div class="mt40">
						<h3 class="f17 fB f-wh"><?php echo NAV_FOLLOW; ?></h3>
						<ul class="list-inline mt15" role="menu">
							<li class="mr20" role="menuitem">
								<a href="#" title="<?php echo TITLE_FOLLOW_1 ?> Facebook" class="sprite social-fb-a" role="link" target="_blank">
									<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Facebook</span>
								</a>
							</li>
							<li class="mr20" role="menuitem">
								<a href="#" title="<?php echo TITLE_FOLLOW_1 ?> LinkedIn" class="sprite social-in-a" role="link" target="_blank">
									<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> LinkedIn</span>
								</a>
							</li>
							<li class="mr20" role="menuitem">
								<a href="#" title="<?php echo TITLE_FOLLOW_1 ?> Google+" class="sprite social-gg-a" role="link" target="_blank">
									<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Google+</span>
								</a>
							</li>
							<li role="menuitem">
								<a href="#" title="<?php echo TITLE_FOLLOW_1 ?> Twitter" class="sprite social-tw-a" role="link" target="_blank">
									<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Twitter</span>
								</a>
							</li>
						</ul><!-- .list-inline -->
					</div>
				</div><!-- .col-md-4 -->
			</div><!-- .row -->
			<small class="f13 fC f-bl-a mt50"><?php echo NAV_COPYRIGHT; ?></small>
		</div><!-- .container -->

		<nav class="footer-lang">
			<div class="dropdown">
				<a data-toggle="dropdown" id="langLabel" class="dropdown-toggle" href="#"><?php echo $lang; ?></a>
				<ul class="dropdown-menu" role="menu" aria-labelledby="langLabel">
					<li><a href="<?php echo $url ?>?lang=fr">Français <small>Fr</small></a></li>
					<li><a href="<?php echo $url ?>?lang=en">Anglais <small>En</small></a></li>
				</ul><!-- .dropdown-menu -->
			</div><!-- .dropdown-->
		</nav><!-- .footer-lang-->

	</footer><!-- #footer -->

	<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
			</div><!-- .modal-content -->
		</div><!-- .modal-dialog -->
	</div><!-- .modal -->



</div><!-- .ie-wp-->

<!-- <div id="modal-loader">
   <img src="theme/img/sprite/loader.gif" alt="Loader">
</div>
     -->
<script src="theme/js/vendor/jquery-1.10.2.min.js"></script>
<script src="theme/js/vendor/jquery.carouFredSel-6.2.1.min.js"></script>
<script src="theme/js/vendor/jquery.touchSwipe.min.js"></script>
<script src="theme/js/vendor/jquery.validate.min.js"></script>
<script src="theme/js/vendor/jquery.waypoints-2.0.3.min.js"></script>
<script src="theme/js/vendor/googleapis.maps.min.js"></script>
<script src="theme/js/vendor/jquery.colorbox-min.js"></script>
<script src="theme/js/vendor/bootstrap.min.js"></script>
<script src="theme/js/global.js"></script>
    <script>
        var errorMail   = '<?php echo CONTACT_MAIL_ERROR ?>';
        var errorMsg    = '<?php echo CONTACT_MSG_ERROR ?>';
        var valid       = '<?php echo CONTACT_VALID ?>';
    </script>

</body>
</html>