// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGrantResult {
    /**
     * Arn of the grant.
     * 
     */
    private final @Nullable String grantArn;
    /**
     * Name for the created Grant.
     * 
     */
    private final @Nullable String grantName;
    /**
     * Home region for the created grant.
     * 
     */
    private final @Nullable String homeRegion;
    /**
     * License Arn for the grant.
     * 
     */
    private final @Nullable String licenseArn;
    private final @Nullable String status;
    /**
     * The version of the grant.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"grantArn","grantName","homeRegion","licenseArn","status","version"})
    private GetGrantResult(
        @Nullable String grantArn,
        @Nullable String grantName,
        @Nullable String homeRegion,
        @Nullable String licenseArn,
        @Nullable String status,
        @Nullable String version) {
        this.grantArn = grantArn;
        this.grantName = grantName;
        this.homeRegion = homeRegion;
        this.licenseArn = licenseArn;
        this.status = status;
        this.version = version;
    }

    /**
     * Arn of the grant.
     * 
    */
    public Optional<String> getGrantArn() {
        return Optional.ofNullable(this.grantArn);
    }
    /**
     * Name for the created Grant.
     * 
    */
    public Optional<String> getGrantName() {
        return Optional.ofNullable(this.grantName);
    }
    /**
     * Home region for the created grant.
     * 
    */
    public Optional<String> getHomeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }
    /**
     * License Arn for the grant.
     * 
    */
    public Optional<String> getLicenseArn() {
        return Optional.ofNullable(this.licenseArn);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The version of the grant.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String grantArn;
        private @Nullable String grantName;
        private @Nullable String homeRegion;
        private @Nullable String licenseArn;
        private @Nullable String status;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGrantResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grantArn = defaults.grantArn;
    	      this.grantName = defaults.grantName;
    	      this.homeRegion = defaults.homeRegion;
    	      this.licenseArn = defaults.licenseArn;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder setGrantArn(@Nullable String grantArn) {
            this.grantArn = grantArn;
            return this;
        }

        public Builder setGrantName(@Nullable String grantName) {
            this.grantName = grantName;
            return this;
        }

        public Builder setHomeRegion(@Nullable String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }

        public Builder setLicenseArn(@Nullable String licenseArn) {
            this.licenseArn = licenseArn;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetGrantResult build() {
            return new GetGrantResult(grantArn, grantName, homeRegion, licenseArn, status, version);
        }
    }
}
