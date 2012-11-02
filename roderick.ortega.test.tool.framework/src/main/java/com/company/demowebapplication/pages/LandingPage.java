package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.interfaces.process.FrameableInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.enums.ServiceTypeEnum;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;

public class LandingPage extends AbstractSitePage implements DataLoadableInterface, LandingPageInterface, FrameableInterface {

	public LandingPage(File frameFile) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile);
	}

	@Override
	public void selectHome() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","Home"))).select();
	}

	@Override
	public void selectWebService() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","WebService"))).select();
	}

	@Override
	public void selectSettings() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","Settings"))).select();
	}

	@Override
	public void selectContactUs() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("SiteFooterNavigation","ContactUs"))).select();
	}

	@Override
	public void setEmail(String email) throws XPathExpressionException {
		if (getDto().getLandingPageDto().getEmail() == null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Email"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Email"))).setText(getDto().getLandingPageDto().getEmail());
		}
	}

	@Override
	public void setPassword(String password) throws XPathExpressionException {
		if (getDto().getLandingPageDto().getPassword() == null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Password"))).setText(password);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Password"))).setText(getDto().getLandingPageDto().getPassword());
		}
	}

	@Override
	public void selectLoginButton() throws XPathExpressionException {
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LoginButton"))).select();
	}

	@Override
	public void selectSignUpButton() throws XPathExpressionException {
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","SignUpButton"))).select();
	}

	@Override
	public void selectDetailsButton() throws XPathExpressionException {
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LoggedInUserDetails"))).select();
	}

	@Override
	public void selectLogOutButton() throws XPathExpressionException {
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LogoutButton"))).select();
	}

	@Override
	public void selectService(ServiceTypeEnum serviceType) throws XPathExpressionException {
		if (getDto().getLandingPageDto().getService() == null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("LandingPage","ServiceSelector"))).select(serviceType.toString());
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("LandingPage","ServiceSelector"))).select(getDto().getLandingPageDto().getService());
		}
	}

	@Override
	public void selectLearnMore() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","LearnMoreLink"))).select();
	}

	@Override
	public void selectAllServices() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","AllServicesLink"))).select();
	}

	@Override
	public void selectNewsArchive() throws XPathExpressionException {
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","NewsArchiveLink"))).select();
	}

	@Override
	public void setNewsletterSignUpEmail(String email) throws XPathExpressionException {
		if (getDto().getLandingPageDto().getNewsletterEmail() == null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","NewsletterSignUpEmail"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","NewsletterSignUpEmail"))).setText(getDto().getLandingPageDto().getNewsletterEmail());
		}
	}

	@Override
	public void selectNewsletterSignUpButton() throws XPathExpressionException {
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","NewsletterSignUpSubmit"))).select();
	}

}
