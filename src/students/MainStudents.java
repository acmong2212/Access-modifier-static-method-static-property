package students;

import java.util.Scanner;

public class MainStudents {
    public static void main(String[] args) {

        Students[] students = new Students[3];
        students[0] = new Students("Thang", 19, "Male");
        students[1] = new Students("Toan", 20, "Male");
        students[2] = new Students("Tu", 30, "Male");

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Hien thi sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Xoa sinh vien theo id");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    display(students);
                    break;
                case 2:
                    students = create(students);
                    break;
                case 3:
                    students = delete(students);
                    break;
            }
        }
    }

    public static void display(Students[] students) {
        for (Students st : students) {
            System.out.println(st.toString());
        }
    }

    public static Students[] create(Students[] students) {
        Scanner scanner = new Scanner(System.in);
        Students[] newStudent = new Students[students.length + 1];

        System.out.println("Nhap ten: ");
        String name = scanner.next();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.next();
        Students st = new Students(name, age, gender);

        for (int i = 0; i < students.length; i++) {
            newStudent[i] = students[i];
        }
        newStudent[newStudent.length - 1] = st;
        return newStudent;
    }

    public static Students[] delete(Students[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao id muon xoa: ");
        int de = scanner.nextInt();

        for (int i = de - 1; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        Students[] newStudents = new Students[students.length - 1];
        for (int i = 0; i < newStudents.length; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }
}
