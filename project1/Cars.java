package project1;
import java.util.Scanner;
public class Cars extends Showroom implements utility{

    String car_name;
    String car_color;
    String car_fuel_type;

    double car_price;
    String car_type;

    String car_transmission;

    @Override
    public void get_details(){
        System.out.println("CAR NAME: "+car_name);
        System.out.println("CAR COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("CAR TRANSMISSION: "+car_transmission);

    }


    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== *** ENTER CAR DETAILS *** ======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.print("FUEL TYPE (PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("ON ROAD PRICE: ");
        car_price = sc.nextDouble();
        System.out.println();
        System.out.print("CAR TYPE (SEDAN/SUV): ");
        car_type = sc.nextLine();
        System.out.print("CAR TRANSMISSION (AUTO/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;

    }

}
