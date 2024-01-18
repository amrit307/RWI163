package com.maven.ProjectWithMaven;

public class CarsInfo {
  private int id;
  private int cc;
  private String color;
  private Cars cars;
  

public CarsInfo(int id, int cc, String color, Cars cars) {
	super();
	this.id = id;
	this.cc = cc;
	this.color = color;
	this.cars = cars;
}


@Override
public String toString() {
	return "CarsInfo [id=" + id + ", cc=" + cc + ", color=" + color + ", cars=" + cars + "]";
}



  
}
