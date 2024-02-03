package iterator2;

import java.util.Iterator;

public class TextListIterator implements Iterator<String> {

    private String[] woerter;
    private int position;


    public TextListIterator(String[] w) {
        woerter = w;
        position=0;
    }

    @Override
    public boolean hasNext() {
        if(position<woerter.length){
            return true;
        }

        return false;
    }

    @Override
    public String next() {
       String wort=woerter[position];
       position++;
       return wort;
    }
}
