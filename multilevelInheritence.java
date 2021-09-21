class Box{
    String itemid;
    public Box(String itemid){
        this.itemid = itemid;
    }
}

class BoxWeight extends Box{
    int weight;
    public BoxWeight(String itemid, int weight){
        super(itemid);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight{
    int cost;
    public Shipment(String itemid, int weight, int cost){
        super(itemid, weight);
        this.cost = cost;
    }
}

public class multilevelInheritence{
    public static void main(String[] args){
        Shipment s1 = new Shipment("15", 80, 70000);
        System.out.println("Information = " +s1.itemid+ " " + s1.weight + " " + s1.cost);
    }
}