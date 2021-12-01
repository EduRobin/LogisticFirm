package LogisticsCompany;

import java.util.ArrayList;

public class Car {

    private  double weight;

    double capacity;
    public Car(double capacity) {
        this.capacity = capacity;
        this.weight = 0;
    }

    public void setWeight(Double w) {
        System.out.println(this.weight);
        this.weight += w;
        System.out.println("Vase momentalni vaha auta je: " + this.weight);

    }
    public double getCapacity() {
        return this.capacity;
    }



    public double getWeight()  {
        return this.weight;
    }

}
