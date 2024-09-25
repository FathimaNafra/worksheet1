import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of outer circle:");
        int outerRadius=input.nextInt();
        System.out.println("enter the radius of inner circle:");
        int innerRadius=input.nextInt();
        double outerArea=3.14 * outerRadius * outerRadius;
        double innerArea=3.14 * innerRadius * innerRadius;

        double circledArea= outerArea-innerArea;
        System.out.println("circled area is:"+circledArea);

    }
}

