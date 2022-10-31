package src.in.modules;

public class Student extends Person {

     public Student (String message){
         super(message);
     }

    @Override
    public void begin() {
        System.out.println(this.message + "is done in studendship");
    }


}
