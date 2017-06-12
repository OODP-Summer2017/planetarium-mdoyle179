package com.mdoyle.Planetarium;

import java.util.List;

public abstract class Planet extends AstroEntity{
	
	private double distanceFromSun;
	private double siderealDay;
	private double orbitalPeriod;
	private int numOfSatellites;
	private List<String> namesOfBiggestSatellies;
	private boolean hasRings;
	
	public Planet(String commonName, double distanceFromSun, double siderealDay, double orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellies, boolean hasRings) {
		super(commonName);
		this.distanceFromSun = distanceFromSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numOfSatellites = numOfSatellites;
		this.namesOfBiggestSatellies = namesOfBiggestSatellies;
		this.hasRings = hasRings;
	}
	
	public String getFactualSummary() {
		return  super.getFactualSummary() + 
				"Celestial Classification = " + getCelestialClassification() + "\n" + 
				"Distance from Sun = " + getDistanceFromSun() + "AU \n" + 
				"Sidereal Day = " + getSiderealDay() + "\n" + 
				"Orbital Period = " + getOrbitalPeriod() + "\n" + 
				"Has rings = " + hasRings() + "\n" + 
				"Number of Satellites = " + getNumOfSatellites() + "\n" +
				"Largest Satellites = " + getNamesOfBiggestSatellies().get(0) + "\n";//TODO: fix the way this line prints out
	}

	public double getDistanceFromSun() {
		return distanceFromSun;
	}
	public void setDistanceFromSun(double distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	public double getSiderealDay() {
		return siderealDay;
	}
	public void setSiderealDay(double siderealDay) {
		this.siderealDay = siderealDay;
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public void setOrbitalPeriod(double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	public int getNumOfSatellites() {
		return numOfSatellites;
	}
	public void setNumOfSatellites(int numOfSatellites) {
		this.numOfSatellites = numOfSatellites;
	}
	public List<String> getNamesOfBiggestSatellies() {
		return namesOfBiggestSatellies;
	}
	public void setNamesOfBiggestSatellies(List<String> namesOfBiggestSatellies) {
		this.namesOfBiggestSatellies = namesOfBiggestSatellies;
	}
	public boolean hasRings() {
		return hasRings;
	}
	public void setRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
}
