// Immutable means the state can not be modified after creation
// Memory
// Thread safe- 100 people can call one string and use it. but they can not change
// Security saved data will remain same
public class StringFunctions {
    public static void main(String[] args) {
        execute();
    }
    public static void execute(){
        String s1 = "knowledge";
        String s3 = "knowledge";
        String s4 = "knowledge";

        int a =10;
        int b=10;

        String s2 = s1.concat("base");
        // s2 points to the same "knowledge"
        String king = "knowledge";


        System.out.println(s1==king);
        if (s1 == s2){
            System.out.println(" s1 and s2 are equal");
        }else {
            System.out.println("Not");
        }
        if (s1.equals(s3)){
            System.out.println(" s1 and s3 are equal");
        }

        System.out.println(a==b);
    }

}
