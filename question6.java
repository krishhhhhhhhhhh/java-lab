package CIE;
	import java.util.*;
	public class personal
	{
		public String name;
		public int sem;
		public String usn;
		
		public void read()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name");
			name = sc.next();
			System.out.println("Enter the semester");
			sem = sc.nextInt();
			System.out.println("Enter the USN");
			usn = sc.next();
		}
		public void display()
		{
			System.out.println("Student details: ");
			System.out.println("Name: "+name+"\nUSN: "+usn+"\nSem: "+sem);
		}
			
		
	}


package CIE;
	import java.util.*;
	public class internals extends personal
	{
		public double cie[];
		
		public void accept()
		{
			cie= new double[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("CIE mark for course "+(i+1)+" : ");
				cie[i]= sc.nextDouble();
			}
		}
		
		
		
	}

package SEE;
	import java.util.*;
	import CIE.*;
	public class externals extends personal
	{
		public double see[];
		
		public void get()
		{
			see= new double[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("SEE mark for course "+(i+1)+" : ");
				see[i]= sc.nextDouble();
			}
		}
		
		
	}


import CIE.*;
	import SEE.*;
	import java.util.*;
	
	class Main
	{
		public static void main(String args[])
		{
			Scanner sx = new Scanner(System.in);
			System.out.println("Enter the number of students");
			int n= sx.nextInt();
			CIE.internals in[]= new CIE.internals[n];
			SEE.externals en[]= new SEE.externals[n];
			int i,j;
			for(i=0;i<n;i++)
			{
				System.out.println("Student "+(i+1));
				in[i] = new CIE.internals();
				en[i] = new SEE.externals();
				in[i].read();
				
				System.out.println("CIE MARKS:");
				in[i].accept();
				System.out.println("SEE MARKS:");
				en[i].get();
				System.out.println();
				in[i].display();
				for(j=0;j<5;j++)
				
				System.out.println("Total Marks for course "+(j+1)+": "+(in[i].cie[j] + (en[i].see[j]/2)));
			}
		}
	
}
