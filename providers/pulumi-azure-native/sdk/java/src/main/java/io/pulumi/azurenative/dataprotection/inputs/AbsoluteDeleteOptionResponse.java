// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AbsoluteDeleteOptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AbsoluteDeleteOptionResponse Empty = new AbsoluteDeleteOptionResponse();

    @InputImport(name="duration", required=true)
    private final String duration;

    public String getDuration() {
        return this.duration;
    }

    @InputImport(name="objectType", required=true)
    private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    public AbsoluteDeleteOptionResponse(
        String duration,
        String objectType) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private AbsoluteDeleteOptionResponse() {
        this.duration = null;
        this.objectType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteDeleteOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteDeleteOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public AbsoluteDeleteOptionResponse build() {
            return new AbsoluteDeleteOptionResponse(duration, objectType);
        }
    }
}