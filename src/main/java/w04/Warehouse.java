package w04;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Fridge> fridges = new ArrayList<Fridge>();

    public List<Fridge> getFridges() {
        return fridges;
    }

    public void setFridges(List<Fridge> fridges) {
        this.fridges = fridges;
    }
}
