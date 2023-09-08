package chapter6.entity;

import java.util.Arrays;

public class Customer {
private String name;
private int age;
private String[]hobby;

    public String getName() {
        return name;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        String message=String.format("my name is %s,age is %s,hobby is %s",
                this.name,this.age, Arrays.toString(hobby));
        return message;
    }
}
