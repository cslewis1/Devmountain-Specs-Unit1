import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome Back!");

        ArrayList<String> samples = new ArrayList<String>();

        samples.add("rock");
        samples.add("weird rock");
        samples.add("smooth rock");
        samples.add("not rock");

        System.out.println("Samples: " + samples);
        System.out.println("Samples are downloaded.");


        System.out.println("There is a item on the list that's not a rock");
        System.out.println("It needs to be deleted");

        samples.remove("not rock");

        System.out.println("Samples has been updated.");
        System.out.println("Samples: " + samples);

        Thread.sleep(500);

        HashMap<String, String> fossils = new HashMap<String, String>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossils data is downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        String fossilChoice = choice.substring(0, 1).toUpperCase() + choice.substring(1) + " Fossil";

        if(choice.equalsIgnoreCase("Bird")){
            System.out.println(choice + " Fossil: " + fossils.get(fossilChoice));
        } else if (choice.equalsIgnoreCase("Fish")){
            System.out.println(choice + " Fossil: " + fossils.get(fossilChoice));
        } else if (choice.equalsIgnoreCase("Tooth")){
            System.out.println(choice + " Fossil: " + fossils.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<String>();

        supplies.add("gauze");
        supplies.add("antibiotics");
        supplies.add("coat");
        supplies.add("chips");

        System.out.println("Supplies Before Expedition: " + supplies);

        supplies.remove("chips");

        System.out.println("Supplies After Expedition: " + supplies);

    }
}
