import java.util.Scanner;
import java.util.Random;

class UserDetails{
    String name;
    String email;
    int phone;




    Scanner scan=new Scanner(System.in);

    void setName(){
        if(this.name==null) {
            System.out.print("Enter Name: ");
            this.name = scan.nextLine();
            System.out.println("Successfully Set Name.");
        }
        else{
            System.out.print("Enter Name: ");
            this.name = scan.nextLine();
            System.out.println("Successfully Updated new Name.");
        }
    }

    void setEmail(){
        if(this.email==null) {
            System.out.print("Enter Email Address: ");
            this.email = scan.nextLine();
            System.out.println("Successfully Set Email.");
        }
        else{
            System.out.print("Enter Name: ");
            this.email= scan.nextLine();
            System.out.println("Successfully Updated new Email.");
        }
    }

    void setPhone(){
        if(this.phone==0) {
            System.out.print("Enter Phone Number: ");
            this.phone = scan.nextInt();
            System.out.println("Successfully Set Phone Number.");
        }
        else{
            System.out.print("Enter new Phone Number: ");
            this.phone= scan.nextInt();
            System.out.println("Successfully Updated new Phone Number.");
        }
    }


}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        do{

        }while (true);
    }
}