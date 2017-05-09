package vehgar;

public class Motorcycle {
	
private String brand;
private String model;
private final String vin;
private int regnum;
private double pricetag;

public Motorcycle(String brand, String model, String vin, int regnum, double pricetag){
this.brand=brand;
this.model=model;
this.vin=vin;
this.regnum=regnum;
this.pricetag=pricetag;
}
public void setBrand(String brand){this.brand=brand;}
public void setModel(String model){this.model=model;}
public void setRegnum(int regnum){this.regnum=regnum;}
public void setPricetag(double pricetag){this.pricetag=pricetag;}

public String getBrand(){return brand;}
public String getModel(){return model;}
public String getVin(){return vin;}
public int getRegnum(){return regnum;}
public double getPricetag(){return pricetag;}

public String toString(){
return " " +brand+ " " + model+" " +vin+ " "+ regnum+ " " + pricetag;
}
}

