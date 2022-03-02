// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3objectlambda.AccessPointPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AWS::S3ObjectLambda::AccessPointPolicy resource is an Amazon S3ObjectLambda policy type that you can use to control permissions for your S3ObjectLambda
 * 
 */
@ResourceType(type="aws-native:s3objectlambda:AccessPointPolicy")
public class AccessPointPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
     * 
     */
    @OutputExport(name="objectLambdaAccessPoint", type=String.class, parameters={})
    private Output<String> objectLambdaAccessPoint;

    /**
     * @return The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
     * 
     */
    public Output<String> getObjectLambdaAccessPoint() {
        return this.objectLambdaAccessPoint;
    }
    /**
     * A policy document containing permissions to add to the specified ObjectLambdaAccessPoint. For more information, see Access Policy Language Overview (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @OutputExport(name="policyDocument", type=Object.class, parameters={})
    private Output<Object> policyDocument;

    /**
     * @return A policy document containing permissions to add to the specified ObjectLambdaAccessPoint. For more information, see Access Policy Language Overview (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Output<Object> getPolicyDocument() {
        return this.policyDocument;
    }

    public interface BuilderApplicator {
        public void apply(AccessPointPolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.s3objectlambda.AccessPointPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.s3objectlambda.AccessPointPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessPointPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPointPolicy(String name) {
        this(name, AccessPointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPointPolicy(String name, AccessPointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPointPolicy(String name, AccessPointPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3objectlambda:AccessPointPolicy", name, args == null ? AccessPointPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessPointPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3objectlambda:AccessPointPolicy", name, null, makeResourceOptions(options, id));
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
    public static AccessPointPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPointPolicy(name, id, options);
    }
}
