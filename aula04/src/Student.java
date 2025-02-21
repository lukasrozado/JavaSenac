public class Student {
    private String nameStudent;
    private String CPFStudent;
    private float mediaStudent;

    public Student(String nameStudent, String CPFStudent, float mediaStudent){
        this.nameStudent = nameStudent;
        this.CPFStudent = CPFStudent;
        this.mediaStudent = mediaStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getCPFStudent() {
        return CPFStudent;
    }

    public void setCPFStudent(String CPFStudent) {
        this.CPFStudent = CPFStudent;
    }

    public float getMediaStudent() {
        return mediaStudent;
    }

    public void setMediaStudent(float mediaStudent) {
        this.mediaStudent = mediaStudent;
    }
}
