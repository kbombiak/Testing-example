package com.learning.courses.api.rest.controller;

import com.learning.courses.dto.*;
import com.learning.courses.service.PersonCourseService;
import com.learning.courses.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Tag(name = "PersonController", description = "Person API")
@RequestMapping("/api/persons")
class PersonController {

    private final PersonService personService;
    private final PersonCourseService personCourseService;

    @PostMapping
    @Operation(summary = "Create person")
    public Long createPerson(@Valid @RequestBody CreatePersonDTO createPersonDTO) {
        return personService.createPerson(createPersonDTO);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get person")
    public PersonDTO getPerson(@PathVariable Long id) {
        return personService.getPerson(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update person")
    public PersonDTO updatePerson(@PathVariable Long id, @RequestBody PersonDTO updatedPerson) {
        return personService.updatePerson(id, updatedPerson);
    }

    @PatchMapping("/grade")
    @Operation(summary = "Grade a student")
    public void gradeStudent(@RequestBody @Valid DegreeDTO degreeDTO) {
        personCourseService.gradeStudent(degreeDTO);
    }


    @PostMapping("/{Id}")
    @Operation(summary = "Add contact to a student")
    public PersonDTO addContact(@PathVariable Long Id, @RequestBody ContactDTO contactDTO) {
        return personService.addContact(Id, contactDTO);
    }


    @DeleteMapping("/{personId}")
    @Operation(summary = "Remove contact from a student")
    public PersonDTO removeContact(@PathVariable Long personId, @PathVariable Long contactId) {
        return personService.removeContact(personId, contactId);
    }
}
