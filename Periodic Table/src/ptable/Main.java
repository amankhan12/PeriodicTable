package ptable;

public class Main {
	
public static void main(String args[]) {
	

	
Element element = new Element() ;

PeriodicTable pd = new PeriodicTable();

	System.out.println("Element symbol is of correct length? \nSymbol contains characters from element name \nIf Symbol contains 2 repeated letters is in element name! : " + element.checkSymbol("ex", "xenon"));

	System.out.println( "Symbol characters in correct order? : " +element.checkOrder("ex", "xenon"));
 
	System.out.println(pd.generateSymbol("Silver"));
	
	
}
}
