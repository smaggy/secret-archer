package com.company.common.model.type;

public interface AbstractWebListBoxInterface extends AbstractWebElementInterface {
	public int getItemCount();
	public void select(int itemIndex);
	public void select(String itemText);
}
