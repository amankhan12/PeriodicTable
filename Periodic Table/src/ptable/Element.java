package ptable;

public class Element {
	
	
	
String elementName;
String symbol;

public String getElementName() {
	return elementName;
}
public void setElementName(String elementName) {
	this.elementName = elementName;
}
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}



public boolean checkSymbol(String symbol, String elementName) {
	
	boolean acceptable = true;
	int count =0;


	for(int y =0; y<=symbol.length(); y++) {
		

		if(! (symbol.length() == 2)) {
			
			acceptable = false;
		
		}
		else {
			
		for(int i=0; i <=elementName.length(); i++) {	

			String let1 = symbol.substring(0, 1);
			String let2 = symbol.substring(1,symbol.length());
			
			
			String firstLetter = elementName.substring(0,1);
			String rest = elementName.substring(1,elementName.length());
			
			String name = firstLetter + rest;
			
			if(!(name.contains(let1) && name.contains(let2))) {
				
				acceptable = false;
				
			}
			else if(let1.equals(let2)) {


			
			count = name.length() - name.replace(let1, "").length();
			
			if(!(count == 2)) {
				
				acceptable = false;
			}
				
			}
			
			}
	}

	


}

	return acceptable;		

}




	public boolean checkOrder(String symbol, String elementName) {
	
		boolean correctOrder = true;

		
			int symbolIndex = 0;
			
			for( char character: symbol.toCharArray() ) {
				
				symbolIndex = elementName.indexOf(character, symbolIndex);
			
				if(symbolIndex == -1) {
						
	
				
				correctOrder = false;
			}
			
			
			}
			return  correctOrder;
			}
		

	}


