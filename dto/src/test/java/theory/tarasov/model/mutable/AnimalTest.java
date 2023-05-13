package theory.tarasov.model.mutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


public class AnimalTest {

    @Test
    public void testDefaultConstructor() {
        var animal = new Animal();
        assertThat(animal).isNotNull();
        assertThat(animal.getName()).isNull();
        assertThat(animal.getBirthDate()).isNull();
        assertThat(animal.getAnimalType()).isNull();
    }

    @Test
    public void testConstructorWithThreeParameters() {
        var animal = new Animal("Rocky", LocalDate.of(2010, 5, 1), AnimalType.CAPYBARA);
        assertThat(animal).isNotNull();
        assertThat(animal.getName()).isEqualTo("Rocky");
        assertThat(animal.getBirthDate()).isEqualTo(LocalDate.of(2010, 5, 1));
        assertThat(animal.getAnimalType()).isEqualTo(AnimalType.CAPYBARA);
    }

    @Test
    public void testGetName() {
        var animal = new Animal("Rocky", LocalDate.of(2010, 5, 1), AnimalType.CAPYBARA);
        assertThat(animal.getName()).isEqualTo("Rocky");
    }

    @Test
    public void testGetBirthDate() {
        var animal = new Animal("Leo", LocalDate.of(2010, 5, 1), AnimalType.CAT);
        assertThat(animal.getBirthDate()).isEqualTo(LocalDate.of(2010, 5, 1));
    }

    @Test
    public void testGetAnimalType() {
        var animal = new Animal("Charlie", LocalDate.of(2010, 5, 1), AnimalType.DOG);
        assertThat(animal.getAnimalType()).isEqualTo(AnimalType.DOG);
    }

    @Test
    public void testSetName() {
        var animal = new Animal("Charlie", LocalDate.of(2010, 5, 1), AnimalType.PARROT);
        animal.setName("Captain Flint");
        assertThat(animal.getName()).isEqualTo("Captain Flint");
    }

    @Test
    public void testSetBirthDate() {
        var animal = new Animal("Leo", LocalDate.of(2010, 5, 1), AnimalType.CAT);
        animal.setBirthDate(LocalDate.of(2012, 8, 15));
        assertThat(animal.getBirthDate()).isEqualTo(LocalDate.of(2012, 8, 15));
    }

    @Test
    public void testSetAnimalType() {
        var animal = new Animal("Leo", LocalDate.of(2010, 5, 1), AnimalType.DOG);
        animal.setAnimalType(AnimalType.CAPYBARA);
        assertThat(animal.getAnimalType()).isEqualTo(AnimalType.CAPYBARA);
    }

    @Test
    public void testEqualsAndHashCode_shouldReturnTrue() {
        var animal1 = new Animal("Captain Flint", LocalDate.of(2010, 5, 1), AnimalType.PARROT);
        var animal2 = new Animal("Captain Flint", LocalDate.of(2010, 5, 1), AnimalType.PARROT);
        assertThat(animal1).isEqualTo(animal2);
        assertThat(animal1.hashCode()).isEqualTo(animal2.hashCode());
    }

    @Test
    public void testEquals_shouldReturnFalseForNull() {
        var animal = new Animal("Captain Flint", LocalDate.of(2010, 5, 1), AnimalType.PARROT);
        assertThat(animal.equals(null)).isFalse();
    }

    @Test
    public void testEquals_shouldReturnFalseForDifferentObjectType() {
        var animal = new Animal("Captain Flint", LocalDate.of(2010, 5, 1), AnimalType.PARROT);
        var differentObject = "not an Animal object";
        assertThat(animal.equals(differentObject)).isFalse();
    }
}