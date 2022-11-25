$(document).ready(function() {
	$('#btn').click(process);
});

/*
function process() {
	$.ajax({
		type:'GET',
		dataType:'json',
		url:'searchOpen.do?query=' + $('#search').val(),
		success:viewMessage,
		error:function(xhr, textStatus, error) {
			alert(xhr.status);
		}
	});
}
*/

function process() {
	$.ajax({
		type:'GET',
		url:'https://dapi.kakao.com/v3/search/book?target=title',
		headers:{"Authorization":"KakaoAK 8e9d9a6512f34cc422a946ade7e572b4"},
		dataType:'json',
		data:{"query":$('#search').val()},
		success:viewMessage
	});
}

function viewMessage(res) {
	//console.log(res);
	//alert(res.documents[0].title);
	$('#wrap table').empty();
	$.each(res.documents, function(index, element) {
		$('#wrap table').append(`<tr><td>${element.title}</td><td><a href=${element.url}><img src=${element.thumbnail}/></a></td><td>${element.price}</td></tr>`);
	});
}
