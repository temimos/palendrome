package queen;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Pally {
    public String reversal(String inputString)
    {
        String outputString="";

         for (int i= inputString.length()-1; i>= 0; i-- ) //start of the string ; as long as i is >=0; go backwards
             {
                 outputString+= inputString.charAt(i);


             }

             return outputString;
    }
    public boolean isPalindromeSimple (String term) {
        String backwardsterm = reversal(term);
        Boolean isSame = term.equals(backwardsterm);
        return isSame;
    }
}
