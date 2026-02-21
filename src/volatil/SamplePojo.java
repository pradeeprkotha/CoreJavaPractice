package volatil;

public class SamplePojo {
    private int id;
    private String name;
//    public final SamplePojo samplePojo;

   private SamplePojo(){

   }


    public static SamplePojo getInstance(){
        if(getInstance()==null){
            return new SamplePojo();
        }else {
            return getInstance();
        }

    }
}
