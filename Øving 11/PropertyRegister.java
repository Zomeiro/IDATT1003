import java.util.ArrayList;
import java.util.List;

public class PropertyRegister {
    ArrayList<Property> propertyList = new ArrayList<>();

    public void addProperty(Property property) {
        propertyList.add(property);
    }
    public void deleteProperty(Property property) {
        propertyList.remove(property);
    }

    public void printAll() {
        for (int i = 0; i < propertyList.size(); i++) {
            System.out.println(propertyList.get(i).toString());
        }
    }

    public Property findPropertyByID(String propertyID) {
        for (int i = 0; i < propertyList.size(); i++) {
            if (propertyList.get(i).getID().equals(propertyID)) {
                return propertyList.get(i);
            }
        }
        return null;
    }



    public double avgArea() {
        double sum = 0;
        for (int i = 0; i < propertyList.size(); i++) {
            sum += propertyList.get(i).getArea();
        }
        return sum / propertyList.size();
    }

    public int propertyCount() {
        int sum = 0;
        for (int i = 0; i < propertyList.size(); i++) {
            sum += 1;
        }
        return sum;
    }

    public List<Property> findPropertiesByLotNumber(int lotNumber) {
        List<Property> matchingProperties = new ArrayList<>();
        for (int i = 0; i < propertyList.size(); i++) {
            if (propertyList.get(i).getLotNumber() == lotNumber) {
                matchingProperties.add(propertyList.get(i));
            }
        }
        return matchingProperties;
    }



}
