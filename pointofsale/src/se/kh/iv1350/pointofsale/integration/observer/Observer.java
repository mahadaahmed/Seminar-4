package se.kh.iv1350.pointofsale.integration.observer;

/**
 * This is the observer interface according to the observer pattern
 * an abstract class
 */
public interface Observer {
    /**
     *
     * @param totalRevenue recieves total revenue of the sale
     */

    public void update (int totalRevenue);

}
