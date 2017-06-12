package com.mdoyle.Planetarium;

import java.util.List;

public abstract class Star extends AstroEntity{
	private String constellationDesignation;
	private StarTempType spectralType;
	private double apparentMagnitude;
	private double absoluteMagnitude;
	
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
	
	private double distanceFromSun;
	private List<Planet> planets;
	
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
