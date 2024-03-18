import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> list;

    public DictionaryOfManyTranslations() {
        this.list = new HashMap<>();
    }

    public void add(String word, String translation) {
        list.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = list.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
           return list.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        list.remove(word);
    }
}
