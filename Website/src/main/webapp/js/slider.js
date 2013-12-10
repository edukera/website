$(document).ready(function() {	tempo = setInterval("slide_start()",timer);//Durée d'apparition

////////////////////////////////////
// INTIALISATION
////////////////////////////////////

	var type = $('#slider article:first-child').attr('class');
	var index = 0;
	f_size(index);
	f_show(index,type);
	
	$('#slider-nav-right').click(function(e){
		slide_next();
		tempo = setInterval("slide_start()",timer);//Durée d'apparition

	});
	$('#slider-nav-left').click(function(e){
		slide_prev();
		tempo = setInterval("slide_start()",timer);//Durée d'apparition
	});
	
	$("body").keydown(function(e) {
		  if(e.keyCode == 37) { // left
			  slide_prev();
			  tempo = setInterval("slide_start()",timer);//Durée d'apparition
		  }
		  else if(e.keyCode == 39) { // right
			  slide_next();
			  tempo = setInterval("slide_start()",timer);//Durée d'apparition
		  }
	});

});

////////////////////////////////////
// FUNCTION SLIDE AUTO
////////////////////////////////////

var isMove = 1;
var etat=0;

function slide_start(){
	var total = $('#slider article').size();
	if (etat<(total-1)){
		etat++;
		index=etat;
		var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
		f_hide(index,type);

	}else{
		etat=0;
		index=etat;
		var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
			f_hide(index,type);
	}
}

function slide_next(){
	clearInterval(tempo);	
	var total = $('#slider article').size();
	if(isMove==0){
		if (etat<(total-1)){
			etat++;
			index=etat;
			var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
			f_hide(index,type);
	
		}else{
			etat=0;
			index=etat;
			var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
				f_hide(index,type);
		}
	}
}
function slide_prev(){
	clearInterval(tempo);	
	var total = $('#slider article').size();
	//alert(total)
	if(isMove==0){
		if(etat==0){
			etat=total-1;
			index=etat;
			var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
			f_hide(index,type);
	
		}else{
			etat--;
			index=etat;
			var type = $('#slider article:nth-child('+(index+1)+')').attr('class');
				f_hide(index,type);
		}

	}
}

	
////////////////////////////////////
// FUNCTIONS STRUCTURE SLIDE
////////////////////////////////////

function f_sizeCalcul(index){
	viewY = ($(window).innerHeight())-140;
	viewX = $(window).innerWidth();
	if((viewY+140)<=630){
		deplacement = etat*(-435);
	}else{
		deplacement = etat*(-viewY);
	}
}

function f_size(index){
	f_sizeCalcul(index);
	$("#slider, #slider article").css("height",(viewY)+"px").css("width",viewX+"px");
	$("#slider article > div").css("top",((viewY-500)/2)+"px");
	$("#slider .custom-pise > div").css("top",((viewY-500))+"px");
	$("#slider article:first-child").css("marginTop",deplacement+"px");
	$("#connect").css("right",((viewX-1200)/2)+"px").css("left","auto");
	if(viewX<1024){
		$("#connect").css("right",0).css("left","690px")
	}
	
	if((viewY+140)<=630){
		$("#slider").css("height","540px");
		$("#slider article").css("height","435px");
		$("#slider article > div").css("top","35px");
		$("#slider article.custom-pise > div").css("top","55px");
	}
	
}

function f_hide(index,type){
	$("#slider article > div").animate({opacity: [0,'easeOutQuad'],left: ["-1500px",'easeOutQuad']}, 400,function() {
		f_background(index,type);
	});
}

function f_background(index,type){
	f_sizeCalcul()
	f_reset(index,type);	
	f_sizeCalcul(index);
	$("#slider article:first-child").animate({ marginTop: [deplacement,'easeOutQuad']}, 400, function() {
		f_show(index,type);
	});
}

function f_show(index,type){
	if(type=='custom-pise'){
		isMove=1
		f_slidePise();
	}
	if(type=='custom-shell'){
		isMove=1
		f_slideShell();
	}
	if(type=='generic'){
		isMove=1
		f_slideGeneric(index);
	}
}
	
////////////////////////////////////
// FUNCTIONS ANIMATION 
////////////////////////////////////

