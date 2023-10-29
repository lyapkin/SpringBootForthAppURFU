package ru.liapkin.springbootforthappurfu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.liapkin.springbootforthappurfu.dao.SubjectDAO;
import ru.liapkin.springbootforthappurfu.entity.Subject;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    @Transactional
    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }

    @Override
    @Transactional
    public Subject getSubject(int id) {
        return subjectDAO.getSubject(id);
    }

    @Override
    @Transactional
    public Subject saveSubject(Subject subject) {
        return subjectDAO.saveSubject(subject);
    }

    @Override
    @Transactional
    public void deleteSubject(int id) {
        subjectDAO.deleteSubject(id);
    }

}
