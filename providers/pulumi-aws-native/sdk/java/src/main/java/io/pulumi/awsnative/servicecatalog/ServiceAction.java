// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.servicecatalog.ServiceActionArgs;
import io.pulumi.awsnative.servicecatalog.enums.ServiceActionAcceptLanguage;
import io.pulumi.awsnative.servicecatalog.enums.ServiceActionDefinitionType;
import io.pulumi.awsnative.servicecatalog.outputs.ServiceActionDefinitionParameter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalog::ServiceAction
 * 
 */
@ResourceType(type="aws-native:servicecatalog:ServiceAction")
public class ServiceAction extends io.pulumi.resources.CustomResource {
    @OutputExport(name="acceptLanguage", type=ServiceActionAcceptLanguage.class, parameters={})
    private Output</* @Nullable */ ServiceActionAcceptLanguage> acceptLanguage;

    public Output</* @Nullable */ ServiceActionAcceptLanguage> getAcceptLanguage() {
        return this.acceptLanguage;
    }
    @OutputExport(name="definition", type=List.class, parameters={ServiceActionDefinitionParameter.class})
    private Output<List<ServiceActionDefinitionParameter>> definition;

    public Output<List<ServiceActionDefinitionParameter>> getDefinition() {
        return this.definition;
    }
    @OutputExport(name="definitionType", type=ServiceActionDefinitionType.class, parameters={})
    private Output<ServiceActionDefinitionType> definitionType;

    public Output<ServiceActionDefinitionType> getDefinitionType() {
        return this.definitionType;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAction(String name, ServiceActionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceAction", name, args == null ? ServiceActionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceAction(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceAction", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static ServiceAction get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAction(name, id, options);
    }
}
