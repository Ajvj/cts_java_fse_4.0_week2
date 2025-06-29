package org.ajay.studentapi.integration;

package org.ajay.studentapi;

import org.ajay.studentapi.model.Student;
import org.ajay.studentapi.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateAndRetrieveStudent() {
        String baseUrl = "http://localhost:" + port + "/students";

        // Create a new student
        Student studentToCreate = new Student(null, "Ajay", 21);
        Student createdStudent = restTemplate.postForObject(baseUrl, studentToCreate, Student.class);

        // Output to console
        System.out.println("✅ Student Created:");
        System.out.println(createdStudent);

        // Assertions
        assertThat(createdStudent).isNotNull();
        assertThat(createdStudent.getId()).isNotNull();

        // Retrieve the student by ID
        Student fetchedStudent = restTemplate.getForObject(baseUrl + "/" + createdStudent.getId(), Student.class);

        // Output to console
        System.out.println("📦 Student Fetched:");
        System.out.println(fetchedStudent);

        // More assertions
        assertThat(fetchedStudent.getName()).isEqualTo("Ajay");
        assertThat(fetchedStudent.getAge()).isEqualTo(21);
    }
}
