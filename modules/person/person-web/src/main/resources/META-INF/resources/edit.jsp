<%@ include file="/init.jsp"%>

<!-- Import -->
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>

<!-- Variables -->
<portlet:renderURL var="viewPersonURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL var="addPersonURL" name="addPerson"></portlet:actionURL>

<portlet:resourceURL id="/person/captcha" var="captchaURL"/>

<!-- View -->
<div>

	<!-- Form -->
	<aui:form action="${addPersonURL}" name="<portlet:namespace />fm">
		<aui:fieldset>
			<aui:input name="personName" label="Name"></aui:input>
			<aui:input name="personSurname" label="Surname"></aui:input>
			<aui:input type="date" name="personBirthdate" label="Birthdate"></aui:input>
			<aui:input name="personEmail" label="Email"></aui:input>
		</aui:fieldset>
		<div>
			<liferay-captcha:captcha url="${captchaURL}" />
		</div>
		<aui:button-row>
			<aui:button type="submit"></aui:button>
			<aui:button type="cancel" onClick="${viewPersonURL}"></aui:button>
		</aui:button-row>
	</aui:form>

</div>