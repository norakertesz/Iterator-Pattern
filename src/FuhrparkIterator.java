import java.util.Iterator;
import java.util.List;

public class FuhrparkIterator implements Iterator<String> {
    private List<String> fb;
    private int position;

    public FuhrparkIterator(List<String> fb) {
        this.fb = fb;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        if(position<fb.size()){
            return true;
        }

        return false;
    }

    @Override
    public String next() {
       String nextObj = this.fb.get(position);
       position++;
       return nextObj;
    }
}
