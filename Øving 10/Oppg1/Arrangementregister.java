import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Arrangementregister {
    private List<Arrangement> arrangementListe = new ArrayList<>();

    public void nyttArrangement(int nr, String navn, String sted, String arrangoer, String type, Long tidspunkt) {
        Arrangement a = new Arrangement(nr, navn, sted, arrangoer, type, tidspunkt);
        arrangementListe.add(a);
    }

    public List<Arrangement> arrSted(String sted) {
        List<Arrangement> arrStedList = new ArrayList<>();
        for (Arrangement a : arrangementListe) {
            if (a.getSted().equalsIgnoreCase(sted)) {
                arrStedList.add(a);
            }
        }
        return arrStedList;
    }

    public List<Arrangement> arrDato(Long dato) {
        List<Arrangement> arrDatoList = new ArrayList<>();
        for (Arrangement a : arrangementListe) {
            if (a.getTidspunkt() / 10000 == dato) {
                arrDatoList.add(a);
            }
        }
        return arrDatoList;
    }

    public List<Arrangement> arrDatoIntervall(Long dato1, Long dato2) {
        List<Arrangement> arrDatoIntervallList = new ArrayList<>();
        for (Arrangement a : arrangementListe) {
            Long tidspunkt = a.getTidspunkt();
            if (tidspunkt >= dato1 && tidspunkt <= dato2) {
                arrDatoIntervallList.add(a);
            }
        }
        arrDatoIntervallList.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return arrDatoIntervallList;
    }

    public List<Arrangement> sorterEtterSted() {
        List<Arrangement> sortedList = new ArrayList<>(arrangementListe);
        sortedList.sort(Comparator.comparing(Arrangement::getSted));
        return sortedList;
    }

    public List<Arrangement> sorterEtterType() {
        List<Arrangement> sortedList = new ArrayList<>(arrangementListe);
        sortedList.sort(Comparator.comparing(Arrangement::getType));
        return sortedList;
    }

    public List<Arrangement> sorterEtterTidspunkt() {
        List<Arrangement> sortedList = new ArrayList<>(arrangementListe);
        sortedList.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return sortedList;
    }
}

