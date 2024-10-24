import java.util.Scanner;


class Digit{
    public static int countDigit(int number){
        number=Math.abs(number);
        int digit=0;
        do{
            digit++;
            number /=10;

        }while(number>0);
        return digit;
    }
}

public class L2Q2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(true){
            System.out.print("enter a  number");
            int input=scanner.nextInt();
            if(input<0){
                System.out.println("programme exited");
                break;
            }
            int numDigit=Digit.countDigit(input);
            System.out.println("the number" + " "+ input+ " "+ "has"+" "+ numDigit+" "+"digits.");

        }

    }
}

