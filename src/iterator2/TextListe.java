package iterator2;

import java.util.Iterator;

public class TextListe implements Iterable<String>{

    private String[] text;

    public TextListe(String t) {
        text=t.split(" ");
    }

    @Override
    public Iterator<String> iterator() {
        return new TextListIterator(text);
    }
}
