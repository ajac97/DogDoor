import java.sql.SQLOutput;
import java.util.Scanner;

public class DogDoorMain {
    private static Scanner input = new Scanner(System.in);
// add recognized barks and scratches with a while loop for each. it adds them to an ArrayList polymorphically
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        String keepGoing = "Yes";
        while (keepGoing.equalsIgnoreCase("Yes")) {
            System.out.println("Add a recognized bark please: ");
            String barkSound = input.nextLine();
            Bark newBark = new Bark(barkSound);
            door.recognizedSounds.add(newBark);
            System.out.println("Would you like to add another Bark?");
            keepGoing = input.nextLine();
        }
        keepGoing = "Yes";
        while (keepGoing.equalsIgnoreCase("Yes")) {
            System.out.println("Add a recognized scratch sound please : ");
            String scratchSound = input.nextLine();
            Scratch newScratch = new Scratch(scratchSound);
            door.recognizedSounds.add(newScratch);
            System.out.println("Would you like to add another Scratch?");
            keepGoing = input.nextLine();
        }
        door.remote.openButton(); // open the door
        Bark b = new Bark("Woofie"); // dog barks
        door.recog.recognize(b); // check if bark is recognized
        door.windowKeypad(1111); // try opening windows with combination
        door.close(); // close the door
        b = new Bark ("Ruff"); // another dog barks
        door.recog.recognize(b); // check if this bark is recognized
    }
}
