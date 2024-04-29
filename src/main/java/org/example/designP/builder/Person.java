package org.example.designP.builder;

import java.util.StringJoiner;

public class Person {
    private String name;
    private String surName;
    private int age;
    private String email;

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surName = personBuilder.surName;
        age = personBuilder.age;
        email = personBuilder.email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surName='" + surName + "'")
                .add("age=" + age)
                .add("email='" + email + "'")
                .toString();
    }

    public static class PersonBuilder {

        private String name;
        private String surName;
        private int age;
        private String email;

        public PersonBuilder(String name, String surName, int age, String email) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.email = email;
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }



        public Person create(){
            return new Person(this);
        }
    }
}
