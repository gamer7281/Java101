public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;
        if (this.salary < 1000) {
            tax = this.salary;
        } else {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year <= 9) {
            return this.salary * 0.05;
        } else if(year <= 19) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    void run() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş artışı : " + this.raiseSalary());
        System.out.printf("Vergi ve Bonuslar ile birlikte maaş : %.2f\n", (this.salary - this.tax() + this.bonus()));
        System.out.printf("Toplam maaş : %.2f\n", (this.salary + this.raiseSalary()));
    }
}
