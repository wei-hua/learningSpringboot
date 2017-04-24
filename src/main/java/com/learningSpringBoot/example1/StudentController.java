package com.learningSpringBoot.example1;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	List<Student> Students=new ArrayList<Student>();
	
    @RequestMapping("/delete")
    public void delete(@RequestParam(value="ID") int ID){
    	Student s2=find(ID);
		if(Students!=null){
			Students.remove(s2);
		}else{
			System.out.println("find no student");
		}
    }
    
    @RequestMapping("/finde")
    public Student find(@RequestParam(value="ID") int ID){
    	Student s=new Student();
		for(int i=0;i<Students.size();i++){
			if(Students.get(i).getID()==ID){
				s=Students.get(i);
			}else{
				System.out.println("find no student");
			}
		}
		return s;
	}

}