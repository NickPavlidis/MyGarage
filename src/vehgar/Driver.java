package vehgar;

public class Driver {
private String name;
private Motorcycle motorcycle;
private String sex;

public Driver(String name, Motorcycle motorcycle, String sex){
	this.name=name;
	this.motorcycle=motorcycle;
	this.sex=sex;
	}

public void setName(String name){this.name=name;}
public void setMotorcycle(Motorcycle motorcycle){this.motorcycle=motorcycle;}
public void setSex(String sex){this.sex=sex;}
public String getName(){return name;}
public Motorcycle getMotorcycle(){return motorcycle;}
public String getSex(){return sex;}

public String toString(){
	return "Driver is "+name+",  Driver Drives "+motorcycle.toString()+",  Driver is "+sex;
}
}
