package skeleton;
public class Cabinet {

    private Thing topShelf;
    private Thing middleShelf;
    private Thing bottomShelf;

    public Cabinet(){}

    public Thing whatIsOn( String shelfName ) {
        switch (shelfName) {
            case "topShelf":
                return topShelf;
            case "middleShelf":
                return middleShelf;
            case "bottomShelf":
                return bottomShelf;
            default:
                return null;
        }
    }

    public  void put( String shelfName, Thing thing ){
        switch (shelfName) {
            case "topShelf":
                topShelf = thing;
                break;
            case "middleShelf":
                middleShelf = thing;
                break;
            case "bottomShelf":
                bottomShelf = thing;
                break;
        }
    }

    public Thing take( String shelfName ){
        Thing thing = null;
        switch (shelfName) {
            case "topShelf":
                thing = topShelf;
                topShelf = null;
                break;
            case "middleShelf":
                thing = middleShelf;
                middleShelf = null;
                break;
            case "bottomShelf":
                thing = bottomShelf;
                bottomShelf = null;
                break;
        }
        return thing;
    }

    @Override
    public String toString() {
        return "Cabinet\n [\t topShelf=" + topShelf + "\n\t middleShelf=" + middleShelf + "\n\t bottomShelf=" + bottomShelf + "\t]\n\n";
        
    }

    //public void put(String shelfName, Thing[] colectiaDeAur) {
    //   switch  (shelfName){
    //        case "topShelf":
    //        topShelf = colectiaDeAur;
    //        break;
    //        case "middleShelf":
    //        middleShelf = colectiaDeAur;
    //        break;
    //        case "bottomShelf":
    //        bottomShelf = colectiaDeAur;
    //        break;
            

    //    }
    //}

    
}   