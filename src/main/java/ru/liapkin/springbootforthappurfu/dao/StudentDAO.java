package ru.liapkin.springbootforthappurfu.dao;

import org.springframework.stereotype.Repository;
import ru.liapkin.springbootforthappurfu.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
