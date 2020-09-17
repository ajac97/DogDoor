import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BarkRecognizer {
    DogDoor door;
    ArrayList<RecognizedSounds> recognizedBarks;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
        recognizedBarks = door.getRecognizedSounds();
    }

    public BarkRecognizer(BarkRecognizer recognizer) {
        this.door = recognizer.door;
        this.recognizedBarks = recognizer.recognizedBarks;
    }

    public BarkRecognizer() {
        this.door = new DogDoor();
        recognizedBarks = door.getRecognizedSounds();
    }

    public BarkRecognizer copy() {
        return new BarkRecognizer(this);
    }

    public ArrayList<RecognizedSounds> getRecognizedBarks() {
        return this.recognizedBarks;
    }

    public void recognize(Bark bark) {
        Iterator<RecognizedSounds> iter = recognizedBarks.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("The bark isn't recognized.");
    }

    public boolean equals(BarkRecognizer recognizer) {
        if (this.getRecognizedBarks().equals(recognizer.getRecognizedBarks())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BarkRecognizer{" +
                "The linked door is " + door +
                ", recognizedBarks=" + "{" + Arrays.toString(recognizedBarks.toArray()) +
                '}';
    }
}


