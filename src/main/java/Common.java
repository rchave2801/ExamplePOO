public class Common extends User{

    private String position;
    private int tools;
    private int work_hours;

    public Common(String nombre, String genero, int id, int edad, String position, int tools, int work_hours) {
        super(nombre, genero, id, edad);
        this.position = position;
        this.tools = tools;
        this.work_hours = work_hours;
    }

    public Common() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    public int getWork_hours() {
        return work_hours;
    }

    public void setWork_hours(int work_hours) {
        this.work_hours = work_hours;
    }
}
