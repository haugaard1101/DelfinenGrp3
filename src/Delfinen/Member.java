package Delfinen;

import java.time.LocalDate;
import java.time.Period;

public class Member {
    private final String name;
    private final boolean isPassive;
    private final int id;
    private final LocalDate dateOfBirth;

    public Member(int id, String name, String dateOfBirth, boolean isPassive) {
        this.name = name;
        this.id = id;
        this.isPassive = isPassive;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public boolean getIsPassive() {
        return isPassive;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public int calcAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);
        return period.getYears();
    }

    public int calcPayment(){
        int payment = 0;
        int age = calcAge();
            if (isPassive)
                payment = 500;
            else if (age < 18)
                payment = 1000;
            else if (age >= 18 && age <= 60)
                payment = 1600;
            else if (age > 60)
                payment = 1200;
            else {
                System.out.println("something");
            }
            return payment;
        }


    @Override
    public String toString() {
        return
                "ID: " + id +  " Name: " + name + " Date of birth: " + dateOfBirth + " State: " + isPassive ; // TODO skal ændre navn på "state".
    }


}
