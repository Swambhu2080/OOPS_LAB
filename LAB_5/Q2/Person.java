public class Person {
    String name;
    String hobby;
    Person(String name)
    {
        this.name=name;
        this.hobby="Reading";
    }
    String getName()
    {
        return this.name;
    }
    void Introduce()
    {
        System.out.println("\nHello, my name is "+getName()+" and my hobby is "+this.hobby+"\n");
    }
}
