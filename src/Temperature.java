package src;

public class Temperature {

    public enum Scale { 
    
        CELSIUS ( "celsius" , 0), FAHRENHEIT (" fahrenheit", 32), KELVIN (" kelvin", 273.15); 
   
        private String label; 
        private Double value; 

        private Scale ( String label, double value ){ 

            this.label= label; 
            this.value=value;
        }
   
        public String getLabel(){
            return label; 
        }
   
       public double getValue(){
        return value; 

       }
   
    }

    private double val;
    private Scale scale ; 

    public Temperature ( double val, Scale scale){
        this.val= val; 
        this.scale= scale; 
    }

    public double getVal(){
        return val; 
    }

   public Scale getScale(){
    return scale; 

   }

   public float convertToCelsius(){
    Double result;
    if (scale == Scale.FAHRENHEIT)
    result= (val -32)*5/9;
    else if (scale ==Scale.KELVIN)
    result=val-273.15; 
    else 
    result = val; 
    return result.floatValue();
   }




   public static void main ( String [ ] arg ){

    Temperature temp1 = new Temperature(25.0, Scale.CELSIUS);
    Temperature temp2 = new Temperature(195.0, Scale.FAHRENHEIT);
    Temperature temp3 = new Temperature(310.0, Scale.KELVIN);

    Temperature[] temps = { temp1, temp2,temp3 };
    for( Temperature t : temps){
        System.out.println("Temperature: " + t.getVal()+ ""+ t.getScale().getLabel());
    }

        System.out.println("Temperature 1 in Celsius: " + temp1.convertToCelsius() + " " + Scale.CELSIUS.getLabel());
        System.out.println("Temperature 2 in Celsius: " + temp2.convertToCelsius() + " " + Scale.CELSIUS.getLabel());
        System.out.println("Temperature 2 in Celsius: " + temp3.convertToCelsius() + " " + Scale.CELSIUS.getLabel());

    }
   }




