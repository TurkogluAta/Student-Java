/*
 * Student.java
 * @author: Ata Turkoglu & K.Hansajith
 * Date: 21/02/2023
 */

public class Student{
    //Declare data members
    private String name;
    private int num;

    //Constructor
    public Student(){
        name = "";
        num = 0;
    }

    //Setters - One for every input
    public void setName(String name){
        this.name = name;
    }
    public void setNum(int num){
        this.num = num;
    }

    //Getters - One for every output
    public String getName(){
        return name;
    }
    public int getNum(){
        return num;
    }
}