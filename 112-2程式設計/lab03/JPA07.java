import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        int m=0,n;
        Scanner sc=new Scanner(System.in);
        while(m!=999){
            System.out.println("Input:");
            m=sc.nextInt();
            if(m==999)
                break;
            n=sc.nextInt();
            if(m<n){
                int i=m;
                m=n;
                n=i;
            }
            for(int i=n;i>0;i--){
                if(m%i==0&&n%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
