/**
 * 
 */

/*
 * function menu() { var gnb = document.getElementById("gnb");
 * if(gnb.style.display=='none'){ gnb.style.display="block"; }else{
 * gnb.style.display="none"; } }
 */
$(document).ready(function() {
	$('#menu_toggle_btn').click(function() {
		$('#gnb').slideToggle('fast', function() {
			// 객체가 다 펼치지거나 접히고 나면 여기에 든 내용이 실행된다.
		});
	});
});

/*
$(document).ready(function() {
	
	$('#gnb li').addClass('out1');
	$('#gnb li').mouseover(function() {
		$(this).addClass('hover2');
	});
	$('#gnb li').mouseout(function() {
		$(this).removeClass('hover2');
	});
});
*/