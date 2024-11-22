import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MenyRegister {
    private List<Rett> rettListe = new ArrayList<>();
    private List<Meny> menyListe = new ArrayList<>();

    public void nyRett(Rett rett) {
        rettListe.add(rett);
    }

    public Rett finnRett(String rettNavn) {
        for (Rett rett : rettListe) {
            if (Objects.equals(rett.getNavn(), rettNavn)) {
                return rett;
            }
        }
        return null;
    }

    public List<Rett> finnRetterAvType(int type) {
        List<Rett> retterAvType = new ArrayList<>();
        for (Rett rett : rettListe) {
            if (rett.getType() == type) {
                retterAvType.add(rett);
            }
        }
        return retterAvType;
    }

    public void nyMeny(List<Rett> retter) {
        menyListe.add(new Meny(retter));
    }

    public List<Meny> menyPrisIntervall(double minPris, double maxPris) {
        List<Meny> menyerInnenforIntervall = new ArrayList<>();
        for (Meny meny : menyListe) {
            double totalPris = meny.beregnTotalPris();
            if (totalPris >= minPris && totalPris <= maxPris) {
                menyerInnenforIntervall.add(meny);
            }
        }
        return menyerInnenforIntervall;
    }
}
