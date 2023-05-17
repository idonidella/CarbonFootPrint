import java.util.ArrayList;

public class CarbonFootPrintMain {

	public static void main(String[] args) {
		

		ArrayList<CarbonFootprint> footPrint = new ArrayList<CarbonFootprint>();

		footPrint.add(new Bicycle("Bianchi","B",200,250,300));
		footPrint.add(new Bicycle("enterwhateveryouwant","Default",0,0,0));
																				//EFEKAN EFE
		footPrint.add(new Building("Fuel-Oil", 100, 100));
		footPrint.add(new Building("enterwhateveryouwant", 0, 0));
						//  ITS SOURCE FOR FOOT CARBON PRINT https://www.egeorman.org.tr/hesaplayicilar/karbon-ayakizi/
		footPrint.add(new Car("Diesel", 15));
		footPrint.add(new Car("enterwhateveryouwant", 0));

		for (CarbonFootprint i : footPrint) {
			System.out.println("\nItems: " + i.toString());
			System.out.println("Carbon FootPrint: " + i.getCarbonFootprint() + " kg CO2");
		}
	}
}
