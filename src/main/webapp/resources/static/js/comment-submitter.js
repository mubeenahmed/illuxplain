$(function(){
	$("#myForm").submit(function(e) {
		e.preventDefault();
		let base = $("base").attr('href');
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

function openTextBox(ref) {
	$(ref).next().toggle();
}

$(function(){
	$(".replyForm").submit(function(e){
		e.preventDefault();
		let base = $("base").attr('href');
		let $inputs = $(this).find(":input");
		let values = {};
	    $inputs.each(function() {
	        values[this.name] = $(this).val();
	    });
	    $.ajax({ url: base + "reply_submitter", data: values, method:"POST" }).then(function(data) {
	    	$('.comment-submitted').show();
	    });
	    
	});
});		