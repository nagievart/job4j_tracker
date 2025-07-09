package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Artur", "Nagiev", "534872", "Moscow")
        );
        ArrayList<Person> persons = phones.find("giev");
        assertThat(persons.get(0).getSurname()).isEqualTo("Nagiev");
    }

    @Test
    public void whenNothingFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Artur", "Nagiev", "534872", "Moscow")
        );
        ArrayList<Person> persons = phones.find("keek");
        assertThat(persons.isEmpty());
    }
}