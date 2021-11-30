package WordGen;

/**
 * TODO: NEXT ORDER OF BUSINESS
 * Make the letters appear side-by-side instead of vertical.
 * One idea is to Make a 2D array-list or vector, and parse through the strings.
 - Each word would be split up into rows and columns.
 - All the rows from each word will be added up to form one mega-string that has the rows from each string appended
 side-by-side next to each other.
 - Then, it is just the simple task of printing that string afterwards and then copying it to the clipboard.

 * The next step after making side-by-side printing is printing out to a file so that people can more easily copy data.
 * The next next step after that is somehow bringing this emoji-gen into Discord and calling some sort of command (like
 with Tarz) to display the emojis there.
 */


import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        String emoji, blank, word, choice;
        Scanner scan = new Scanner(System.in);
        Word w = new Word("", "", "");
        do
        {
            //getting data from user (emoji, blank, and word)
            System.out.print("emoji: ");
            emoji = scan.nextLine();
            System.out.print("# chars: " + emoji.length() + "\nblank: ");
            blank = scan.nextLine();
            System.out.print("# blanks: " + blank.length() + "\nword: ");
            word = scan.nextLine();

            //converting word into characters
            w.setLetter(emoji, blank);
            w.setWord(word);
            w.convert();

            System.out.print("Continue?\n");
            choice = scan.nextLine();

        }while(choice.toLowerCase().equals("yes"));

    }
}
