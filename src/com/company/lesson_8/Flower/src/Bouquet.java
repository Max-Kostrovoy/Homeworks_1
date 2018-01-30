package com.company.lesson_8.Flower.src;

public class Bouquet {
    public int totalPrice = 0;

    public void printBouquet(Flower... fl) {
        for (Flower thisFlower : fl) {
            totalPrice += thisFlower.getPrice();
            System.out.println(thisFlower.flowerName + ", from " + thisFlower.getOrigin());
            System.out.println("It costs : " + thisFlower.getPrice());
            System.out.println("You can keep it for " + thisFlower.getDaysToKeep() + " days.");
            System.out.println("Total price is : " + totalPrice);
        }
    }

    public static void main(String[] args) {
        Bouquet myBouquet = new Bouquet();
        Flower[] flowers = new Flower[3];
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        Aster aster = new Aster();

        flowers[0] = rose;
        flowers[1] = tulip;
        flowers[2] = aster;

        myBouquet.printBouquet(rose, tulip, aster);
    }


}