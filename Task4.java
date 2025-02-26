public class Task4 {
    public static void main(String[] args) {
        int year=1995;
        isLeapYear(1995);
    

    

     }
public static void isLeapYear(int year){
        if (year%400==0||4== 0 && year%100!=0) {
            System.out.println("wysokostnyy "+year);
        }
        else {
            System.out.println("yyl wysokosny dal "+year);
        }
    }

}
