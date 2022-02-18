// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionBasicScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionBasicScalingGetArgs Empty = new StandardAppVersionBasicScalingGetArgs();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s". Defaults to 900s.
     * 
     */
    @InputImport(name="idleTimeout")
    private final @Nullable Input<String> idleTimeout;

    public Input<String> getIdleTimeout() {
        return this.idleTimeout == null ? Input.empty() : this.idleTimeout;
    }

    /**
     * Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
     */
    @InputImport(name="maxInstances", required=true)
    private final Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances;
    }

    public StandardAppVersionBasicScalingGetArgs(
        @Nullable Input<String> idleTimeout,
        Input<Integer> maxInstances) {
        this.idleTimeout = idleTimeout;
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
    }

    private StandardAppVersionBasicScalingGetArgs() {
        this.idleTimeout = Input.empty();
        this.maxInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionBasicScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> idleTimeout;
        private Input<Integer> maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionBasicScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder setIdleTimeout(@Nullable Input<String> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public Builder setIdleTimeout(@Nullable String idleTimeout) {
            this.idleTimeout = Input.ofNullable(idleTimeout);
            return this;
        }

        public Builder setMaxInstances(Input<Integer> maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }

        public Builder setMaxInstances(Integer maxInstances) {
            this.maxInstances = Input.of(Objects.requireNonNull(maxInstances));
            return this;
        }

        public StandardAppVersionBasicScalingGetArgs build() {
            return new StandardAppVersionBasicScalingGetArgs(idleTimeout, maxInstances);
        }
    }
}