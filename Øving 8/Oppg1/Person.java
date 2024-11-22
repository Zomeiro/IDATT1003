public class Person {
    private String fornavn;
    private String etternavn;
    private int foedselsaar;

    Person (String fornavn, String etternavn, int foedselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.foedselsaar = foedselsaar;
    }

    String getFornavn(){
        return this.fornavn;
    }
    String getEtternavn(){
        return this.etternavn;
    }
    int getFoedselsaar(){
        return this.foedselsaar;
    }

    void setFornavn(String nyttFornavn){
        this.fornavn = nyttFornavn;
    }
    void setEtternavn(String nyttEtternavn){
        this.etternavn = nyttEtternavn;
    }
}
