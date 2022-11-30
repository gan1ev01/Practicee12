import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(" Enter Length :  ");
            double length = scanner.nextDouble();
            System.out.print(" Enter Width :  ");
            double width = scanner.nextDouble();
            System.out.print(" Enter Height :  ");
            double height = scanner.nextDouble();
            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
            System.out.println(parallelepiped);
            System.out.println(" Area of the parallelepiped : "+parallelepiped.getArea());
            System.out.println(" Volume of the parallelepiped : "+parallelepiped.getVolume());
        }catch (InputMismatchException exception){
            System.out.println(" It can't be more than 20 or negative number ! ");
        } catch (Exception exception) {
            System.out.println(" It can't be letter or symbol ! ");
        }
    }
}

