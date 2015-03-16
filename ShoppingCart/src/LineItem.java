/**
 * Created by jimtryon on 1/9/15.
 * LineItem
 */
public class LineItem
{
    // Member variables set to private and can only be accessed in this class.
    private String name;
    private int quantity;
    private double pricePerUnit;

    // Constructor used to create an item order.
    public LineItem(String name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // getCost returns the total cost of an item given the quantity.
    public double getCost()
    {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    // setQuantity updates the item's quantity.
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}
