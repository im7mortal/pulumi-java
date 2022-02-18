// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.enums.ServiceImageRepositoryImageRepositoryType;
import io.pulumi.awsnative.apprunner.outputs.ServiceImageConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceImageRepository {
    private final @Nullable ServiceImageConfiguration imageConfiguration;
    /**
     * Image Identifier
     * 
     */
    private final String imageIdentifier;
    /**
     * Image Repository Type
     * 
     */
    private final ServiceImageRepositoryImageRepositoryType imageRepositoryType;

    @OutputCustomType.Constructor({"imageConfiguration","imageIdentifier","imageRepositoryType"})
    private ServiceImageRepository(
        @Nullable ServiceImageConfiguration imageConfiguration,
        String imageIdentifier,
        ServiceImageRepositoryImageRepositoryType imageRepositoryType) {
        this.imageConfiguration = imageConfiguration;
        this.imageIdentifier = Objects.requireNonNull(imageIdentifier);
        this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType);
    }

    public Optional<ServiceImageConfiguration> getImageConfiguration() {
        return Optional.ofNullable(this.imageConfiguration);
    }
    /**
     * Image Identifier
     * 
     */
    public String getImageIdentifier() {
        return this.imageIdentifier;
    }
    /**
     * Image Repository Type
     * 
     */
    public ServiceImageRepositoryImageRepositoryType getImageRepositoryType() {
        return this.imageRepositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceImageRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceImageConfiguration imageConfiguration;
        private String imageIdentifier;
        private ServiceImageRepositoryImageRepositoryType imageRepositoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceImageRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageConfiguration = defaults.imageConfiguration;
    	      this.imageIdentifier = defaults.imageIdentifier;
    	      this.imageRepositoryType = defaults.imageRepositoryType;
        }

        public Builder setImageConfiguration(@Nullable ServiceImageConfiguration imageConfiguration) {
            this.imageConfiguration = imageConfiguration;
            return this;
        }

        public Builder setImageIdentifier(String imageIdentifier) {
            this.imageIdentifier = Objects.requireNonNull(imageIdentifier);
            return this;
        }

        public Builder setImageRepositoryType(ServiceImageRepositoryImageRepositoryType imageRepositoryType) {
            this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType);
            return this;
        }

        public ServiceImageRepository build() {
            return new ServiceImageRepository(imageConfiguration, imageIdentifier, imageRepositoryType);
        }
    }
}
