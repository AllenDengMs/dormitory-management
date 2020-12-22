package cn.organization.dormitory.service;


import cn.organization.dormitory.entity.Student;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.StudentQueryBuilder;

/**
 * Created by Allen on 2020/12/20.
 */
public interface StudentService {

  PageQueryResult<Student> pageQueryStudents(StudentQueryBuilder queryBuilder);

  int addStudent(Student student);

  int deleteStudent(int id);

  int updateStudent(Student student);
}
