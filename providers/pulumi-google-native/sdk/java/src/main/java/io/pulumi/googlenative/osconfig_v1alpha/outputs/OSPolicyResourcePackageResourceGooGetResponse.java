// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourcePackageResourceGooGetResponse {
    /**
     * Package name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private OSPolicyResourcePackageResourceGooGetResponse(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Package name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceGooGetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceGooGetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public OSPolicyResourcePackageResourceGooGetResponse build() {
            return new OSPolicyResourcePackageResourceGooGetResponse(name);
        }
    }
}
