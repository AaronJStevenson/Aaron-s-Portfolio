
public abstract class CourseGrades{
  private GradedActivity[] grades = new GradedActivity[4];

    //set method for lab,passfail,essay,final exam score set in coursegrade demo
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
  
    public void setPassFailExam(PassFailExam aPassFailExam) {
       grades[1]= aPassFailExam;
    }

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    public void setFinalExam(GradedActivity aFinalExam) {
        grades[3] = aFinalExam;
    }

    // String toSting method to set the string for output result
    public String toString() {
        String str =   "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade() +
        		"\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade() +
        		"\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade() +
        		"\nFinal Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();        
        return str;

    }
}

