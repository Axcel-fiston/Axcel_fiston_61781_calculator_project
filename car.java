
import java.util.Objects;
import java.util.Scanner;
 class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

     public void delivery(int deliveredQuantity) {
         quantity += deliveredQuantity;
         System.out.println(deliveredQuantity + " " + brand + " " + model + " cars delivered.");
     }
     public void sell(int soldQuantity) {
         if (quantity >= soldQuantity) {
             quantity -= soldQuantity;
             System.out.println(soldQuantity + " " + brand + " " + model + " cars sold.");
         } else {
             System.out.println("Not enough " + brand + " " + model + " cars in stock to sell.");
         }

}
     @Override
     public String toString(){
         return "Car{"+"model="+model+'\''+",brand="+brand+'\''+",year="+year+'\''+",price="+price+'\''+",color="+color+'\''+",quantity="+quantity+"}";
     }
 }
 class cars
{
    public static void main(String[] args)
    {
        Car r=new Car("Aventador","Lamborghini",2023,900000,"white",100);
        System.out.println(r.toString());
        r.sell(180);
        System.out.println(r.toString());
        r.setModel("Aventador");
        r.delivery(200);
        r.setBrand("Lamborghini");
        r.setYear(2023);
        r.setColor("black");
        r.setPrice(2000000);
        r.setQuantity(20);
        System.out.println(r.toString());
    }
}
