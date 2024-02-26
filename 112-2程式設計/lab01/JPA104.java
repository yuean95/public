import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        double ans;
        System.out.print("輸入第一組的x座標和y座標:");
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.print("輸入第二組的x座標和y座標:");
        x2=sc.nextInt();
        y2=sc.nextInt();
        ans=Math.sqrt(Math.pow((double)(x2-x1),2)+Math.pow((double)(y2-y1),2));
        System.out.printf("介於(%d,%d)和(%d,%d)之間的距離是%.2f",x1,y1,x2,y2,ans);
        sc.close();
    }
}
