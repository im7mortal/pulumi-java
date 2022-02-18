// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.connect.HoursOfOperationArgs;
import io.pulumi.awsnative.connect.outputs.HoursOfOperationConfig;
import io.pulumi.awsnative.connect.outputs.HoursOfOperationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Connect::HoursOfOperation
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:connect:HoursOfOperation")
public class HoursOfOperation extends io.pulumi.resources.CustomResource {
    /**
     * Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    @OutputExport(name="config", type=List.class, parameters={HoursOfOperationConfig.class})
    private Output<List<HoursOfOperationConfig>> config;

    /**
     * @return Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    public Output<List<HoursOfOperationConfig>> getConfig() {
        return this.config;
    }
    /**
     * The description of the hours of operation.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the hours of operation.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    @OutputExport(name="hoursOfOperationArn", type=String.class, parameters={})
    private Output<String> hoursOfOperationArn;

    /**
     * @return The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    public Output<String> getHoursOfOperationArn() {
        return this.hoursOfOperationArn;
    }
    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @OutputExport(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    /**
     * The name of the hours of operation.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the hours of operation.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * One or more tags.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={HoursOfOperationTag.class})
    private Output</* @Nullable */ List<HoursOfOperationTag>> tags;

    /**
     * @return One or more tags.
     * 
     */
    public Output</* @Nullable */ List<HoursOfOperationTag>> getTags() {
        return this.tags;
    }
    /**
     * The time zone of the hours of operation.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The time zone of the hours of operation.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HoursOfOperation(String name, HoursOfOperationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:HoursOfOperation", name, args == null ? HoursOfOperationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HoursOfOperation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:connect:HoursOfOperation", name, null, makeResourceOptions(options, id));
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
    public static HoursOfOperation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HoursOfOperation(name, id, options);
    }
}
