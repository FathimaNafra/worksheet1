import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your full name:first middle last");
        String fullName=input.nextLine();
        String parts[]=fullName.split(" ");
        if (parts.length != 3) {
            System.out.println("Please enter the name in the format: first middle last");
            return;
        }
        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];


        char middleInitial = middleName.charAt(0);
        System.out.println(lastName + " ,"+ firstName + ", "+ middleInitial);
        input.close();
    }
}

