// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigFileSystemConfig;
import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelSpec;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
 * 
 */
public final class AppImageConfigKernelGatewayImageConfig extends io.pulumi.resources.InvokeArgs {

    public static final AppImageConfigKernelGatewayImageConfig Empty = new AppImageConfigKernelGatewayImageConfig();

    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    @InputImport(name="fileSystemConfig")
    private final @Nullable AppImageConfigFileSystemConfig fileSystemConfig;

    public Optional<AppImageConfigFileSystemConfig> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Optional.empty() : Optional.ofNullable(this.fileSystemConfig);
    }

    /**
     * The specification of the Jupyter kernels in the image.
     * 
     */
    @InputImport(name="kernelSpecs", required=true)
    private final List<AppImageConfigKernelSpec> kernelSpecs;

    public List<AppImageConfigKernelSpec> getKernelSpecs() {
        return this.kernelSpecs;
    }

    public AppImageConfigKernelGatewayImageConfig(
        @Nullable AppImageConfigFileSystemConfig fileSystemConfig,
        List<AppImageConfigKernelSpec> kernelSpecs) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpecs = Objects.requireNonNull(kernelSpecs, "expected parameter 'kernelSpecs' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfig() {
        this.fileSystemConfig = null;
        this.kernelSpecs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppImageConfigFileSystemConfig fileSystemConfig;
        private List<AppImageConfigKernelSpec> kernelSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpecs = defaults.kernelSpecs;
        }

        public Builder setFileSystemConfig(@Nullable AppImageConfigFileSystemConfig fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder setKernelSpecs(List<AppImageConfigKernelSpec> kernelSpecs) {
            this.kernelSpecs = Objects.requireNonNull(kernelSpecs);
            return this;
        }

        public AppImageConfigKernelGatewayImageConfig build() {
            return new AppImageConfigKernelGatewayImageConfig(fileSystemConfig, kernelSpecs);
        }
    }
}
