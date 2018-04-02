package com.mdoyle.Planetarium.AstroEntityCreators;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mdoyle.Planetarium.CelestialVisitors.CelestialVisitorImpl;

public class CelestialVisitorCreator {
	
	public static List<CelestialVisitorImpl> createCelestialVisitors(){
		List<CelestialVisitorImpl> celestialVisitors = new ArrayList<CelestialVisitorImpl>();

		Calendar nextAppearsOn = Calendar.getInstance();
		nextAppearsOn.set(Calendar.MONTH, Calendar.JANUARY);
		nextAppearsOn.set(Calendar.DAY_OF_MONTH, 1);
		nextAppearsOn.set(Calendar.YEAR, 1986);	
		
		Calendar lastAppearedOn = Calendar.getInstance();
		lastAppearedOn.set(Calendar.MONTH, Calendar.JANUARY);
		lastAppearedOn.set(Calendar.DAY_OF_MONTH, 1);
		lastAppearedOn.set(Calendar.YEAR, 2061);		
		CelestialVisitorImpl halleysComet = new CelestialVisitorImpl("Halley's Comet", nextAppearsOn.getTime(), lastAppearedOn.getTime(), true);	
		
		celestialVisitors.add(halleysComet);
		
		return celestialVisitors;
	}
}
