package collections;

public class SingleClass {

    private int number =100;
    private static SingleClass instance = null;


    private SingleClass(){

    }

    public int getNumber(){
        return number;
    }

    public static SingleClass getObject(){
        if(instance == null){
            instance = new SingleClass();
        }
        return instance;
    }
}
