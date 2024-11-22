public class Rett {
    private String navn;
    private int type;
    private double pris;
    private String oppskrift;

    public Rett(String navn, int type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getTypeNavn() {
        switch (type) {
            case 1: return "Forrett";
            case 2: return "Hovedrett";
            case 3: return "Dessert";
            case 4: return "Annet";
            default: return "Ugyldig verdi";
        }
    }

    public int getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }
}
