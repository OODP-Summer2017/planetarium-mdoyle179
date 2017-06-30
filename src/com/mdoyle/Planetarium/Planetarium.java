package com.mdoyle.Planetarium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import com.mdoyle.Planetarium.DataTypes.AstronomicalUnit;
import com.mdoyle.Planetarium.DataTypes.EarthDay;
import com.mdoyle.Planetarium.DataTypes.EarthMass;
import com.mdoyle.Planetarium.DataTypes.LightYears;
import com.mdoyle.Planetarium.DataTypes.Quantity;
import com.mdoyle.Planetarium.DataTypes.SolarMass;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * Driver class for the program. Creates instances of all the concrete classes
 */
public class Planetarium {

//	private static HashMap<String, Quantity> createQuantities(double distanceFromSun, double siderealDay, double period) {
//		HashMap<String, Quantity> planetQuantites = new HashMap<String, Quantity>();
//		
//		Quantity auDistance = new AstronomicalUnit(distanceFromSun);
//		Quantity earthDaySd = new EarthDay(new BigDecimal(siderealDay);
//		Quantity earthDayPeriod = new EarthDay(new BigDecimal(period);
//		
//		planetQuantites.put("distance", auDistance);
//		planetQuantites.put("sideRealDay", earthDaySd);
//		planetQuantites.put("orbitalPeriod", earthDayPeriod);
//		return planetQuantites;
//
//	}

