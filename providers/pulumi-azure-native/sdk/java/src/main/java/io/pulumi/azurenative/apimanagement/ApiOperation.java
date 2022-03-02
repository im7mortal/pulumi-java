// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiOperationArgs;
import io.pulumi.azurenative.apimanagement.outputs.ParameterContractResponse;
import io.pulumi.azurenative.apimanagement.outputs.RequestContractResponse;
import io.pulumi.azurenative.apimanagement.outputs.ResponseContractResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Api Operation details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiOperation newoperations /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/PetStoreTemplate2/operations/newoperations 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiOperation")
public class ApiOperation extends io.pulumi.resources.CustomResource {
    /**
     * Description of the operation. May include HTML formatting tags.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the operation. May include HTML formatting tags.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Operation Name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Operation Name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     * 
     */
    @OutputExport(name="method", type=String.class, parameters={})
    private Output<String> method;

    /**
     * @return A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     * 
     */
    public Output<String> getMethod() {
        return this.method;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Operation Policies
     * 
     */
    @OutputExport(name="policies", type=String.class, parameters={})
    private Output</* @Nullable */ String> policies;

    /**
     * @return Operation Policies
     * 
     */
    public Output</* @Nullable */ String> getPolicies() {
        return this.policies;
    }
    /**
     * An entity containing request details.
     * 
     */
    @OutputExport(name="request", type=RequestContractResponse.class, parameters={})
    private Output</* @Nullable */ RequestContractResponse> request;

    /**
     * @return An entity containing request details.
     * 
     */
    public Output</* @Nullable */ RequestContractResponse> getRequest() {
        return this.request;
    }
    /**
     * Array of Operation responses.
     * 
     */
    @OutputExport(name="responses", type=List.class, parameters={ResponseContractResponse.class})
    private Output</* @Nullable */ List<ResponseContractResponse>> responses;

    /**
     * @return Array of Operation responses.
     * 
     */
    public Output</* @Nullable */ List<ResponseContractResponse>> getResponses() {
        return this.responses;
    }
    /**
     * Collection of URL template parameters.
     * 
     */
    @OutputExport(name="templateParameters", type=List.class, parameters={ParameterContractResponse.class})
    private Output</* @Nullable */ List<ParameterContractResponse>> templateParameters;

    /**
     * @return Collection of URL template parameters.
     * 
     */
    public Output</* @Nullable */ List<ParameterContractResponse>> getTemplateParameters() {
        return this.templateParameters;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
     * 
     */
    @OutputExport(name="urlTemplate", type=String.class, parameters={})
    private Output<String> urlTemplate;

    /**
     * @return Relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}
     * 
     */
    public Output<String> getUrlTemplate() {
        return this.urlTemplate;
    }

    public interface BuilderApplicator {
        public void apply(ApiOperationArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiOperationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiOperationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiOperation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiOperation(String name) {
        this(name, ApiOperationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiOperation(String name, ApiOperationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiOperation(String name, ApiOperationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperation", name, args == null ? ApiOperationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiOperation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiOperation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiOperation").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiOperation").build())
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
    public static ApiOperation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiOperation(name, id, options);
    }
}
