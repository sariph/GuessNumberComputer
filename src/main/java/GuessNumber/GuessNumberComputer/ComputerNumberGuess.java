package GuessNumber.GuessNumberComputer;

import java.util.Scanner;

/**
 * @author Sariph Shrestha
 *
 */

public class ComputerNumberGuess {
	public static final String READY="ready";
	public static final String HIGHER="higher";
	public static final String LOWER="lower";
	public static final String END="end";
	public static final String YES="yes";
	public static final String QUESTION="Is the Number ";
	public static final String QUESTION_MARK="?";
	
	/**
	 * The range of values was not specified in the problem
	 * So if we assume the range to be maximum value of the Integer then there might be an overflow
	 * There are few solutions
	 * 1) Increase the size of the data type to higher[long, BigInteger]
	 * 2) Decrease the value of the maximum and minimum to half so that it does not overflow
	 * public static int lowerBound=Integer.MIN_VALUE/2;
	 * public static int upperBound=Integer.MAX_VALUE/2;
	 */
	public static int lowerBound=-100;
	public static int upperBound=100;
	
	private final Scanner scanner;
	
	public ComputerNumberGuess(){
		this(new Scanner(System.in));
	}
	
	/**
	 * For Dependency Injection(If needed)
	 * @param scanner
	 */
	public ComputerNumberGuess(Scanner scanner) {
		this.scanner=scanner;
	}
	
	/**
	 * @return
	 */
	public String getNext(){
		return scanner.next();
	}
	
	public void guessNumber(){
			//Take the user Input
			String userInput=getNext();
			
			//The game begins
			if(userInput.equalsIgnoreCase(READY)){
				while(!userInput.equalsIgnoreCase(END) && !userInput.equalsIgnoreCase(YES)){
					int currentGuess=(lowerBound + upperBound)/2;
					System.out.println(QUESTION+currentGuess+QUESTION_MARK);
					
					//Get User Response
					userInput=getNext();
					if(userInput.equalsIgnoreCase(HIGHER)){
						lowerBound=currentGuess+1;
					} else if(userInput.equalsIgnoreCase(LOWER)){
						upperBound=currentGuess-1;
					}
				}
			}
		return;
	}

	public static void main(String args[]){
		ComputerNumberGuess computerNumberGuess=new ComputerNumberGuess(new Scanner(System.in));
		computerNumberGuess.guessNumber();
	}
}
