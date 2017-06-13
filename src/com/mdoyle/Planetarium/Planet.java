package com.mdoyle.Planetarium;

import java.util.List;

public abstract class Planet extends AstroEntity{
	
	private double distanceFromSun;
	private double siderealDay;
	private double orbitalPeriod;
	private int numOfSatellites;
	private List<String> namesOfBiggestSatellites;
	private boolean hasRings;
	
	public Planet(String commonName, double distanceFromSun, double siderealDay, double orbitalPeriod,
			int numOfSatellites, List<String> namesOfBiggestSatellites, boolean hasRings) {
		super(commonName);
		this.distanceFromSun = distanceFromSun;
		this.siderealDay = siderealDay;
		this.orbitalPeriod = orbitalPeriod;
		this.numOfSatellites = numOfSatellites;
		this.namesOfBiggestSatellites = namesOfBiggestSatellites;
		this.hasRings = hasRings;
	}
	
	public String getFactualSummary() {
		StringBuilder satelliteNames = new StringBuilder();
		for (String satellite : getNamesOfBiggestSatellites()) {
			satelliteNames.append(satellite);
			satelliteNames.append(", ");
		}
		
		return  super.getFactualSummary() + 
				"Distance from Sun = " + getDistanceFromSun() + "AU \n" + 
				"Sidereal Day = " + getSiderealDay() + "\n" + 
				"Orbital Period = " + getOrbitalPeriod() + "\n" + 
				"Has rings = " + hasRings() + "\n" + 
				"Number of Satellites = " + getNumOfSatellites() + "\n" +
				"Largest Satellites = " + satelliteNames + "\n";
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
	public List<String> getNamesOfBiggestSatellites() {
		return namesOfBiggestSatellites;
	}
	public void setnamesOfBiggestSatellites(List<String> namesOfBiggestSatellites) {
		this.namesOfBiggestSatellites = namesOfBiggestSatellites;
	}
	public boolean hasRings() {
		return hasRings;
	}
	public void setRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
}
