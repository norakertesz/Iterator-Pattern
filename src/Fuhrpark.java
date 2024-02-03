import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fuhrpark implements Iterable<String>{
    public Fuhrpark(String besitzer) {
        this.besitzer = besitzer;
        this.fortbewegungsmittel = new ArrayList<>();
    }

    private String besitzer;

    private List<String> fortbewegungsmittel;




    public void addForbewegungsmittel(String f){
        this.fortbewegungsmittel.add(f);

    }


//muss uns eine itartor zurückliefern der es uns ermöglicht über die fortbewegungsmittel zu iterieren
    @Override
    public Iterator<String> iterator() {
        return new FuhrparkIterator(this.fortbewegungsmittel);
    }
}
