
public class parameterized {
    public static void main(String []args)
    {
        Dog puppy= new Dog("raj", "White", 2.2, 1);
        System.out.println(puppy);

    }
}

class Dog{
    private String name;
    private String color;
    private double height;
    private int age;

    public Dog(String name,String color,double height,int age)
    {
        this.name=name;
        this.color=color;
        this.height=height;
        this.age=age;

    }

    

   

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dog{");
        sb.append("name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", height=").append(height);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
