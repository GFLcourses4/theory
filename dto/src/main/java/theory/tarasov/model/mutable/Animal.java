package theory.tarasov.model.mutable;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String name;
    private LocalDate birthDate;
    private AnimalType animalType;

    public Animal() {
    }

    public Animal(String name, LocalDate birthDate, AnimalType animalType) {
        this.name = name;
        this.birthDate = birthDate;
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal[ name = " + name + ", birthDate = " + birthDate + ", type = " + animalType + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(name, animal.name) && Objects.equals(birthDate, animal.birthDate)
                && Objects.equals(animalType, animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, animalType);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

}
