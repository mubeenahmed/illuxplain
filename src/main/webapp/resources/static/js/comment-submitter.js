$(function(){
			$("#myForm").submit(function() {
				var $inputs = $("#myForm :input");
			    var values = {};
			    $inputs.each(function() {
			        values[this.name] = $(this).val();
			    });
			    $.ajax({ url: "http://localhost:8080/illuxplain/add-comment", data: values, method:"POST" }).then(function(data) {
			       $('.comment-submitted').append(data);
			    });
			});
		});