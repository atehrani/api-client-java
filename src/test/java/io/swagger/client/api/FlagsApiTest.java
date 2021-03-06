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
import io.swagger.client.model.FeatureFlag;
import io.swagger.client.model.FeatureFlagBody;
import io.swagger.client.model.FeatureFlagStatus;
import io.swagger.client.model.FeatureFlagStatuses;
import io.swagger.client.model.FeatureFlags;
import io.swagger.client.model.PatchDelta;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlagsApi
 */
@Ignore
public class FlagsApiTest {

    private final FlagsApi api = new FlagsApi();

    
    /**
     * Delete a feature flag by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        api.deleteFeatureFlag(projectKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Get a single feature flag by key.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        String environmentKeyQuery = null;
        FeatureFlag response = api.getFeatureFlag(projectKey, featureFlagKey, environmentKeyQuery);

        // TODO: test validations
    }
    
    /**
     * Get a list of statuses for all feature flags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagStatusTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        FeatureFlagStatuses response = api.getFeatureFlagStatus(projectKey, environmentKey);

        // TODO: test validations
    }
    
    /**
     * Get a list of statuses for all feature flags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagStatusesTest() throws ApiException {
        String projectKey = null;
        String environmentKey = null;
        String featureFlagKey = null;
        FeatureFlagStatus response = api.getFeatureFlagStatuses(projectKey, environmentKey, featureFlagKey);

        // TODO: test validations
    }
    
    /**
     * Get a list of all features in the given project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureFlagsTest() throws ApiException {
        String projectKey = null;
        String environmentKeyQuery = null;
        String tag = null;
        FeatureFlags response = api.getFeatureFlags(projectKey, environmentKeyQuery, tag);

        // TODO: test validations
    }
    
    /**
     * Modify a feature flag by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchFeatureFlagTest() throws ApiException {
        String projectKey = null;
        String featureFlagKey = null;
        List<PatchDelta> patchDelta = null;
        FeatureFlag response = api.patchFeatureFlag(projectKey, featureFlagKey, patchDelta);

        // TODO: test validations
    }
    
    /**
     * Create a feature flag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFeatureFlagTest() throws ApiException {
        String projectKey = null;
        FeatureFlagBody featureFlagBody = null;
        api.postFeatureFlag(projectKey, featureFlagBody);

        // TODO: test validations
    }
    
}
