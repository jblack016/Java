import java.util.ArrayList;

public class Order{

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name="guest ";
        this.ready= false;
    }


    public Order(String name){
        this.name = name;
        this.ready = false;
    }


    // Name
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }


    // Ready
    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready=ready;
    }

    // Items
    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item>items){
        this.items=items;
    }

    // Add Items
    public void addItem(Item item){
        this.items.add(item);
    }

    // Print Ready Status message
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";
        } else{
            return "Your order will be ready soon.";
        }
    }

    // Get Order Total
    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    // Print order total
    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}