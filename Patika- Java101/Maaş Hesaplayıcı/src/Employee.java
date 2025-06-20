public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary < 1000){
            return 0;
        } else {
            return (salary * 3) / 100;
        }
    }

    public double bonus(){
        if(workHours < 40){
            return 0;
        } else {
            return (workHours - 40) * 30;
        }
    }

    public double raiseSalary(){
        int yearsWorked = 2025 - hireYear;
        if (yearsWorked < 10){
            return salary * 0.05;
        } else if (yearsWorked < 20){
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }


    public void printInfo() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax;
        double totalSalary = salary + raise + bonus - tax;

        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus);
        System.out.println("Toplam Maaş: " + totalSalary);
    }


}