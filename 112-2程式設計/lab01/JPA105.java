import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args) {
        int one,five,ten,fif;
        String name,ans;
        System.out.print("請輸入您的姓名:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.printf("hi,%s,請輸入您的銅板的個數:\n",name);
        System.out.print("請輸入1元的數量:");
        one=sc.nextInt();
        System.out.print("請輸入5元的數量:");
        five=sc.nextInt();
        System.out.print("請輸入10元的數量:");
        ten=sc.nextInt();
        System.out.print("請輸入50元的數量:");
        fif=sc.nextInt();
        ans=(one+5*five+10*ten+50*fif)+"";
        System.out.printf("%c 千 %c 百 %c 十 %c 元",ans.charAt(0),ans.charAt(1),ans.charAt(2),ans.charAt(3));
        sc.close();
    }
}
