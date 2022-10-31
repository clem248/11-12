package src.in.modules;

import src.in.interfaces.invoker;

public abstract class Person implements invoker {
    protected String message;

    public Person (String message){
        this.message = message;
    }

}
