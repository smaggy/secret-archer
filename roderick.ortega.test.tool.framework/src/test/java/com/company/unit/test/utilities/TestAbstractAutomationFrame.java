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
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "ServiceSelector")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "Email")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "Password")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "LoginButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "SignInButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "NewsletterSignUpEmail")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "NewsletterSignUpSubmit")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "LearnMoreLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "AllServicesLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "NewsArchiveLink")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "LoggedInUserName")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "LoggedInUserDetails")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage", "LogoutButton")));
		System.out.println(automationFrame.getLocator(new FrameParameters("LoginPage")));
		System.out.println(automationFrame.getLocator(new FrameParameters("TopNavigation", "NavigationList")));
		System.out.println(automationFrame.getLocator(new FrameParameters("TopNavigation", "Home")));
		System.out.println(automationFrame.getLocator(new FrameParameters("TopNavigation", "Account")));
		System.out.println(automationFrame.getLocator(new FrameParameters("TopNavigation", "ContactUs")));
		System.out.println(automationFrame.getLocator(new FrameParameters("TopNavigation")));
		System.out.println(automationFrame.getLocator(new FrameParameters("AccountDetailsPage", "UserFullName")));
		System.out.println(automationFrame.getLocator(new FrameParameters("AccountDetailsPage", "ContactInformation")));
		System.out.println(automationFrame.getLocator(new FrameParameters("AccountDetailsPage", "PurchasedQuotesTableWrapper")));
	}
	
	@Test
	public void test02() throws Exception {
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "ServiceSelector")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "Email")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "Password")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "LoginButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "SignInButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "NewsletterSignUpEmail")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "NewsletterSignUpSubmit")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "LearnMoreLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "AllServicesLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "NewsArchiveLink")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "LoggedInUserName")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "LoggedInUserDetails")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage", "LogoutButton")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("LoginPage")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("TopNavigation", "NavigationList")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("TopNavigation", "Home")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("TopNavigation", "Account")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("TopNavigation", "ContactUs")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("TopNavigation")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("AccountDetailsPage", "UserFullName")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("AccountDetailsPage", "ContactInformation")));
		System.out.println(automationFrame.getCssSelector(new FrameParameters("AccountDetailsPage", "PurchasedQuotesTableWrapper")));
	}
	
	@After
	public void after() {
		
	}
	
}
