import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    Map<Employe, Departement> affections = new HashMap<>();
   void ajouterEmployeDepartement(Employe e, Departement d){
       affections.put(e,d);
   }
    void afficherEmployesEtDepartements(){
       for (Map.Entry<Employe,Departement> a:affections.entrySet()){
           System.out.println(a.getKey() + "||" + a.getValue());
       }
    }

   void supprimerEmploye (Employe e){
       affections.remove(e);
   }

   void supprimerEmployeEtDepartement (Employe e, Departement d){
       affections.remove(e,d);
   }
    void afficherEmployes(){
       for(Employe affEmp: affections.keySet()){
           System.out.println(affEmp);
       }
    } void afficherDepartements(){
       for(Departement affDep: affections.values()){
           System.out.println(affDep);
       }
    }
    boolean rechercherEmploye (Employe e){
        return affections.containsKey(e);
    }
    boolean rechercherDepartement (Departement d){
        return affections.containsValue(d);
    }
    TreeMap<Employe, Departement> trierMap(){
       return new TreeMap<>(affections);
    }

}
