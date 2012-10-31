package com.company.unit.test.utilities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.company.common.frame.AbstractAutomationFrame;
import com.company.common.interfaces.action.FrameableInterface;

public class MockTestAbstractAutomationFrame extends AbstractAutomationFrame implements FrameableInterface {

	public MockTestAbstractAutomationFrame(File frameFile) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile);
	}

}
