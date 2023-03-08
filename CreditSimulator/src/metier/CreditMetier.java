package metier;

import dao.CreditDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import modele.Credit;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreditMetier {
    CreditDao creditDao;

    public Credit Claculer_Mensualite(Long idCredit) throws Exception{
        var credit = creditDao.TrouverParId(idCredit);

        if (credit == null){
            throw new Exception("L'id est introuvable !! ");
        }
        else {
            double taux     = credit.getTaux_MensuelHamza()/1200;
            double capitale = credit.getCapEmpHamza();
            int NbrMois     = credit.getNombremoisHamza();

            double mensualite = (capitale*taux)/(1/-Math.pow((1+taux),-1*NbrMois));
            mensualite = Math.round(mensualite*100)/100;
            credit.setMensualiteHamza(mensualite);
            return credit;
        }

    }
}
