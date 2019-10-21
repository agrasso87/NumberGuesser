/**+
 * @(#)NumberGuesser.java
 *
 *
 * @Alex Grasso
 * @version 1.00 2018/10/5
 */

public class NumberGuesser {

    private int lowerBound;
	private int upperBound;
	private int midpoint;
	private int origLower;
	private int origUpper;

    public NumberGuesser(int lower, int upper){
    	lowerBound = lower;
    	upperBound = upper;
    	origLower = lower;
    	origUpper = upper;
    	midpoint = (lower + upper)/2;
    }

    public void higher(){
    	lowerBound = midpoint + 1;
    	midpoint = (lowerBound + upperBound)/2;
    }

    public void lower(){
    	upperBound = midpoint - 1;
    	midpoint = (lowerBound + upperBound)/2;
    }

    public int getCurrentGuess(){
    	return ((lowerBound + upperBound)/2);
    }

    public void reset(){
    	lowerBound = origLower;
    	upperBound = origUpper;
    }
}
