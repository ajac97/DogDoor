import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private Window windows;
    Remote remote;
    BarkRecognizer recog;
    private boolean open;
    ArrayList<RecognizedSounds> recognizedSounds; // will accept both Bark and Scratch polymorphically.


    public DogDoor() {
        open = false;
        recognizedSounds = new ArrayList<RecognizedSounds>();
        windows = new Window();
        recog = new BarkRecognizer(this);
        remote = new Remote(this);


    }

    public DogDoor(DogDoor door) {
        open = door.open;
        recognizedSounds = door.recognizedSounds;
        windows = new Window();
        recog = new BarkRecognizer(this);
        remote = new Remote(this);
    }

    public DogDoor copy(DogDoor obj2) {
        obj2.recognizedSounds = this.recognizedSounds;
        return obj2;
    }

    public void open() {
        open = true;
        System.out.println("The door is now open");
        Timer closeCounter = new Timer();
        closeCounter.schedule(new TimerTask() {
            @Override
            public void run() {
                close();

            }
        }, 7000);


    }

    public void close() {
        open = false;
        System.out.println("The door is now closed");
    }

    public void addSound(Bark sound) {
        recognizedSounds.add(sound);
    }


    public ArrayList<RecognizedSounds> getRecognizedSounds() {
        return recognizedSounds;
    }

    public boolean isOpen() {
        return open;
    }

    public void windowKeypad(int combo) {
        if (combo == windows.getCombo()) {
            if (!windows.isOpen()) {
                windows.open();
            } else {
                windows.close();
            }
        } else {
            System.out.println("The combination is incorrect.");
        }
    }

    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public BarkRecognizer getRecog() {
        return recog;
    }

    public void setRecog(BarkRecognizer recog) {
        this.recog = recog;
    }

    public Window getWindows() {
        return windows;
    }

    public void setWindows(Window windows) {
        this.windows = windows;
    }

    public boolean equals(DogDoor door2) {
        if (this.getRecognizedSounds().equals(door2.getRecognizedSounds())) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.isOpen()) {
            str = "Your dog door is open.\n";
        } else {
            str = "Your dog door is closed.\n";
        }
        str += "The recognized sounds are" + Arrays.toString(getRecognizedSounds().toArray()) + "\n";
        str += "Your dog door is linked to a remote control\n";
        str += "Your dog door is linked to a recognizing device";
        return str;
    }
}


