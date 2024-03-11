import java.util.Scanner;

public class JPA08 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
            repeat();
        sc.close();
    }

    public static void repeat(){
        int input;
        System.out.println("Input:");
        input=sc.nextInt();
        if(input>=90)
            System.out.println("Your grade is A");
        else if(90>input&&input>=80)
            System.out.println("Your grade is B");
        else if(80>input&&input>=70)
            System.out.println("Your grade is C");
        else if(70>input&&input>=60)
            System.out.println("Your grade is D");
        else if(60>input)
            System.out.println("Your grade is F");
    }
}