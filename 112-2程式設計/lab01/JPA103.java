import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        int a,b,c;
        double ans;
        System.out.print("Please input:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        ans=(a+b+c)/3.0;
        System.out.printf("Average: %.2f",ans);
        sc.close();
    }
}
