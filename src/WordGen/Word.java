package WordGen;

import java.util.ArrayList;
import java.util.Locale;

public class Word
{
    Letter letter;
    String word;
    String oldWord;

    public Word(String emoji, String blank, String word)
    {
        letter = new Letter(emoji, blank);
        this.word = word.toUpperCase();
        oldWord = "";
    }

    public void convert()
    {
        for(int i = 0; i < word.length(); i++)
        {
            System.out.println(letter.getLetter(word.charAt(i) - 65));
        }
    }

    public void setLetter(Letter l)
    {
        letter = l;
    }

    public void setLetter(String emoji, String blank)
    {
        letter.setEmoji(emoji);
        letter.setBlank(blank);
    }

    public String getWord() { return word; }
    public void setWord(String word) { this.word = word.toUpperCase(); }
}

