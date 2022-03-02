// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.IotConnectorFhirDestinationArgs;
import io.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IoT Connector FHIR destination definition.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:healthcareapis:IotConnectorFhirDestination dest1 /subscriptions/subid/resourceGroups/testRG/providers/Microsoft.HealthcareApis/workspaces/workspace1/iotconnectors/blue/fhirdestinations/dest1 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthcareapis:IotConnectorFhirDestination")
public class IotConnectorFhirDestination extends io.pulumi.resources.CustomResource {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * FHIR Mappings
     * 
     */
    @OutputExport(name="fhirMapping", type=IotMappingPropertiesResponse.class, parameters={})
    private Output<IotMappingPropertiesResponse> fhirMapping;

    /**
     * @return FHIR Mappings
     * 
     */
    public Output<IotMappingPropertiesResponse> getFhirMapping() {
        return this.fhirMapping;
    }
    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    @OutputExport(name="fhirServiceResourceId", type=String.class, parameters={})
    private Output<String> fhirServiceResourceId;

    /**
     * @return Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    public Output<String> getFhirServiceResourceId() {
        return this.fhirServiceResourceId;
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
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Determines how resource identity is resolved on the destination.
     * 
     */
    @OutputExport(name="resourceIdentityResolutionType", type=String.class, parameters={})
    private Output<String> resourceIdentityResolutionType;

    /**
     * @return Determines how resource identity is resolved on the destination.
     * 
     */
    public Output<String> getResourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IotConnectorFhirDestinationArgs.Builder a);
    }
    private static io.pulumi.azurenative.healthcareapis.IotConnectorFhirDestinationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.healthcareapis.IotConnectorFhirDestinationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IotConnectorFhirDestination(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotConnectorFhirDestination(String name) {
        this(name, IotConnectorFhirDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotConnectorFhirDestination(String name, IotConnectorFhirDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotConnectorFhirDestination(String name, IotConnectorFhirDestinationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnectorFhirDestination", name, args == null ? IotConnectorFhirDestinationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IotConnectorFhirDestination(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnectorFhirDestination", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:healthcareapis/v20210601preview:IotConnectorFhirDestination").build())
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
    public static IotConnectorFhirDestination get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotConnectorFhirDestination(name, id, options);
    }
}
