// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRunOpV2ResourceRequirementsResponse {
    /**
     * Determines whether CPU should be throttled or not outside of requests.
     * 
     */
    private final Boolean cpuIdle;
    /**
     * Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final Map<String,String> limits;

    @OutputCustomType.Constructor({"cpuIdle","limits"})
    private GoogleCloudRunOpV2ResourceRequirementsResponse(
        Boolean cpuIdle,
        Map<String,String> limits) {
        this.cpuIdle = Objects.requireNonNull(cpuIdle);
        this.limits = Objects.requireNonNull(limits);
    }

    /**
     * Determines whether CPU should be throttled or not outside of requests.
     * 
    */
    public Boolean getCpuIdle() {
        return this.cpuIdle;
    }
    /**
     * Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
    */
    public Map<String,String> getLimits() {
        return this.limits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuIdle;
        private Map<String,String> limits;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuIdle = defaults.cpuIdle;
    	      this.limits = defaults.limits;
        }

        public Builder setCpuIdle(Boolean cpuIdle) {
            this.cpuIdle = Objects.requireNonNull(cpuIdle);
            return this;
        }

        public Builder setLimits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public GoogleCloudRunOpV2ResourceRequirementsResponse build() {
            return new GoogleCloudRunOpV2ResourceRequirementsResponse(cpuIdle, limits);
        }
    }
}
