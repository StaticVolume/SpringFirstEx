
public class Cat {
    private byte age;
    private String name;
    public Cat() {

    }
    public void setAge(byte age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return  this.age;
    }
    public String getName() {
        return  this.name;
    }

    public void catSay() {
        System.out.println( this.getName() + " Мяу");
    }
}
