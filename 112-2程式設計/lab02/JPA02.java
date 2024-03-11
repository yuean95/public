import java.util.Scanner;

public class JPA02 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        repeat();
        repeat();
        sc.close();
    }

    public static void repeat(){
        int a,b;
        System.out.println("Input:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.printf("%d is lager than %d\n",a,b);
        else if(a<b)
            System.out.printf("%d is lager than %d\n",b,a);
        else
            System.out.printf("Two numbers are equal\n");
    }
}
