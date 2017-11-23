package edu.albany.dg643867.setup;

public class Liquid {
	protected String name;
	
	public Liquid(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Liquid: " + name;
	}
}
