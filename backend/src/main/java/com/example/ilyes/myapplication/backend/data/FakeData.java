package com.example.ilyes.myapplication.backend.data;

import com.example.ilyes.myapplication.backend.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilyes on 12/10/15.
 */
public class FakeData {

    private static List<Student> students = new ArrayList<>();


    public static List<Student> get() {


        // create 10 toto
        for (int i = 0; i < 10; i++) {
            students.add(new Student("toto", 25, "USTO", "INFO", "M1"));
        }

        // creta 10 tux
        for (int i = 0; i < 10; i++) {
            students.add(new Student("tux", 21, "IGMO", "INFO", "L2"));
        }

        return students;
    }


}
