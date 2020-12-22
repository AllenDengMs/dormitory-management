package cn.organization.dormitory.service.impl;

import cn.organization.dormitory.dao.StudentMapper;
import cn.organization.dormitory.entity.Student;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.StudentQueryBuilder;
import cn.organization.dormitory.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Allen on 2020/12/20.
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  public StudentMapper studentMapper;

  @Override
  public PageQueryResult<Student> pageQueryStudents(StudentQueryBuilder queryBuilder) {
    int total = studentMapper.countStudents(queryBuilder);
    List<Student> students = studentMapper.queryStudents(queryBuilder);
    return new PageQueryResult(total, students);
  }

  @Override
  public int addStudent(Student student) {
    return studentMapper.addStudent(student);
  }

  @Override
  public int deleteStudent(int id) {
    return studentMapper.deleteStudent(id);
  }

  @Override
  public int updateStudent(Student student) {
    return studentMapper.updateStudent(student);
  }
}
