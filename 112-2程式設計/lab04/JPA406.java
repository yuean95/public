public class JPA406 {
    public static void main(String[] args) {
        int time;
        time=2;
        repeat(time);
        System.out.println("--------------------");
        time=3;
        repeat(time);
        System.out.println("--------------------");
        time=5;
        repeat(time);
        System.out.println("--------------------");
        time=8;
        repeat(time);
    }

    public static void repeat(int time){
        int cost=0;
        if(time<=2)
            cost=30*time;
        else if(time<4)
            cost=60+50*(time-2);
        else if(time<6)
            cost=160+80*(time-4);
        else
            cost=320+100*(time-6);
        System.out.println("停車時數:"+time+"小時");
        
        System.out.println("應繳費用:"+cost+"元整");
    }
}
