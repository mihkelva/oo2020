package w11_proovikontrolltoo;

public class Barrel {
    double volume;
    double amount;

    public Barrel(double volume, double amount) {
        this.volume = volume;
        this.amount = amount;
    }

    public boolean fillBottle(Bottle bottle) {
        boolean bottleFilled = false;
        if(bottle.size <= this.amount) {
            bottleFilled = true;
        }
        return bottleFilled;
    }

    public int fillWholeBarrel(Bottle bottle) {
        int filledBottles = 0;
        if(bottle.size <= this.volume) {
            filledBottles = (int) (this.volume / bottle.size);
        }
        return filledBottles;
    }


}
