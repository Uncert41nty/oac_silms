package kz.example.skills1mprove_bot.service;

import kz.example.skills1mprove_bot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramService {
    private final UserRepository userRepository;
    private final LessonRepository lessonRepository;
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final TeacherRepository teacherRepository;

    @Autowired
    public TelegramService(UserRepository userRepository, LessonRepository lessonRepository,
                           StudentRepository studentRepository, SubjectRepository subjectRepository,
                           TeacherRepository teacherRepository) {
        this.userRepository = userRepository;
        this.lessonRepository = lessonRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.teacherRepository = teacherRepository;
    }

    public void sout() {
    }
}
