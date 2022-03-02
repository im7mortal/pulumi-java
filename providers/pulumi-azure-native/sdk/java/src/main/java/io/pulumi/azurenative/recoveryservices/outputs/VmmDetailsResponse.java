// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VmmDetailsResponse {
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMM'.
     * 
     */
    private final String instanceType;

    @OutputCustomType.Constructor({"instanceType"})
    private VmmDetailsResponse(String instanceType) {
        this.instanceType = Objects.requireNonNull(instanceType);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMM'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public VmmDetailsResponse build() {
            return new VmmDetailsResponse(instanceType);
        }
    }
}
