package com.company.common.model.type;

public interface AbstractWebTableRowInterface extends AbstractWebElementInterface {
	public AbstractWebElementInterface getCell(int itemIdentifierIndex);
	public int getCellCount();
	public int getIndex();
}
