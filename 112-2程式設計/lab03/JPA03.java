public class JPA03 {
    public static void main(String[] args){
        System.out.print("0~1000中的完美數有:");
        for(int i=1;i<1001;i++){
            int sum=0;
            for(int factor=1;factor<=i/2;factor++){
                if(i%factor==0)
                    sum=sum+factor;
            }
            if(sum==i)
                System.out.print(" "+i);
        }
    }
}
