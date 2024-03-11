import java.util.Scanner;

public class JPA06 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
            repeat();
        sc.close();
    }

    public static void repeat(){
        int a,b,c;
        System.out.print("Input Chinese score:");
        a=sc.nextInt();
        System.out.print("Input English score:");
        b=sc.nextInt();
        System.out.print("Input Math score:");
        c=sc.nextInt();
        if(a<60)
            System.out.println("Chinese failed.");
        if(b<60)
            System.out.println("English failed.");
        if(c<60)
            System.out.println("Math failed.");
        if(a>59&&b>59&&c>59)
            System.out.println("All pass.");
    }
}