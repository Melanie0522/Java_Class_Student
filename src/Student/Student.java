package Student;

public class Student {
    private String name;
    private int ID_NO;
    private String gender;
    private int age;
//constructor
    public Student(){
        this.name="Amy";
        this.ID_NO=001;
        this.gender="girl";
        this.age=5;
    }
    public Student(String name,int ID_NO,String gender,int age){
        this.name=name;
        this.ID_NO=ID_NO;
        this.gender=gender;
        this.age=age;
    }
//name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//ID_NO
    public int getNO() {
        return ID_NO;
    }
    public void setNO(int ID_NO) {
        this.ID_NO = ID_NO;
    }
//gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
//age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
