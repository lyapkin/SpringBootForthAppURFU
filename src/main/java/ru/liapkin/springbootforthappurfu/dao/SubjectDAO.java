package ru.liapkin.springbootforthappurfu.dao;

import org.springframework.stereotype.Repository;
import ru.liapkin.springbootforthappurfu.entity.Subject;

import java.util.List;

@Repository
public interface SubjectDAO {

    List<Subject> getAllSubjects();

    Subject saveSubject(Subject subject);

    Subject getSubject(int id);

    void deleteSubject(int id);

}
