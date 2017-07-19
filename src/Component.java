/*
 * participant: Component
 *          defines all possible methods for both
 *          part (participant: Leaf) and assemblies (participant: Composite)
 */
public interface Component {
    
    public String getDescription();
    public double getCost();
    void addComponent(Component item);
    void removeComponent(Component item);
    Component[] getComponents();
    
}
