public class Remote {
    private DogDoor door;

    public Remote(DogDoor doorObj) {
        door = doorObj;

    }
    public Remote(Remote remote){
        this.door = remote.door;
    }

    public Remote() {
        door=new DogDoor();
    }
    public Remote copy(){
        return new Remote (this);

    }

    public void openButton() {
        door.open();
    }

    public void closeButton() {
        if (door.isOpen()) {
            door.close();
        }
    }
    public boolean equals(Remote remote){
        if (this.door.equals(remote.door)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "The linked door is " + door +
                '}';
    }
}
