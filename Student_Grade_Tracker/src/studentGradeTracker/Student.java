package studentGradeTracker;

public class Student {
	    private int id;
	    private String name;
	    private Integer[] marks;
	    private float average;
	    private char grade;

	    public Student(int id, String name, Integer[] marks){
	        this.id=id;
	        this.name=name;
	        this.marks=marks;
	    }
	    public void setId(int id){
	        this.id=id;
	    }
	    public int getId(){
	        return id;
	    }
	    public void setName(String name){
	        this.name=name;
	    }
	    public String getName(){
	        return name;
	    }
	    public Integer[] setMarks(Integer[] marks){
	        return this.marks = getMarks();
	    }
	    public Integer[] getMarks(){
	        return marks;
	    }
	    public void setAverage(float average){
	        this.average=average;
	    }
	    public float getAverage(){
	        return average;
	    }
	    public void setGrade(char grade){
	        this.grade=grade;
	    }
	    public char getGrade(){
	        return grade;
	    }

	    public void calculateAvg(){
	        StudentMain sm = new StudentMain ();
	        int sum=0;
	        //int no=0;
	        for(int i=0;i<marks.length;i++){
	            sum+=marks[i];
	        }
	        float avg=sum/sm.n;
	        //System.out.println(sum);
	        setAverage(avg);
	    }
	    public void findGrade(){
	       float avg=getAverage();
	       if (avg>+80 && avg<+100){
	           setGrade('O');
	       }  
	        else if (avg>=50 && avg<80){
	            setGrade('A');
	       }
	       else {
	           setGrade('F');
	       }
	    }
	}


