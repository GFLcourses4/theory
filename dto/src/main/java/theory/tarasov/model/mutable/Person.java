package theory.tarasov.model.mutable;

import java.time.LocalDate;
import java.util.Set;

public class Person {
    private String firstName;
    private String secondName;
    private LocalDate birthDate;

    private Set<Animal> animals;

    public Person() {
    }

    public Person(String firstName, String secondName, LocalDate birthDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public Person(String firstName, String secondName, LocalDate birthDate, Set<Animal> animals) {
        this(firstName, secondName, birthDate);
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Person [ firstName = " + firstName + ", secondName = " + secondName
                + ", birthDate = " + birthDate + ", animals = " + animals + " ]";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

}
