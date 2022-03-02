// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecr.RepositoryArgs;
import io.pulumi.awsnative.ecr.enums.RepositoryImageTagMutability;
import io.pulumi.awsnative.ecr.outputs.RepositoryEncryptionConfiguration;
import io.pulumi.awsnative.ecr.outputs.RepositoryImageScanningConfiguration;
import io.pulumi.awsnative.ecr.outputs.RepositoryLifecyclePolicy;
import io.pulumi.awsnative.ecr.outputs.RepositoryTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::ECR::Repository resource specifies an Amazon Elastic Container Registry (Amazon ECR) repository, where users can push and pull Docker images. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecr:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="encryptionConfiguration", type=RepositoryEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ RepositoryEncryptionConfiguration> encryptionConfiguration;

    public Output</* @Nullable */ RepositoryEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    @OutputExport(name="imageScanningConfiguration", type=RepositoryImageScanningConfiguration.class, parameters={})
    private Output</* @Nullable */ RepositoryImageScanningConfiguration> imageScanningConfiguration;

    public Output</* @Nullable */ RepositoryImageScanningConfiguration> getImageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }
    /**
     * The image tag mutability setting for the repository.
     * 
     */
    @OutputExport(name="imageTagMutability", type=RepositoryImageTagMutability.class, parameters={})
    private Output</* @Nullable */ RepositoryImageTagMutability> imageTagMutability;

    /**
     * @return The image tag mutability setting for the repository.
     * 
     */
    public Output</* @Nullable */ RepositoryImageTagMutability> getImageTagMutability() {
        return this.imageTagMutability;
    }
    @OutputExport(name="lifecyclePolicy", type=RepositoryLifecyclePolicy.class, parameters={})
    private Output</* @Nullable */ RepositoryLifecyclePolicy> lifecyclePolicy;

    public Output</* @Nullable */ RepositoryLifecyclePolicy> getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }
    /**
     * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    @OutputExport(name="repositoryName", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryName;

    /**
     * @return The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    public Output</* @Nullable */ String> getRepositoryName() {
        return this.repositoryName;
    }
    /**
     * The JSON repository policy text to apply to the repository. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html in the Amazon Elastic Container Registry User Guide.
     * 
     */
    @OutputExport(name="repositoryPolicyText", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> repositoryPolicyText;

    /**
     * @return The JSON repository policy text to apply to the repository. For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html in the Amazon Elastic Container Registry User Guide.
     * 
     */
    public Output</* @Nullable */ Object> getRepositoryPolicyText() {
        return this.repositoryPolicyText;
    }
    @OutputExport(name="repositoryUri", type=String.class, parameters={})
    private Output<String> repositoryUri;

    public Output<String> getRepositoryUri() {
        return this.repositoryUri;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={RepositoryTag.class})
    private Output</* @Nullable */ List<RepositoryTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<RepositoryTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RepositoryArgs.Builder a);
    }
    private static io.pulumi.awsnative.ecr.RepositoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ecr.RepositoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Repository(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, @Nullable RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecr:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Repository(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecr:Repository", name, null, makeResourceOptions(options, id));
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
    public static Repository get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, options);
    }
}
