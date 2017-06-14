package com.mdoyle.Planetarium;

/**
 * Abstract class for all Astronomical Entities
 *
 */
public abstract class AstroEntity {
	private String commonName;

	public AstroEntity(String commonName) {
		this.commonName = commonName;
	}
	
	public abstract String getCelestialClassification();
	
	/**
	 * Gets the factual summary
	 * @return String with the summary
	 */
	public String getFactualSummary(){
		return "Name = " + getCommonName() + "\n" +
				"Celstial Classification = " + getCelestialClassification() + "\n";
	}
	
	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
}
