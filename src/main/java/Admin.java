public class Admin extends User{

    private int amount_person;
    private String position;
    private String specialty;
    private double budget;

    public Admin(String nombre, String genero, int id, int edad, int amount_person, String position, String specialty, double budget) {
        super(nombre, genero, id, edad);
        this.amount_person = amount_person;
        this.position = position;
        this.specialty = specialty;
        this.budget = budget;
    }

    public Admin() {
    }

    public int getAmount_person() {
        return amount_person;
    }

    public void setAmount_person(int amount_person) {
        this.amount_person = amount_person;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
