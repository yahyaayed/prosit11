import java.util.*;

public class Main {
    public static void main(String[] args) {

    Employe e1 = new Employe(1,"anwer");
    Departement d1 = new Departement(1,"gestion");
    Employe e2 = new Employe(2,"yassine");
    Departement d2 = new Departement(2,"informatique");
    Employe e3 = new Employe(3,"nabil");
    Departement d3 = new Departement(3,"réseau");
    Employe e4 = new Employe(4,"seif");
    Departement d4 = new Departement(4,"finance");

    AffectationHashMap a1 = new AffectationHashMap();
    a1.ajouterEmployeDepartement(e1,d1);
    a1.ajouterEmployeDepartement(e2,d2);
    a1.ajouterEmployeDepartement(e3,d3);
    a1.ajouterEmployeDepartement(e4,d4);

    a1.afficherEmployesEtDepartements();
    System.out.println("------------------------------------");
    a1.supprimerEmploye(e1);

    a1.afficherEmployes();

    System.out.println("-----------------------------");
    Map<Employe,Departement> triMap = a1.trierMap();

    for (Map.Entry<Employe , Departement> entry : triMap.entrySet()){
        System.out.println(entry.getKey()+"||"+ entry.getValue());
    }

    }

}