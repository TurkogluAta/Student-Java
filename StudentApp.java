/*
 * StudentApp.java
 * 21/2/2023
 * @author: Ata Turkoglu & K.Hansajith
 */

import javax.swing.JOptionPane;
public class StudentApp{
    public static void main(String args[]){
        //Declare variables
        String name;
        int num;
        double result1, result2, result3, average;

        //Declare objects - Create objects
        Student myStudent = new Student();
        Average myAverage = new Average();

        //Input
        name = JOptionPane.showInputDialog(null,"Enter student name: ");
        myStudent.setName(name);
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter student number: "));
        myStudent.setNum(num);
        //Confirmation message 
        JOptionPane.showMessageDialog(null,"Is this your name: "+name+", and is this your student number: "+num);

        result1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter result for assessment one: "));
        myAverage.setNum1(result1);
        result2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter result for assessment two: "));
        myAverage.setNum2(result2);
        result3 = Double.parseDouble(JOptionPane.showInputDialog(null,"result for assessment three: "));
        myAverage.setNum3(result3);

        //Process
        myAverage.computeAverage();

        //Output
        average = myAverage.getAverage();
        JOptionPane.showMessageDialog(null,"The average is: "+average);

    }
}