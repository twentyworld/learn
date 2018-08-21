package com.learn;

import com.fasterxml.jackson.annotation.*;

/**
 * Created by teemper on 2018/8/21, 21:48.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */

@JsonPropertyOrder
public class House {
    private int price;
    @JsonProperty("destination")
    private String address;

    public House() {
    }

    public House(int price, String address) {
        this.price = price;
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" + "price=" + price + ", address='" + address + '\'' + '}';
    }

}
