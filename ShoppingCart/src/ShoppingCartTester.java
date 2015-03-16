/**
 * Created by jimtryon on 1/11/15.
 * This program creates two classes LineItem and ShoppingCart to simulate
 * an online shopping cart and print the cart totals.
 */
public class ShoppingCartTester {

    // Unit test 1
    // Single item
    public static void main(String[] args)
    {
        ShoppingCart singleItemCart = new ShoppingCart();

        LineItem coat = new LineItem("coat", 1, 39.99);
        singleItemCart.add(coat);
        System.out.println("Single item total: " + singleItemCart.getTotalCost());
        System.out.println();

        // Unit test 2
        // Five items
        ShoppingCart typicalCart = new ShoppingCart();

        LineItem socks = new LineItem("socks", 4, 14.99);
        LineItem hat = new LineItem("hats", 2, 10.00);
        LineItem pants = new LineItem("pants", 1, 29.95);
        LineItem sweater = new LineItem("sweaters", 2, 49.50);
        LineItem belt = new LineItem("belt", 1, 17.99);

        typicalCart.add(socks);
        typicalCart.add(hat);
        typicalCart.add(pants);
        typicalCart.add(sweater);
        typicalCart.add(belt);

        System.out.println();
        System.out.println("Five item total: " + typicalCart.getTotalCost());
        System.out.println();

        // Unit test 3
        // Ten items
        ShoppingCart fullCart = new ShoppingCart();

        LineItem watch = new LineItem("watch", 1, 70.00);
        LineItem gps = new LineItem("gps", 2, 199.99);
        LineItem fan = new LineItem("fan", 1, 20.00);
        LineItem radio = new LineItem("radio", 1, 15.00);
        LineItem tent = new LineItem("tent", 1, 120.00);
        LineItem flashlight = new LineItem("flashlight", 1, 12.00);
        LineItem batteries = new LineItem("batteries", 4, 9.99);
        LineItem backpack = new LineItem("backpack", 2, 79.99);
        LineItem compass = new LineItem("compass", 1, 40.00);
        LineItem boots = new LineItem("boots", 1, 65.00);

        fullCart.add(watch);
        fullCart.add(gps);
        fullCart.add(fan);
        fullCart.add(radio);
        fullCart.add(tent);
        fullCart.add(flashlight);
        fullCart.add(batteries);
        fullCart.add(backpack);
        fullCart.add(compass);
        fullCart.add(boots);

        System.out.println();
        System.out.println("Ten item total: " + fullCart.getTotalCost());
        System.out.println();

        // Unit test 4
        // Overflow
        ShoppingCart overflowCart = new ShoppingCart();
        LineItem towels = new LineItem("towels", 2, 30.00);
        LineItem water = new LineItem("water", 24, 4.00);
        LineItem grill = new LineItem("grill", 1, 19.99);
        LineItem charcoal = new LineItem("charcoal", 2, 15.00);
        LineItem net = new LineItem("badminton", 1, 90.00);
        LineItem rackets = new LineItem("rackets", 2, 8.00);
        LineItem cooler = new LineItem("cooler", 1, 24.75);
        LineItem ice = new LineItem("ice", 8, 13.00);
        LineItem chairs = new LineItem("chairs", 3, 18.00);
        LineItem sunscreen = new LineItem("sunscreen", 1, 12.99);
        LineItem sandals = new LineItem("sandals", 1, 65.00);


        overflowCart.add(towels);
        overflowCart.add(water);
        overflowCart.add(grill);
        overflowCart.add(charcoal);
        overflowCart.add(net);
        overflowCart.add(rackets);
        overflowCart.add(cooler);
        overflowCart.add(ice);
        overflowCart.add(chairs);
        overflowCart.add(sunscreen);
        overflowCart.add(sandals);

        System.out.println();
        System.out.println("Overflow item total: " + overflowCart.getTotalCost());
        System.out.println();

        // Unit test 5
        // Empty cart
        ShoppingCart emptyCart = new ShoppingCart();
        System.out.println("Empty cart total: " + emptyCart.getTotalCost());
    }

}
