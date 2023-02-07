package com.example.Tycoon;

public class BusinessInfo {

    private double cost;
    private double profit;
    private double time;


    public BusinessInfo(double c, double p, double t){

        cost = c;
        profit = p;
        time = t;

    }

    public void setCost(double cost) {
        cost = cost;
    }

    public double getCost(){
        return cost;
    }


    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getProfit() {
        return profit;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

}
