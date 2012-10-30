package com.company.common.types;

public class SearchParameters {
	
	private boolean explicit = false;
	private String mainSearch;
	private String firstQualifier;
	private String secondQualifier;
	private String thirdQualifier;
	
	public SearchParameters(String mainSearch) {
		this.mainSearch = mainSearch;
	}
	
	public SearchParameters(String mainSearch, String firstQualifier) {
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
	}
	
	public SearchParameters(String mainSearch, String firstQualifier, String secondQualifier) {
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
		this.secondQualifier = secondQualifier;
	}
	
	public SearchParameters(String mainSearch, String firstQualifier, String secondQualifier, String thirdQualifier) {
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
		this.secondQualifier = secondQualifier;
		this.thirdQualifier = thirdQualifier;
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch) {
		this.explicit = searchExplicitly;
		this.mainSearch = mainSearch;
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch, String firstQualifier) {
		this.explicit = searchExplicitly;
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
	}
	
	public SearchParameters(boolean searchExplicitly ,String mainSearch, String firstQualifier, String secondQualifier) {
		this.explicit = searchExplicitly;
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
		this.secondQualifier = secondQualifier;
	}
	
	public SearchParameters(boolean searchExplicitly, String mainSearch, String firstQualifier, String secondQualifier, String thirdQualifier) {
		this.explicit = searchExplicitly;
		this.mainSearch = mainSearch;
		this.firstQualifier = firstQualifier;
		this.secondQualifier = secondQualifier;
		this.thirdQualifier = thirdQualifier;
	}
	
	public boolean isExplicitSearch() {
		return explicit;
	}

	public void setExplicitSearch(boolean searchExplicitly) {
		this.explicit = searchExplicitly;
	}

	public String getMainSearch() {
		return mainSearch;
	}
	
	public void setMainSearch(String mainSearch) {
		this.mainSearch = mainSearch;
	}
	
	public String getFirstQualifier() {
		return firstQualifier;
	}
	
	public void setFirstQualifier(String firstQualifier) {
		this.firstQualifier = firstQualifier;
	}
	
	public String getSecondQualifier() {
		return secondQualifier;
	}
	
	public void setSecondQualifier(String secondQualifier) {
		this.secondQualifier = secondQualifier;
	}
	
	public String getThirdQualifier() {
		return thirdQualifier;
	}
	
	public void setThirdQualifier(String thirdQualifier) {
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
