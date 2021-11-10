package students;

public class Students {
    private String name;
    private int age;
    private String gender;
    private int id;

    private static int idNumber = 1;

    public Students(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = idNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
