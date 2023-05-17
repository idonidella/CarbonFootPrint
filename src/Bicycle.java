
public class Bicycle implements CarbonFootprint{

    private String Model;
    private String foodType;
    private double footprintmileforfood_A;
    private double footprintmileforfood_B;
    private double footprintmileforfood_C;
 

	public Bicycle(String model, String foodType, double footprintmileforfood_A, double footprintmileforfood_B,
			double footprintmileforfood_C) {			
		
		setModel(model);
		setFoodType(foodType);									//EFEKAN EFE
		setFootprintmileforfood_A(footprintmileforfood_A);
		setFootprintmileforfood_B(footprintmileforfood_B);
		setFootprintmileforfood_C(footprintmileforfood_C);
		
	}

	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	public double getFootprintmileforfood_A() {
		return footprintmileforfood_A;
	}


	public void setFootprintmileforfood_A(double footprintmileforfood_A) {
		this.footprintmileforfood_A = footprintmileforfood_A;
	}


	public double getFootprintmileforfood_B() {
		return footprintmileforfood_B;
	}


	public void setFootprintmileforfood_B(double footprintmileforfood_B) {
		this.footprintmileforfood_B = footprintmileforfood_B;
	}


	public double getFootprintmileforfood_C() {
		return footprintmileforfood_C;
	}


	public void setFootprintmileforfood_C(double footprintmileforfood_C) {
		this.footprintmileforfood_C = footprintmileforfood_C;
	}


	public String getModel() {
        return Model;
    }
    
    
    public void setModel(String model) {
        this.Model = model;
    }
    
    
    @Override
    public String toString() {

        String a = "\nBicycle Model = " +  this.Model;
        String c= "";
        
        if( foodType == "A" ) {
        	c= "\nSelected food: A";
        }

        else if (foodType=="B") {
        	c= "\nSelected food: B";
        }
        
        else if (foodType=="C") {
        	c= "\nSelected food: C";
        }
        else{
        	c= "\nno valid meal selected";
        }
  
        return a+c;
       
    }

    @Override
    public double getCarbonFootprint() {
    	if (foodType == "A") {
            return 0 + this.footprintmileforfood_A;
        }
        if (foodType == "B") {
        	 return 0 + this.footprintmileforfood_B;
        }
        if (foodType == "C") {
        	 return 0 + this.footprintmileforfood_C;
        }

        else{
        return 0; }
    }   
}