import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length in centimeters:");
        int centiMeter=input.nextInt();
        double inches= centiMeter/2.54;
        double feet= inches/12;
        System.out.println("length in inches and feet are:"+ inches+","+feet);
    }
}

