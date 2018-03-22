import com.swabunga.spell.engine.SpellDictionary;
import com.swabunga.spell.engine.SpellDictionaryHashMap;
import com.swabunga.spell.event.*;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class SpellCheck {

    public static class SuggestionListener implements SpellCheckListener {

        public void spellingError(SpellCheckEvent event) {
            System.out.println("Misspelling: " + event.getInvalidWord());

            List suggestions = event.getSuggestions();
            if (suggestions.isEmpty()) {
                System.out.println("No suggestions found.");
            } else {
                System.out.print("Suggestions: ");

                for (Iterator i = suggestions.iterator(); i.hasNext();) {
                    System.out.print(i.next());
                    if (i.hasNext()) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) throws Exception {
//        if (args.length < 1) {
//            System.err.println("Usage: Suggest <dictionary file>");
//            System.exit(1);
//        }
        SpellDictionary dictionary = new SpellDictionaryHashMap(new File("./dict/en_US/en_us.dic"), new File("./dict/en_US/phonet.en"));
        SpellChecker spellChecker = new SpellChecker(dictionary);
        spellChecker.addSpellCheckListener(new SuggestionListener());

        StringWordTokenizer a = new StringWordTokenizer("this is an spemd book. that is anthr book.");
        int b = spellChecker.checkSpelling(a);
        System.out.println(b);
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            System.out.print("Enter line to spell check (return to exit): ");
//            String line = in.readLine();
//
//            if (line.length() == 0) {
//                break;
//            }
//            spellChecker.checkSpelling(new StringWordTokenizer(line));
//        }
    }

}