import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
     Fuhrpark fp = new Fuhrpark("Hansi");
     fp.addForbewegungsmittel("Schi");
     fp.addForbewegungsmittel("Scooter");
     fp.addForbewegungsmittel("Skateboard");

     for (String fortp:fp){
         System.out.println(fortp);
     }
        System.out.println("*/-*/-*/-*/-*/-*/-*/-*/-*/*");

     Iterator<String> fpIter = fp.iterator();
     while (fpIter.hasNext()){
         System.out.println(fpIter.next());
     }

    }
}