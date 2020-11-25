/**
 * 
 */

//$(delkey).click(function(){
//  confirm("Are you sure you want to delete this post?");
//});

$(what).click(function(){
	var result = confirm("Are you sure you want to delete this post?");
	if(result){
		$(delkey).css("display", "block");
	}
});