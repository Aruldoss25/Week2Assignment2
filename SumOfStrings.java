package week2.day2;

public class SumOfStrings {

	public static void main(String[] args) {
	
			String Text = "Arul1567";
			int sum =0;
			for( int i = 0;i< Text.length();i++)
				if(Character.isDigit(Text.charAt(i)))
				{sum= sum+Character.getNumericValue(Text.charAt(i))+sum;
				
				}
			System.out.println("sum of the digit  in the string is:"+ sum);
			

		}


	}

