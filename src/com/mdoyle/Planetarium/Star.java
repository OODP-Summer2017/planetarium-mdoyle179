package com.mdoyle.Planetarium;

import java.math.BigDecimal;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.Quantity;
import com.mdoyle.Planetarium.DataTypes.SolarMass;

/**
 * Defines general characteristics of Stars
 *
 */
public abstract class Star extends AstroEntity{
	
	private String constellationDesignation;
	private StarTempType spectralType;
	private BigDecimal apparentMagnitude;
	private BigDecimal absoluteMagnitude;
	private LightYears distanceFromSun;
	private List<Planet> planets;
	private SolarMass starMass;
	
	public Star(String commonName, String constellationDesignation, StarTempType spectralType, BigDecimal apparentMagnitude,
			BigDecimal absoluteMagnitude, LightYears distanceFromSun, List<Planet> planets, SolarMass starMass) {
		super(commonName);
		this.constellationDesignation = constellationDesignation;
		this.spectralType = spectralType;
		this.apparentMagnitude = apparentMagnitude;
		this.absoluteMagnitude = absoluteMagnitude;
		this.distanceFromSun = distanceFromSun;
		this.planets = planets;
		this.starMass = starMass;
	}

	@Override
	public String getFactualSummary() {
		StringBuilder planetNames = new StringBuilder();
		List<Planet> planetList = getPlanets();
		
		for(int i = 0; i < planetList.size(); i++) {
			planetNames.append(planetList.get(i).getCommonName());
			
			// don't append the comma if it's the last item in the list
			if (i != planetList.size()-1){
				planetNames.append(", ");
			}
		}

		return super.getFactualSummary() +
				"Relative Mass = " + getMass().toString() +"\n" +
				"Constellation Desgination = " + getConstellationDesignation() + "\n" + 
				"Spectral Type = " + getSpectralType() + "\n" + 
				"Apparent Magnitude = " + getApparentMagnitude() + "\n" + 
				"Absolute Magnitude = " + getAbsoluteMagnitude() + "\n" + 
				"Distance from Sun = " +  getDistanceFromSun().toString() + "\n" +
				"Planets = " + planetNames.toString() + "\n";
	}
	
	public Quantity getMass() {
		return starMass;
	}

	public void setStarMass(Quantity starMass) {
		SolarMass solarMass = new SolarMass(starMass.getValue());
		this.starMass = solarMass;
	}

	public String getConstellationDesignation() {
		return constellationDesignation;
	}
	public void setConstellationDesignation(String constellationDesignation) {
		this.constellationDesignation = constellationDesignation;
	}
	public StarTempType getSpectralType() {
		return spectralType;
	}
	public void setSpectralType(StarTempType spectralType) {
		this.spectralType = spectralType;
	}
	public BigDecimal getApparentMagnitude() {
		return apparentMagnitude;
	}
	public void setApparentMagnitude(BigDecimal apparentMagnitude) {
		this.apparentMagnitude = apparentMagnitude;
	}
	public LightYears getDistanceFromSun() {
		return distanceFromSun;
	}
	public void setDistanceFromSun(LightYears distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	public List<Planet> getPlanets() {
		return planets;
	}
	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}
	public BigDecimal getAbsoluteMagnitude() {
		return absoluteMagnitude;
	}
	public void setAbsoluteMagnitude(BigDecimal absoluteMagnitude) {
		this.absoluteMagnitude = absoluteMagnitude;
	}
}
