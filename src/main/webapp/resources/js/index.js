$(window).load(function(){
		        $('#myModalload').modal('show');
});



$(".dropdown-menu li a").click(function () {
	var selText = $(this).text();
	// var imgSource = $(this).find('img').attr('src');
	// var img = '<img src="' + imgSource + '"/>';
	$(this).parents('.btn-group').find('.dropdown-toggle').html( selText);
});



$(document).ready(function(){
    $(".nav-tabs a").click(function(){
        $(this).tab('show');
    });
});