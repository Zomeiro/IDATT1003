



public class Tekstanalyse {
    private String streng;
    private int[] antallTegn;
    
    public Tekstanalyse(String streng){
        this.streng = streng.toLowerCase(); 
        antallTegn = new int[30]; 
        for (int i = 0; i < this.streng.length(); i++) {
            char tegn = this.streng.charAt(i);
            
            if (tegn >= 'a' && tegn <= 'z') {
                antallTegn[tegn - 'a']++;  //subtraherer verdien av a fra unicode verdien til tegn for å få index
            } else if (tegn == 'æ') {
                antallTegn[26]++; 
            } else if (tegn == 'ø') {
                antallTegn[27]++; 
            } else if (tegn == 'å') {
                antallTegn[28]++;
            } else {
                antallTegn[29]++; 
            }
        }
    }


    public int forskjelligeBokstaver(){
        int antallForskjellige = 0;
        for (int i = 0; i < 29; i++) { 
            if (antallTegn[i] > 0) {
                antallForskjellige++; 
            }
        }
        return antallForskjellige;
    }


    public int antallBokstaver() {
        int antallTotalt = 0;
        for (int i = 0; i < 29; i++) {
            antallTotalt += antallTegn[i];
        }
        return antallTotalt;
    }


    public int antallAvBokstav(String bokstav){ //kan ikke bruke char pga funky toLowerCase metode
        bokstav = bokstav.toLowerCase();
        char tegn = bokstav.charAt(0); 
        if (tegn >= 'a' && tegn <= 'z') {
            return antallTegn[tegn - 'a'];
        } else if (tegn == 'æ') {
            return antallTegn[26]; 
        } else if (tegn == 'ø') {
            return antallTegn[27]; 
        } else if (tegn == 'å') {
            return antallTegn[28]; 
        } else {
            return 0; 
        }
    }

    
    public String hoyestForekomst() {
        int maksAntall = 0;
        String Bokstaver = "";

        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > maksAntall) {
                maksAntall = antallTegn[i];
                Bokstaver = "" + (char) (i + 'a');
            } else if (antallTegn[i] == maksAntall && maksAntall > 0) {
                Bokstaver += ", " + (char) (i + 'a'); 
            }
        }
        return Bokstaver;
    }
    
}