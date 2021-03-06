package roman;

public class RomanNumbersConversion {
	
	public static final int[] romanValues = {4000,3000,2000,1000,900,800,700,600,500,400,300,200,100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};
	public static final String[] romanChars = {"MMMM","MMM","MM","M","CM","DCCC","DCC","DC","D","CD","CCC","CC","C","XC","LXXX","LXX","LX","L","XL","XXX","XX","X","IX","VIII","VII","VI","V","IV","III","II","I"};

	public static String stringToRoman(int inputNum) {

		String returnValue = "";

	    if (inputNum < 1 || inputNum > 3999) {
	        System.out.println("Invalid roman number value!");
	    }

	    for (int i = 0; i < romanValues.length; i++) {
	        int numberInPlace = inputNum / romanValues[i];
	        if (numberInPlace == 0) continue;
	        returnValue += numberInPlace == 4 && i > 0? romanChars[i] + romanChars[i - 1]:
	            new String(new char[numberInPlace]).replace("\0",romanChars[i]);
	        inputNum = inputNum % romanValues[i];
	    }
	    
	    return returnValue;       
	  }
	
	
}
