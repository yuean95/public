import java.util.Scanner;

public class JPA04 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        repeat();
        repeat();
        sc.close();
    }

    public static void repeat(){
        int input;
        System.out.println("Input:");
        input=sc.nextInt();
        if(input%5==0&&input%9==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
