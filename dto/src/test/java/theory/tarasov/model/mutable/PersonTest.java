package theory.tarasov.model.mutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    public void testDefaultConstructor() {
        var person = new Person();
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isNull();
        assertThat(person.getSecondName()).isNull();
        assertThat(person.getBirthDate()).isNull();
        assertThat(person.getAnimals()).isNull();
    }

    @Test
    public void testConstructorWithThreeParameters() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getSecondName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getAnimals()).isNull();
    }

    @Test
    public void testConstructorWithFourParameters() {
        Set<Animal> animals = getAnimals();
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1), animals);
        assertThat(person).isNotNull();
        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getSecondName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getAnimals()).isEqualTo(animals);
    }

    @Test
    public void testGetFirstName() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        assertThat(person.getFirstName()).isEqualTo("John");
    }

    @Test
    public void testGetSecondName() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        assertThat(person.getSecondName()).isEqualTo("Doe");
    }

    @Test
    public void testGetBirthDate() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
    }

    @Test
    public void testGetAnimals() {
        Set<Animal> animals = getAnimals();
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1), animals);
        assertThat(person.getAnimals()).isEqualTo(animals);
    }

    @Test
    public void testSetFirstName() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        person.setFirstName("Jane");
        assertThat(person.getFirstName()).isEqualTo("Jane");
    }

    @Test
    public void testSetSecondName() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        person.setSecondName("Smith");
        assertThat(person.getSecondName()).isEqualTo("Smith");
    }

    @Test
    public void testSetBirthDate() {
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        person.setBirthDate(LocalDate.of(1995, 3, 15));
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1995, 3, 15));
    }

    @Test
    public void testSetAnimals() {
        Set<Animal> animals = getAnimals();
        var person = new Person("John", "Doe", LocalDate.of(1990, 1, 1));
        person.setAnimals(animals);
        assertThat(person.getAnimals()).isEqualTo(animals);
    }

    private Set<Animal> getAnimals() {
        return Set.of(
                new Animal("Rocky", LocalDate.of(2010, 5, 1), AnimalType.CAPYBARA),
                new Animal("Leo", LocalDate.of(2012, 8, 15), AnimalType.CAT));
    }

}