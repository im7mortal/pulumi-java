// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class FlexibleAppVersionManualScaling {
    /**
     * Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = ["manual_scaling"[0].instances]` to prevent drift detection.
     * 
     */
    private final Integer instances;

    @OutputCustomType.Constructor({"instances"})
    private FlexibleAppVersionManualScaling(Integer instances) {
        this.instances = Objects.requireNonNull(instances);
    }

    /**
     * Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = ["manual_scaling"[0].instances]` to prevent drift detection.
     * 
    */
    public Integer getInstances() {
        return this.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionManualScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instances;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionManualScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder setInstances(Integer instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public FlexibleAppVersionManualScaling build() {
            return new FlexibleAppVersionManualScaling(instances);
        }
    }
}
