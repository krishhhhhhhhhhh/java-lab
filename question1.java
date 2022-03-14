import java.util.*;
class Quadratic{
    public static void main(String args[]){
        int a,b,c,ch;
        double root1,root2,disc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        disc=(b*b)-(4*a*c);
        if(disc>0){
            ch=1;
        }
        else if(disc==0){
            ch=0;
        }
        else{
            ch=-1;
        }

        switch(ch){
            case 1: 
            root1=(-b+Math.sqrt(disc))/(2*a);
            root2=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("Roots are real and unequal");
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
            break;
            
            case 0:
            System.out.println("Roots are real and equal");
            root1=(-b/(2*a));
            System.out.println("Root: "+root1);
            break;
            
            case -1:
            System.out.println("Imaginary roots");
            disc*=-1;
            root1=(-b/(2*a));
            root2=(Math.sqrt(disc))/(2*a);
            System.out.println("Root 1: "+root1+"+i"+root2);
            System.out.println("Root 2: "+root1+"-i"+root2);
            break;
        }
    }
}
