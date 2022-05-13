public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String StuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String StuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.StuNo = StuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.c1.sozlu = sozlu1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.sozlu = sozlu2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.sozlu = sozlu3;
        }
    }

    void isPass() {
        double course1 = (this.c1.note * 0.80) + (this.c1.sozlu * 0.20);
        double course2 = (this.c2.note * 0.80) + (this.c3.sozlu * 0.20);
        double course3 = (this.c2.note * 0.80) + (this.c3.sozlu * 0.20);

        this.average = (course1 + course2 + course3) / 3.0;
        if (this.average > 55) {
            System.out.println("Sınıfı başarılı şekilde geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız!");
        }

        this.printNote();
    }

    void printNote() {
        System.out.println("===========================");
        System.out.println(c1.name + " Notu : " + c1.note);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c2.name + " Notu : " + c3.note);
        System.out.println("Ortalamanız : " + this.average);
    }
}
