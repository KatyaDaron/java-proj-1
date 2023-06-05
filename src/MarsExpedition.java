import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Adding bootup message for Mars Expedition and delay
        System.out.println("Welcome to the Mars Expedition!");
        System.out.println("Initializing mission systems...");
        Thread.sleep(2000);
        System.out.println("All systems ready for launch!");
        Thread.sleep(2000);
        System.out.println("The Mars Expedition begins!");

        //Greeting user
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hi, " + userName + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        //Accounting for invalid input
        boolean isValidAnswer = false;
        while (!isValidAnswer) {
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase("y")) {
                System.out.println("I knew you would say that. You are team leader for a reason.");
                isValidAnswer = true;
            } else if (userAnswer.equalsIgnoreCase("n")) {
                System.out.println("Too bad you are team leader. You have to go.");
                isValidAnswer = true;
            } else {
                System.out.println("Invalid input. Please type Y or N.");
            }
        }

        //Prompting for team size and adjusting it
        System.out.println("How many people you want on your team?");
        int teamSize = input.nextInt();
        input.nextLine();
        if (teamSize > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            int remainingMembers = 2 - teamSize;
            System.out.println("That's not enough people for the mission.");
            System.out.println("You need at least " + remainingMembers + " more on your team besides you.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        //Prompting for a snack
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        //Choosing a vehicle
        System.out.println("Choose a vehicle for the expedition: ");
        System.out.println("1. Mars Rover");
        System.out.println("2. Spaceship");
        System.out.println("3. Mars Buggy");
        System.out.println("4. Martian Hovercraft");
        System.out.print("Enter the number of your choice: ");
        int vehicleChoice = input.nextInt();
        input.nextLine();
        String selectedVehicle;
        switch (vehicleChoice) {
            case 1:
                selectedVehicle = "Mars Rover";
                break;
            case 2:
                selectedVehicle = "Spaceship";
                break;
            case 3:
                selectedVehicle = "Mars Buggy";
                break;
            case 4:
                selectedVehicle = "Martian Hovercraft";
                break;
            default:
                selectedVehicle = "your feet";
        }

        //Final message
        System.out.println();
        System.out.println("Mission Details:");
        System.out.println("Team: " + userName + " and " + teamSize + " members");
        System.out.println("Snack: " + snack);
        System.out.println("Vehicle: " + selectedVehicle);
        System.out.println("Countdown initiated: 3... 2... 1...");
        Thread.sleep(1000);
        System.out.println("Blastoff!");
    }
}
