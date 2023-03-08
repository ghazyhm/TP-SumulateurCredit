package modele;
import lombok.*;

@Data // contient tostring getters et setters equals
@AllArgsConstructor // generer un constructeur avec tous les parametres
@NoArgsConstructor // generer un constructeur sans parmaetre par defaut


public class Credit {
    private Long idHamza;
    private Double CapEmpHamza;
    private Double taux_MensuelHamza;
    private String nom_DemandeurHamza;
    private Double mensualiteHamza;

    private Integer NombremoisHamza;

    @Override
    public String toString(){
        var creditStr = " ================================================== \n";
        creditStr += " => Credit n "+getNom_DemandeurHamza();
        creditStr += " => CapitalEmprunter "+ getCapEmpHamza() +"\n";
        creditStr += " => Nom de l'emprunteur" + getNom_DemandeurHamza()+"\n";
        creditStr += " => Nombre de mois "+ getMensualiteHamza()+"\n";
        creditStr += " => Nombre mois "+getNombremoisHamza()+"\n";
        creditStr += " => Taux de mentionalite "+ getTaux_MensuelHamza()+"\n";
        creditStr += " => Mensualite "+getMensualiteHamza()+"\n";
        creditStr += " ===================================================== \n";
        return creditStr;
    }


}
