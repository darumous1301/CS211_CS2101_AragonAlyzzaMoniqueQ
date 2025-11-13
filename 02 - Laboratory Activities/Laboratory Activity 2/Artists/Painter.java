//Instance of Painter Class
enum Medium { 
    OIL, 
    WATERCOLOR, 
    ACRYLIC, 
    PENCIL, 
    CHARCOAL 
}

    class Painter extends Artist {
    private Medium medium;

    public Painter(String name, int age, String specialty, Medium medium) {
        super(name, age, specialty);
        this.medium = medium;
    }
    
    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }
    
    public void displayInfo() {
        System.out.println("Painter\'s Info:");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
