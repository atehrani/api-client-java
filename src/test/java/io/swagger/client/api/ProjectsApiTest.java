/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.PatchDelta;
import io.swagger.client.model.Project;
import io.swagger.client.model.ProjectBody;
import io.swagger.client.model.Projects;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Delete a project by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String projectKey = null;
        api.deleteProject(projectKey);

        // TODO: test validations
    }
    
    /**
     * Get a project by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectKey = null;
        Project response = api.getProject(projectKey);

        // TODO: test validations
    }
    
    /**
     * Returns a list of all projects in the account.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        Projects response = api.getProjects();

        // TODO: test validations
    }
    
    /**
     * Modify a project by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchProjectTest() throws ApiException {
        String projectKey = null;
        List<PatchDelta> patchDelta = null;
        api.patchProject(projectKey, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Create a project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postProjectTest() throws ApiException {
        ProjectBody projectBody = null;
        api.postProject(projectBody);

        // TODO: test validations
    }
    
}
