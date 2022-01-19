package training;
import java.util.Scanner;

public class vowel_chars {
	
	public static Scanner r=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please, enter the next information");
		System.out.println("First, provide the position rule, how often are vowels detected?");
		int p = r.nextInt();
		r.nextLine();
		System.out.println("Now enter the string that will be analyzed");
		String s = r.nextLine();
		vowels(p,s);
		
	}

	private static void vowels(int p, String s) {
		int x=-1;
		boolean ban=false;
		String vowels="";
		do
		{
			if(((x+p)>s.length()-1))
			{
				System.out.println("The next characters will be deprecated due to the given position rule and the length of the string");
				for(x=x+1; x<s.length();x++)
				{
					System.out.print(s.charAt(x));
				}
				System.out.println();
			}
			else
			{
				x = x+p;
				if(s.charAt(x)=='a'||s.charAt(x)=='e'||s.charAt(x)=='i'||s.charAt(x)=='o'||s.charAt(x)=='u')
					{
					ban = true;
					vowels = vowels + (s.charAt(x)+" ");
					}	
			}
			
		}while(x<s.length());
		
		if(ban==true)
			System.out.println("Given the position rule, i found the next vowels: "+vowels);
		else
			System.out.println("Given the position rule, i cannot found any vowel :(");
		
	}
	
	

}
