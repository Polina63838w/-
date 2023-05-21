import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Toy {
    int toyId;
    String name;
    int quantity;
    double weight;

    public Toy(int toyId, String name, int quantity, double weight) {
        this.toyId = toyId;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void reduceQuantity(int value) {
        this.quantity -= value;
    }

    public String toString() {
        return this.name + " (" + this.toyId + "): " + this.quantity;
    }
}

class Store {
    List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public Toy pickToy() {
        List<Toy> lotteryList = new ArrayList<>();
        for (Toy toy : toys) {
            for (int i = 0; i < toy.weight; i++) {
                lotteryList.add(toy);
            }
        }
        Random random = new Random();
        Toy prize = lotteryList.get(random.nextInt(lotteryList.size()));
        prize.reduceQuantity(1);
        return prize;
    }

    public void displayToys() {
        for (Toy toy : toys) {
            System.out.println(toy.toString());
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Store store = new Store();
        store.addToy(new Toy(1, "Teddy bear", 10, 50));
        store.addToy(new Toy(2, "Doll", 5, 30));
        store.addToy(new Toy(3, "Car", 15, 20));
        store.addToy(new Toy(4, "Chess set", 2, 5));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the new weight for Chess set (a value between 0 and 100): ");
        double newWeight = input.nextDouble();
        store.toys.get(3).setWeight(newWeight);

        System.out.println("All toys:");
        store.displayToys();

        System.out.println("Pick a toy as a prize:");
        Toy prize = store.pickToy();
        System.out.println(prize.name + " is the prize!");

        System.out.println("Reduced quantity of the prize toy:");
        System.out.println(prize.toString());

        FileWriter fileWriter = new FileWriter("prize.txt");
        fileWriter.write(prize.name);
        fileWriter.close();

        System.out.println("Updated quantity of all toys:");
        store.displayToys();
    }
}
