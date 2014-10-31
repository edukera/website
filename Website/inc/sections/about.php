<section class="section-wp about-bg" role="region">
	<div class="anchor" id="section-about"></div>
	<a href="#section-about" class="sprite icon-arrow-section"></a>
	<div class="container">
		<header class="col-md-12">
			<h2 class="h-like-c f-gy-b"><?php echo ABOUT_TITLE; ?></h2>
		</header>
		<div class="col-md-12">
			<ul id="about-tab" class="d-inbl v-m mt30 mb50" role="tablist">
				<li class="mr30 active">
					<a href="#contact" role="tab" data-toggle="tab"><?php echo NAV_CONTACT; ?></a></li>
				<li class="mr30">
					<a href="#team" role="tab" data-toggle="tab"><?php echo NAV_TEAM; ?></a>
				</li>
				<li>
					<a href="#legal" role="tab" data-toggle="tab"><?php echo NAV_LEGAL; ?></a>
				</li>
			</ul><!-- .tab-nav -->
			<div class="tab-content pv0">
				<div class="anchor" id="section-about-tab"></div>
				<div class="tab-pane pv0 fade in active" id="contact">
					<h3 class="h-like-i f-bl-a"><?php echo CONTACT_TITLE; ?></h3>
					<div class="row mt50">
						<div class="col-md-6 pl60">
							<?php echo $form_feedback ?>
							<form action="index.php#contact" method="post" enctype="multipart/form-data" novalidate="novalidate"  class="form-validator" role="form">
								<div>
									<input type="email" name="email" id="email" placeholder="<?php echo CONTACT_MAIL; ?>" class="form-control form-sm">
								</div>
								<div class="mt10">
									<textarea name="msg" id="msg" rows="5" placeholder="<?php echo CONTACT_MSG; ?>" class="form-control"></textarea>
								</div>
								<div class="mt15">
									<input type="submit" name="submit" class="fUpp f-bl-a f14 fB" role="button" value="<?php echo CONTACT_SUBMIT; ?>">
								</div>
							</form>
						</div><!-- .col-md-6 -->
						<div class="col-md-5 col-md-offset-1">
							<aside class="pull-right pr40">
								<a href="mailto:contact@edukera.com" class="d-inbl v-m btn-mail" target="_blank">
									<span class="sprite icon-contact"></span>
									<span class="f19 f-gy-b ml5">contact@edukera.com</span>
								</a>
								<div class="mt40 hidden-print">
									<h3 class="h-like-f f-gy-b"><?php echo CONTACT_FOLLOW; ?></h3>
									<ul class="list-inline mt15" role="menu">
