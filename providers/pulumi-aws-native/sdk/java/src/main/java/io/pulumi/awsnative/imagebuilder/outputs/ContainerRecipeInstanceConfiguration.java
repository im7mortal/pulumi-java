// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.ContainerRecipeInstanceBlockDeviceMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerRecipeInstanceConfiguration {
    /**
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
     */
    private final @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
     */
    private final @Nullable String image;

    @OutputCustomType.Constructor({"blockDeviceMappings","image"})
    private ContainerRecipeInstanceConfiguration(
        @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings,
        @Nullable String image) {
        this.blockDeviceMappings = blockDeviceMappings;
        this.image = image;
    }

    /**
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
    */
    public List<ContainerRecipeInstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? List.of() : this.blockDeviceMappings;
    }
    /**
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
    */
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeInstanceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings;
        private @Nullable String image;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.image = defaults.image;
        }

        public Builder setBlockDeviceMappings(@Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }
        public ContainerRecipeInstanceConfiguration build() {
            return new ContainerRecipeInstanceConfiguration(blockDeviceMappings, image);
        }
    }
}
