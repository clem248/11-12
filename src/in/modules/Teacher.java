package src.in.modules;

public class Teacher extends Person {

    public Teacher(String message) {
        super(message);
    }

    @Override
    public void begin() {
        System.out.println(this.message + "happenedd in teacherhood");
    }

}
