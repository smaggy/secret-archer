package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.interfaces.process.FrameableInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.enums.ServiceTypeEnum;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;

public class LandingPage extends AbstractSitePage implements DataLoadableInterface, LandingPageInterface, FrameableInterface {

	final static Logger logger = LoggerFactory.getLogger(LandingPage.class);
	
	public LandingPage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile, webFactory);
	}

	@Override
	public void setEmail(String email) throws XPathExpressionException {
		logger.info("ACTION: setEmail: [" + email + "]");
		if (email != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Email"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Email"))).setText(getDto().getLandingPageDto().getEmail());
		}
	}

	@Override
	public void setPassword(String password) throws XPathExpressionException {
		logger.info("ACTION: setPassword: [" + password + "]");
		if (password != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Password"))).setText(password);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","Password"))).setText(getDto().getLandingPageDto().getPassword());
		}
	}

	@Override
	public void selectLoginButton() throws XPathExpressionException {
		logger.info("ACTION: selectLoginButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LoginButton"))).select();
	}

	@Override
	public void selectSignUpButton() throws XPathExpressionException {
		logger.info("ACTION: selectSignUpButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","SignUpButton"))).select();
	}

	@Override
	public void selectDetailsButton() throws XPathExpressionException {
		logger.info("ACTION: selectDetailsButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LoggedInUserDetails"))).select();
	}

	@Override
	public void selectLogOutButton() throws XPathExpressionException {
		logger.info("ACTION: selectLogOutButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","LogoutButton"))).select();
	}

	@Override
	public void selectService(ServiceTypeEnum serviceType) throws XPathExpressionException {
		logger.info("ACTION: selectService: [" + serviceType + "]");
		if (serviceType != null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("LandingPage","ServiceSelector"))).select(serviceType.toString());
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("LandingPage","ServiceSelector"))).select(getDto().getLandingPageDto().getService());
		}
	}

	@Override
	public void selectLearnMore() throws XPathExpressionException {
		logger.info("ACTION: selectLearnMore");
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","LearnMoreLink"))).select();
	}

	@Override
	public void selectAllServices() throws XPathExpressionException {
		logger.info("ACTION: selectAllServices");
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","AllServicesLink"))).select();
	}

	@Override
	public void selectNewsArchive() throws XPathExpressionException {
		logger.info("ACTION: selectNewsArchive");
		getWebFactory().createWebLink(getLocator(new FrameParameters("LandingPage","NewsArchiveLink"))).select();
	}

	@Override
	public void setNewsletterSignUpEmail(String email) throws XPathExpressionException {
		logger.info("ACTION: setNewsletterSignUpEmail: [" + email + "]");
		if (email != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","NewsletterSignUpEmail"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("LandingPage","NewsletterSignUpEmail"))).setText(getDto().getLandingPageDto().getNewsletterEmail());
		}
	}

	@Override
	public void selectNewsletterSignUpButton() throws XPathExpressionException {
		logger.info("ACTION: selectNewsletterSignUpButton");
		getWebFactory().createWebButton(getLocator(new FrameParameters("LandingPage","NewsletterSignUpSubmit"))).select();
	}

}
