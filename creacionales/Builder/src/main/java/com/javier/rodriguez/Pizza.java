package com.javier.rodriguez;

import java.util.ArrayList;

public class Pizza {
    private String crust = "";
    private String sauce = "";
    private ArrayList<String> toppings = new ArrayList<>();

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }
}
