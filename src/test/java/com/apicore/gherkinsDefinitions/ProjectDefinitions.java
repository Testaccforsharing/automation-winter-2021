package com.apicore.gherkinsDefinitions;

import com.apicore.serenitySteps.ProjectSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

/**
 * This is class contains project definitions
 */
public class ProjectDefinitions {

    @Steps
    public ProjectSteps projectSteps;

    @And("^the user creates a project with name \"([^\"]*)\"$")
    public void createProject(String name) throws Exception {
        projectSteps.createProject(name);
    }

    @And("^the user gets created project$")
    public void getCreatedProject() throws Exception {
        projectSteps.getCreatedProject();
    }

    @And("^the user removes created project$")
    public void removeCreatedProject() throws Exception {
        projectSteps.removeCreatedProject();
    }

    @And("^the user removes project with id \"([^\"]*)\"$")
    public void removeProjectById(String id) throws Exception {
        projectSteps.removeProjectById(id);
    }

    @And("^the user gets project with id \"([^\"]*)\"$")
    public void getProjectById(String id) throws Exception {
        projectSteps.getProjectById(id);
    }
}
