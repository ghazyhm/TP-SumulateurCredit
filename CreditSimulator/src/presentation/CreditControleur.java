package presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import metier.CreditMetier;
import modele.Credit;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreditControleur {
     CreditMetier creditMetier;
     public void Afficher_Mensualite(Long idCredit) throws  Exception{

         var creditAvecMensualite = creditMetier.Claculer_Mensualite(idCredit);
         System.out.println(creditAvecMensualite);
     }


}
