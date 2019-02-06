import java.io.*;
import java.util.*;
class Strcompare
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	String b=input.nextLine();
	if(a.length()>=b.length())
	{
		System.out.println(a);
	}
	else
	{
		System.out.println(b);
	}
    }
}
