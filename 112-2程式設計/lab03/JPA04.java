import java.util.Scanner;

public class JPA04{
    public static void main(String[] args){
        int total=0,n=0,dollars=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        while(dollars!=-1){
            System.out.print("Please enter meal dollars or enter -1 to stop:");
            dollars=sc.nextInt();
            if(dollars==-1)
                break;
            total=total+dollars;
            n++;
        }
        System.out.println("餐點總費用:"+total);
        avg=(double)total/n;
        System.out.printf(" %d 道餐點平均費用為: %.2f",n,avg);
        sc.close();
    }
}