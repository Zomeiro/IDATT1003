public class Property {
    private String municipalityName;
    private int municipalityID;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double area; //in m^2
    private String ownerName;


    Property(String municipalityName, int municipalityID, int lotNumber, int sectionNumber, double area, String ownerName) {
        this.municipalityName = municipalityName;
        this.municipalityID = municipalityID;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.area = area;
        this.ownerName = ownerName;
    }

    Property(String municipalityName, int municipalityID, int lotNumber, int sectionNumber, double area, String ownerName, String name) {
        this.municipalityName = municipalityName;
        this.municipalityID = municipalityID;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
    }
    public String getMunicipalityName() {
        return municipalityName;
    }
    public int getMunicipalityID() {
        return municipalityID;
    }
    public int getLotNumber() {
        return lotNumber;
    }
    public int getSectionNumber() {
        return sectionNumber;
    }
    public String getName() {
        if (name != null) {
            return name;
        }
        else {
            return "N/A";
        }
    }
    public double getArea() {
        return area;
    }


    public String getID() {
        return getMunicipalityID() + "-" + getLotNumber() + "/" + getSectionNumber();
    }

    public String getOwnerName() {
        return ownerName;
    }

    //pga kommunesammenslåinger osv.
    public void setMunicipalityID(int municipalityID) {
        this.municipalityID = municipalityID;
    }
    public void setmunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }


    public void setownerName(String ownerName) { //fordi eier lett kan endres
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Municipality: "+getMunicipalityName() +
                "\nMunicipalityID-GNR/BNR: " + getID() +
                "\nName: " + getName() +
                "\nArea: " + getArea() + "\n";
    }
}
