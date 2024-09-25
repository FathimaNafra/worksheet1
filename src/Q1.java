
import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println(" enter a word");
        String word=input.next();
        if (word.length()%2!=0){
            int middleIndex=word.length()/2;
            char middleLetter= word.charAt(middleIndex);
            System.out.println("middle letter is:" +" "+ middleLetter );



        }else{
            System.out.println("enter a odd letter word");
        }
    }
}

