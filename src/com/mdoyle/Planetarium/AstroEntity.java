package com.mdoyle.Planetarium;

import com.mdoyle.Planetarium.DataTypes.Quantity;

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
	
	public abstract Quantity getMass();
	
	/**
	 * Gets the factual summary
	 * @return String with the summary
	 */
	public String getFactualSummary(){
		return "Name = " + getCommonName() + System.lineSeparator() +
				"Celstial Classification = " + getCelestialClassification() + System.lineSeparator();
	}
	
	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
}
