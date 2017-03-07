import java.util.Scanner;

public class carLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Car car1 = new Car();
       System.out.println( "Enter the car's year model: ");
        car1.setYear(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the car's make: ");
        car1.setMake(keyboard.nextLine());
        
        
        // this is a loop that says if the speed is less than zero, add 5 to it 5 times
        for(int i = 0; i < 5; i++){
        	car1.accelerate();
        System.out.println(car1.getSpeed());
        }
        // this is a loop that says deduct 5, 5 times
        for(int i = 0; i < 5; i++){
        	car1.brake();
        	System.out.println(car1.getSpeed());
        }
    

        keyboard.close();
	}

}
