// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationServiceEnvironmentManagedApiArgs;
import io.pulumi.azurenative.logic.outputs.ApiResourceBackendServiceResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceDefinitionsResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceGeneralInformationResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceMetadataResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourcePoliciesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The integration service environment managed api.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationServiceEnvironmentManagedApi servicebus /subscriptions/80d4fe69-c95b-4dd2-a938-9250f1c8ab03/resourceGroups/rohithah-ise/providers/Microsoft.Logic/integrationServiceEnvironments/tes-ise-ga/managedApis/servicebus 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationServiceEnvironmentManagedApi")
public class IntegrationServiceEnvironmentManagedApi extends io.pulumi.resources.CustomResource {
    /**
     * The API definition.
     * 
     */
    @OutputExport(name="apiDefinitionUrl", type=String.class, parameters={})
    private Output<String> apiDefinitionUrl;

    /**
     * @return The API definition.
     * 
     */
    public Output<String> getApiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    /**
     * The api definitions.
     * 
     */
    @OutputExport(name="apiDefinitions", type=ApiResourceDefinitionsResponse.class, parameters={})
    private Output<ApiResourceDefinitionsResponse> apiDefinitions;

    /**
     * @return The api definitions.
     * 
     */
    public Output<ApiResourceDefinitionsResponse> getApiDefinitions() {
        return this.apiDefinitions;
    }
    /**
     * The backend service.
     * 
     */
    @OutputExport(name="backendService", type=ApiResourceBackendServiceResponse.class, parameters={})
    private Output<ApiResourceBackendServiceResponse> backendService;

    /**
     * @return The backend service.
     * 
     */
    public Output<ApiResourceBackendServiceResponse> getBackendService() {
        return this.backendService;
    }
    /**
     * The capabilities.
     * 
     */
    @OutputExport(name="capabilities", type=List.class, parameters={String.class})
    private Output<List<String>> capabilities;

    /**
     * @return The capabilities.
     * 
     */
    public Output<List<String>> getCapabilities() {
        return this.capabilities;
    }
    /**
     * The category.
     * 
     */
    @OutputExport(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return The category.
     * 
     */
    public Output<String> getCategory() {
        return this.category;
    }
    /**
     * The connection parameters.
     * 
     */
    @OutputExport(name="connectionParameters", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> connectionParameters;

    /**
     * @return The connection parameters.
     * 
     */
    public Output<Map<String,Object>> getConnectionParameters() {
        return this.connectionParameters;
    }
    /**
     * The integration service environment managed api deployment parameters.
     * 
     */
    @OutputExport(name="deploymentParameters", type=IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse> deploymentParameters;

    /**
     * @return The integration service environment managed api deployment parameters.
     * 
     */
    public Output</* @Nullable */ IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse> getDeploymentParameters() {
        return this.deploymentParameters;
    }
    /**
     * The api general information.
     * 
     */
    @OutputExport(name="generalInformation", type=ApiResourceGeneralInformationResponse.class, parameters={})
    private Output<ApiResourceGeneralInformationResponse> generalInformation;

    /**
     * @return The api general information.
     * 
     */
    public Output<ApiResourceGeneralInformationResponse> getGeneralInformation() {
        return this.generalInformation;
    }
    /**
     * The integration service environment reference.
     * 
     */
    @OutputExport(name="integrationServiceEnvironment", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> integrationServiceEnvironment;

    /**
     * @return The integration service environment reference.
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The metadata.
     * 
     */
    @OutputExport(name="metadata", type=ApiResourceMetadataResponse.class, parameters={})
    private Output<ApiResourceMetadataResponse> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output<ApiResourceMetadataResponse> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The policies for the API.
     * 
     */
    @OutputExport(name="policies", type=ApiResourcePoliciesResponse.class, parameters={})
    private Output<ApiResourcePoliciesResponse> policies;

    /**
     * @return The policies for the API.
     * 
     */
    public Output<ApiResourcePoliciesResponse> getPolicies() {
        return this.policies;
    }
    /**
     * The provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The runtime urls.
     * 
     */
    @OutputExport(name="runtimeUrls", type=List.class, parameters={String.class})
    private Output<List<String>> runtimeUrls;

    /**
     * @return The runtime urls.
     * 
     */
    public Output<List<String>> getRuntimeUrls() {
        return this.runtimeUrls;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationServiceEnvironmentManagedApiArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.IntegrationServiceEnvironmentManagedApiArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.IntegrationServiceEnvironmentManagedApiArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationServiceEnvironmentManagedApi(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationServiceEnvironmentManagedApi(String name) {
        this(name, IntegrationServiceEnvironmentManagedApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationServiceEnvironmentManagedApi(String name, IntegrationServiceEnvironmentManagedApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationServiceEnvironmentManagedApi(String name, IntegrationServiceEnvironmentManagedApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironmentManagedApi", name, args == null ? IntegrationServiceEnvironmentManagedApiArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationServiceEnvironmentManagedApi(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironmentManagedApi", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationServiceEnvironmentManagedApi").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IntegrationServiceEnvironmentManagedApi get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationServiceEnvironmentManagedApi(name, id, options);
    }
}
