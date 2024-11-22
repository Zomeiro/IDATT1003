import java.util.Arrays;
import java.util.Objects;

public class Tekstbehandling {
    private final String streng;
    private final String[] ordArray;

    public Tekstbehandling(String streng) {
        this.streng = streng;
        this.ordArray = getString().split(" ");
    }
    public String getString(){
        return this.streng;
    }
    public int antallOrd(){
        return this.ordArray.length;
    }
    public int forekomstAvStreng(String ord){
        String tekst = this.streng.toLowerCase();
        int antall = 0;
        while (tekst.contains(ord.toLowerCase())){
            tekst=tekst.substring(tekst.indexOf(ord)+ord.length());
            antall+=1;
        }
        return antall;
    }

    public double avgOrdlengde(){
        int totChars = 0;
        //Arrays.stream(this.ordArray).forEach(System.out::println);
        for (int i = 0; i <= this.ordArray.length-1; i++) {
            for (int j = 0; j < this.ordArray[i].length(); j++) {
                if ((this.ordArray[i].charAt(j) != '.') & (this.ordArray[i].charAt(j) != '?') & (this.ordArray[i].charAt(j) != '!')){
                    totChars+=1;
                }
            }
        }
        return (double) totChars /this.ordArray.length;
    }

    public String byttUt(String orgOrd,String nyttOrd){
        String tekst = getString();
        while (tekst.toLowerCase().contains(orgOrd.toLowerCase())){
            tekst=tekst.substring(0,tekst.indexOf(orgOrd)) + nyttOrd + tekst.substring(tekst.indexOf(orgOrd)+orgOrd.length());
        }
        return tekst;
    }

    public double avgSetning(){
        String[] setninger = this.streng.split("[.!?]");
        int ordCount = 0;
        for (String s : setninger) {
            String[] setning = s.split(" ");
            for (int j = 0; j < setning.length - 1; j++) {
                if (!Objects.equals(setning[j], "")) {
                    ordCount += 1;
                }
            }
        }
        return (double) ordCount /setninger.length;
    }
    public String storeBokstaver(){
        return this.streng.toUpperCase();
    }

}
