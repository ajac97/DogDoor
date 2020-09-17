public class Window {
    int combo;
    boolean open;

    public Window(int combo, boolean open) {
        this.combo = combo;
        this.open = open;
    }

    public Window() {
        this.combo = 0000;
        this.open = false;
    }

    public Window(Window window) {
        this.combo = window.combo;
        this.open = window.open;

    }

    public Window copy(Window window) {
        return new Window(window);
    }

    public void open() {
        this.open = false;
        System.out.println("The windows are now open");

    }

    public void close() {
        this.open = false;
        System.out.println("The windows are now closed");
    }

    public int getCombo() {
        return this.combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }

    public boolean isOpen() {
        return open;
    }
    public boolean equals(Window window){
        return this.combo == window.combo;
    }
    public String toString(){
      String str="Your window is"+this.open+"\n";
      str+="Your current combination is: "+this.combo+"\n";
      return str;
    }
}