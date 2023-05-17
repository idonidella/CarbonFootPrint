
public class Car implements CarbonFootprint{

    private String carModel;
    private double Consumption;
    
    
    public Car(String carModel, double Consumption) {
        this.carModel=carModel;
        this.Consumption=Consumption;
    }
    
  
    public String getModel() {
        return carModel;
    }
    public void setModel(String model) {
        this.carModel = model;
    }
    public double getConsumption() {
        return Consumption;
    }
    public void setConsumption(double consumption) {
        this.Consumption = consumption;
    }

    @Override
    public String toString() {
       
        String b= "\nCar fuel type = " +  this.carModel;
        String c= "\nAnnual fuel consumption = " + this.Consumption +" lt.";
        return b +c;
    }
    
    @Override
    public double getCarbonFootprint() {
        if(carModel == "Diesel") {
            return 2.6 * this.Consumption;
        }
        if(carModel == "LPG") {
            return 1.680 * this.Consumption;
        }
        if(carModel == "Gas") {
            return 2.240 * this.Consumption;
        }
        else {
            return 2.240 * this.Consumption;
        }
    }


}