public class Task3 {

    public static void main(String[] args) {
        int rubles=3;
        int remainder10=rubles%10;
        int remainder100=rubles%100;
        if  (remainder10==0||(5<=remainder10&&remainder10<=9)||11<=remainder100){
            System.out.println(rubles+"rubley");


        }
        else if(2<=remainder10 && remainder10<=4){
            System.out.println(rubles+"rublya");
    
        }
        else if(remainder10==1){
            System.out.println(rubles+"rubl");
        }
        else{
            System.out.println(rubles+"ruble is invalid");
        }

    }
}
