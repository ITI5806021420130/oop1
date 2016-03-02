import java.util.Scanner;
public class decode {

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
			if(a=='E')
			{
				a='R';
			}
			else if(a=='R')
			{
				a='W';
			}
			else if(a=='W')
			{
				a='E';
			}
			System.out.print(a);
		}
	}

}
