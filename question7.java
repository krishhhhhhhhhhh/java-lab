class gen<T,V,W>{
    T ob1;
    V ob2;
    W ob3;

    gen(T a, V b, W c){
        ob1=a;
        ob2=b;
        ob3=c;
    }

    void showType(){
        System.out.println("Type of T is "+ob1.getClass().getName());
        System.out.println("Type of V is "+ob2.getClass().getName());
        System.out.println("Type of W is "+ob3.getClass().getName());
    }

    T getob1(){
        return ob1;
    }

    V getob2(){
        return ob2;
    }

    W getob3(){
        return ob3;
    }
}

class generics1{
    public static void main(String args[]) {
        gen<Integer,String,Double> obj=new gen<Integer,String,Double>(45,"Mansi",45.2);

        obj.showType();
        int x=obj.getob1();
        String y=obj.getob2();
        double z=obj.getob3();
        
        System.out.println("Value of Integer "+x);
        System.out.println("Value of String "+y);
        System.out.println("Value of Double "+z);
    }
}
