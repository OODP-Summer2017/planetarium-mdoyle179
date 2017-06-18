package com.mdoyle.Planetarium;

import java.util.List;

/**
 * Defines general characteristics of Planets
 *
 */
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
		List<String> satelliteList = getNamesOfBiggestSatellites();
		
		for(int i = 0; i < satelliteList.size(); i++) {
			satelliteNames.append(satelliteList.get(i));
			
			// don't append the comma if it's the last item in the list
			if (i != satelliteList.size()-1){
				satelliteNames.append(", ");
			}
		}		
		Quantity earthDay = new Quantity();
		earthDay.setUnit("EARTH_DAY");
		earthDay.setValue(getSiderealDay());
		
		Quantity orbitalPeriod = new Quantity();
		orbitalPeriod.setUnit("EARTH_DAY");
		orbitalPeriod.setValue(getOrbitalPeriod());
		
		Quantity distanceFromSun = new Quantity();
		distanceFromSun.setUnit("AU");
		distanceFromSun.setValue(getDistanceFromSun());
		
		return  super.getFactualSummary() + 
				"Distance from Sun = " + distanceFromSun.toString() + "\n" + 
				"Sidereal Day = " + earthDay.toString() + "\n" + 
				"Orbital Period = " + orbitalPeriod.toString() + "\n" + 
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
