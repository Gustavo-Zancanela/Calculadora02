public class Calculator2 {
    public double tax = 0.05;
    public double tip = 0.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){
        
        double total = originalPrice * (1 + tax + tip);
        System.out.println("$" + total);
        //Calculate an individual's total after tax and tip
        //Print this value
    }
}
