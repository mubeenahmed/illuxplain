$(function(){
	$("#myForm").submit(function(e) {
		e.preventDefault();
		let base = $("base").attr('href');
		console.log(base);
		let $inputs = $("#myForm :input");
	    let values = {};
	    $inputs.each(function() {
	        values[this.name] = $(this).val();
	    });
	    $.ajax({ url: base + "add-comment", data: values, method:"POST" }).then(function(data) {
	    	$('.comment-submitted').show();
	    });
	});
});

function openTextBox() {
	$("#replyDiv").toggle();
}
function reply(){
	let reply = $("textarea[name='replyTxt']").text();
	let id = $("#comment_id").val();
}