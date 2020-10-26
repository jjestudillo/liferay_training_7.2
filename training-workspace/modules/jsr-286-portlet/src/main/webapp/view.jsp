<%@ include file="/init.jsp" %>

 <%
     String cssStyle = "";

     String backgroundColor = renderRequest.getParameter("backgroundColor");

     if (backgroundColor != null && !backgroundColor.isEmpty()) {
         cssStyle = "background-color: " + backgroundColor + ";";
     }
 %>
 <div style="<%= cssStyle %>">

     <p class="caption">
         <liferay-ui:message key="jsr-286-portlet.caption" />
     </p>

 </div>

 <portlet:renderURL var="viewRedURL">
     <portlet:param name="backgroundColor" value="red"/>
 </portlet:renderURL>
 <portlet:renderURL var="viewYellowURL">
     <portlet:param name="backgroundColor" value="yellow"/>
 </portlet:renderURL>

 <div class="btn-group">
     <a class="btn btn-default" href="<%= viewRedURL %>">Set red</a>
     <a class="btn btn-default" href="<%= viewYellowURL %>">Set yellow</a>
 </div>