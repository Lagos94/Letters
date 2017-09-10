/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 6 Chapter 6
* Computer Configuration
* Due Date: 09/10/17*/
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String uLetters = userIn.nextLine();
        System.out.println("Number of letters in '" +uLetters+ "' is " + countLetters(uLetters));
    }
    public static int countLetters(String s) {
        int read = 0;
        for (int t=0; t<s.length(); t++){
            char w = s.charAt(t);
            if (Character.isLetter(w)){
                read++;
            }
        }
    return read;}
}
