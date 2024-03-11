import java.util.Scanner;

public class JPA05 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
            repeat();
        sc.close();
    }

    public static void repeat(){
        int input;
        System.out.println("Enter an integer:");
        input=sc.nextInt();
        if(input%2==0&&input%3==0)
            System.out.printf("%d是2、3、6的倍數\n",input);
        else if(input%2==0)
            System.out.printf("%d是2的倍數\n",input);
        else if(input%3==0)
            System.out.printf("%d是3的倍數\n",input);
        else
            System.out.printf("%d不是2、3、6的倍數\n",input);
    }
}
