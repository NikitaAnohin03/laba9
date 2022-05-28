package com.company;

public class Main {

    public static void main(String[] args) {
        Сlient1 a = new Сlient1("Croissant ",45,4,"Denis ",73144215);
        a.Сlient1();
        Сlient2 b = new Сlient2("lays ",60,10,"Danil ",1301276);
        b.Сlient2();
        Сlient3 c = new Сlient3("Orbit ",35,6,"Dima ",2226789);
        c.Сlient3();
    }
}
interface Product{
    void name();
    void price();
    void rating();
}
class Baking implements Product{
    String buns ;
    int price;
    int rating;
    Baking(String buns ,int price , int rating){
        this.buns =buns ;
        this.price=price;
        this.rating=rating;
    }
    public void name(){
        System.out.println(buns );
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}
class Crisps implements Product {
    String crisps;
    int price;
    int rating;

    Crisps(String crisps, int price, int rating) {
        this.crisps = crisps;
        this.price = price;
        this.rating = rating;
    }
    public void name() {
        System.out.println(crisps);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
}
class Gum  implements Product{
    String gum ;
    int price;
    int rating;

    Gum(String gum , int price, int rating) {
        this.gum = gum ;
        this.price = price;
        this.rating = rating;
    }
    public void name() {
        System.out.println(gum);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
}
interface User{
    void login();
    void password();
}
class Сlient1  implements User,Product {
    String buns ;
    int price;
    int rating;
    String login;
    int password;

    Сlient1(String buns , int price, int rating, String login, int password) {
        this.buns  = buns ;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(buns );
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Сlient1(){
        System.out.println("User name: "+login + " buys " + buns );
    }
}
class Сlient2  implements User,Product {
    String crisps;
    int price;
    int rating;
    String login;
    int password;

    Сlient2(String crisps, int price, int rating, String login, int password) {
        this.crisps = crisps;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(crisps);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Сlient2(){
        System.out.println("User name: "+login + " buys " + crisps);
    }
}
class Сlient3  implements User,Product {
    String gum;
    int price;
    int rating;
    String login;
    int password;

    Сlient3(String gum, int price, int rating, String login, int password) {
        this.gum = gum;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }
    public void name() {
        System.out.println(gum);
    }
    public void price() {
        System.out.println(price);
    }
    public void rating() {
        System.out.println(rating);
    }
    public void login() {
        System.out.println(login);
    }
    public void password() {
        System.out.println(password);
    }
    public void Сlient3(){
        System.out.println("User name: "+login + " buys " + gum);
    }
}