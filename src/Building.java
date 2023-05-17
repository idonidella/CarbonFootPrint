
public class Building implements CarbonFootprint {

    private String heatingType;
    private double annualHeatingExpenditure;
    private double annualElectricityConsumptionkWh;

    public Building(String heatingType , double annualHeatingExpenditure , double annualElectricityConsumptionkWh) {
    	setHeatingType(heatingType);
    	setAnnualElectricityConsumptionkWh(annualElectricityConsumptionkWh);
    	setAnnualHeatingExpenditure(annualHeatingExpenditure);
    }
    
    
    @Override
    public String toString() {
    
    	String a =("\nHouse heating type = " +  this.heatingType);
    	String b =("\nHouse annual heating consumption = " + this.annualHeatingExpenditure);
        String c= "";
        
        if( heatingType == "LPG" ) {
        	c= "lt";
        }

        else if (heatingType=="Coal") {
        	c= "kg";
        }
        
        else if (heatingType=="NaturalGas") {
        	c= "m3";
        }
        else if (heatingType=="Fuel-Oil") {
        	c= "MJ/kg";
        }
        else{
        	c= "lt";  //Default is lt
        }
  
        return a+b+c;
    }

    
    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public double getAnnualHeatingExpenditure() {
        return annualHeatingExpenditure;
    }

    public void setAnnualHeatingExpenditure(double annualHeatingExpenditure) {
        this.annualHeatingExpenditure = annualHeatingExpenditure;
    }

    public double getAnnualElectricityConsumptionkWh() {
        return annualElectricityConsumptionkWh;
    }

    public void setAnnualElectricityConsumptionkWh(double annualElectricityConsumptionkWh) {
        this.annualElectricityConsumptionkWh = annualElectricityConsumptionkWh;
    }

    @Override
    public double getCarbonFootprint() {
        if ( heatingType == "NaturalGas") {
            return 2.020 * this.annualHeatingExpenditure  + (annualElectricityConsumptionkWh * 0.490);
        }
        if ( heatingType == "Coal") {
            return 2.040 * this.annualHeatingExpenditure + (annualElectricityConsumptionkWh * 0.490);
        }
        if ( heatingType == "LPG") {
            return 1.680 * this.annualHeatingExpenditure + (annualElectricityConsumptionkWh * 0.490);
        }
        if ( heatingType == "Fuel-Oil") {
            return 2.960 * this.annualHeatingExpenditure + (annualElectricityConsumptionkWh * 0.490);
        }
        else{
        return 2.020 * this.annualHeatingExpenditure + (annualElectricityConsumptionkWh * 0.490); }

    }
}