package src;

import src.in.modules.DepartmentHead;
import src.in.modules.Person;

public class main {

    public static void main(String[] args) {
        Controller cr = new Controller();
        Person chat = new DepartmentHead("something");
        cr.begin(chat);
    }

}
