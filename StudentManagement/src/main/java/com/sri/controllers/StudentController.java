package com.sri.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sri.api.Student;
import com.sri.api.StudentDTO;
import com.sri.dao.StudentDAO;
import com.sri.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/showStudent")
	public String showStudentList(Model model) {

		List<Student> loadStudents = studentService.loadStudents();
		model.addAttribute("students", loadStudents);

		return "student-list";
	}

	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
		String type = "Add";
		model.addAttribute("type", type);
		return "add-student";
	}

	@RequestMapping("/saveStudent")
	public String saveStudent(Student student) {
		if (student.getId() == 0) {

			studentService.saveStudent(student);

		} else {
			studentService.updateStudent(student);
		}

		return "redirect:/thankyou";
	}

	@RequestMapping("/thankyou")
	public String thankyou(Model model) {
		String save = "saved";
		model.addAttribute("required_field", save);
		return "success-page";
	}

	@RequestMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {
		String type = "Update";
		model.addAttribute("type", type);
		// System.out.println("Student id : "+id);
		Student theStudent = studentService.getStudent(id);
		// System.out.println(theStudent);

//		student.setId(theStudent.getId());
//		student.setName(theStudent.getName());
//		student.setMobile(theStudent.getMobile());
//		student.setCountry(theStudent.getCountry());

		model.addAttribute("student", theStudent);

		return "add-student";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id, Model model) {
		if (studentService.deleteStudentById(id)) {

			String delete = "deleted";
			model.addAttribute("required_field", delete);

		} else {
			
			String notDelete = "not deleted";
			model.addAttribute("required_field", notDelete);
			
		}
		return "success-page";
	}

}
