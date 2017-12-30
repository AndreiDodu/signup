package com.cyberx.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyberx.signup.model.Student;
import com.cyberx.signup.service.StudentService;

@Controller
@SessionAttributes("student")
public class StudentController {
  
  @Autowired
  private StudentService studentService;
  
  @RequestMapping(value="/", method=RequestMethod.GET)
  public String signup(Model model) {
      Student student = new Student();
      model.addAttribute("student", student);
      return "home";
  }
  
  @RequestMapping(value="/", method=RequestMethod.POST)
  public String signup(@ModelAttribute("student") Student student, Model model) {
      if(studentService.getStudentByUserName(student.getUserName())) {
          model.addAttribute("message", "User Name exists. Try another user name");
          return "home";
      } else {
          studentService.insertStudent(student);
          student = new Student();
          model.addAttribute("student", student);
          return "home";
      }
  }
  
}
