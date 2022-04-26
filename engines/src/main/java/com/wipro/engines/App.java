package com.wipro.engines;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Take Break Connect @8.00pm
        
    	ElectricEngine olaElectric=new ElectricEngine();
    	olaElectric.setModel("1234");
    	olaElectric.setEngineType("Electric");
    	olaElectric.setPower(123);
    	olaElectric.setRpm(456);
    	olaElectric.setCurrentType("AC");
    	olaElectric.setTorque(23);
    	olaElectric.setVoltage("234");
    	olaElectric.setWeight(60);
    	
    	olaElectric.showSpecs();
    	
    	
    	ElectricEngine[] eletric=new ElectricEngine[5];
    	// 5 electric engine details
    	
    	
    }
}
