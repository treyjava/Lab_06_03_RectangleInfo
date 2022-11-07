import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        String trash = "";

        System.out.print("Enter the length of the rectangle: ");

        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid number " + trash + ", please try again");
            System.exit(0);
        }
        System.out.print("Enter the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid number " + trash + ", please try again");
            System.exit(0);
        }

        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        double triangle = length / 2;
        double triangle2 = width / 2;
        double diagonal = triangle * triangle + triangle2 * triangle2;
        System.out.println("The area of the rectangle is " + area + ", the perimeter is " + perimeter + ", and the diagonal is " + diagonal);
    }
}