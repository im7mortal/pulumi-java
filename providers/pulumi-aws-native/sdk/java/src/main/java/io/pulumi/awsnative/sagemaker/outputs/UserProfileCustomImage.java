// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserProfileCustomImage {
    /**
     * The Name of the AppImageConfig.
     * 
     */
    private final String appImageConfigName;
    /**
     * The name of the CustomImage. Must be unique to your account.
     * 
     */
    private final String imageName;
    /**
     * The version number of the CustomImage.
     * 
     */
    private final @Nullable Integer imageVersionNumber;

    @OutputCustomType.Constructor({"appImageConfigName","imageName","imageVersionNumber"})
    private UserProfileCustomImage(
        String appImageConfigName,
        String imageName,
        @Nullable Integer imageVersionNumber) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
        this.imageName = Objects.requireNonNull(imageName);
        this.imageVersionNumber = imageVersionNumber;
    }

    /**
     * The Name of the AppImageConfig.
     * 
     */
    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }
    /**
     * The name of the CustomImage. Must be unique to your account.
     * 
     */
    public String getImageName() {
        return this.imageName;
    }
    /**
     * The version number of the CustomImage.
     * 
     */
    public Optional<Integer> getImageVersionNumber() {
        return Optional.ofNullable(this.imageVersionNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileCustomImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appImageConfigName;
        private String imageName;
        private @Nullable Integer imageVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileCustomImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.imageName = defaults.imageName;
    	      this.imageVersionNumber = defaults.imageVersionNumber;
        }

        public Builder setAppImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setImageVersionNumber(@Nullable Integer imageVersionNumber) {
            this.imageVersionNumber = imageVersionNumber;
            return this;
        }

        public UserProfileCustomImage build() {
            return new UserProfileCustomImage(appImageConfigName, imageName, imageVersionNumber);
        }
    }
}
