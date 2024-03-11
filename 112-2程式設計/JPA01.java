import java.util.Scanner;

public class JPA01{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        repeat();
        repeat();
        sc.close();
    }

    public static void repeat(){
        int input;
        System.out.println("Please enter score:");
        input=sc.nextInt();
        if(input>=60)
            System.out.println("You pass");
        System.out.println("End");
    }
}