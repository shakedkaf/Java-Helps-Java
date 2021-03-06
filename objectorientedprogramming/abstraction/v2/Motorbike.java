/**
 * Motorbike class is a subclass of Vehicle.
 *
 * @version 2.0
 * @author L.Gobinath
 */
public class Motorbike extends Vehicle {
    /**
     * Motorbike class is a non-abstract sub class of Vehicle.
     * Must override the drive method.
     */
    @Override
    public void drive() {
        System.out.println("Use handlebars");
    }
}