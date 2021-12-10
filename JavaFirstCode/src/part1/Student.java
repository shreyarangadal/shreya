package part1;

public class Student {
    private int id;
    private String name;
    public Student(int i) {
      this.id=5;
    }
    public Student (int idparam, String idname){
        this.id=idparam;
        this.name=idname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
