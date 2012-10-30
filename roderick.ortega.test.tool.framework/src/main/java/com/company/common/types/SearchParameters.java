package com.company.common.types;

public class SearchParameters {
	
	private boolean explicit = false;
	private String mainSearch;
	private String firstQualifier;
	private String secondQualifier;
	private String thirdQualifier;
	
	public SearchParameters(String mainSearch) {
		setMainSearch(mainSearch);
	}
	
	public SearchParameters(String mainSearch, String firstQualifier) {
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
	}
	
	public SearchParameters(String mainSearch, String firstQualifier, String secondQualifier) {
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
		setSecondQualifier(secondQualifier);
	}
	
	public SearchParameters(String mainSearch, String firstQualifier, String secondQualifier, String thirdQualifier) {
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
		setSecondQualifier(secondQualifier);
		setThirdQualifier(thirdQualifier);
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch) {
		setExplicitSearch(searchExplicitly);
		setMainSearch(mainSearch);
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch, String firstQualifier) {
		setExplicitSearch(searchExplicitly);
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
	}
	
	public SearchParameters(boolean searchExplicitly ,String mainSearch, String firstQualifier, String secondQualifier) {
		setExplicitSearch(searchExplicitly);
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
		setSecondQualifier(secondQualifier);
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch, String firstQualifier, String secondQualifier, String thirdQualifier) {
		setExplicitSearch(searchExplicitly);
		setMainSearch(mainSearch);
		setFirstQualifier(firstQualifier);
		setSecondQualifier(secondQualifier);
		setThirdQualifier(thirdQualifier);
	}
	
	public boolean isExplicitSearch() {
		return explicit;
	}

	private void setExplicitSearch(boolean searchExplicitly) {
		this.explicit = searchExplicitly;
	}

	public String getMainSearch() {
		return mainSearch;
	}
	
	private void setMainSearch(String mainSearch) {
		this.mainSearch = mainSearch;
	}
	
	public String getFirstQualifier() {
		return firstQualifier;
	}
	
	private void setFirstQualifier(String firstQualifier) {
		this.firstQualifier = firstQualifier;
	}
	
	public String getSecondQualifier() {
		return secondQualifier;
	}
	
	private void setSecondQualifier(String secondQualifier) {
		this.secondQualifier = secondQualifier;
	}
	
	public String getThirdQualifier() {
		return thirdQualifier;
	}
	
	private void setThirdQualifier(String thirdQualifier) {
		this.thirdQualifier = thirdQualifier;
	}
	
	public void normalizeSearchParameters() {
		
		if (this.mainSearch != null) {
			setMainSearch(getMainSearch().toLowerCase().trim());
		}
		if (this.firstQualifier != null) {
			setFirstQualifier(getFirstQualifier().toLowerCase().trim());
		}
		if (this.secondQualifier != null) {
			setSecondQualifier(getSecondQualifier().toLowerCase().trim());
		}
		if (this.thirdQualifier != null) {
			setThirdQualifier(getThirdQualifier().toLowerCase().trim());
		}
		
	}
	
	public String toString() {
		return "[" + explicit + "|" + mainSearch + "|" + firstQualifier + "|" +secondQualifier + "|" +thirdQualifier + "]";
	}
}
