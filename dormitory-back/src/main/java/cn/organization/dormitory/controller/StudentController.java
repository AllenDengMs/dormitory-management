package cn.organization.dormitory.controller;

import cn.organization.dormitory.entity.Student;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.Result;
import cn.organization.dormitory.entity.query.StudentQueryBuilder;
import cn.organization.dormitory.service.StudentService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2020/12/20.
 */
@RequestMapping("/students")
@RestController
public class StudentController {

  @Autowired
  public StudentService studentService;

  @GetMapping
  public PageQueryResult<Student> pageQueryStudents(StudentQueryBuilder queryBuilder) {
    return studentService.pageQueryStudents(queryBuilder);
  }

  @PostMapping("/add")
  public Result addStudent(Student student) {
    return Result.of(studentService.addStudent(student));
  }

  @PostMapping("/update")
  public Result updateStudent(Student student) {
    return Result.of(studentService.updateStudent(student));
  }

  @GetMapping("/delete/{id}")
  public Result delete(@PathVariable int id) {
    return Result.of(studentService.deleteStudent(id));
  }


}
