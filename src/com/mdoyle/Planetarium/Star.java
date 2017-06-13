package com.mdoyle.Planetarium;

import java.util.List;

public abstract class Star extends AstroEntity{
	private String constellationDesignation;
	private StarTempType spectralType;
	private double apparentMagnitude;
	private double absoluteMagnitude;
	private double distanceFromSun;
	private List<Planet> planets;
	
	public Star(String commonName, String constellationDesignation, StarTempType spectralType, double apparentMagnitude,
			double absoluteMagnitude, double distanceFromSun, List<Planet> planets) {
		super(commonName);
		this.constellationDesignation = constellationDesignation;
		this.spectralType = spectralType;
		this.apparentMagnitude = apparentMagnitude;
		this.absoluteMagnitude = absoluteMagnitude;
		this.distanceFromSun = distanceFromSun;
		this.planets = planets;
	}

	@Override
	public String getFactualSummary() {
		StringBuilder planetNames = new StringBuilder();
		List<Planet> planetList = getPlanets();
		
		for(int i = 0; i < planetList.size(); i++) {
			planetNames.append(planetList.get(i).getCommonName());
			if (i != planetList.size()-1){
				planetNames.append(", ");
			}
		}				
		return super.getFactualSummary() +
				"Constellation Desgination = " + getConstellationDesignation() + "\n" + 
				"Spectral Type = " + getSpectralType() + "\n" + 
				"Apparent Magnitude = " + getApparentMagnitude() + "\n" + 
				"Absolute Magnitude = " + getAbsoluteMagnitude() + "\n" + 
				"Distance from Sun = " + getDistanceFromSun() + " light years \n" +
				"Planets = " + planetNames.toString() + "\n";
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
	public double getApparentMagnitude() {
		return apparentMagnitude;
	}
	public void setApparentMagnitude(double apparentMagnitude) {
		this.apparentMagnitude = apparentMagnitude;
	}
	public double getDistanceFromSun() {
		return distanceFromSun;
	}
	public void setDistanceFromSun(double distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	public List<Planet> getPlanets() {
		return planets;
	}
	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}
	public double getAbsoluteMagnitude() {
		return absoluteMagnitude;
	}
	public void setAbsoluteMagnitude(double absoluteMagnitude) {
		this.absoluteMagnitude = absoluteMagnitude;
	}
}
