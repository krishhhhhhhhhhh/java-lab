class Threadfunc implements Runnable
{
Thread t;
String a;
int b;
Threadfunc(String s , int n )
{
a=s;
b=n;
t=new Thread(this,"Thread");
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i++)
{
System.out.println(a);
Thread.sleep(b);
}
}
catch(InterruptedException ie)
{
System.out.println("Thread Exception");
}
}
}


class multi
{
public static void main(String args[])
{
Threadfunc n=new Threadfunc("BMSCE",10000);
Threadfunc m=new Threadfunc("cse",2000);
}
}
