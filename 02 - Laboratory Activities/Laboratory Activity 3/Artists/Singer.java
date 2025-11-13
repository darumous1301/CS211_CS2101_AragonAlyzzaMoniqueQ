//Instance of Singer Class
enum Genre {
    POP,
    ROCK,
    CLASSICAL,
    JAZZ,
    HIPHOP,
    RNB
}

    class Singer extends Artist {
    private Genre genre;

    public Singer(String name, int age, String specialty, Genre genre) {
        super(name, age, specialty);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Singer\'s Info: ");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}