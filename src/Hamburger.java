/**
 * Created by melodytempleton on 5/31/17.
 */
public class Hamburger {

    private String rollType = "";
    private String meat = "";
    private Double price = 0d;


    public Hamburger (String rollType, String meat) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = 3.00d;

        System.out.println("You have ordered a " + this.meat + " burger on a "  + this.rollType + " at base price of " + this.price);
    }

      public void addCheese () {

        this.price = this.price + 1.00d;
        System.out.println("Added cheese to burger for additional $1.00");
          giveBurgerTotal ();
    }

      public void addBacon () {

        this.price = this.price + 1.00d;
        System.out.println("Added bacon to burger for additional $1.00");
          giveBurgerTotal ();

    }

      public void addLettuce () {

        this.price = this.price + .50d;
        System.out.println("Added lettuce to burger for additional $.50");
          giveBurgerTotal ();

    }

      public void addTomato() {

        this.price = this.price + .50d;
        System.out.println("Added tomato to burger for additional $1.00");
          giveBurgerTotal ();

    }

    public void giveBurgerTotal (){

        System.out.println("Your burger price is $" + this.price);
    }


}
