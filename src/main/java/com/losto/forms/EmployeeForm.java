package com.losto.forms;
import com.dlsc.formsfx.model.structure.Form;
import com.dlsc.formsfx.model.structure.Group;
import com.dlsc.formsfx.model.structure.Field;

import java.time.*;


public class EmployeeForm {

public static Form create (){
    return Form.of(
            Group.of(
                    Field.ofStringType("")
                            .label("First Name")
                            .required("Required"),

                    Field.ofStringType("")
                            .label("Last Name")
                            .required("Required"),

                    Field.ofStringType("")
                            .label("Email"),
                            //.validate(email -> email.contains("@"), "Invalid email"),

                    Field.ofDate(LocalDate.now())
                            .label("Hire Date"),

                    Field.ofDoubleType(0.0)
                            .label("Salary")
                            //.validate(s-> s>0, "Salary must be positive")
            )
    ).title("Employee Information");
}


}
