package mindswap.jpa.entity.Resources;

import javax.persistence.*;

@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Age", nullable = false)
    private int age;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
