package ru.job4j.profession;

public class Doctor extends Proffession {

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }

}
