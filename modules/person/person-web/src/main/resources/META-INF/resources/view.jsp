<%@ include file="/init.jsp"%>

<!-- Bean -->
<jsp:useBean id="entries" class="java.util.ArrayList" scope="request" />

<!-- Variables -->
<portlet:renderURL var="addPersonUrl">
	<portlet:param name="mvcPath" value="/edit.jsp"></portlet:param>
</portlet:renderURL>

<!-- View -->
<div>

	<!-- Title -->
	<p>
		<b><liferay-ui:message key="person.caption" /></b>
	</p>

	<!-- Table -->
	<liferay-ui:search-container>
		<liferay-ui:search-container-results results="${persons}" />

		<liferay-ui:search-container-row className="com.rboudhar001.model.Person" modelVar="person">
			<liferay-ui:search-container-column-text property="personName" name="Name" />
			<liferay-ui:search-container-column-text property="personSurname" name="Surname" />
			<liferay-ui:search-container-column-text property="personBirthdate" name="Birthdate" />
			<liferay-ui:search-container-column-text property="personEmail" name="Email" />
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator/>
	</liferay-ui:search-container>

	<!-- Buttons -->
	<aui:button-row>
		<aui:button onClick="${addPersonUrl}" value="Add Person"></aui:button>
	</aui:button-row>

</div>