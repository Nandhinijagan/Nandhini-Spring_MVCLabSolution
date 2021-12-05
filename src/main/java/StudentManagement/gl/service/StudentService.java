package StudentManagement.gl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import StudentManagement.gl.entities.Student;
// Service interface
@Service
public interface StudentService {

	public List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);
}
