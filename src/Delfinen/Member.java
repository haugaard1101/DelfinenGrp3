package Delfinen;

import java.time.LocalDate;
import java.time.Period;

public class Member {
    private String name;
    private boolean isPassive;
    private int id;
    private LocalDate dateOfBirth;


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

    @Override
    public String toString() {
        return
                id + " :ID " + name + " :Name " + dateOfBirth + " :Date of birth ";
    }


}
