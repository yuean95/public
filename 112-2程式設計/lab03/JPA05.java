import java.util.Scanner;

public class JPA05 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0;i<3;i++)    //重複i次
            repeat();
        sc.close();
    }

    public static void repeat(){
        int input,sum=1;
        System.out.print("Please enter one value:");
        input=sc.nextInt();
        if(input>10||input<1){
            System.out.println("Error, the value is out of range.");
            return;
        }
        for(int i=2;i<=input;i++){
            sum=sum*i;
        }
        System.out.printf("%d! : %d\n",input,sum);
    }
}