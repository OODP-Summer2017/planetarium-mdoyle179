package com.mdoyle.Planetarium.CelestialVisitors;

import java.util.Date;

/**
 * Defines the interface for celestial visitors
 */
public interface CelestialVisitor {
	public Date lastAppearedOn();
	public Date nextAppearsOn();
	public boolean isPredictable();
}
