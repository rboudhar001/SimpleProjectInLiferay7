<%@ include file="/init.jsp"%>

<!-- Variables -->
<portlet:renderURL var="viewPersonURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addPerson" var="addPersonURL"></portlet:actionURL>

<!-- View -->
<div>

	<!-- Form -->
	<aui:form action="${addPersonURL}" name="<portlet:namespace />fm">
		<aui:fieldset>
			<aui:input name="personName"></aui:input>
			<aui:input name="personSurname"></aui:input>
			<aui:input name="personBirthdate"></aui:input>
			<aui:input name="personEmail"></aui:input>
		</aui:fieldset>
		<aui:button-row>
			<aui:button type="submit"></aui:button>
			<aui:button type="cancel" onClick="${viewURL.toString()}"></aui:button>
		</aui:button-row>
	</aui:form>

</div>