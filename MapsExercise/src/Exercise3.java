import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {
    public static void main(String[] args) {

        search("Uncle", dictionary());
    }
    //Method takes in word to search in dictionary
    protected static void search(String word, Map dictionary){
        String newWord = toSentenceCase(word);
        if(dictionary.containsKey(newWord)){
            System.out.println("English Word: " + newWord + "\nGerman Word: " + dictionary.get(newWord));
        }else{
            System.out.println("I don't know such word!");
        }
    }

    //Method to convert word to a standard Sentence Case
    // and also the format in which words are written in the dictionary method
    public final static String toSentenceCase(String word){
        String restOfTheWord = "";
        Character firstLetter = word.charAt(0);
        String first = firstLetter.toString().toUpperCase();
        for (int i = 1; i < word.length(); i++){
            Character restOfWord = word.charAt(i);
            restOfTheWord += restOfWord.toString().toLowerCase();
        }
        return first + restOfTheWord;
    }

    //dictionary
    private static Map<String, String> dictionary (){
        var dictionary = new TreeMap<String, String>();

        dictionary.put("Water", "Wasser");
        dictionary.put("Man", "Mann");
        dictionary.put("Woman", "Frau");
        dictionary.put("Table", "Tisch");

        return dictionary;
    }
}
