package com.company.lesson_7;

public class Phone {
    String model;
    double weight;
    int number;

    Phone(String m, double w, int num) {
        this.model = m;
        this.weight = w;
        this.number = num;
    }

    Phone(double w, int num) {
        this.weight = w;
        this.number = num;
    }

    Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void printPhone() {
        System.out.println("Model : " + model);
        System.out.println("Weight : " + weight + " gr.");
    }

    public void receiveCall(String name) {
        System.out.println("Incoming name : " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Incoming name : " + name);
        System.out.println("Incoming number : " + number);
    }

    public void sendMessage(int... array) {
        System.out.println("Message is sent to : ");
        for (int a : array) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.setModel("Nokia");
        myPhone.setWeight(150.4);
        myPhone.setNumber(1234678);

        Phone myPhone2 = new Phone();
        myPhone2.setWeight(95.7);
        myPhone2.setNumber(3456834);

        myPhone.sendMessage(128347);
        myPhone2.sendMessage(127001, 128465);
        myPhone.sendMessage(0, 128, 256, 512);

        myPhone.printPhone();

        myPhone.receiveCall("Mike", 34599985);
    }
}