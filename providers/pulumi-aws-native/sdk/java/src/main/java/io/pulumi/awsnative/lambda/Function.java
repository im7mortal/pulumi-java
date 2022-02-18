// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lambda.FunctionArgs;
import io.pulumi.awsnative.lambda.enums.FunctionArchitecturesItem;
import io.pulumi.awsnative.lambda.enums.FunctionPackageType;
import io.pulumi.awsnative.lambda.outputs.FunctionCode;
import io.pulumi.awsnative.lambda.outputs.FunctionDeadLetterConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionEnvironment;
import io.pulumi.awsnative.lambda.outputs.FunctionFileSystemConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionImageConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionTag;
import io.pulumi.awsnative.lambda.outputs.FunctionTracingConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionVpcConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lambda::Function
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:lambda:Function")
public class Function extends io.pulumi.resources.CustomResource {
    @OutputExport(name="architectures", type=List.class, parameters={FunctionArchitecturesItem.class})
    private Output</* @Nullable */ List<FunctionArchitecturesItem>> architectures;

    public Output</* @Nullable */ List<FunctionArchitecturesItem>> getArchitectures() {
        return this.architectures;
    }
    /**
     * Unique identifier for function resources
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Unique identifier for function resources
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The code for the function.
     * 
     */
    @OutputExport(name="code", type=FunctionCode.class, parameters={})
    private Output<FunctionCode> code;

    /**
     * @return The code for the function.
     * 
     */
    public Output<FunctionCode> getCode() {
        return this.code;
    }
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    @OutputExport(name="codeSigningConfigArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> codeSigningConfigArn;

    /**
     * @return A unique Arn for CodeSigningConfig resource
     * 
     */
    public Output</* @Nullable */ String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }
    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    @OutputExport(name="deadLetterConfig", type=FunctionDeadLetterConfig.class, parameters={})
    private Output</* @Nullable */ FunctionDeadLetterConfig> deadLetterConfig;

    /**
     * @return A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    public Output</* @Nullable */ FunctionDeadLetterConfig> getDeadLetterConfig() {
        return this.deadLetterConfig;
    }
    /**
     * A description of the function.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the function.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Environment variables that are accessible from function code during execution.
     * 
     */
    @OutputExport(name="environment", type=FunctionEnvironment.class, parameters={})
    private Output</* @Nullable */ FunctionEnvironment> environment;

    /**
     * @return Environment variables that are accessible from function code during execution.
     * 
     */
    public Output</* @Nullable */ FunctionEnvironment> getEnvironment() {
        return this.environment;
    }
    /**
     * Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    @OutputExport(name="fileSystemConfigs", type=List.class, parameters={FunctionFileSystemConfig.class})
    private Output</* @Nullable */ List<FunctionFileSystemConfig>> fileSystemConfigs;

    /**
     * @return Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    public Output</* @Nullable */ List<FunctionFileSystemConfig>> getFileSystemConfigs() {
        return this.fileSystemConfigs;
    }
    /**
     * The name of the Lambda function, up to 64 characters in length. If you don't specify a name, AWS CloudFormation generates one.
     * 
     */
    @OutputExport(name="functionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionName;

    /**
     * @return The name of the Lambda function, up to 64 characters in length. If you don't specify a name, AWS CloudFormation generates one.
     * 
     */
    public Output</* @Nullable */ String> getFunctionName() {
        return this.functionName;
    }
    /**
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    @OutputExport(name="handler", type=String.class, parameters={})
    private Output</* @Nullable */ String> handler;

    /**
     * @return The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    public Output</* @Nullable */ String> getHandler() {
        return this.handler;
    }
    /**
     * ImageConfig
     * 
     */
    @OutputExport(name="imageConfig", type=FunctionImageConfig.class, parameters={})
    private Output</* @Nullable */ FunctionImageConfig> imageConfig;

    /**
     * @return ImageConfig
     * 
     */
    public Output</* @Nullable */ FunctionImageConfig> getImageConfig() {
        return this.imageConfig;
    }
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @OutputExport(name="kmsKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyArn;

    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    @OutputExport(name="layers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> layers;

    /**
     * @return A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    public Output</* @Nullable */ List<String>> getLayers() {
        return this.layers;
    }
    /**
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    @OutputExport(name="memorySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> memorySize;

    /**
     * @return The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    public Output</* @Nullable */ Integer> getMemorySize() {
        return this.memorySize;
    }
    /**
     * PackageType.
     * 
     */
    @OutputExport(name="packageType", type=FunctionPackageType.class, parameters={})
    private Output</* @Nullable */ FunctionPackageType> packageType;

    /**
     * @return PackageType.
     * 
     */
    public Output</* @Nullable */ FunctionPackageType> getPackageType() {
        return this.packageType;
    }
    /**
     * The number of simultaneous executions to reserve for the function.
     * 
     */
    @OutputExport(name="reservedConcurrentExecutions", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> reservedConcurrentExecutions;

    /**
     * @return The number of simultaneous executions to reserve for the function.
     * 
     */
    public Output</* @Nullable */ Integer> getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions;
    }
    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The identifier of the function's runtime.
     * 
     */
    @OutputExport(name="runtime", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtime;

    /**
     * @return The identifier of the function's runtime.
     * 
     */
    public Output</* @Nullable */ String> getRuntime() {
        return this.runtime;
    }
    /**
     * A list of tags to apply to the function.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FunctionTag.class})
    private Output</* @Nullable */ List<FunctionTag>> tags;

    /**
     * @return A list of tags to apply to the function.
     * 
     */
    public Output</* @Nullable */ List<FunctionTag>> getTags() {
        return this.tags;
    }
    /**
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    @OutputExport(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    @OutputExport(name="tracingConfig", type=FunctionTracingConfig.class, parameters={})
    private Output</* @Nullable */ FunctionTracingConfig> tracingConfig;

    /**
     * @return Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    public Output</* @Nullable */ FunctionTracingConfig> getTracingConfig() {
        return this.tracingConfig;
    }
    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    @OutputExport(name="vpcConfig", type=FunctionVpcConfig.class, parameters={})
    private Output</* @Nullable */ FunctionVpcConfig> vpcConfig;

    /**
     * @return For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    public Output</* @Nullable */ FunctionVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, FunctionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Function(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:Function", name, null, makeResourceOptions(options, id));
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
    public static Function get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, options);
    }
}
