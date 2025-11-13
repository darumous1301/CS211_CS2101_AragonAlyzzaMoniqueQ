//Instance of Dancer Class
enum DanceStyle { 
    BALLET, 
    HIPHOP, 
    JAZZ, 
    CONTEMPORARY 
}
    
    class Dancer extends Artist {
    private DanceStyle style;

    public Dancer(String name, int age, String specialty, DanceStyle style) {
        super(name, age, specialty);
        this.style = style;
    }
    
    public DanceStyle getStyle() {
        return style;
    }

    public void setStyle(DanceStyle style) {
        this.style = style;
    }

    public void displayInfo() {
        System.out.println("Dancer\'s Info:");
        super.displayInfo();
        System.out.println("Dance Style: " + style);
    }
}
