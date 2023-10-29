package ru.liapkin.springbootforthappurfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.liapkin.springbootforthappurfu.entity.Subject;
import ru.liapkin.springbootforthappurfu.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public ResponseEntity<List<Subject>> showAllSubjects() {
        List<Subject> allSubjects = subjectService.getAllSubjects();
        return new ResponseEntity<>(allSubjects, HttpStatus.OK);
    }

    @GetMapping("/subjects/{id}")
    public ResponseEntity<Subject> getSubject(@PathVariable("id") int id) {
        Subject subject = subjectService.getSubject(id);
        if (subject == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

    @PostMapping("/subjects")
    public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/subjects/{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable("id") int id, @RequestBody Subject subject) {
        subject.setId(id);
        subjectService.saveSubject(subject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/subjects/{id}")
    public void deleteSubject(@PathVariable("id") int id) {
        subjectService.deleteSubject(id);
    }

}
