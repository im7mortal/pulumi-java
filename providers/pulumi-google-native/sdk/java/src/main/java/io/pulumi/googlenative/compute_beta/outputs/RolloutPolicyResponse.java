// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class RolloutPolicyResponse {
    /**
     * An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
     */
    private final String defaultRolloutTime;
    /**
     * Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
     */
    private final Map<String,String> locationRolloutPolicies;

    @OutputCustomType.Constructor({"defaultRolloutTime","locationRolloutPolicies"})
    private RolloutPolicyResponse(
        String defaultRolloutTime,
        Map<String,String> locationRolloutPolicies) {
        this.defaultRolloutTime = Objects.requireNonNull(defaultRolloutTime);
        this.locationRolloutPolicies = Objects.requireNonNull(locationRolloutPolicies);
    }

    /**
     * An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
    */
    public String getDefaultRolloutTime() {
        return this.defaultRolloutTime;
    }
    /**
     * Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
    */
    public Map<String,String> getLocationRolloutPolicies() {
        return this.locationRolloutPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultRolloutTime;
        private Map<String,String> locationRolloutPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRolloutTime = defaults.defaultRolloutTime;
    	      this.locationRolloutPolicies = defaults.locationRolloutPolicies;
        }

        public Builder setDefaultRolloutTime(String defaultRolloutTime) {
            this.defaultRolloutTime = Objects.requireNonNull(defaultRolloutTime);
            return this;
        }

        public Builder setLocationRolloutPolicies(Map<String,String> locationRolloutPolicies) {
            this.locationRolloutPolicies = Objects.requireNonNull(locationRolloutPolicies);
            return this;
        }
        public RolloutPolicyResponse build() {
            return new RolloutPolicyResponse(defaultRolloutTime, locationRolloutPolicies);
        }
    }
}
