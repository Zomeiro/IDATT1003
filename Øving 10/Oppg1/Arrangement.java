
public class Arrangement {
    private final int nr;
    private final String navn;
    private final String sted;
    private final String arrangoer;
    private final String type;
    private final Long tidspunkt;

    public Arrangement(int nr, String navn, String sted, String arrangoer, String type, Long tidspunkt) {
        this.nr = nr;
        this.navn = navn;
        this.sted = sted;
        this.arrangoer = arrangoer;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNr() {
        return nr;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public String getArrangoer() {
        return arrangoer;
    }

    public String getType() {
        return type;
    }

    public Long getTidspunkt() {
        return tidspunkt;
    }

    @Override //fikk denne av chatgpt
    public String toString() {
        return "Arrangement{" +
                "nr=" + nr +
                ", navn='" + navn + '\'' +
                ", sted='" + sted + '\'' +
                ", arrangør='" + arrangoer + '\'' +
                ", type='" + type + '\'' +
                ", tidspunkt=" + tidspunkt +
                '}';
    }
}