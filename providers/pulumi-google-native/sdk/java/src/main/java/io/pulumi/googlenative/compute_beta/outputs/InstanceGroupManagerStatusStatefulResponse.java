// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerStatusStatefulResponse {
    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    private final Boolean hasStatefulConfig;
    /**
     * Status of per-instance configs on the instance.
     * 
     */
    private final InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse perInstanceConfigs;

    @OutputCustomType.Constructor({"hasStatefulConfig","perInstanceConfigs"})
    private InstanceGroupManagerStatusStatefulResponse(
        Boolean hasStatefulConfig,
        InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse perInstanceConfigs) {
        this.hasStatefulConfig = Objects.requireNonNull(hasStatefulConfig);
        this.perInstanceConfigs = Objects.requireNonNull(perInstanceConfigs);
    }

    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
    */
    public Boolean getHasStatefulConfig() {
        return this.hasStatefulConfig;
    }
    /**
     * Status of per-instance configs on the instance.
     * 
    */
    public InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse getPerInstanceConfigs() {
        return this.perInstanceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean hasStatefulConfig;
        private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse perInstanceConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasStatefulConfig = defaults.hasStatefulConfig;
    	      this.perInstanceConfigs = defaults.perInstanceConfigs;
        }

        public Builder setHasStatefulConfig(Boolean hasStatefulConfig) {
            this.hasStatefulConfig = Objects.requireNonNull(hasStatefulConfig);
            return this;
        }

        public Builder setPerInstanceConfigs(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse perInstanceConfigs) {
            this.perInstanceConfigs = Objects.requireNonNull(perInstanceConfigs);
            return this;
        }
        public InstanceGroupManagerStatusStatefulResponse build() {
            return new InstanceGroupManagerStatusStatefulResponse(hasStatefulConfig, perInstanceConfigs);
        }
    }
}
