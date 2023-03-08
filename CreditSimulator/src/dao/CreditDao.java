package dao;

import modele.Credit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CreditDao {

    public static Set<Credit> BDCredit(){
        return new HashSet<Credit>(Arrays.asList(new Credit(1L,300.0,3.5,"Amine",
                                    0.0,120),new Credit(2L,30000.0,2.9,"Amine",
                1.0,60), new Credit(3L,20005.0,2.5,"Amine",
                1.0,80)));
    }

    public Credit TrouverParId(Long id){
        System.out.println("Credit a chercher ayant l'id :" + id);
        return BDCredit().stream().filter(( Credit credit) -> credit.getIdHamza() == id).findFirst().orElse(null); // entre les deux parenthese on fait la condition
        //on a travailler avec les lambda expressions car on a stream est une interface
        /*les lambda travail avec les interface seulement  */
    }
}
