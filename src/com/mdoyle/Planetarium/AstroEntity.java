package com.mdoyle.Planetarium;

public abstract class AstroEntity {
	private String commonName;

	public AstroEntity(String commonName) {
		this.commonName = commonName;
	}
	
	public abstract String getCelestialClassification();
	
	public String getFactualSummary(){
		return "Name = " + getCommonName() + "\n";
	}
	
	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
}
