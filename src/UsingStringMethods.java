import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
       /* Create a program that will allow users to enter a word, and a character number index.
        Your program will print out the size of the word, as well as the substring (starting from 0) to the index the user specified.
        If the user entered index is larger than the size of the word, the program will print "Index is larger than length".
        */
        System.out.println("Enter a word");
        word=scanner.nextLine();
        System.out.println("The length of the word is "+word.length());
        System.out.println("Enter an index ");
        int index=scanner.nextInt();
        if(index>word.length()){
            System.out.println("Index is larger than length");
        }
        else{
            System.out.println("The substring is "+ word.substring(0,index));

        }

    }

}