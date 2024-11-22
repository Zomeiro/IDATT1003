import java.util.Random;

class Spiller {
    int sumPoeng;
    Random terning;

    Spiller(){
        this.sumPoeng = 0;
        this.terning = new Random();
    }

    int getSumPoeng(){
        return this.sumPoeng;
    }

    void kastTerningen(){
        int terningkast = this.terning.nextInt(6)+1;
        if (terningkast == 1){
            this.sumPoeng = 0;
        }
        else if (this.sumPoeng < 100){
            this.sumPoeng+=terningkast;
        }
        else if (this.sumPoeng > 100){
            this.sumPoeng-=terningkast;
        }
    }

    boolean erFerdig(){
        if (this.sumPoeng==100){
            return true;
        }
        else{
            return false;
        }
    }

}


public class terningspill {
    public static void main(String[] args) {
        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();
        int runde = 0;
        while (true){
            runde +=1;

            spillerA.kastTerningen();
            spillerB.kastTerningen();
            
            System.out.println("R: "+runde+", SA: "+spillerA.sumPoeng+", SB: "+spillerB.sumPoeng);

            if (spillerA.erFerdig()){
                System.out.println("Spiller A er ferdig etter " + runde + " kast!");
                break;
            }
            else if (spillerB.erFerdig()){
                System.out.println("Spiller B er ferdig etter " + runde + " kast!");
                break;
            }

            
        }
    }   

   
}
