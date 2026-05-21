package com.learning.courses.controller;

import com.learning.courses.AbstractIntegrationTest;
import com.learning.courses.dto.CreateCourseDTO;
import com.learning.courses.model.Course;
import com.learning.courses.model.Person;
import com.learning.courses.repository.CourseRepository;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;


public class ContactIT extends AbstractIntegrationTest {




    @Test
    void shouldAddContactToPerson() throws Exception {}


    @Test
    void shouldRemoveContact() throws Exception {}


    @Test
    void shoudlThrowWhenPersonNotFoundWhileAddingContact() throws Exception {}

    @Test
    void shoudlThrowWhenContactNotFound(){}




}
