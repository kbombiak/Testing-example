package com.learning.courses.dto;

import java.io.Serializable;

import com.learning.courses.model.enums.CourseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class ContactDTO {

    private String email;

    private String address;

    private String phone;



}
