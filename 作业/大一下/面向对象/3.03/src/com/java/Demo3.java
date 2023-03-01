package com.java;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student3[] arr=new Student3[5];
        Student3 s;
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"学生的信息");
            System.out.println("请输入学生的学号：");
            int sNo= sc.nextInt();
            System.out.println("请输入学生的姓名：");
            String sName= sc.next();
            System.out.println("请输入学生的性别：");
            String sSex= sc.next();
            System.out.println("请输入学生的年龄：");
            int sAge= sc.nextInt();
            System.out.println("请输入学生的课程成绩：");
            int sJava= sc.nextInt();
            s=new Student3(sNo,sName,sSex,sAge,sJava);//对输入的信息存入一个数组
            arr[i]=s;
 
 
        }
        System.out.println("五个学生的java课程的平均值为："+Student3.getAverage(arr)+"，最高成绩为："+Student3.getMaxnum(arr)+",最低成绩为："+Student3.getMinnum(arr));
        
 
    }
 
}
class Student3{
    private int sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;
 
    public int getsNo() {
        return sNo;
    }
 
    public String getsName() {
        return sName;
    }
 
    public String getsSex() {
        return sSex;
    }
 
    public int getsAge() {
        return sAge;
    }
 
    public int getsJava() {
        return sJava;
    }
    public Student3(){}
 
    public Student3(int sNo, String sName, String sSex, int sAge, int sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }
    public void show(){
        System.out.println("学号："+sNo);
        System.out.println("姓名："+sName);
        System.out.println("性别："+sSex);
        System.out.println("年龄："+sAge);
        System.out.println("成绩："+sJava);
    }
    public static double getAverage(Student3[] arr){
        double sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i].sJava;
 
        }
        return sum/ arr.length;
 
    }
    public static int getMaxnum(Student3[] arr){
        int max=arr[0].sJava;int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].sJava>max){
                max=arr[i].sJava;
                index=i;
                break;
            }
        }
        return max;
    }
    public static int getMinnum(Student3[] arr){
        int min=arr[0].sJava;int index;
        for (int i=0;i<arr.length;i++){
            if (arr[i].sJava<min){
                min=arr[i].sJava;
                index=i;
                break;
            }
        }
        return min;
    }
}