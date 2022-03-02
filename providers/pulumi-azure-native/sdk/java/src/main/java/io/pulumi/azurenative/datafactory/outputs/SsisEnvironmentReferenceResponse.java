// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisEnvironmentReferenceResponse {
    /**
     * Environment folder name.
     * 
     */
    private final @Nullable String environmentFolderName;
    /**
     * Environment name.
     * 
     */
    private final @Nullable String environmentName;
    /**
     * Environment reference id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Reference type
     * 
     */
    private final @Nullable String referenceType;

    @OutputCustomType.Constructor({"environmentFolderName","environmentName","id","referenceType"})
    private SsisEnvironmentReferenceResponse(
        @Nullable String environmentFolderName,
        @Nullable String environmentName,
        @Nullable Double id,
        @Nullable String referenceType) {
        this.environmentFolderName = environmentFolderName;
        this.environmentName = environmentName;
        this.id = id;
        this.referenceType = referenceType;
    }

    /**
     * Environment folder name.
     * 
    */
    public Optional<String> getEnvironmentFolderName() {
        return Optional.ofNullable(this.environmentFolderName);
    }
    /**
     * Environment name.
     * 
    */
    public Optional<String> getEnvironmentName() {
        return Optional.ofNullable(this.environmentName);
    }
    /**
     * Environment reference id.
     * 
    */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Reference type
     * 
    */
    public Optional<String> getReferenceType() {
        return Optional.ofNullable(this.referenceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisEnvironmentReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String environmentFolderName;
        private @Nullable String environmentName;
        private @Nullable Double id;
        private @Nullable String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisEnvironmentReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentFolderName = defaults.environmentFolderName;
    	      this.environmentName = defaults.environmentName;
    	      this.id = defaults.id;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setEnvironmentFolderName(@Nullable String environmentFolderName) {
            this.environmentFolderName = environmentFolderName;
            return this;
        }

        public Builder setEnvironmentName(@Nullable String environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setReferenceType(@Nullable String referenceType) {
            this.referenceType = referenceType;
            return this;
        }
        public SsisEnvironmentReferenceResponse build() {
            return new SsisEnvironmentReferenceResponse(environmentFolderName, environmentName, id, referenceType);
        }
    }
}
