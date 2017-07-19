
// Example: Composite design pattern
// This example is based on the code presented at the book:
// "Java Design Pattern Essentials" by Tony Bevis

/*
 * participant: Client
 */
public class Main {
    
    public static void main(String[] args) {
        Component cpu = new Part("CPU", 120);
        Component fan = new Part("fan", 10);
        Component ram = new Part("memory", 50);
        
        Component mainBoard = new Assembly("MainBoard");
        mainBoard.addComponent(cpu);
        mainBoard.addComponent(fan);
        mainBoard.addComponent(ram);
        
        Component computer = new Assembly("computer");
        computer.addComponent(mainBoard);
        computer.addComponent(new Part("monitor", 80));
        
        System.out.println(cpu);
        System.out.println(mainBoard);
        System.out.println(computer);
             
    }
    
}
