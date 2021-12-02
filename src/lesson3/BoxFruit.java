package lesson3;

import java.util.ArrayList;

public class BoxFruit<F> {

    ArrayList<F> fruits = new ArrayList();
    private double weightFruit = 0.0;

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit){
        System.out.println("Вес в первом ящике: " + fruits.size());
        System.out.println("Вес во втором ящике: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("Вес в первом ящике после слияния: " + fruits.size());
        System.out.println("Вес во втором ящике после слияния: " + boxFruit.fruits.size());
    }

}
