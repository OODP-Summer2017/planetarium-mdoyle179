package com.mdoyle.Planetarium;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.SolarMass;

public class SupernovaStar extends Star{
	
	private SupernovaType supernovaType;
	private Date peakBrillianceDate;
	
	public SupernovaStar(String commonName, String constellationDesignation, StarTempType spectralType,
			BigDecimal apparentMagnitude, BigDecimal absoluteMagnitude, LightYears distanceFromSun, List<Planet> planets,
			SupernovaType supernovaType, Date peakBrillianceDate, SolarMass starMass) {
		super(commonName, constellationDesignation, spectralType, apparentMagnitude, absoluteMagnitude, distanceFromSun,
				planets, starMass);
		this.supernovaType = supernovaType;
		this.peakBrillianceDate = peakBrillianceDate;
	}

	@Override
	public String getCelestialClassification() {
		return "Supernova";
	}

	@Override
	public String getFactualSummary() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
		String formattedDate = sdf.format(peakBrillianceDate.getTime());
		
		return super.getFactualSummary() +
				"Supernova Type = " + getSupernovaType() + "\n" + 
				"Peak brilliance date = " + formattedDate + "\n";
	}
	
	public SupernovaType getSupernovaType() {
		return supernovaType;
	}

	public void setSuperNovaType(SupernovaType type) {
		this.supernovaType = type;
	}

	public Date getPeakBrillianceDate() {
		return peakBrillianceDate;
	}

	public void setPeakBrillianceDate(Date peakBrillianceDate) {
		this.peakBrillianceDate = peakBrillianceDate;
	}

	
}
