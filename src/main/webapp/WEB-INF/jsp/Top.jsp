<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/12/2
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <!--写个时间戳，看刷新没 -->
    <title>Title<%=System.currentTimeMillis()%></title>
</head>
<body>
    脑壳
    <f:form modelAttribute="book" action="${pageContext.request.contextPath}/book/how" method="post">
        书名：<f:input path="bookName"/><br>
        价格：<f:input path="bookPrice"/><br>
        备注：<f:input path="bookBrief"/><br>
        <input type="submit" value="确定">
    </f:form>
    <hr/>

    <%=System.currentTimeMillis()%>
    <div>
        <a href="${pageContext.request.contextPath}/book/zh">zh</a>
        <a href="${pageContext.request.contextPath}/book/en">en</a>
    </div>
    <div>
            <p>
                <t:message code="yhzh.label"></t:message>
            </p>
            <p>
                <t:message code="yhmm.label"></t:message>
            </p>
            <p>
                ${msg}
            </p>
</div>


    <%--${book}--%>

</body>
</html>
