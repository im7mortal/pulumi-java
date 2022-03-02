// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationPackageSupportUrlsResponse {
    /**
     * The government cloud support URL.
     * 
     */
    private final @Nullable String governmentCloud;
    /**
     * The public azure support URL.
     * 
     */
    private final @Nullable String publicAzure;

    @OutputCustomType.Constructor({"governmentCloud","publicAzure"})
    private ApplicationPackageSupportUrlsResponse(
        @Nullable String governmentCloud,
        @Nullable String publicAzure) {
        this.governmentCloud = governmentCloud;
        this.publicAzure = publicAzure;
    }

    /**
     * The government cloud support URL.
     * 
    */
    public Optional<String> getGovernmentCloud() {
        return Optional.ofNullable(this.governmentCloud);
    }
    /**
     * The public azure support URL.
     * 
    */
    public Optional<String> getPublicAzure() {
        return Optional.ofNullable(this.publicAzure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageSupportUrlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String governmentCloud;
        private @Nullable String publicAzure;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageSupportUrlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.governmentCloud = defaults.governmentCloud;
    	      this.publicAzure = defaults.publicAzure;
        }

        public Builder setGovernmentCloud(@Nullable String governmentCloud) {
            this.governmentCloud = governmentCloud;
            return this;
        }

        public Builder setPublicAzure(@Nullable String publicAzure) {
            this.publicAzure = publicAzure;
            return this;
        }
        public ApplicationPackageSupportUrlsResponse build() {
            return new ApplicationPackageSupportUrlsResponse(governmentCloud, publicAzure);
        }
    }
}
