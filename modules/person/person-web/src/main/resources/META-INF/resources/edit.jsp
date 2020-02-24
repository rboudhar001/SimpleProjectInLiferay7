<%@ include file="/init.jsp"%>

<!-- Variables -->
<portlet:renderURL var="viewPersonURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL var="addPersonURL" name="addPerson"></portlet:actionURL>

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
		<aui:button-row>
			<aui:button type="submit"></aui:button>
			<aui:button type="cancel" onClick="${viewPersonURL}"></aui:button>
		</aui:button-row>
	</aui:form>

</div>