import java.util.Scanner;

public class JPA102{
    public static void main(String[] args) {
        double input,ans;
        System.out.print("Please input:");
        Scanner sc=new Scanner(System.in);
        input=sc.nextDouble();
        ans=2.20462*input;
        System.out.printf("%f kg=%f ponds",input,ans);
        sc.close();
    }
}