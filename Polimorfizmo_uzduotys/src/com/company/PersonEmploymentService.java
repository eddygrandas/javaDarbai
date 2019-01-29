package com.company;

import java.util.List;

public interface PersonEmploymentService {
    List<UnemployedPerson> unemployedPersons();
    List<EmployedPerson> employedPersons();
}
