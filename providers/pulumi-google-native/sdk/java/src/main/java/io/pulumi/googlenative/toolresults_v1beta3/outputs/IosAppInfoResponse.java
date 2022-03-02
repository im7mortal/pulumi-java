// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IosAppInfoResponse {
    /**
     * The name of the app. Required
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private IosAppInfoResponse(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The name of the app. Required
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosAppInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IosAppInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public IosAppInfoResponse build() {
            return new IosAppInfoResponse(name);
        }
    }
}
