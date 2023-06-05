import java.util.*;

public class FindingsList {

    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("\nWelcome back from your expedition!");
        System.out.println("It's time to catalog everything you found.\n");

        //Storing all rock samples
        List<String> rockList = new ArrayList<>();
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println("Rock data downloaded successfully!\n");
        System.out.println("List of rocks:");
        for (String rock : rockList) {
            System.out.println(" - " + rock);
        }

        //Removing non-rocks
        System.out.println("\nNon-rock element found. It needs to be removed from the list.\n");
        rockList.remove("not rock");
        for (String rock : rockList) {
            System.out.println(" - " + rock);
        }
        System.out.println("\nPerfect!\n");

        //Storing all fossils samples
        Thread.sleep(1000);
        Map<String, String> map = new HashMap<>();
        map.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        map.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        map.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        //Accessing fossil information
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish or tooth)");
        Scanner scanner = new Scanner(System.in);
        String fossilChoice = scanner.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            fossilChoice = "Bird Fossil";
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + map.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            fossilChoice = "Fish Fossil";
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + map.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            fossilChoice = "Tooth Fossil";
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + map.get(fossilChoice));
        } else {
            System.out.println("Invalid choice. No information available for the selected fossil.");
        }

        //Storing supplies brought
        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();
        supplies.add("Binoculars");
        supplies.add("Flashlight");
        supplies.add("Solar Charger");

        //Printing supplies before and after expedition
        Iterator beforeExpeditionItr = supplies.iterator();
        System.out.println("\nSupplies Before Expedition:");
        while (beforeExpeditionItr.hasNext()) {
            System.out.println(" - " + beforeExpeditionItr.next());
        }

        supplies.remove("Binoculars");

        Iterator<String> afterExpeditionItr = supplies.iterator();
        System.out.println("\nSupplies After Expedition:");
        while (afterExpeditionItr.hasNext()) {
            System.out.println(" - " + afterExpeditionItr.next());
        }
    }
}
