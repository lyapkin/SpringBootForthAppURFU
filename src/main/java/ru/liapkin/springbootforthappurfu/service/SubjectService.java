package ru.liapkin.springbootforthappurfu.service;

import org.springframework.stereotype.Service;
import ru.liapkin.springbootforthappurfu.entity.Subject;

import java.util.List;

@Service
public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject getSubject(int id);

    Subject saveSubject(Subject subject);

    void deleteSubject(int id);

}
