package lesson_6HW;

public class Cat {
    //fields

    private String name;
    private Integer weight;
    private Integer age;
    private String color;
    private String adres;

    // constructor


    public Cat(String name) {
        setName(name);
    }

    public Cat(String name, Integer weight, Integer age) {
        this(name);
        setWeight(weight);
        setAge(age);
    }

    public Cat(String name, Integer age) {
        this(name,null,age);
    }

    public Cat(Integer weight, String color) {
        this(null,weight,null);
        setColor(color);
    }

    public Cat(Integer weight, String color, String adres) {
        this(weight,color);
        setAdres(adres);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight == 0 || weight < 2) {
            weight = 3;
        }
        this.weight = weight;
    }

    public Integer getAge() {
        if (age == 0 || age < 1) {
            age = 1;
        }
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            color = "Black";
        }
        this.color = color;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }



}


