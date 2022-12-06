package com.company;

public class Item
{
    private double salesPrice;
    private String name;
    private int quant;
    private double storeCost;
    private int min;

    public Item(String n, double  price, double cost, int quantity, int minimum) {
        name = n;
        salesPrice = price;
        storeCost = cost;
        quant = quantity;
        min = minimum;
    }

    public void restock()
    {
        quant+=20;
    }
    public void buy(int num)
    {
        if(num<quant)
        {
            quant-=num;
        }
        if(quant<min)
        {
            restock();
        }
        System.out.println("Your total Price is: " + (num * salesPrice));
    }



}