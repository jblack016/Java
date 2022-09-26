public class CafeJava {
    public static void main(String[] args){

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = " Your total is $";

        // Menu Variables
        double mochaPrice = 3.75;
        double dripCoffeePrice = 1.00;
        double lattePrice = 3.99;
        double cappuccinoPrice = 5.50;


        //Customer name Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order Completions
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // Cindhuri Order
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + displayTotalMessage + dripCoffeePrice + pendingMessage);

        // Noah Order
        if(isReadyOrder2){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage);
        }

        // Sam Order
            System.out.println(displayTotalMessage + lattePrice*2);
        if(isReadyOrder3){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy Order
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}