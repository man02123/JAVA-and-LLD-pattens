package Concepts;

public class CoreConcepts {

    private String id;
    private String name;
    private OrderStatus orderStatus;

    public CoreConcepts(String id, String name, OrderStatus orderStatus) {
        this.id = id;
        this.name = name;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Id: " + id + " Name: " + name + " Order Status: " + orderStatus);
    }
}
