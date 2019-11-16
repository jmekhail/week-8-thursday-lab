public class Methods {

    // x

    private int x;

    // helloWorld method


    public static helloWorld() {

        System.out.println("Hello, world!");

    }

    // print method

    public void print() {

        System.out.println("x is: " + x);

    }
    // setX method

    public void setX(int newX) {

        if (x < 0) {

            System.out.println("x must be set to a positive value.");

            System.exit(0);

        }

        x = newX;

    }

    // Initialization method

    public Methods(int x) {


        setX(x);
    }

    // getX method

    public int getX() {

        return x;

    }


    // Overloaded print method

    public static void print(Methods obj) {


        obj.print();


    }


}
