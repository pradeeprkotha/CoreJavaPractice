package collections;

public class SingleClass {

    private SingleClass(){}
    private static SingleClass obj;
    public static SingleClass getObj(){
        if(obj == null){
            obj = new SingleClass();
        }
        return obj;
    };
}
