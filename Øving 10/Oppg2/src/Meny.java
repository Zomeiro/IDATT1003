import java.util.List;

public class Meny {
    private List<Rett> retter;

    public Meny(List<Rett> retter) {
        this.retter = retter;
    }

    public double beregnTotalPris() {
        double totalPris = 0;
        for (Rett rett : retter) {
            totalPris += rett.getPris();
        }
        return totalPris;
    }

    public List<Rett> getRetter() {
        return retter;
    }
}