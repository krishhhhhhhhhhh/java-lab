public class WrongAge extends Exception{
    String str;
    WrongAge(String a){
        str=a;
    }


    public String toString(){
        return "Exception caught:"+str;
    }
}

public class Father {
    int age;
    Father(int a)throws WrongAge{
        age=a;
        if(a<0){
            throw new WrongAge("Age is less than 0");
        }
}

public class Son1 extends Father{
    int x;
    Son1(int s,int f)throws WrongAge{
        super(f);
        x=s;
        if(s>=f){
            throw new WrongAge("Age of son is greater than age of father");
        }
        else
            System.out.println("Valid");
    }
}

public class Exception2 {
    public static void main(String args[]){
        try{
           Father obj=new Father(-1);
        }
        catch(WrongAge a){
            System.out.println(a);
        }
        finally{
            System.out.println("Checked condition 1");
        }

        try{
            Son1 obj2=new Son1(30,20);
        }
        catch(WrongAge a){
            System.out.println(a);
        }
        finally{
            System.out.println("Checked condition 2");
        }
    }
}
