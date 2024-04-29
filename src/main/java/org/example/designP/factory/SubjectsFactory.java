package org.example.designP.factory;

public class SubjectsFactory {
    public Subjects getSubject(String subjectName) {

        if (subjectName.equals("Math")) {
            return new Math();
        } else if (subjectName.equals("Physics")) {
            return new Physics();

        }
        return null;

    }
}