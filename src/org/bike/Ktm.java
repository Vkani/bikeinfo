package org.bike;

public class Ktm implements Bike {
public void cost() {
	System.out.println("Cost-120000");
}
public void speed() {
	System.out.println("Speed- 150 km/hr");
}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
