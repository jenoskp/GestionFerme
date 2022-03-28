
import ch.ferme.animal.*;

import java.util.List;
import java.util.ArrayLis;

public class GestionFerme {
    
    public static void main (String[] args) {
        System.out.println ("Test de Gestion Ferme");
        Volaille v = new Volaille();
        
    }

    public static List<Vache> creerListeVaches() {
        List<Vache> listeVaches = new ArrayList<Vache>();
        listeVaches.add(new Vache(2019, "Holstein", "V003"));
        listeVaches.add(new Vache(2019, "Holstein", "V004"));
        listeVaches.add(new Vache(2019, "Simental", "V010"));
        listeVaches.add(new Vache(2019, "Holstein", "V023"));
        listeVaches.add(new Vache(2019, "Brune", "V041"));
        return listeVaches;

    }

    

}
