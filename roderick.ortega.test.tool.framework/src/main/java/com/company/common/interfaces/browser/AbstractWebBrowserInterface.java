package com.company.common.interfaces.browser;

import com.company.common.interfaces.action.FindableInterface;
import com.company.common.types.Url;

public interface AbstractWebBrowserInterface extends FindableInterface {
	public void close();
	public String getUrl();
	public void navigate(Url url);
	public String getTitle();
}
