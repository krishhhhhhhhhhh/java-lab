import java.util.*;

public class Book {
    // instance variables
    String name;
    String author;
    int price;
    int num_pages;

    static Scanner sc=new Scanner(System.in);

    // Constructor to initialise instance variables
    Book(){
        this.name="";
        this.author="";
        this.price=0;
        this.num_pages=0;
    }


    // Function to get details of a book
    void get(){
        System.out.println("Enter Name");
        this.name=sc.nextLine();
        System.out.println("Enter Author");
        this.author=sc.nextLine();
        System.out.println("Enter Price");
        this.price=sc.nextInt();
        System.out.println("Enter Number Of Pages");
        this.num_pages=sc.nextInt();
    }

    public String toString(){
        return ("Name "+this.name+"\nAuthor "+this.author+"\nPrice "+this.price +"\nNumber of Pages "+this.num_pages);
    }

    public static void main(String args[]){

        System.out.println("Enter number of books");
        int n=sc.nextInt();

        // Array of objects
        Book obj[]=new Book[n];

        // Class_name obj=new Class_name();

        for(int i=0;i<n;i++){
            obj[i]=new Book();
            String x=sc.nextLine();
            System.out.println("Enter Book "+(i+1)+" details");
            obj[i].get();
        }

        int max=obj[0].price,pos=0;
        for(int i=0;i<n;i++){
            if(obj[i].price>max){
                max=obj[i].price;
                pos=i;
            }
            System.out.println("Book "+(i+1)+" details");
            System.out.println(obj[i]);
        }
        System.out.println("Maximum price is of book "+(pos+1)+" with value "+max);
    }

}
