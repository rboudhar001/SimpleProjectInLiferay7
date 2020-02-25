package com.rboudhar001.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.rboudhar001.constants.MyDate;
import com.rboudhar001.constants.PersonPortletKeys;
import com.rboudhar001.model.Person;
import com.rboudhar001.service.PersonLocalService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Rachid
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Person",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PersonPortletKeys.PERSON,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
	},
	service = Portlet.class
)
public class PersonPortlet extends MVCPortlet {

	// Variables

    private PersonLocalService mPersonLocalService;
   
    // Services

	@Reference(unbind = "-")
    protected void setPersonService(PersonLocalService personLocalService) {
		mPersonLocalService = personLocalService;
    }
	
	// **************
	// *** Render ***
	// **************
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {

		// Security
		// ...

		try {

			// Get Persons from DB
			List<Person> persons = mPersonLocalService.getPersons(0, Integer.MAX_VALUE);

			// Add Attributes to 'renderRequest'
			renderRequest.setAttribute("persons", persons);

		} catch (Exception e) {
			throw new PortletException(e);
		}

		// Render
		super.render(renderRequest, renderResponse);
	}

	// **************
	// *** Action ***
	// **************

	public void addPerson(ActionRequest actionRequest, ActionResponse actionResponse) {

		// Security
		// ...
		
		try {
			
			CaptchaUtil.check(actionRequest);

			// Get Data from 'actionRequest'
			String personName = ParamUtil.getString(actionRequest, "personName");
			String personSurname = ParamUtil.getString(actionRequest, "personName");
			Date personBirthdate = ParamUtil.getDate(actionRequest, "personBirthdate", MyDate.getDateFormat());
			String personEmail = ParamUtil.getString(actionRequest, "personEmail");

			// Create Person
			long personId = CounterLocalServiceUtil.increment(Person.class.getName());
			Person person = mPersonLocalService.createPerson(personId);
			person.setPersonName(personName);
			person.setPersonSurname(personSurname);
			person.setPersonBirthdate(personBirthdate);
			person.setPersonEmail(personEmail);

			// Add Person to DB
			mPersonLocalService.addPerson(person);

			// Success
			SessionMessages.add(actionRequest, "personAdded");

		} catch (Exception e) {

			// Error
			SessionErrors.add(actionRequest, e.getClass().getName());
			PortalUtil.copyRequestParameters(actionRequest, actionResponse);
			actionResponse.getRenderParameters().setValue("mvcPath", "/edit.jsp");
		}
	}

	// ****************
	// *** Resource ***
	// ****************

	@Override
    public void serveResource(
        ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

		try {

			CaptchaUtil.serveImage(resourceRequest, resourceResponse);

		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
}