package skeleton;
public abstract class Thing {
    
    public abstract void setName(String name);
    public abstract void getName();
    
    //Prin definirea acestor două metode în clasa abstractă "Thing",
    //se stabilește un contract pe care orice clasă care extinde clasa "Thing" trebuie să-l respecte.
    //Astfel, orice clasă care moștenește clasa "Thing" trebuie să ofere o implementare pentru aceste două metode abstracte, 
    //asigurând astfel că fiecare obiect "Thing" poate fi numit și că numele său poate fi obținut atunci când este necesar.}
}