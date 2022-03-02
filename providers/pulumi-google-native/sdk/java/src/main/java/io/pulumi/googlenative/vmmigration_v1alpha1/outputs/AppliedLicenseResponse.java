// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AppliedLicenseResponse {
    /**
     * The OS license returned from the adaptation module's report.
     * 
     */
    private final String osLicense;
    /**
     * The license type that was used in OS adaptation.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"osLicense","type"})
    private AppliedLicenseResponse(
        String osLicense,
        String type) {
        this.osLicense = Objects.requireNonNull(osLicense);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The OS license returned from the adaptation module's report.
     * 
    */
    public String getOsLicense() {
        return this.osLicense;
    }
    /**
     * The license type that was used in OS adaptation.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppliedLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osLicense;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AppliedLicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osLicense = defaults.osLicense;
    	      this.type = defaults.type;
        }

        public Builder setOsLicense(String osLicense) {
            this.osLicense = Objects.requireNonNull(osLicense);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AppliedLicenseResponse build() {
            return new AppliedLicenseResponse(osLicense, type);
        }
    }
}
