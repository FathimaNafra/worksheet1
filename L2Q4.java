import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter five numbers");
        for (int i=0;i<5;i++){
            System.out.print("number" + (i+1)+" : ");
            num[i]= scanner.nextInt();


        }
        scanner.close();
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++ ){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }else if(num[i]>secondLargest && num[i]!=largest){
                secondLargest=num[i];
            }
        }
        System.out.println("the second largest number is:" + secondLargest);

    }
}
