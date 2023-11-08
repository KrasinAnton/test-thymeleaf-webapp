package ru.krasin.testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.krasin.testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
