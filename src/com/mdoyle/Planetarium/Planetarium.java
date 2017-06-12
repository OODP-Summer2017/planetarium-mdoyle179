package com.mdoyle.Planetarium;

import java.util.ArrayList;
import java.util.List;

public class Planetarium {
	public static void main(String[] args) {
		
		//create object to represent each concrete class
		//invoke getFactualSummary() method, and print results to the console. use polymorphism
		List<AstroEntity> entities = new ArrayList<AstroEntity>();
		
		List<String> earthSatellites = new ArrayList<String>();
		earthSatellites.add("Moon");
		TerrestialPlanet earth = new TerrestialPlanet("Earth", 1.0, 1.0, 365.256, 1, earthSatellites, false, true);
		entities.add(earth);
		
		//GasGiantPlanet jupiter = new GasGiantPlanet();
	
		
		List<Planet> planets = new ArrayList<Planet>();	
		planets.add(earth);
		MainSequenceStar sun = new MainSequenceStar("Sun", "Our Sun", StarTempType.G, -26.75, 4.82, 0.0, planets, 1.0);
		entities.add(sun);

		for(AstroEntity entity : entities) {
			System.out.println(entity.getFactualSummary());
		}
	}
}
