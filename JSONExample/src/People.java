import java.lang.reflect.Array;
import java.util.ArrayList;

public class People
{
    String name;
    int age;
    float weight;

    public People(String name, int age, float weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args)
    {
        ArrayList<People> people = new ArrayList<>(3);
        people.add(new People("Joao", 20, 70.5f));
        people.add(new People("Maria", 14, 40.2f));
        people.add(new People("Joana", 26, 60.8f));

        for (People p: people)
        {
            System.out.println(p.toString());
        }
    }
}
