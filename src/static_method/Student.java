package static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor để khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    //phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
