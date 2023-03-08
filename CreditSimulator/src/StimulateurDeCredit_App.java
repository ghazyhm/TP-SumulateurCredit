
import dao.CreditDao;
import metier.CreditMetier;
import presentation.CreditControleur;
import java.util.Scanner;
public class StimulateurDeCredit_App {
    static Scanner clavierHamza = new Scanner(System.in);
    static  boolean estunNombre(String input){
        try {
            Integer.parseInt(input); return true;
        }catch (Exception e){
            return false;
        }
    }
    public void test1(){
        var dao  = new CreditDao();
        var metier = new CreditMetier();
        var controleur = new CreditControleur();

        metier.setCreditDao(dao);
        controleur.setCreditMetier(metier);
        String rep = "";
        do{
            System.out.println(" => [test1] Calcule de mensualite de credit <= \n");
            try {
                String input = "";
                while (true){

                System.out.println(" => Entrer l'id du credit ");
                input = clavierHamza.nextLine();
                if(estunNombre(input)) break;
                System.err.println("Entrer non valide !!");
            }
                long id = Long.parseLong(input);
                controleur.Afficher_Mensualite(id);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
            System.out.println("Voullez vous quitter l'application (yes/no) ? "); rep=clavierHamza.nextLine();
        }while(!rep.equalsIgnoreCase("yes"));
        System.out.println("Au revoir *_* ");
    }

    public static void main(String[] args) {
        new StimulateurDeCredit_App().test1();


    }
}
