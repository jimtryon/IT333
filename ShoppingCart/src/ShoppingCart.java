/*
 * Created by jimtryon on 1/9/15.
 * ShoppingCart
 *
 */
    public class ShoppingCart {
    LineItem[] list;

    // Default constructor that accepts no parameters and initializes an empty array of line items
    public ShoppingCart() {
        // Zero-length array -- empty shopping cart
        list = new LineItem[0];

    }

    // add takes the new item and adds it to the list if the cart has fewer than 10 items
    public void add(LineItem newItem) {
        if (list.length > 9) {
            System.out.println("The cart has reached its maximum limit.");
        } else {
            LineItem[] tempList = new LineItem[list.length + 1];
            int count = 0;

            for (LineItem item : list) {
                tempList[count] = item;
                count++;
            }
            tempList[count] = newItem;
            list = tempList;

            System.out.println(newItem.getQuantity() + " " + newItem.getName() + " added to cart.");

        }
    }

    // getTotalCost returns the total sum of all line items
    public double getTotalCost() {
        double total = 0.0;

        for (LineItem item : list) {
            total += item.getCost();
        }

        return total;
    }
}