<!--										<li class="mr20" role="menuitem">
											<a href="#" title="<?php echo TITLE_FOLLOW_1 ?> Facebook" class="sprite social-fb-a" role="link" target="_blank">
												<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Facebook</span>
											</a>
										</li> -->
										<li class="mr20" role="menuitem">
											<a href="http://www.linkedin.com/company/edukera?trk=prof-0-ovw-curr_pos" title="<?php echo TITLE_FOLLOW_1 ?> LinkedIn" class="sprite social-in-a" role="link" target="_blank">
												<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> LinkedIn</span>
											</a>
										</li>
										<li class="mr20" role="menuitem">
											<a href="https://plus.google.com/u/0/b/108941836539544483457/108941836539544483457/posts/" title="<?php echo TITLE_FOLLOW_1 ?> Google+" class="sprite social-gg-a" role="link" target="_blank">
												<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Google+</span>
											</a>
										</li>
										<li role="menuitem">
											<a href="https://twitter.com/edukera" title="<?php echo TITLE_FOLLOW_1 ?>Twitter" class="sprite social-tw-a" role="link" target="_blank">
												<span class="sr-only"><?php echo TITLE_FOLLOW_1 ?> Twitter</span>
											</a>
										</li>
									</ul><!-- .list-inline -->
								</div>
							</aside><!-- .pull-right -->
						</div><!-- .col-md-5 -->
					</div><!-- .row -->
					<div class="mt50">
						<div class="about-map">
							<div id="edukera-map" class="map hidden-print" data-zoom="16" data-lat="48.8836226" data-lng="2.2630228"></div>
							<div class="bg-gy-a pa15">
								<address class="h-like-f f-gy-b fC"><?php echo CONTACT_ADDRESS; ?></address>
							</div>
						</div><!-- .about-map-->
					</div>
				</div><!-- #contact.tab-pane -->
				<div class="tab-pane pv0 fade" id="team">
					<h3 class="h-like-i f-bl-a fC"><?php echo TEAM_TITLE; ?></h3>
					<div class="row">
						<ul class="col-md-12 ph0" role="list">
							<li class="col-md-3 col-md-offset-3 ph20 mt50" role="listitem">
								<article class="team-wp bg-gy-a" role="article">
									<figure class="team-picture">
										<img src="uploads/team-br.png" alt="Benoît Rognier">
									</figure><!-- .team-picture -->
									<div class="pa15 pt25">
										<h4 class="h-like-f f-gy-b">Benoît Rognier</h4>
										<h5 class="btn btn-sm mt10 no-link"><?php echo TEAM_BLOC_1_JOB; ?></h5>
										<p class="f15 mt20"><?php echo TEAM_BLOC_1_TXT; ?></p>
										<ul class="list-inline mt25" role="menu">
											<li class="mr5" role="menuitem">
												<a href="http://fr.linkedin.com/in/benoitrognier" title="<?php echo TITLE_FOLLOW_2 ?> LinkedIn" class="sprite social-in-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> LinkedIn</span>
												</a>
											</li>
											<!--<li class="mr5" role="menuitem">
												<a href="#" title="<?php echo TITLE_FOLLOW_2 ?> Google+" class="sprite social-gg-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> Google+</span>
												</a>
											</li>
											<li role="menuitem">
												<a href="#" title="<?php echo TITLE_FOLLOW_2 ?> Twitter" class="sprite social-tw-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> Twitter</span>
												</a>
											</li>-->
										</ul><!-- .list-inline -->
									</div>
								</article><!-- .teamp-wp -->
							</li><!-- .col-md-3 -->
							<li class="col-md-3 ph20 mt50" role="listitem">
								<article class="team-wp bg-gy-a" role="article">
									<figure class="team-picture">
										<img src="uploads/team-gd.png" alt="Guillaume Duhamel">
									</figure><!-- .team-picture -->
									<div class="pa15 pt25">
										<h4 class="h-like-f f-gy-b">Guillaume Duhamel</h4>
										<h5 class="btn btn-sm mt10 no-link"><?php echo TEAM_BLOC_2_JOB; ?></h5>
										<p class="f15 mt20"><?php echo TEAM_BLOC_2_TXT; ?></p>
										<ul class="list-inline mt25" role="menu">
											<li class="mr5" role="menuitem">
												<a href="http://fr.linkedin.com/in/guillaumeduhamel" title="<?php echo TITLE_FOLLOW_2 ?> LinkedIn" class="sprite social-in-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> LinkedIn</span>
												</a>
											</li>
<!--											<li class="mr5" role="menuitem">
												<a href="#" title="<?php echo TITLE_FOLLOW_2 ?> Google+" class="sprite social-gg-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> Google+</span>
												</a>
											</li>
											<li role="menuitem">
												<a href="#" title="<?php echo TITLE_FOLLOW_2 ?> Twitter" class="sprite social-tw-b" role="link" target="_blank">
													<span class="sr-only"><?php echo TITLE_FOLLOW_2 ?> Twitter</span>
												</a>
											</li> -->
										</ul><!-- .list-inline -->
									</div>
								</article><!-- .teamp-wp -->
							</li><!-- .col-md-3 -->

						</ul>
					</div><!-- .row -->
				</div><!-- #team.tab-pane -->
				<div class="tab-pane pv20 fade" id="legal">
					<p class="f19 f-gy-b">La solution edukera et le présent site sont édités par la société edukera. Société par actions simplifiée au capital social de 37.623 euros, immatriculée au Registre du Commerce et des Sociétés de Nanterre sous le numéro 793 014 333, et dont le siège social est établi au 84 rue Perronet, 92200 Neuilly-sur-Seine.</p>
					<p class="f19 f-gy-b mt20">Le Directeur de la publication / Responsable de la rédaction est Benoît Rognier, qui peut être contacté aux coordonnées suivantes : contact@edukera.com.</p>
					<p class="f19 f-gy-b mt20">La SAS edukera est propriétaire des noms de domaine http://www.edukera.com et http://www.qedumath.com.</p>
					<p class="f19 f-gy-b mt20">Le Site est hébergé par la société Google, dont le siège social France est établi au 8 Rue de Londres, 75009 Paris.</p>
				</div><!-- #legal.tab-pane -->
			</div><!-- .tab-content-->
		</div><!-- .col-md-12 -->
	</div><!-- .container -->
</section><!-- .section-wp -->
