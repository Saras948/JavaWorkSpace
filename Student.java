public class Student implements Person{

    private String personType;

    private String name;
    private String classS;
    private int rollNumber;

    public Student(String name,String classS,int rollNumber)
    {
        this.name = name;
        this.classS = classS;
        this.rollNumber = rollNumber;
    }

    public void personType()
    {
        this.personType = "Student";
    }

    public String getName()
    {
        return this.name;
    }

    public String getClassS()
    {
        return this.classS;
    }

    public String getPersonType()
    {
        return this.personType;
    }
    
    public int getRollNumer()
    {
        return this.rollNumber;
    }
}
