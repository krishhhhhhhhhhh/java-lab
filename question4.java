import java.util.*;
abstract class shape{
    double a,b;
    abstract void printArea();
}

class rectangle extends shape{
    void getdata(double x,double y){
        a=x;
        b=y;
    }
    
    @Override
    void printArea() {
        System.out.println("The area of rectangle is " + (a*b));
    }
}


class triangle extends shape{
    void getdata(double x,double y){
        a=x;
        b=y;
    }
    @Override
    void printArea() {
        System.out.println("The area of triangle is " + (0.5*a*b));
    }
}
class circle extends shape{
    void getdata(double x){
        a=x;
        b=x;
    }
    @Override
    void printArea() {
        System.out.println("The area of circle is "+ (float)(3.1415*a*b));
    }
}
public class abstraction {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int choice;
        float p,q;
        rectangle a1=new rectangle();
        triangle a2=new triangle();
        circle a3 =new circle();

        do{
            System.out.println("Choose Shape \n1.rectangle \n2.triangle \n3.circle\n4.Exit");
            choice =input.nextInt();
            switch(choice){
                case 1: System.out.println("enter the dimensions of rectangle ");
                        p=input.nextFloat();
                        q=input.nextFloat();
                        a1.getdata(p,q);
                        a1.printArea();
                        break;
                case 2: System.out.println("enter the dimension of triangle ");
                        p=input.nextFloat();
                        q=input.nextFloat();
                        a2.getdata(p,q);
                        a2.printArea();
                        break;
                case 3: System.out.println("enter the radius of ");
                        p=input.nextFloat();
                        a3.getdata(p);
                        a3.printArea();
                        break;
                case 4:System.out.println("Exiting....");
                        break;
            }
        }while(choice!=4);
        input.close();

    }
}
