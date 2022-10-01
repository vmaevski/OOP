import java.util.ArrayList;

public class Human {
    public Human(String n, TypeSex s){
        Name = n;
        Sex = s;
    }
    public String getName(){
        return Name;
    }
    public TypeSex getSex(){
        return Sex;
    }
    private String Name;
    private TypeSex Sex;
    Human Mom;
    Human Dad;
    ArrayList<Human> Children = new ArrayList<Human>();    
}
enum TypeSex{
    M,
    W
}