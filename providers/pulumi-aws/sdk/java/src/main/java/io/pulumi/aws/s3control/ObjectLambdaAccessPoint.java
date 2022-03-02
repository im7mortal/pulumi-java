// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3control.ObjectLambdaAccessPointArgs;
import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState;
import io.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Object Lambda Access Point.
 * An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Object Lambda Access Points can be imported using the `account_id` and `name`, separated by a colon (`:`), e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint example 123456789012:example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint")
public class ObjectLambdaAccessPoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @OutputExport(name="configuration", type=ObjectLambdaAccessPointConfiguration.class, parameters={})
    private Output<ObjectLambdaAccessPointConfiguration> configuration;

    /**
     * @return A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    public Output<ObjectLambdaAccessPointConfiguration> getConfiguration() {
        return this.configuration;
    }
    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this Object Lambda Access Point.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(ObjectLambdaAccessPointArgs.Builder a);
    }
    private static io.pulumi.aws.s3control.ObjectLambdaAccessPointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ObjectLambdaAccessPoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectLambdaAccessPoint(String name) {
        this(name, ObjectLambdaAccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectLambdaAccessPoint(String name, ObjectLambdaAccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectLambdaAccessPoint(String name, ObjectLambdaAccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint", name, args == null ? ObjectLambdaAccessPointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ObjectLambdaAccessPoint(String name, Input<String> id, @Nullable ObjectLambdaAccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ObjectLambdaAccessPoint get(String name, Input<String> id, @Nullable ObjectLambdaAccessPointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectLambdaAccessPoint(name, id, state, options);
    }
}
