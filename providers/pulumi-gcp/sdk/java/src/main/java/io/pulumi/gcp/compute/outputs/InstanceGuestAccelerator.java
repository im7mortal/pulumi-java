// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceGuestAccelerator {
    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    private final Integer count;
    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"count","type"})
    private InstanceGuestAccelerator(
        Integer count,
        String type) {
        this.count = Objects.requireNonNull(count);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * The type of reservation from which this instance can consume resources.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public InstanceGuestAccelerator build() {
            return new InstanceGuestAccelerator(count, type);
        }
    }
}
