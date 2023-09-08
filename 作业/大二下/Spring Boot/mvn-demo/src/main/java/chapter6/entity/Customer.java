package chapter6.entity;


import java.util.Arrays;

public class Customer {
    String custId;
    String name;
    int age;
    String[] hobby;
    public Customer(){}
    public Customer(String custId,String name,int age){
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

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
        return "Customer [custId=" + custId + ", name=" + name + ", age=" + age
                + ", hobby=" + Arrays.toString(hobby) + "]";
    }
}
