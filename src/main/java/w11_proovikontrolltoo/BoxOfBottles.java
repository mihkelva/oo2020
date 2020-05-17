package w11_proovikontrolltoo;

public class BoxOfBottles {
    String type;
    double price;
    double weight;
    int bottleCount;
    Bottle bottle;

    public BoxOfBottles(String type, double price, double weight, int bottleCount, Bottle bottle) {
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.bottleCount = bottleCount;
        this.bottle = bottle;
    }

    public BoxOfBottles(String type, double price, double weight, int bottleCount) {
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.bottleCount = bottleCount;
    }

    public double getTotalWeight() {
        return this.weight + this.bottle.weight + this.bottle.drink.specialWeight * this.bottle.size;
    }

    public double getTotalCost() {
        return this.price + this.bottle.cost + this.bottle.drink.litrePrice * this.bottle.size;
    }

    public int fillBoxFromBarrel(Barrel barrel) {
        int filledBottles = 0;
        if(bottle.size <= barrel.volume) {
            filledBottles = (int) (barrel.amount / bottle.size);
        }
        if(filledBottles > bottleCount) {
            filledBottles = bottleCount;
            System.out.println("Kast on täis!");
        }
        return filledBottles;
    }

}
