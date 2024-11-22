public class NyString {
    private final String streng;
    public NyString(String streng){
        this.streng = streng;
    }
    public String getString() {
        return this.streng;
    }

    public String forkort() {
        String[] a = this.streng.split(" ");
        StringBuilder forkortet = new StringBuilder();
        for (int i = 0;i<=a.length-1;i++){
            forkortet.append(a[i].charAt(0));
        }
        return forkortet.toString().toUpperCase();
    }

    public String fjernTegn(char tegn){
        StringBuilder fStreng = new StringBuilder();
        String a = getString();
        while (a.indexOf(tegn) != -1){
            fStreng.append(a.substring(0,a.toLowerCase().indexOf(tegn)));
            a = a.substring(a.toLowerCase().indexOf(tegn)+1, a.length());
        }
        fStreng.append(a);
        return fStreng.toString();
    }
}
