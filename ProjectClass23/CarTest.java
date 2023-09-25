package ProjectClass23;
/*
11. Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount

 */
class Car{

    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

// Subclass Sedan
class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice - (0.05 * carPrice); // 5% discount for sedans longer than 20 feet
        } else {
            return carPrice - (0.10 * carPrice); // 10% discount for other sedans
        }
    }
}

// Subclass Truck
class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (0.10 * carPrice); // 10% discount for trucks over 2000 pounds
        } else {
            return carPrice - (0.20 * carPrice); // 20% discount for other trucks
        }
    }
}

public class CarTest {
    public static void main(String[] args) {
        // Create a Sedan
        Sedan sedan = new Sedan(25000, "Red", 22.5);

        // Create a Truck
        Truck truck = new Truck(35000, "Blue", 1800);

        // Calculate and display sale prices
        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}

