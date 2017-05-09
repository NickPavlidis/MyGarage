package vehgar;

public class TestMotorcycle {

	public static void main(String[] args) {
		//Test all the public Methods
		Motorcycle fz6 =new Motorcycle("Yamaha", "Fazer", "12345qwerty", 17678, 3.5);
		System.out.println(fz6);
		fz6.setRegnum(51180);
		System.out.println(fz6);
		fz6.setBrand("Suzuki");
		System.out.println(fz6);
		fz6.setModel("Vstrom");
		System.out.println(fz6);
		fz6.setPricetag(5.2);
		System.out.println(fz6);
		Motorcycle fz5=new Motorcycle("Honda", "Cbr","zaqxsw123cde",34562,4.5);
		System.out.println(fz5);
		System.out.println(fz6.getBrand());
		System.out.println(fz6.getModel());
		
		Driver nikos=new Driver("Nikos",fz6,"male");
		System.out.println(nikos);
		
	}
}
