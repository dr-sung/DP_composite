/*
 * participant: Leaf
 */
public class Part implements Component {
    
    private final String description;
    private final double cost;
    
    public Part(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }
    
    // empty implementation for unit parts

    @Override
    public void addComponent(Component item) {
    }

    @Override
    public void removeComponent(Component item) {
    }

    @Override
    public Component[] getComponents() {
        return null;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return "["+description+":$"+cost+"]";
    }
}
