package com.cyberx.signup.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.cyberx.signup.model.Student;

public interface StudentMapper {
	  @Insert("INSERT INTO student(userName, password, firstName,"
	          + "lastName, emailAddress) VALUES"
	          + "(#{userName},#{password}, #{firstName}, #{lastName},"
	          + "#{emailAddress})")
	  @Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	  public void insertStudent(Student student);
	      
	  @Select("SELECT USERNAME as userName, PASSWORD as password, "
	          + "FIRSTNAME as firstName, LASTNAME as lastName, "
	          + "EMAILADDRESS as emailAddress "
	          + "FROM student WHERE userName = #{userName}")
	  public Student getStudentByUserName(String userName);


	}