// SLIDE PISE
function f_slidePise(){
	var cible = '#slider .custom-pise';
	$(cible+' h1').animate({ right: ["10%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},800, function(){
		$(cible+' .learnmore').animate({opacity: [1,'easeOutQuad']},800,function(){
			isMove = 0;
		});
	});
	$(cible+' .custom img:nth-child(2)').animate({left: ["18%",'easeInOutQuad'],opacity: [1,'easeInOutQuad']},500, function(){
		$(cible+' .custom img:nth-child(3)').animate({left: ["37%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},300);
	});
}

// SLIDE SHELL
function f_slideShell(){
	//alert(isMove);
	var cible = '#slider .custom-shell';
	$(cible+' h1').animate({ right: ["5%",'easeOutQuad'],opacity: [1,'easeInOutQuad']}, 800);
	$(cible+' .custom img:nth-child(1)').animate({ opacity: [1,'easeInOutQuad']},2000, function (){
		$(cible+' .custom img:nth-child(3)').animate({opacity: [1,'easeInOutQuad']},1200,function(){
			$(cible+' .custom img:nth-child(4)').animate({ left: ["31%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},1200);
			$(cible+' .custom img:nth-child(2)').animate({ left: ["2%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},600);
			$(cible+' .learnmore').animate({opacity: [1,'easeOutQuad']},1200,function(){
				isMove = 0;
			});
		});
	});
/*	
	$(cible+' .custom img:nth-child(4)').animate({ left: ["31%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},800);
	$(cible+' .custom img:nth-child(2)').animate({ left: ["2%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},400);
	$(cible+' h1').animate({ right: ["5%",'easeOutQuad'],opacity: [1,'easeInOutQuad']}, 800, function(){
		$(cible+' .custom img:nth-child(3)').animate({opacity: [1,'easeInOutQuad']},200);
		$(cible+' .learnmore').animate({opacity: [1,'easeOutQuad']},800,function(){
			isMove = 0;
		});
	});*/
}

// SLIDE GENERIC
function f_slideGeneric(index){
	var cible = '#slider article.generic:nth-child('+(index+1)+')';
	$(cible+' h1').animate({opacity: [1,'easeInOutQuad'],left: ["5.8%",'easeInOutQuad']},800);
	$(cible+' .learnmore').animate({left: ["0%",'easeOutQuad'],opacity: [1,'easeInOutQuad']},600,function(){
		isMove = 0;
	});
}	

////////////////////////////////////
// FUNCTIONS RESET
////////////////////////////////////

function f_reset(index,type){
	if(type=='custom-pise'){
		f_sizeCalcul();
		var cible = '#slider .custom-pise';
		$(cible+' .learnmore,'+cible+' h1,'+cible+' .custom img:nth-child(2),'+cible+' .custom img:nth-child(3)').css('opacity','0');
		$(cible+' div').css({ opacity: "1", left: "0px" });
		$(cible+' .custom img:nth-child(2)').css('left','10%');
		$(cible+' .custom img:nth-child(3)').css('left','17%');
		$(cible+' h1').css('right','-10%');
	}
	if(type=='custom-shell'){
		var cible = '#slider .custom-shell';
		$(cible+' .learnmore,'+cible+' h1,'+cible+' .custom img:nth-child(2),'+cible+' .custom img:nth-child(3),'+cible+' .custom img:nth-child(4)').css('opacity','0');
		$(cible+' div').css({ opacity: "1", left: "0px"});
		$(cible+' h1').css('right','30%');
		$(cible+' .custom img:nth-child(2)').css('left','-2%');
		$(cible+' .custom img:nth-child(4)').css('left','55%');
	}
	if(type=='generic'){
		var cible = '#slider article.generic:nth-child('+(index+1)+')';
		$(cible+' div').css({ opacity: "1", left: "0px"});
		$(cible+' h1').css({ opacity: "0", left: "-20%"});
		$(cible+' .learnmore').css({ opacity: "0", left: "30%"});
	}
}
	
////////////////////////////////////
// FUNCTION NAVIGATION
////////////////////////////////////

$(window).resize(function() {
	f_size();
});
