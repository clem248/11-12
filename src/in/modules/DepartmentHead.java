package src.in.modules;

public class DepartmentHead extends Person{

    public DepartmentHead(String message) {
        super(message);
    }

    @Override
    public void begin() {
        System.out.println(this.message + " is done in department");
    }

}
