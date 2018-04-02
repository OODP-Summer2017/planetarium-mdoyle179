package com.mdoyle.Planetarium.AstroEntityCreators;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.SolarMass;
import com.mdoyle.Planetarium.Planets.Planet;
import com.mdoyle.Planetarium.Stars.GiantStar;
import com.mdoyle.Planetarium.Stars.GiantnessType;
import com.mdoyle.Planetarium.Stars.MainSequenceStar;
import com.mdoyle.Planetarium.Stars.Star;
import com.mdoyle.Planetarium.Stars.StarTempType;
import com.mdoyle.Planetarium.Stars.SupernovaStar;
import com.mdoyle.Planetarium.Stars.SupernovaType;

public class StarCreator {

	private static List<MainSequenceStar> createMainSequenceStars(){	
		List<Planet> sunPlanets = PlanetCreator.createAllPlanets();
		
		List<MainSequenceStar> mainSequenceStars = new ArrayList<MainSequenceStar>();
		
		LightYears sunDistance = new LightYears(new BigDecimal("0.0"));
		SolarMass sunMass = new SolarMass(new BigDecimal("1.0"));
		MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", StarTempType.G, new BigDecimal("-26.75"), new BigDecimal("4.82"), 
				sunDistance, sunPlanets, new BigDecimal("1.0"), sunMass);
		
		mainSequenceStars.add(sun);
		
		return mainSequenceStars;
	}

	private static List<GiantStar> createGiantStars(){
		List<GiantStar> giantStars = new ArrayList<GiantStar>();
		
		List<Planet> algolPlanets = new ArrayList<Planet>();
		LightYears algolDistance = new LightYears(new BigDecimal("93.0"));
		SolarMass algolMass = new SolarMass(new BigDecimal("3.17"));
		GiantStar algol = new GiantStar("Algol", "Beta Persei", StarTempType.K, new BigDecimal("2.12"), new BigDecimal("-.10"), 
				algolDistance, algolPlanets, GiantnessType.SUB_GIANT, algolMass);
		
		giantStars.add(algol);
		
		return giantStars;
	}

	private static List<SupernovaStar> createSupernovaStars(){
		List<SupernovaStar> supernovaStars = new ArrayList<SupernovaStar>();
		
		List<Planet> sanduleakPlanets = new ArrayList<Planet>();
		Calendar peakBrillianceDate = Calendar.getInstance();
		peakBrillianceDate.set(Calendar.MONTH, Calendar.MAY);
		peakBrillianceDate.set(Calendar.DAY_OF_MONTH, 20);
		peakBrillianceDate.set(Calendar.YEAR, 1987);
		
		LightYears sanduleakDistance = new LightYears(new BigDecimal("163000.0"));
		SolarMass sanduleakMass = new SolarMass(new BigDecimal("20"));
		SupernovaStar sanduleak = new SupernovaStar("Sanduleak - 69 - 202", "Supernova 1987A", StarTempType.B, 
				new BigDecimal("2.9"), new BigDecimal("-15.6"), sanduleakDistance, sanduleakPlanets, SupernovaType.II, 
				peakBrillianceDate.getTime(), sanduleakMass);
		
		supernovaStars.add(sanduleak);
		
		return supernovaStars;
	}
	
	public static List<Star> createAllStars(){
		List<Star> allStars = new ArrayList<Star>();
		List<MainSequenceStar> mainSequenceStars = createMainSequenceStars();
		List<GiantStar> giantStars = createGiantStars();
		List<SupernovaStar> supernovaStars = createSupernovaStars();
		
		for (MainSequenceStar mainSequenceStar: mainSequenceStars){
			allStars.add(mainSequenceStar);
		}
		
		for (GiantStar giantStar: giantStars){
			allStars.add(giantStar);
		}
		
		for (SupernovaStar supernovaStar: supernovaStars){
			allStars.add(supernovaStar);
		}
		
		return allStars;
	}
}
