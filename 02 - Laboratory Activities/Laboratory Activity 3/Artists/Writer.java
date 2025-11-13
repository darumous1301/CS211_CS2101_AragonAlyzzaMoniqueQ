//Instance of Writer Class
enum WritingStyle { 
    FICTION, 
    NONFICTION, 
    POETRY, 
    DRAMA 
}
    
    class Writer extends Artist {
    private WritingStyle style;

    public Writer(String name, int age, String specialty, WritingStyle style) {
        super(name, age, specialty);
        this.style = style;
    }
    
    public WritingStyle getStyle() {
        return style;
    }

    public void setStyle(WritingStyle style) {
        this.style = style;
    }

    public void displayInfo() {
        System.out.println("Writer\'s Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + style);
    }
}
