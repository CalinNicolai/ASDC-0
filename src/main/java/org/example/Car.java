package org.example;
import java.io.Serializable;

public class Car implements Cloneable, Serializable {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    // Конструктор по умолчанию
    public Car() {}

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Make: " + id);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    // Переопределение метода equals для сравнения по содержимому
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car other = (Car) obj;
        return id == other.id &&
                make.equals(other.make) &&
                model.equals(other.model) &&
                year == other.year &&
                color.equals(other.color) &&
                Double.compare(price, other.price) == 0;
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, make, model, year, color, price);
    }

    // Другие методы класса
}
