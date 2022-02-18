// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.awsnative.lambda.enums.FunctionArchitecturesItem;
import io.pulumi.awsnative.lambda.enums.FunctionPackageType;
import io.pulumi.awsnative.lambda.outputs.FunctionDeadLetterConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionEnvironment;
import io.pulumi.awsnative.lambda.outputs.FunctionFileSystemConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionImageConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionTag;
import io.pulumi.awsnative.lambda.outputs.FunctionTracingConfig;
import io.pulumi.awsnative.lambda.outputs.FunctionVpcConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFunctionResult {
    private final @Nullable List<FunctionArchitecturesItem> architectures;
    /**
     * Unique identifier for function resources
     * 
     */
    private final @Nullable String arn;
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    private final @Nullable String codeSigningConfigArn;
    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    private final @Nullable FunctionDeadLetterConfig deadLetterConfig;
    /**
     * A description of the function.
     * 
     */
    private final @Nullable String description;
    /**
     * Environment variables that are accessible from function code during execution.
     * 
     */
    private final @Nullable FunctionEnvironment environment;
    /**
     * Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    private final @Nullable List<FunctionFileSystemConfig> fileSystemConfigs;
    /**
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    private final @Nullable String handler;
    /**
     * ImageConfig
     * 
     */
    private final @Nullable FunctionImageConfig imageConfig;
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    private final @Nullable List<String> layers;
    /**
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    private final @Nullable Integer memorySize;
    /**
     * PackageType.
     * 
     */
    private final @Nullable FunctionPackageType packageType;
    /**
     * The number of simultaneous executions to reserve for the function.
     * 
     */
    private final @Nullable Integer reservedConcurrentExecutions;
    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    private final @Nullable String role;
    /**
     * The identifier of the function's runtime.
     * 
     */
    private final @Nullable String runtime;
    /**
     * A list of tags to apply to the function.
     * 
     */
    private final @Nullable List<FunctionTag> tags;
    /**
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    private final @Nullable FunctionTracingConfig tracingConfig;
    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    private final @Nullable FunctionVpcConfig vpcConfig;

    @OutputCustomType.Constructor({"architectures","arn","codeSigningConfigArn","deadLetterConfig","description","environment","fileSystemConfigs","handler","imageConfig","kmsKeyArn","layers","memorySize","packageType","reservedConcurrentExecutions","role","runtime","tags","timeout","tracingConfig","vpcConfig"})
    private GetFunctionResult(
        @Nullable List<FunctionArchitecturesItem> architectures,
        @Nullable String arn,
        @Nullable String codeSigningConfigArn,
        @Nullable FunctionDeadLetterConfig deadLetterConfig,
        @Nullable String description,
        @Nullable FunctionEnvironment environment,
        @Nullable List<FunctionFileSystemConfig> fileSystemConfigs,
        @Nullable String handler,
        @Nullable FunctionImageConfig imageConfig,
        @Nullable String kmsKeyArn,
        @Nullable List<String> layers,
        @Nullable Integer memorySize,
        @Nullable FunctionPackageType packageType,
        @Nullable Integer reservedConcurrentExecutions,
        @Nullable String role,
        @Nullable String runtime,
        @Nullable List<FunctionTag> tags,
        @Nullable Integer timeout,
        @Nullable FunctionTracingConfig tracingConfig,
        @Nullable FunctionVpcConfig vpcConfig) {
        this.architectures = architectures;
        this.arn = arn;
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfigs = fileSystemConfigs;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.kmsKeyArn = kmsKeyArn;
        this.layers = layers;
        this.memorySize = memorySize;
        this.packageType = packageType;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = role;
        this.runtime = runtime;
        this.tags = tags;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.vpcConfig = vpcConfig;
    }

    public List<FunctionArchitecturesItem> getArchitectures() {
        return this.architectures == null ? List.of() : this.architectures;
    }
    /**
     * Unique identifier for function resources
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    public Optional<String> getCodeSigningConfigArn() {
        return Optional.ofNullable(this.codeSigningConfigArn);
    }
    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    public Optional<FunctionDeadLetterConfig> getDeadLetterConfig() {
        return Optional.ofNullable(this.deadLetterConfig);
    }
    /**
     * A description of the function.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Environment variables that are accessible from function code during execution.
     * 
     */
    public Optional<FunctionEnvironment> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    public List<FunctionFileSystemConfig> getFileSystemConfigs() {
        return this.fileSystemConfigs == null ? List.of() : this.fileSystemConfigs;
    }
    /**
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    public Optional<String> getHandler() {
        return Optional.ofNullable(this.handler);
    }
    /**
     * ImageConfig
     * 
     */
    public Optional<FunctionImageConfig> getImageConfig() {
        return Optional.ofNullable(this.imageConfig);
    }
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    public List<String> getLayers() {
        return this.layers == null ? List.of() : this.layers;
    }
    /**
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    public Optional<Integer> getMemorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    /**
     * PackageType.
     * 
     */
    public Optional<FunctionPackageType> getPackageType() {
        return Optional.ofNullable(this.packageType);
    }
    /**
     * The number of simultaneous executions to reserve for the function.
     * 
     */
    public Optional<Integer> getReservedConcurrentExecutions() {
        return Optional.ofNullable(this.reservedConcurrentExecutions);
    }
    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }
    /**
     * The identifier of the function's runtime.
     * 
     */
    public Optional<String> getRuntime() {
        return Optional.ofNullable(this.runtime);
    }
    /**
     * A list of tags to apply to the function.
     * 
     */
    public List<FunctionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    public Optional<FunctionTracingConfig> getTracingConfig() {
        return Optional.ofNullable(this.tracingConfig);
    }
    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    public Optional<FunctionVpcConfig> getVpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FunctionArchitecturesItem> architectures;
        private @Nullable String arn;
        private @Nullable String codeSigningConfigArn;
        private @Nullable FunctionDeadLetterConfig deadLetterConfig;
        private @Nullable String description;
        private @Nullable FunctionEnvironment environment;
        private @Nullable List<FunctionFileSystemConfig> fileSystemConfigs;
        private @Nullable String handler;
        private @Nullable FunctionImageConfig imageConfig;
        private @Nullable String kmsKeyArn;
        private @Nullable List<String> layers;
        private @Nullable Integer memorySize;
        private @Nullable FunctionPackageType packageType;
        private @Nullable Integer reservedConcurrentExecutions;
        private @Nullable String role;
        private @Nullable String runtime;
        private @Nullable List<FunctionTag> tags;
        private @Nullable Integer timeout;
        private @Nullable FunctionTracingConfig tracingConfig;
        private @Nullable FunctionVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.arn = defaults.arn;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfigs = defaults.fileSystemConfigs;
    	      this.handler = defaults.handler;
    	      this.imageConfig = defaults.imageConfig;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.packageType = defaults.packageType;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArchitectures(@Nullable List<FunctionArchitecturesItem> architectures) {
            this.architectures = architectures;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCodeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        public Builder setDeadLetterConfig(@Nullable FunctionDeadLetterConfig deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironment(@Nullable FunctionEnvironment environment) {
            this.environment = environment;
            return this;
        }

        public Builder setFileSystemConfigs(@Nullable List<FunctionFileSystemConfig> fileSystemConfigs) {
            this.fileSystemConfigs = fileSystemConfigs;
            return this;
        }

        public Builder setHandler(@Nullable String handler) {
            this.handler = handler;
            return this;
        }

        public Builder setImageConfig(@Nullable FunctionImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setLayers(@Nullable List<String> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setMemorySize(@Nullable Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        public Builder setPackageType(@Nullable FunctionPackageType packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setReservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public Builder setRuntime(@Nullable String runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setTags(@Nullable List<FunctionTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTracingConfig(@Nullable FunctionTracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable FunctionVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public GetFunctionResult build() {
            return new GetFunctionResult(architectures, arn, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfigs, handler, imageConfig, kmsKeyArn, layers, memorySize, packageType, reservedConcurrentExecutions, role, runtime, tags, timeout, tracingConfig, vpcConfig);
        }
    }
}
