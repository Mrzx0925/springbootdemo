package com.springboot.mydemo.entity;

public class Data {

   private Integer one = 0;
    private Integer two = 0;
    private Integer three = 0;
    private Integer four = 0;
    private Integer five = 0;

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getFour() {
        return four;
    }

    public void setFour(Integer four) {
        this.four = four;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }

    public void addone(){
        this.one++;
    }
    public void addtwo(){
        this.two++;
    }
    public void addthree(){
        this.three++;
    }
    public void addfour(){
        this.four++;
    }
    public void addfive(){
        this.five++;
    }
}
