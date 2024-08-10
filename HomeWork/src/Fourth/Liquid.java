package Fourth;

import java.math.BigDecimal;

public class Liquid {
    private String name;
    private int volume;
    private int price;

    public Liquid() {
    }

    public Liquid(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getOnePrice() {
        BigDecimal price = BigDecimal.valueOf(this.price);
        BigDecimal volume = BigDecimal.valueOf(this.volume);
        return price.divide(volume).doubleValue();
    }
}
