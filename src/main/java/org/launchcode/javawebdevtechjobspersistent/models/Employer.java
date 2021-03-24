package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    // Unsure of what validation is appropriate, went with validation for a String
    @NotBlank(message = "Employer location is required.")
    @Size(min = 2, max = 150, message = "Location must be between 2 and 150 characters.")
    private String location;

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
