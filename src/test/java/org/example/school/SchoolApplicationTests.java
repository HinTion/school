package org.example.school;

import lombok.*;
import org.example.school.entity.*;
import org.example.school.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.*;

@SpringBootTest
class SchoolApplicationTests {

	@Autowired
	private ClassroomMapper classroomMapper;

	@Test
	public void test() {
		List<Classroom> classrooms = classroomMapper.list();
System.out.println(classrooms);	}





	@Test
	public void SerializableTest(){
		User user = new User(1001, "Joe");
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.txt"));
			objectOutputStream.writeObject(user);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void DeserializableTest(){
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.txt"));
			try {
				Object object = objectInputStream.readObject();
				User user = (User) object;
				System.out.println(user);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
