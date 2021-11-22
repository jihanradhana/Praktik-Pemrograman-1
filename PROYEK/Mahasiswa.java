public class Mahasiswa extends Human{
    private String studID;
    private String fullName;
    private double gpa;

    public Mahasiswa(String studID, String fullName, double gpa) {
        this.studID = studID;
        this.fullName = fullName;
        this.gpa = gpa;
    }

    public void setstudID(String studID) {
        this.studID = studID;
    }

    public String getstudID(String studID) {
        return this.studID;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getfullName(String fullName) {
        return this.fullName;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public double getgpa() {
        return this.gpa;
    }

    public void getDetail() {
        System.out.print(this.studID + " " + this.fullName + " " + this.gpa + " " + this.weight);    
    }
}
