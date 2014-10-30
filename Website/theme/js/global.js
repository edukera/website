/*!
* Project Name - @author: Jérémie Maquet || www.jmaquet.fr/
*/

/* Copyright (c) 2007-2013 Ariel Flesler - aflesler<a>gmail<d>com | http://flesler.blogspot.com  Dual licensed under MIT and GPL. * @author Ariel Flesler * @version 1.4.6 */
;(function($){var h=$.scrollTo=function(a,b,c){$(window).scrollTo(a,b,c)};h.defaults={axis:'xy',duration:parseFloat($.fn.$)>=1.3?0:1,limit:true};h.window=function(a){return $(window)._scrollable()};$.fn._scrollable=function(){return this.map(function(){var a=this,isWin=!a.nodeName||$.inArray(a.nodeName.toLowerCase(),['iframe','#document','html','body'])!=-1;if(!isWin)return a;var b=(a.contentWindow||a).document||a.ownerDocument||a;return/webkit/i.test(navigator.userAgent)||b.compatMode=='BackCompat'?b.body:b.documentElement})};$.fn.scrollTo=function(e,f,g){if(typeof f=='object'){g=f;f=0}if(typeof g=='function')g={onAfter:g};if(e=='max')e=9e9;g=$.extend({},h.defaults,g);f=f||g.duration;g.queue=g.queue&&g.axis.length>1;if(g.queue)f/=2;g.offset=both(g.offset);g.over=both(g.over);return this._scrollable().each(function(){if(e==null)return;var d=this,$elem=$(d),targ=e,toff,attr={},win=$elem.is('html,body');switch(typeof targ){case'number':case'string':if(/^([+-]=?)?\d+(\.\d+)?(px|%)?$/.test(targ)){targ=both(targ);break}targ=$(targ,this);if(!targ.length)return;case'object':if(targ.is||targ.style)toff=(targ=$(targ)).offset()}$.each(g.axis.split(''),function(i,a){var b=a=='x'?'Left':'Top',pos=b.toLowerCase(),key='scroll'+b,old=d[key],max=h.max(d,a);if(toff){attr[key]=toff[pos]+(win?0:old-$elem.offset()[pos]);if(g.margin){attr[key]-=parseInt(targ.css('margin'+b))||0;attr[key]-=parseInt(targ.css('border'+b+'Width'))||0}attr[key]+=g.offset[pos]||0;if(g.over[pos])attr[key]+=targ[a=='x'?'width':'height']()*g.over[pos]}else{var c=targ[pos];attr[key]=c.slice&&c.slice(-1)=='%'?parseFloat(c)/100*max:c}if(g.limit&&/^\d+$/.test(attr[key]))attr[key]=attr[key]<=0?0:Math.min(attr[key],max);if(!i&&g.queue){if(old!=attr[key])animate(g.onAfterFirst);delete attr[key]}});animate(g.onAfter);function animate(a){$elem.animate(attr,f,g.easing,a&&function(){a.call(this,targ,g)})}}).end()};h.max=function(a,b){var c=b=='x'?'Width':'Height',scroll='scroll'+c;if(!$(a).is('html,body'))return a[scroll]-$(a)[c.toLowerCase()]();var d='client'+c,html=a.ownerDocument.documentElement,body=a.ownerDocument.body;return Math.max(html[scroll],body[scroll])-Math.min(html[d],body[d])};function both(a){return typeof a=='object'?a:{top:a,left:a}}})($);

