package com.mdoyle.Planetarium;

import java.util.Date;

public interface CelestialVisitor {
	public Date lastAppearedOn();
	public Date nextAppearsOn();
	public boolean isPredictable();
}
