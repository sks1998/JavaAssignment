import java.io.*;
import java.util.*;
import java.util.regex.*;
class Assignment1
{
	public static void main(String args[])
	{ 
		Scanner scan=new Scanner(System.in);
		int n;
		String text=scan.nextLine();
		n=Integer.parseInt(scan.nextLine());
		findpattern(text,n);
	}
	public static void findpattern(String TextToFind,int n)
	{
		String temp=TextToFind;
		Scanner scan=new Scanner(System.in);
		int i;
		String a[]=new String[100];
		ArrayList<Integer>list = new ArrayList<>();
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(int j=-1;(j=temp.indexOf(a[i],j+1)) !=-1;)
			{ 
				list.add(j);
			}
		}
		Collections.sort(list);
		for(Integer txt:list)
			System.out.print(txt+" ");
	}
}