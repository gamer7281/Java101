public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "05555555555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "0000", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "11111", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 78, 50, 100, 40, 60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "123", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50, 30, 70, 90, 20, 90);
        s2.isPass();
    }
}
