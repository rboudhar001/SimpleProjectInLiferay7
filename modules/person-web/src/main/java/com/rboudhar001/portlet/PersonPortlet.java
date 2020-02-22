package com.rboudhar001.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.rboudhar001.constants.PersonPortletKeys;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

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
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PersonPortlet extends MVCPortlet {
	
	// **************
	// *** Render ***
	// **************
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {

		// Get Persons from DB
		// ...
		
		// Add Persons to 'renderRequest'
		// ...
		
		// Render
		super.render(renderRequest, renderResponse);
	}
	
	// **************
	// *** Action ***
	// **************
	
	public void addPerson(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		// Security
		// ...
		
		// Get Person from 'actionRequest'
		// ...
		
		// Save the new Person in DB
		// ...
		
		// Render
		// ...
		
	}
	
	// ****************
	// *** Response ***
	// ****************
	
	// ...
}