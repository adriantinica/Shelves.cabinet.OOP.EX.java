package things;
import skeleton.Thing;
public class Tablet extends Thing {

    private String tabletName;

    public Tablet(String tabletName){
        this.tabletName = tabletName;
    }

    public String getTabletName() {
        return tabletName;
    }

    public void setTabletName(String tabletName) {
        this.tabletName = tabletName;
    }

    @Override
    public void setName(String name) {
        
    }

    @Override
    public void getName() {
        
    }

    @Override
    public String toString() {
        return "Tablet [tabletName=" + tabletName + "]";
    }

    

    
}