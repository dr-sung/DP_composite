
// participant: Composite

import java.util.ArrayList;

public class Assembly implements Component {

    private final ArrayList<Component> itemList;
    private final String description;

    public Assembly(String description) {
        this.description = description;
        itemList = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component item) {
        itemList.add(item);
    }

    @Override
    public void removeComponent(Component item) {
        itemList.remove(item);
    }

    @Override
    public Component[] getComponents() {
        return itemList.toArray(new Component[itemList.size()]);
    }

    @Override
    public double getCost() {
        double totalCost = 0;
        for (Component item : itemList) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public String getDescription() {
        String description = this.description + "<";
        for (int i = 0; i < itemList.size(); i++) {
            Component item = itemList.get(i);
            if (i != itemList.size() - 1) {
                description += item.getDescription() + ",";
            } else {
                description += item.getDescription();
            }
        }

        return description + ">";
    }
    
    public String toString() {
        return "["+this.getDescription()+" :$"+this.getCost()+"]";
    }
}
