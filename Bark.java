public class Bark implements RecognizedSounds {
    private String barkNoise;

    public Bark(String barkNoise) {
        this.barkNoise = barkNoise;
    }

    public Bark() {
        barkNoise = "";
    }

    public Bark(Bark bark) {
        this.barkNoise = bark.barkNoise;
    }

    public Bark copy() {
        return new Bark(this);
    }

    public String getNoise() {
        return barkNoise;
    }

    public void setNoise(String sound) {
        this.barkNoise = sound;
    }

    public boolean equals(RecognizedSounds bark) {
        return this.barkNoise.equalsIgnoreCase(bark.getNoise());

    }

    @Override
    public String toString() {
        return "Bark sound: " + barkNoise;
    }
}

