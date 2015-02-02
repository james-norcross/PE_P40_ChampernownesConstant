package projecteuler.problem40;

public class ChampernownesConstant {

	/**
	 * Author: James Norcross
	 * Date: 2/2/15
	 * Purpose: Project Euler Problem 40
	 * Description: Constructs Champernowne's constant and calculates the product of the digits in place 1,10,100,1000,10000,
	 * 100000,1000000
	 */
	
	public static final int MAX = 1000000;
	
	public static void main(String[] args) {
		
		// solution using StringBuilder to construct Champernowne's constant
		StringBuilder result = new StringBuilder(MAX);
		result.append('.');
		
		for(int i = 1; result.length() <= MAX; i++)
		{
			result.append(Integer.toString(i));
		}
		
		String champernownesConstant = result.toString();
		int product = 1;
		
		for(int j = 1; j <= MAX; j *= 10)
		{
			product *= Integer.parseInt(Character.toString(champernownesConstant.charAt(j)));
		}
		
		System.out.println(product);
		
	}

}
