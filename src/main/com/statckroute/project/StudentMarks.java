//1. Create a class called StudentMarks, which prompts user for the number of students, reads it
//        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//        grades of each of the students and saves them in an int array called stuGrades. Your program shall
//        check that the grade is between 0 and 100 else has to trow an error message.
package com.statckroute.project;

public class StudentMarks {
    private int numOfStudents;
    private  int [] stuGrades;

    public StudentMarks(int numOfStudents, int[] stuGrades) {
        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;
    }

    public boolean checkGrades(){
        for (int element:
             stuGrades) {
            if(element < 0 || element >100){
                return false;
            }
        }
        return true;
    }
}
