package ptable;

import java.util.HashMap;
import java.util.Random;

public class PeriodicTable {



public String generateSymbol(String elementName) {
	
	HashMap<String,String> element = new HashMap<String,String>() ;

		String symbol = "";
		String firstLetter = elementName.substring(0, 1);
		String rest = elementName.substring(1,elementName.length());
	
			for(int i =0; i<=rest.length(); i++) {
		
				Random rd = new Random();
				
				int n = rd.nextInt(rest.length());
				
				char symbol1 = (char) rest.charAt(n);
				
				Character.toString(symbol1);
				
				symbol = firstLetter + symbol1;
			
	}
 	
	
	
	return symbol;
	
	
	
	
	
}
	
	
	

}
