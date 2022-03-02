// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IosTestLoopResponse {
    /**
     * Bundle ID of the app.
     * 
     */
    private final String bundleId;

    @OutputCustomType.Constructor({"bundleId"})
    private IosTestLoopResponse(String bundleId) {
        this.bundleId = Objects.requireNonNull(bundleId);
    }

    /**
     * Bundle ID of the app.
     * 
    */
    public String getBundleId() {
        return this.bundleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bundleId;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
        }

        public Builder setBundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }
        public IosTestLoopResponse build() {
            return new IosTestLoopResponse(bundleId);
        }
    }
}
