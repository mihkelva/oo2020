package w11_proovikontrolltoo;

public class Bottle {
    double size;
    String type;
    double weight;
    double cost;
    Drink drink;

    public Bottle(double size, String type, double weight, double cost, Drink drink) {
        this.size = size;
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.drink = drink;
    }

    public Bottle(double size, String type, double weight, double cost) {
        this.size = size;
        this.type = type;
        this.weight = weight;
        this.cost = cost;
    }

    public double getTotalWeight() {
        return this.weight + this.drink.specialWeight * this.size;
    }

    public double getTotalCost() {
        return this.cost + this.drink.litrePrice * this.size;
    }
}
