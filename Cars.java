package com.maven.ProjectWithMaven;

public class Cars {
	
private String name;
private String series;
public Cars(String name ,String series) {
	super();
	this.name = name;
	this.series = series;
	
}
@Override
public String toString() {
	return "Cars [name=" + name + ", series=" + series + "]";
}

}
