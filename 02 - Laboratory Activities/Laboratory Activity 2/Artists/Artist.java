//Instance of Artist Class
public class Artist {
    
    private String name;
    private int age;
    private String specialty;
    
    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}