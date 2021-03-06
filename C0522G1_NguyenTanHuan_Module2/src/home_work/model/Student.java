package home_work.model;

public class Student extends Person {
    private String namClass;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String gender, String namClass, double point) {
        super(id, name, dateOfBirth, gender);
        this.namClass = namClass;
        this.point = point;
    }

    public Student(String nam, int i, String hn) {
    }

    public String getNamClass() {
        return namClass;
    }

    public void setNamClass(String namClass) {
        this.namClass = namClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getGender(), this.getNamClass(), this.getPoint());
    }

    @Override
    public String toString() {
        return "Student= {"+super.toString()+ ", nameClass: "+ namClass+", point= "+point+ "}";
    }
}

