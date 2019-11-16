import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
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



        for(int i = 0;i<3;i++)
        {
            System.out.println("Enter the name of pet : ");
            petName = keyboard.next();
            System.out.println("Enter the age of pet : ");
            petAge = keyboard.nextInt();
            System.out.println("Enter the weight of the pet : ");
            petWeight = keyboard.nextDouble();

            pet[i] = new Pet(petName,petAge,petWeight);
        }


        System.out.println("====================================");
        System.out.println();

        largest = pet[0].getWeight();
        smallest = pet[0].getWeight();
        for(int i = 1;i< 3;i++)
        {
            if( pet[i].getWeight() > largest)
            {
                largest = pet[i].getWeight();
                ctr = i;
            }
            if( pet[i].getWeight() < smallest)
            {
                smallest = pet[i].getWeight();
                ctr1 = i;
            }

        }

        System.out.println("The largest pet(s) (" + largest + " pounds):");



        System.out.println("is "+pet[ctr].getName());
        System.out.println();


        System.out.println("The smallest pet(s) (" + smallest + " pounds):");


        System.out.println("is "+pet[ctr1].getName());

        System.out.println();


        oldest = pet[0].getAge();
        youngest = pet[0].getAge();
        for(int i = 1;i<3;i++)
        {
            if(pet[i].getAge() > oldest)
            {
                oldest = pet[i].getAge();
                ctr = i;
            }

            if(pet[i].getAge() < youngest)
            {
                youngest = pet[i].getAge();
                ctr1 = i;
            }

        }

        System.out.println("The oldest pet(s) (" + oldest + " years):");

        System.out.println(" is "+pet[ctr].getName());
        System.out.println();
        /* your code to find the age of the youngest Pet(s) goes here */

        System.out.println("The youngest pet(s) (" + youngest + " years):");



        System.out.println(" is "+pet[ctr1].getName());
        System.out.println();


        for(int i = 0;i<3;i++)
        {
            aveWeight = aveWeight + pet[i].getWeight();
        }
        aveWeight = aveWeight/3;
        System.out.print("Average weight (pounds) = " + aveWeight);

        System.out.println();


        for(int i = 0;i<3;i++)
        {
            aveAge = aveAge + pet[i].getAge();
        }
        aveAge = aveAge/3;
        System.out.print("Average age (years) = " + aveAge);

        System.out.println();
    }
}
