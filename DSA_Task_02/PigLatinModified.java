package internetS.pigLatin;
import java.util.Scanner;
public class PigLatinModified {

	
    public static void main(String[] args)
    {
        System.out.println("Enter word: ");
        Scanner scan = new Scanner(System.in);

        String stringWord = scan.nextLine();
        char v = Character.toLowerCase(stringWord.charAt(0));
            String first = stringWord.substring(0,1);
            String slice = stringWord.substring(1,stringWord.length());
            System.out.println(slice + first + "ay");       
    }
}