<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
<title>打印预览</title>
<script type="text/javascript">
function seeXML(sXML){
    var w = window.open("");
    w.document.write("<xmp>" + sXML + "</xmp>");
}

//获得随机数
function getRandom(){
	var d = new Date();
	return d.getTime();
}

Ext.onReady(function() {
	try {
		var strFormatType = "0"; // 0 套打，1 全打
		var formatDoc = Pku.Common.createDocument();
		formatDoc.load("${ctx}/static/paperprint/doc/${print.paperCode}_FORMAT.xml");

		tpb.PvwSingleOutput = '${print.singleOutput}' || "0"; // 是否联页输出，默认分页输出
		tpb.ShowToolBar = '${print.showToolBar}' || "1";
		tpb.ShowBuPrint = '${print.showPrint}' || "1";
		tpb.BuExitCaption = "关闭";
		tpb.PvwShowWatermark = 0; // 不显示水印
		tpb.PvwSealColorBlack = 0; //0印章为红色，1为黑色。默认1。
		tpb.PaperVersion = "N"; // 新版文书控件

		tpb.ShowPaperView("S", formatDoc.xml, paperData.xml);

		setResize();
	} catch (e) {
		alert(e.description);
	}
});

function setResize() {
	if (window.frameElement) {
		tpb.UCWidth = window.frameElement.offsetWidth - 20;
		tpb.UCHeight = window.frameElement.offsetHeight - 47;
	} else {
		tpb.UCWidth = document.body.clientWidth - 20;
		tpb.UCHeight = document.body.clientHeight - 47;
	}
	tpb.ResizeViewer();
}
window.onresize = function() {
	setResize();
}
</script>
<script type="text/VBScript">
Dim lngPrintTimes
lngPrintTimes = 0

Dim m_bln_ResizeViewer
m_bln_ResizeViewer = False

Sub Window_OnActivate()
    If m_bln_ResizeViewer=False Then
        Call tpb.ResizeViewer()
		msgbox "打印完成！"
        m_bln_ResizeViewer = True
    End If
End Sub

Sub tpb_PrinterLawPaper()
    lngPrintTimes = lngPrintTimes + 1
    tpb.PvwMessage = "当前打印了" & lngPrintTimes & "次！"
End Sub

Sub Window_Onunload()
    Call tpb.CloseViewer
End Sub

Sub tpb_OnClickExit()
	Call tpb.CloseViewer
	Window.Close
End Sub
</script>
<xml id="paperData">${print.paperValue}</xml>
</head>
<body>
<table style="margin:0;"  align="center" width="100%" height="100%" border="0">
<tr>
    <td align="center">
    <object 
    ID="tpb"
    width="100%" 
    height="100%" 
    classid="clsid:FA37513C-4FFE-45F0-9758-F7B7D70E6D55"
	codebase="PkuLPPvw.ocx#version=1,0,0,0">
    </object>
    </td>
</tr>
</table>
</body>
</html>