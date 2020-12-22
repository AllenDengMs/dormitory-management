package cn.organization.dormitory.dao;

import cn.organization.dormitory.entity.Student;
import cn.organization.dormitory.entity.query.StudentQueryBuilder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Allen on 2020/12/20.
 */
@Mapper
public interface StudentMapper {

  public int countStudents(StudentQueryBuilder queryBuilder);

  public List<Student> queryStudents(StudentQueryBuilder queryBuilder);

  public int addStudent(Student student);

  int deleteStudent(@Param("id") int id);

  int updateStudent(Student student);
}
