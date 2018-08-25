$(function() {
	// 启动验证框架
	$.validate();

	$("#searchBtn").click(function() {
		var result = $("div#condition *").valResult();
		if (result.isOK) {
			$(".result tr:gt(0)").remove();
			$.post("findusers", $("[name]").serialize(), function(data) {
				if (data) {
					var list = data.list;
					for (var i = 0; i < list.length; i++) {
						var oTr = $("<tr></tr>");
						$("<td></td>").html(list[i].id).appendTo(oTr);
						$("<td></td>").html(list[i].name).appendTo(oTr);
						$("<td></td>").html(list[i].age).appendTo(oTr);
						oTr.appendTo(".result")
					}

				}
			}, "json");
		} else {
			result.trigger();
		}

	});
}

);