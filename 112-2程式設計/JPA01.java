import java.util.Scanner;

public class JPA01{
    public static void main(String[] args) {
        int input,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        input=sc.nextInt();
        sum=0;
        for(int i=1;i<=input;i++)
            sum=sum+i;
        System.out.printf("1+...+%d=%d",input,sum);
        sc.close();
    }
}