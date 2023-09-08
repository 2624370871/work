package chapter3;

import java.util.List;

public class Person {
    private String name;
    private String  id;
    private List list;
    public Person(){
        System.out.println("无参构造函数");
    }
    public Person(String name,String id,List list){
        System.out.println("有参构造函数");
        this.name=name;
        this.id=id;
        this.list=list;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setList(List list) {
        this.list = list;
    }
    public void printInfo(){
        System.out.println("Your name is "+this.name+",your id is "+this.id);
        for(Object each:this.list){
            System.out.println(each.toString());
        }
    }
}
