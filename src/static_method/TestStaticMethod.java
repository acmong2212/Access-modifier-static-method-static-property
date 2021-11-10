package static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); //Gọi phương thức thay đổi change()

        //Tạo đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //Gọi phương thức hiển thị display()
        s1.display();
        s2.display();
        s3.display();
    }
}