/* Copyright (c) 2007-2010 Ariel Flesler - aflesler<a>gmail<d>com | http://flesler.blogspot.com Dual licensed under MIT and GPL. @author Ariel Flesler @version 1.2.9b */
;(function($){var h=location.href.replace(/#.*/,'');var i=$.localScroll=function(a){$('body').localScroll(a)};i.defaults={duration:1000,axis:'y',event:'click',stop:true,target:window,reset:true};i.hash=function(a){if(location.hash){a=$.extend({},i.defaults,a);a.hash=false;if(a.reset){var d=a.duration;delete a.duration;$(a.target).scrollTo(0,a);a.duration=d}scroll(0,location,a)}};$.fn.localScroll=function(b){b=$.extend({},i.defaults,b);return b.lazy?this.bind(b.event,function(e){var a=$([e.target,e.target.parentNode]).filter(filter)[0];if(a)scroll(e,a,b)}):this.find('a,area').filter(filter).bind(b.event,function(e){scroll(e,this,b)}).end().end();function filter(){return!!this.href&&!!this.hash&&this.href.replace(this.hash,'')==h&&(!b.filter||$(this).is(b.filter))}};function scroll(e,a,b){var c=a.hash.slice(1),elem=document.getElementById(c)||document.getElementsByName(c)[0];if(!elem)return;if(e)e.preventDefault();var d=$(b.target);if(b.lock&&d.is(':animated')||b.onBefore&&b.onBefore(e,elem,d)===false)return;if(b.stop)d._scrollable().stop(true);if(b.hash){var f=b.offset;f=f&&f.top||f||0;var g=elem.id==c?'id':'name',$a=$('<a> </a>').attr(g,c).css({position:'absolute',top:$(window).scrollTop()+f,left:$(window).scrollLeft()});elem[g]='';$('body').prepend($a);location=a.hash;$a.remove();elem[g]=c}d.scrollTo(elem,b).trigger('notify.serialScroll',[elem])}})($);

 /* PlaceHolder : https://github.com/mathiasbynens/$-placeholder */
 (function(window,document,$){var isInputSupported="placeholder"in document.createElement("input");var isTextareaSupported="placeholder"in document.createElement("textarea");var prototype=$.fn;var valHooks=$.valHooks;var propHooks=$.propHooks;var hooks;var placeholder;if(isInputSupported&&isTextareaSupported){placeholder=prototype.placeholder=function(){return this};placeholder.input=placeholder.textarea=true}else{placeholder=prototype.placeholder=function(){var $this=this;$this.filter((isInputSupported? "textarea":":input")+"[placeholder]").not(".placeholder").bind({"focus.placeholder":clearPlaceholder,"blur.placeholder":setPlaceholder}).data("placeholder-enabled",true).trigger("blur.placeholder");return $this};placeholder.input=isInputSupported;placeholder.textarea=isTextareaSupported;hooks={"get":function(element){var $element=$(element);var $passwordInput=$element.data("placeholder-password");if($passwordInput)return $passwordInput[0].value;return $element.data("placeholder-enabled")&&$element.hasClass("placeholder")?"":element.value},"set":function(element,value){var $element=$(element);var $passwordInput=$element.data("placeholder-password");if($passwordInput)return $passwordInput[0].value=value;if(!$element.data("placeholder-enabled"))return element.value=value;if(value==""){element.value=value;if(element!=document.activeElement)setPlaceholder.call(element)}else if($element.hasClass("placeholder"))clearPlaceholder.call(element,true,value)||(element.value=value);else element.value=value;return $element}};if(!isInputSupported){valHooks.input=hooks;propHooks.value=hooks}if(!isTextareaSupported){valHooks.textarea=hooks;propHooks.value=hooks}$(function(){$(document).delegate("form","submit.placeholder",function(){var $inputs=$(".placeholder",this).each(clearPlaceholder);setTimeout(function(){$inputs.each(setPlaceholder)},10)})});$(window).bind("beforeunload.placeholder",function(){$(".placeholder").each(function(){this.value=""})})}function args(elem){var newAttrs={};var rinline$=/^$\d+$/;$.each(elem.attributes,function(i,attr){if(attr.specified&&!rinline$.test(attr.name))newAttrs[attr.name]=attr.value});return newAttrs}function clearPlaceholder(event,value){var input=this;var $input=$(input);if(input.value==$input.attr("placeholder")&&$input.hasClass("placeholder"))if($input.data("placeholder-password")){$input=$input.hide().next().show().attr("id",$input.removeAttr("id").data("placeholder-id"));if(event===true)return $input[0].value=value;$input.focus()}else{input.value="";$input.removeClass("placeholder");input==document.activeElement&&input.select()}}function setPlaceholder(){var $replacement;var input=this;var $input=$(input);var id=this.id;if(input.value==""){if(input.type=="password"){if(!$input.data("placeholder-textinput")){try{$replacement=$input.clone().attr({"type":"text"})}catch(e){$replacement=$("<input>").attr($.extend(args(this),{"type":"text"}))}$replacement.removeAttr("name").data({"placeholder-password":$input,"placeholder-id":id}).bind("focus.placeholder",clearPlaceholder);$input.data({"placeholder-textinput":$replacement,"placeholder-id":id}).before($replacement)}$input=$input.removeAttr("id").hide().prev().attr("id",id).show()}$input.addClass("placeholder");$input[0].value=$input.attr("placeholder")}else $input.removeClass("placeholder")}})(this,document,$);

/* Windows Phone 8 viewport fix */
(function() {if (navigator.userAgent.match(/IEMobile\/10\.0/)) {var msViewportStyle = document.createElement("style");msViewportStyle.appendChild(document.createTextNode("@-ms-viewport{width:auto!important}"));document.getElementsByTagName("head")[0].appendChild(msViewportStyle);}})();


/* Function : VIEWPORT - calcul window height */
function f_winHeight(){
    // Is store active ?
    var isStore = $('#main').hasClass('store-off');

    winHeight = $(window).height();
    if(winHeight<=600){
        winHeight = 600;
    }
    if(isStore == false){
        if(winHeight>=820){
            winHeight = 820;
        }
    }else{
        if(winHeight>=720){
            winHeight = 720;
        }
    }
    return winHeight;
}

/* Function : HEADER - add/remove active class */
function f_headerActive(){
    $('.anchor').waypoint(function(direction) {
        if (direction === 'down') {
            var href = $(this).attr('id');
            $('#header a').removeClass('active');
            if( (href == 'section-about-tab') || (href == 'section-about') ){
                $('#header a[href=#section-about]').addClass('active');
            }else if(href == 'section-presentation'){
                $('#header a[href=#section-presentation]').addClass('active');
            }
        }
      },{ offset: '2px' } )
      .waypoint(function(direction) {
        if (direction === 'up') {
            var href = $(this).attr('id');
            $('#header a').removeClass('active');
            if( (href == 'section-quote') || (href == 'section-about-tab') ){
                $('#header a[href=#section-about]').addClass('active');
            }else if( href == 'section-about'){
                $('#header a[href=#section-presentation]').addClass('active');
            }
        }
      }, { offset: '0px' } );
}

/* Function : HEADER - stick on scroll */
function f_headerSticky(){
    f_winHeight();
    var viewport =  winHeight - 55;
    if(($(window).scrollTop()) > viewport){
        $("body").addClass("fixed");
    }else{
        $("body").removeClass("fixed");
    }
}

/* Function : section TOP - calcul height */
function f_topHeight(){
    f_winHeight();
    var viewport = winHeight - 100;
    $('#top-wp').css('height',viewport+'px');
}

/* Function : section TOP - Carousel */
function f_topCarousel(){
    //Configuration slider
    $('#top-carousel .carousel').carouFredSel({
        responsive          : false,
        items               : 1,
        height              : 264,
        width               : 406,
        auto                : false,
        scroll     : {
            items           : 1,
            height          : 264,
            width           : 406,
            easing          : "swing",
            pauseOnHover    : true,
            duration        : 500,
            timeoutDuration : 6000
        },
        pagination : {
            container       : ".carousel-pagination",
            deviation       : 0
        },
        swipe      : {
            onTouch         : true,
            onMouse         :true
        }
    });
}

/* Function : section PRESENTATION - colorbox */
function f_presentationColorbox(){
    $('.colorbox').each(function(){
        var groupName = $(this).attr('data-colorbox');
        $(this).colorbox({
            rel:groupName,
            onClosed : function(){
                $('.colorbox').blur();
            }
        });
    });
}

/* Function : section ABOUT - tab switch */
function f_aboutTab(){
    $('#about-tab  a').on('click',function(e){
       $('html, body').animate({scrollTop: $("#section-about").offset().top}, 250);
    });
    $('.trigger-about').on('click',function(){
        var dataTrigger = $(this).attr('data-trigger');
        $('#about-tab li:eq('+dataTrigger+') a').tab('show');
    });
    $('#about-tab li:eq(0) a').tab('show');
    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
        f_teamHeight();
    })
}

/* Function : section ABOUT - Google map */
function f_contactMap() {
    $('.map').each(function(){
        var id       = $(this).attr('id');
        var dataLat  = $(this).attr('data-lat');
        var dataLng  = $(this).attr('data-lng');
        var dataZoom = parseInt($(this).attr('data-zoom'));
        var myLatlng = new google.maps.LatLng(dataLat, dataLng );
        var myOptions = {
            zoom: dataZoom,
            center: myLatlng,
            disableDefaultUI: true
        }
        var map = new google.maps.Map(document.getElementById(id),myOptions);
        var contentString = '<div style="text-align: center; font-size:14px; overflow:hidden;"><br/><img width="174" height="116" src="theme/icons/logo.png"/><br/><br/><div style="margin: auto; text-align: left; width: 247px; overflow:hidden; line-height: 135%;"><strong>Edukera</strong><br/> 171, av Charles de Gaulle<br/>92200 Neuilly-sur-Seine <br/>contact@edukera.com<br/><a href="http://www.edukera.com/" title="Visitez le site Internet">http://www.edukera.com/</a><br/></div><br/></div>';
        var infowindow = new google.maps.InfoWindow({
            content: contentString
        });
        var marker = new google.maps.Marker({
            position: myLatlng,
            map: map,
            title: 'Edukera - 171, av Charles de Gaulle - 2e étage - 92200 Neuilly-sur-Seine - contact@edukera.com'
         });
        google.maps.event.addListener(marker, 'click', function() {
            infowindow.open(map,marker);
        });
    });
}

/* Function : section ABOUT - Contact form validator */
function f_formValidator(){
    jQuery.validator.setDefaults({
        debug: false,
        success: function(label) {
            label.addClass("valid").text(valid);
        }
    });
    $('.form-validator').each(function(i) {
        $(this).validate({
            rules: {
                email    :     {required: true, email: true }
//		,
//                msg      :     {required: true, minlength: 10 }
            },
            messages: {
                email    :      errorMail
//		,
//              msg      :      errorMsg
            }
        });
    });
}

/* Function : section ABOUT - team calcul height */
function f_teamHeight(){
    group = $('.team-wp');
    var tallest = 0;
    group.each(function() {
        var thisHeight = $(this).height();
        if(thisHeight > tallest) {
            tallest = thisHeight+85;
        }
    });
    group.css('minHeight',tallest);
}

/* Package all functions */
function myInitPages() {
    $('html').removeClass('no-js').addClass('hasJS');
    $(document).on('click','a[rel="external"]', function(e) { window.open( $(this).attr('href') ); e.preventDefault(); });
    $('a[type="application/pdf"]').not('a[rel="external"]').on('click', function(e) { window.open( $(this).attr('href') ); e.preventDefault(); });
    $("a[rel='external']")
        .addClass('external')
        .each(function(){
            la_cible = $(this).attr("href");
            title =  la_cible + " (nouvelle fenêtre)";
            if($(this).attr("title")) title = $(this).attr("title") + " " + la_cible + " (nouvelle fenêtre)";
            $(this).attr("title",title);
        });
    $('input, textarea').placeholder();
    $.localScroll();
    f_winHeight();
    f_headerSticky();
    f_headerActive();
    f_topHeight();
    f_topCarousel();
    f_presentationColorbox();
    f_aboutTab();
    f_formValidator();
    f_contactMap();
    $(window).on('resize',function(){
        f_headerSticky();
        f_topHeight();
    });
    $(window).scroll(function(){
        f_headerSticky();
    });

    $('.dropdown-toggle').dropdown()
}

/* Fire functions when dom ready */
$(document).ready(function() {
    myInitPages();
});
