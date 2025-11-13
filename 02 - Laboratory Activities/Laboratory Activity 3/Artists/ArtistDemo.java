public class ArtistDemo {
    public static void main(String[] args) {

        Artist artist = new Artist("Fang Shilong \'Jackie Chan\'", 71, "Martial Arts");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Shaffer Smith \'Ne-Yo\'", 46, "Music", Genre.RNB);
        singer.displayInfo();
        
        System.out.println();
        
        Painter painter = new Painter("Leonardo da Vinci", 67, "Painting", Medium.OIL);
        painter.displayInfo();
        
        System.out.println();
        
        Writer writer = new Writer("Inksteady \'Idy\' ", 22, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
        
        System.out.println();
        
        Dancer dancer = new Dancer("Lalisa \'Lisa\' Manobal", 28, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}
