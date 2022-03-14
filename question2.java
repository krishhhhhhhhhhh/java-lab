import java.util.*;
class SGPA{

    String usn, name;
    int credits[]=new int[5];
    int marks[]=new int[5];

    Scanner sc=new Scanner(System.in);

    void input(){
        System.out.println("Enter USN and Name of Student");
        usn=sc.nextLine();
        name=sc.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter subject "+(i+1)+" marks and credits");
            marks[i]=sc.nextInt();
            credits[i]=sc.nextInt();
        }
    }

    void compute(){
        int sum=0,sum_credits=0;
        for(int i=0;i<5;i++){
            if(marks[i]>=90){
                sum=sum + credits[i]*10;
            }
            else if(marks[i]>=80){
                sum=sum + credits[i]*9;
            }
            else if(marks[i]>=70){
                sum=sum + credits[i]*8;
            }
            else if(marks[i]>=60){
                sum=sum + credits[i]*7;
            }
            else if(marks[i]>=50){
                sum=sum + credits[i]*6;
            }
            else if(marks[i]>=40){
                sum=sum + credits[i]*5;
            }
            else{
                sum=sum+0;
            }
            sum_credits=sum_credits+credits[i];
        }

        double sgpa=sum/(sum_credits*1.0);
        System.out.println("Name = "+name);
        System.out.println("USN = "+usn);
        System.out.println("SGPA = "+sgpa);
    }

    public static void main(String args[]){
        SGPA obj=new SGPA();
        obj.input();
        obj.compute();
    }
}
