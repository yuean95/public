import java.util.Scanner;

public class JPA07 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
            repeat();
        sc.close();
    }

    public static void repeat(){
        int a,b,c;
        System.out.print("請輸入三個整數:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a+b<c||a+c<b||b+c<a)&&a!=0&&b!=0&&c!=0)
            System.out.println("不可以構成三角型");
        else if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)||Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)||Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2))
            System.out.println("直角三角型");
        else if(Math.pow(a,2)+Math.pow(b,2)<Math.pow(c,2)||Math.pow(a,2)+Math.pow(c,2)<Math.pow(b,2)||Math.pow(c,2)+Math.pow(b,2)<Math.pow(a,2))
            System.out.println("鈍角三角型");
        else if(Math.pow(a,2)+Math.pow(b,2)>Math.pow(c,2)&&Math.pow(a,2)+Math.pow(c,2)>Math.pow(b,2)&&Math.pow(c,2)+Math.pow(b,2)>Math.pow(a,2))
            System.out.println("銳角三角型");
    }
}