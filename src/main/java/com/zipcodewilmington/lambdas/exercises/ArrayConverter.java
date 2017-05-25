package com.zipcodewilmington.lambdas.exercises;

import com.zipcodewilmington.lambdas.anthropoid.Person;
import com.zipcodewilmington.lambdas.anthropoid.PersonFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 5/25/17.
 */
public final class ArrayConverter extends ConversionAgent<Person[]> {
    public ArrayConverter(Person... people) {
        super(people);
    }

    public ArrayConverter(int collectionSize) {
        this(PersonFactory.createPersonArray(collectionSize));
        /** Implementation of adapter pattern for testing purposes
         *  @param collectionSize  - length of Array to be generated */
    }

    //TODO
    public List<Person> toList() {
        return Arrays.asList(toArray());
    }

    //TODO
    public Stream<Person> toStream() {
        return toList().stream();
    }

    @Override
    public Person[] toArray() {
        return this.people;
    }
}