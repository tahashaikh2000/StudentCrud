package com.qde.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qde.model.Students;
import com.qde.service.StudentsService;
import org.springframework.web.servlet.ModelAndView;

//mark class as Controller
@RestController
public class StudentsController
{
//autowire the StudentsService class
@Autowired
StudentsService studentsService;
//creating a get mapping that retrieves all the students detail from the database
@GetMapping("/students/getall")
private List<Students> getAllStudents()
{
//    return "students";
    return studentsService.getAllStudents();
}
//creating a get mapping that retrieves the detail of a specific student
@GetMapping("/students/{studentId}")
private Students getStudents(@PathVariable("studentId") int studentId)
{
return studentsService.getStudentsById(studentId);
}
//creating a delete mapping that deletes a specified student
@DeleteMapping("/students/delete/{studentId}")
private void deleteStudent(@PathVariable("studentId") int studentId)
{
studentsService.delete(studentId);
}

//creating post mapping that post the student detail in the database
@PostMapping("/students/save")
private int saveStudent(@RequestBody Students students)
{
    Students students1 =studentsService.saveOrUpdate(students);
return students1.getstudentId();
}

//creating put mapping that updates the student detail
@PutMapping("/students/update")
private Students update(@RequestBody Students students)
{
studentsService.saveOrUpdate(students);
return students;
}



//    @GetMapping("/welcome")
////	@ResponseBody
//    public ModelAndView firstPage() {
//        System.out.println("came");
//        return  new ModelAndView("welcome");
//    }
}
