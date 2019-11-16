import java.util.Scanner;

public class Pet {



    private String name;
    private int age;
    private double weight;

    public Pet(String name,int age,double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        String petName = "";
        int petAge = 0;
        double petWeight = 0;
        int ctr = 0;
        int ctr1 = 0;

        Pet[] pet = new Pet[3];

        double largest = 0, smallest = 0;
        int youngest = 0, oldest = 0;
        double aveWeight = 0, aveAge = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of pet : ");
            petName = keyboard.next();
            System.out.println("Enter the age of pet : ");
            petAge = keyboard.nextInt();
            System.out.println("Enter the weight of the pet : ");
            petWeight = keyboard.nextDouble();

            pet[i] = new Pet(petName, petAge, petWeight);
        }

        System.out.println("====================================");
        System.out.println();


        largest = pet[0].getWeight();
        smallest = pet[0].getWeight();
        for (int i = 1; i < 3; i++) {
            if (pet[i].getWeight() > largest) {
                largest = pet[i].getWeight();
                ctr = i;
            }
            if (pet[i].getWeight() < smallest) {
                smallest = pet[i].getWeight();
                ctr1 = i;
            }

        }

        System.out.println("The largest pet(s) (" + largest + " pounds):");
    }

}
