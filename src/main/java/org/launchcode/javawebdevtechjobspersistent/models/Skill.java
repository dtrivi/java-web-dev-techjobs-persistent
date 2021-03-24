package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Position skill is required.")
    @Size(min = 2, max = 999, message = "Skill must be described between 2 and 999 characters.")
    private String skill;

    public Skill() {}

}