	public static void main(String[] args) {
		
		// List of all the astronomical entities
		List<AstroEntity> entities = new ArrayList<AstroEntity>();

		// Terrestial Planets
		List<String> mercurySatellites = new ArrayList<String>();
		//HashMap<String, Quantity> mercuryQuantities = createQuantities(.39, 58.65, 87.97);
		AstronomicalUnit mercuryDistanceFromSun = new AstronomicalUnit(new BigDecimal(".39"));
		EarthDay mercurySiderealDay = new EarthDay(new BigDecimal("58.65"));
		EarthDay mercuryPeriod = new EarthDay(new BigDecimal("87.97"));
		EarthMass mercuryMass = new EarthMass(new BigDecimal(".0553"));
		TerrestialPlanet mercury = new TerrestialPlanet("Mercury", mercuryDistanceFromSun, mercurySiderealDay, mercuryPeriod, 0, mercurySatellites, false, false, mercuryMass);
				
		List<String> venusSatellites = new ArrayList<String>();
		AstronomicalUnit venusDistanceFromSun = new AstronomicalUnit(new BigDecimal(".72"));
		EarthDay venusSiderealDay = new EarthDay(new BigDecimal("243.1"));
		EarthDay venusPeriod = new EarthDay(new BigDecimal("224.70"));
		EarthMass venusMass = new EarthMass(new BigDecimal(".815"));
		TerrestialPlanet venus = new TerrestialPlanet("Venus", venusDistanceFromSun, venusSiderealDay, venusPeriod, 0, venusSatellites, false, false, venusMass);
		
		List<String> earthSatellites = new ArrayList<String>();
		earthSatellites.add("Moon");
		AstronomicalUnit earthDistanceFromSun = new AstronomicalUnit(new BigDecimal("1.0"));
		EarthDay earthSiderealDay = new EarthDay(new BigDecimal("1.0"));
		EarthDay earthPeriod = new EarthDay(new BigDecimal("365.256"));
		EarthMass earthMass = new EarthMass(new BigDecimal("1.0"));
		TerrestialPlanet earth = new TerrestialPlanet("Earth", earthDistanceFromSun, earthSiderealDay, earthPeriod, 1, earthSatellites, false, true, earthMass);
		
		List<String> marsSatellites = new ArrayList<String>();
		marsSatellites.add("Phobos");
		marsSatellites.add("Deimos");
		AstronomicalUnit marsDistanceFromSun = new AstronomicalUnit(new BigDecimal("1.524"));
		EarthDay marsSiderealDay = new EarthDay(new BigDecimal("1.026"));
		EarthDay marsPeriod = new EarthDay(new BigDecimal("687.0"));
		EarthMass marsMass = new EarthMass(new BigDecimal(".107"));
		TerrestialPlanet mars = new TerrestialPlanet("Mars", marsDistanceFromSun, marsSiderealDay, marsPeriod, 2, marsSatellites, false, true, marsMass);
		
		// Gas Giant Planets
		List<String> jupiterSatellites = new ArrayList<String>();
		jupiterSatellites.add("Ganymede");
		jupiterSatellites.add("Callisto");
		jupiterSatellites.add("IO");
		AstronomicalUnit jupiterDistanceFromSun = new AstronomicalUnit(new BigDecimal("5.203"));
		EarthDay jupiterSiderealDay = new EarthDay(new BigDecimal("0.41"));
		EarthDay jupiterPeriod = new EarthDay(new BigDecimal("4332.71"));
		EarthMass jupiterMass = new EarthMass(new BigDecimal("317.8"));
		GasGiantPlanet jupiter = new GasGiantPlanet("Jupiter", jupiterDistanceFromSun, jupiterSiderealDay, jupiterPeriod, 67, jupiterSatellites, true, true, jupiterMass);
	
		List<String> saturnSatellites = new ArrayList<String>();
		saturnSatellites.add("Titan");
		saturnSatellites.add("Rhea");
		saturnSatellites.add("Iapetus");
		AstronomicalUnit saturnDistanceFromSun = new AstronomicalUnit(new BigDecimal("9.540"));
		EarthDay saturnSiderealDay = new EarthDay(new BigDecimal("0.426"));
		EarthDay saturnPeriod = new EarthDay(new BigDecimal("10759.5"));
		EarthMass saturnMass = new EarthMass(new BigDecimal("95.2"));
		GasGiantPlanet saturn = new GasGiantPlanet("Saturn", saturnDistanceFromSun, saturnSiderealDay, saturnPeriod, 62, saturnSatellites, true, true, saturnMass);
		
		List<String> uranusSatellites = new ArrayList<String>();
		uranusSatellites.add("Titania");
		uranusSatellites.add("Oberon");
		uranusSatellites.add("Umbriel");
		AstronomicalUnit uranusDistanceFromSun = new AstronomicalUnit(new BigDecimal("19.19"));
		EarthDay uranusSiderealDay = new EarthDay(new BigDecimal("0.717"));
		EarthDay uranusPeriod = new EarthDay(new BigDecimal("30685"));
		EarthMass uranusMass = new EarthMass(new BigDecimal("14.5"));
		GasGiantPlanet uranus = new GasGiantPlanet("Uranus", uranusDistanceFromSun, uranusSiderealDay, uranusPeriod, 27, uranusSatellites, true, false, uranusMass);
		
		List<String> neptuneSatellites = new ArrayList<String>();
		neptuneSatellites.add("Triton");
		neptuneSatellites.add("Proteus");
		neptuneSatellites.add("Nereid");
		AstronomicalUnit neptuneDistanceFromSun = new AstronomicalUnit(new BigDecimal("30.06"));
		EarthDay neptuneSiderealDay = new EarthDay(new BigDecimal("0.671"));
		EarthDay neptunePeriod = new EarthDay(new BigDecimal("60190.0"));
		EarthMass neptuneMass = new EarthMass(new BigDecimal("17.1"));
		GasGiantPlanet neptune = new GasGiantPlanet("Neptune", neptuneDistanceFromSun, neptuneSiderealDay, neptunePeriod, 14, neptuneSatellites, true, false, neptuneMass);
		
		// Dwarf Planets
		List<String> plutoSatellites = new ArrayList<String>();
		plutoSatellites.add("Charon");
		plutoSatellites.add("Nix");
		plutoSatellites.add("Hydra");
		AstronomicalUnit plutoDistanceFromSun = new AstronomicalUnit(new BigDecimal("39.53"));
		EarthDay plutoSiderealDay = new EarthDay(new BigDecimal("6.386"));
		EarthDay plutoPeriod = new EarthDay(new BigDecimal("90800"));
		EarthMass plutoMass = new EarthMass(new BigDecimal(".0022"));
		DwarfPlanet pluto = new DwarfPlanet("Pluto", plutoDistanceFromSun, plutoSiderealDay, plutoPeriod, 5, plutoSatellites, false, false, plutoMass);
		
		// Main Sequence Stars
		List<Planet> sunPlanets = new ArrayList<Planet>();	
		sunPlanets.add(mercury);
		sunPlanets.add(venus);
		sunPlanets.add(earth);
		sunPlanets.add(mars);
		sunPlanets.add(jupiter);
		sunPlanets.add(saturn);
		sunPlanets.add(uranus);
		sunPlanets.add(neptune);
		sunPlanets.add(pluto);
		LightYears sunDistance = new LightYears(new BigDecimal("0.0"));
		SolarMass sunMass = new SolarMass(new BigDecimal("1.0"));
		MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", StarTempType.G, new BigDecimal("-26.75"), new BigDecimal("4.82"),sunDistance, sunPlanets, new BigDecimal("1.0"), sunMass);
		
		// Giant Stars
		List<Planet> algolPlanets = new ArrayList<Planet>();
		LightYears algolDistance = new LightYears(new BigDecimal("93.0"));
		SolarMass algolMass = new SolarMass(new BigDecimal("3.17"));
		GiantStar algol = new GiantStar("Algol", "Beta Persei", StarTempType.K, new BigDecimal("2.12"), new BigDecimal("-.10"), algolDistance, algolPlanets, GiantnessType.SUB_GIANT, algolMass);
		
		// Supernova Stars
		List<Planet> sanduleakPlanets = new ArrayList<Planet>();
		Calendar peakBrillianceDate = Calendar.getInstance();
		peakBrillianceDate.set(Calendar.MONTH, Calendar.MAY);
		peakBrillianceDate.set(Calendar.DAY_OF_MONTH, 20);
		peakBrillianceDate.set(Calendar.YEAR, 1987);
		LightYears sanduleakDistance = new LightYears(new BigDecimal("163000.0"));
		SolarMass sanduleakMass = new SolarMass(new BigDecimal("20"));
		SupernovaStar sanduleak = new SupernovaStar("Sanduleak - 69 - 202", "Supernova 1987A", StarTempType.B, new BigDecimal("2.9"), new BigDecimal("-15.6"), sanduleakDistance, sanduleakPlanets, SupernovaType.II, peakBrillianceDate.getTime(), sanduleakMass);
		
		// Celestial Visitors
		Calendar nextAppearsOn = Calendar.getInstance();
		nextAppearsOn.set(Calendar.MONTH, Calendar.JANUARY);
		nextAppearsOn.set(Calendar.DAY_OF_MONTH, 1);
		nextAppearsOn.set(Calendar.YEAR, 1986);	
		
		Calendar lastAppearedOn = Calendar.getInstance();
		lastAppearedOn.set(Calendar.MONTH, Calendar.JANUARY);
		lastAppearedOn.set(Calendar.DAY_OF_MONTH, 1);
		lastAppearedOn.set(Calendar.YEAR, 2061);		
		CelestialVisitorImpl halleysComet = new CelestialVisitorImpl("Halley's Comet", nextAppearsOn.getTime(), lastAppearedOn.getTime(), true);		

		//Add the entities to the list
		entities.add(sun);
		entities.add(mercury);
		entities.add(venus);
		entities.add(earth);
		entities.add(mars);
		entities.add(jupiter);
		entities.add(saturn);
		entities.add(uranus);
		entities.add(neptune);
		entities.add(pluto);
		entities.add(algol);
		entities.add(sanduleak);
		entities.add(halleysComet);
		
		System.out.println("Planetarium");
		System.out.println("*********************");
		// Print results to the console using polymorphism
		for(AstroEntity entity : entities) {
			System.out.println(entity.getFactualSummary());
		}
	}
}
