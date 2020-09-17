public class Person {
    String name;
   String hobby="Reading";
    Person(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    String getHobby()
    {
        return hobby;
    }
    void Introduce()
    {
        System.out.println("\nHello, my name is "+getName()+" and my hobby is "+getHobby()+"\n");
    }
}
