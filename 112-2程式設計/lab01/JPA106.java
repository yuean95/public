public class JPA106 {
    public static void main(String[] args) {
        double x;
        x=-3.2;
        System.out.printf("f(-3.2)=%.4f\n",f(x));
        x=-2.1;
        System.out.printf("f(-2.1)=%.4f\n",f(x));
        x=0;
        System.out.printf("f(0)=%.4f\n",f(x));
        x=2.1;
        System.out.printf("f(2.1)=%.4f\n",f(x));
    }

    public static double f(double x){
        double ans;
        ans=3*(Math.pow((double)x,3))+2*(double)x-1;
        return ans;
    }
}
