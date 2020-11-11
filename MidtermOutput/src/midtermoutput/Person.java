package midtermoutput;
public class Person {
    private String Name;
    private String Age;
    
    public Person(String Name, String Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getAge(){
        return this.Age;
    }
    public void setAge(String Age){
        this.Age = Age;
    } 
}
