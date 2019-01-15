package ru.amstolbov.phonedictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        return persons.stream().filter(el ->  el.getName().contains(key)
                                              || el.getAddress().contains(key)
                                              || el.getSurname().contains(key)
                                              || el.getPhone().contains(key)).collect(Collectors.toList());
    }
}
