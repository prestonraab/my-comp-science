/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card firstcard= new Card("jack","diamond",11);
		Card secondcard = new Card("jack","diamond",11);
		System.out.println(firstcard.toString());
		System.out.println(secondcard.toString());
		System.out.println(firstcard.matches(secondcard));
		System.out.println(secondcard.matches(firstcard));
	}
}
