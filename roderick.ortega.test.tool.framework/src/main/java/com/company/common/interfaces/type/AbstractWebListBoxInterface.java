package com.company.common.interfaces.type;

public interface AbstractWebListBoxInterface extends AbstractWebElementInterface {
	public int getItemCount();
	public void select(int itemIndex);
	public void select(String itemText);
}
