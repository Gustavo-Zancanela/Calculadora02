public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party
        Calculator2 calc = new Calculator2();
        
        calc.originalPrice = 10; //Person 1: $10
        calc.findTotal();
        
        calc.originalPrice = 12; // Person 2: $12
        calc.findTotal();
        
        calc.originalPrice = 9; // Person 3: $9
        calc.findTotal();
        
        calc.originalPrice = 8; // Person 4: $8
        calc.findTotal();
        
        calc.originalPrice = 7;  //Person 5: $7
        calc.findTotal();
        
        calc.originalPrice = 15; // Person 6: $15 (Alex)
        calc.findTotal();
        
        calc.originalPrice = 11; //  Person 7: $11
        calc.findTotal();
        
        calc.originalPrice = 30; // Person 8: $30
        calc.findTotal();
       
        
    }
}
