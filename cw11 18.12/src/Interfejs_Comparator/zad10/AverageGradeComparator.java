package Interfejs_Comparator.zad10;

import java.util.Comparator;

public class AverageGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {
        int avgGrade = Double.compare(obj2.getAverageGrade(), obj1.getAverageGrade());
        if(avgGrade != 0){
            return avgGrade;
        }
        return obj1.getName().compareTo(obj2.getName());
    }
}
