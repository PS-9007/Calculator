
public class Calculator {
	int a,b;
    public void addition()
    {
    	a=23;
    	b=56;
    	System.out.println("Addition of Numbers : "+(a+b));
    }
    
    public void subtraction()
    {
    	a=78;
    	b=35;
    	System.out.println("Subtraction of Numbers : "+(a-b));
    }
    public void multiplication()
    {
    	a=17;
    	b=7;
    	System.out.println("Multiplication of Numbers : "+(a*b));
    }
    public void division()
    {
    	a=90;
    	b=6;
    	System.out.println("Quotient of Numbers : "+(a/b));
    	System.out.println("Remainder of Numbers : "+(a%b));
    }
	
    public static void main(String[] args) {

    	Calculator c=new Calculator();
    	
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		
		
	}
}