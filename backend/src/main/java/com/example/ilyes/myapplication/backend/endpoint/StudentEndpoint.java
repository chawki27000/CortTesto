package com.example.ilyes.myapplication.backend.endpoint;

import com.example.ilyes.myapplication.backend.data.FakeData;
import com.example.ilyes.myapplication.backend.model.Student;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "studentApi",
        version = "v1",
        resource = "student",
        namespace = @ApiNamespace(
                ownerDomain = "model.backend.myapplication.ilyes.example.com",
                ownerName = "model.backend.myapplication.ilyes.example.com",
                packagePath = ""
        )
)
public class StudentEndpoint {

    List<Student> data = FakeData.get();


    /**
     * get a student from databse
     *
     * @param id
     * @return
     */
    @ApiMethod(name = "getStudent", httpMethod = ApiMethod.HttpMethod.GET)
    public Student getStudent(@Named("id") int id) {
        return data.get(id);
    }


    /**
     * set student into the database
     *
     * @return
     */
    @ApiMethod(name = "setStudent", httpMethod = ApiMethod.HttpMethod.POST)
    public Student setStudent() {
        Student s = new Student("bleu", 19, "IGMO", "INFO", "L1");
        data.add(s);
        return s;
    }

//    @ApiMethod(name = "getAllStudent", httpMethod = "GET")
//    public List<Student> getAllStudent() {
//
//        return data;
//    }


    @ApiMethod(name = "getStudentByLevel", httpMethod = "GET")
    public List<Student> getStudentByLevel(@Named("level")String level) {

        List<Student> temp = new ArrayList<>();


        for (int i = 0; i < data.size(); i++) {
            if (Objects.equals(data.get(i).getAnnee(), level)) {
                temp.add(data.get(i));
            }
        }

        return temp;
    }


}