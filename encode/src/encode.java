
import java.util.Scanner;
public class encode {

	public static void main(String[] args) {
		String s1,s2;
		char a;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		s1=scan.nextLine();
		s2=s1.toUpperCase();
		for(i=s2.length()-1;i>=0;i--)
		{
			a=s2.charAt(i);
			if(a=='R')
			{
				a='E';
			}
			else if(a=='W')
			{
				a='R';
			}
			else if(a=='E')
			{
				a='W';
			}
			System.out.print(a);
		}
	}

}
