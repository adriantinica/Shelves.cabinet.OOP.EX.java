package things;
import skeleton.Thing;
public class Phone extends Thing {

    private String phoneName;

    public Phone(String phoneName){
        this.phoneName = phoneName;
    
    }


    public void setPhoneName(String phoneName){
        this.phoneName = phoneName;
    }

    public String  getPhoneName(){
        return phoneName;
    }




    @Override
    public void getName() {
        // TODO Auto-generated method stub
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public String toString() {
        return "Phone [phoneName=" + phoneName + "]";
    }

    

    
    
}
