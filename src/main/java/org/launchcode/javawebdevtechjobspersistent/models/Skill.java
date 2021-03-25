package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Skill description is required.")
    @Size(min = 2, max = 999, message = "Skill description must be described between 2 and 999 characters.")
    private String description;

    public Skill() {}

    // Unsure if the getters/setters are wanted here, but assumed so.
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}