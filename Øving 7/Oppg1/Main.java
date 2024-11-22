

public class Main {
    public static void main(String[] args) {
        NyString test = new NyString("Norges Teknisk Naturvitenskaplige Universitet");
        System.out.println(test.forkort());
        System.out.println(test.fjernTegn('n'));
        System.out.println(test.getString()); //for å vise at strengen er immutabel
    }
}
