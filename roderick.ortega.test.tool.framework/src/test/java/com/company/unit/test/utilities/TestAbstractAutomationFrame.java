package com.company.unit.test.utilities;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.common.types.FrameParameters;

public class TestAbstractAutomationFrame {
	
	private MockTestAbstractAutomationFrame automationFrame;
	
	@Before
	public void before() throws Exception {
		
		System.out.println("=== new test ===");
		
		File frameFile = new File("./Resources/Frames/DemoWebApplication.xml");
		this.automationFrame = new MockTestAbstractAutomationFrame(frameFile);
	}
	
	@Test
	public void test01() throws Exception {
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "ServiceSelector")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "Email")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "Password")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "LoginButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "SignUpButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "NewsletterSignUpEmail")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "NewsletterSignUpSubmit")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "LearnMoreLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "AllServicesLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "NewsArchiveLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "LoggedInUserName")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "LoggedInUserDetails")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage", "LogoutButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LandingPage")));
		System.out.println(automationFrame.getLocator(new FrameParameters("SiteTopNavigation", "NavigationList")));
		System.out.println(automationFrame.getLocator(new FrameParameters("SiteTopNavigation", "Home")));
		System.out.println(automationFrame.getLocator(new FrameParameters("SiteTopNavigation", "Account")));
		System.out.println(automationFrame.getLocator(new FrameParameters("SiteTopNavigation", "ContactUs")));
		System.out.println(automationFrame.getLocator(new FrameParameters("SiteTopNavigation")));
		System.out.println(automationFrame.getLocator(new FrameParameters("DetailsPage", "UserFullName")));
		System.out.println(automationFrame.getLocator(new FrameParameters("DetailsPage", "ContactInformation")));
		System.out.println(automationFrame.getLocator(new FrameParameters("DetailsPage", "PurchasedQuotesTableWrapper")));
	}
	
	@Test
	public void test02() throws Exception {
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "ServiceSelector")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "Email")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "Password")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "LoginButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "SignUpButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "NewsletterSignUpEmail")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "NewsletterSignUpSubmit")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "LearnMoreLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "AllServicesLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "NewsArchiveLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "LoggedInUserName")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "LoggedInUserDetails")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage", "LogoutButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LandingPage")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("SiteTopNavigation", "NavigationList")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("SiteTopNavigation", "Home")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("SiteTopNavigation", "Account")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("SiteTopNavigation", "ContactUs")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("SiteTopNavigation")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("DetailsPage", "UserFullName")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("DetailsPage", "ContactInformation")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("DetailsPage", "PurchasedQuotesTableWrapper")));
	}
	
	@After
	public void after() {
		
	}
	
}
