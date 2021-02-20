package Labdemo2;

public class admin {
    int admin_id;
    double salary;
    int working_hour;

    admin(int id, double sal, int wh) {
        admin_id = id;
        salary = sal;
        working_hour = wh;
    }

    double bonus() {
        if (salary >= 10000) {
            return (salary * 0.1);
        }
        return salary;
    }

    String work_status() {
        if (working_hour >= 10) {
            return "Good";
        }
        return "bad";
    }
}
