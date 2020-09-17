public class Scratch implements RecognizedSounds {
    private String scratchSound;

    public Scratch(String scratch) {
        this.scratchSound = scratch;
    }

    public Scratch(Scratch scr) {
        scratchSound = scr.scratchSound;
    }

    public Scratch() {
        scratchSound = "";
    }

    public Scratch copy() {
        return new Scratch(this);
    }

    public void setNoise(String sound) {
        this.scratchSound = sound;
    }

    public String getNoise() {
        return scratchSound;
    }

    public void setScratchSound(String sound) {
        this.scratchSound = sound;
    }

    public boolean equals(RecognizedSounds scratch) {
        return this.scratchSound.equalsIgnoreCase(scratch.getNoise());
    }

    @Override
    public String toString() {
        return "Scratch sound: " + scratchSound;
    }

}

