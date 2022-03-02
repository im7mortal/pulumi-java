// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.MetricCounterSetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricConfigurationResponse {
    /**
     * Host name for the IoT hub associated to the device.
     * 
     */
    private final List<MetricCounterSetResponse> counterSets;
    /**
     * The MDM account to which the counters should be pushed.
     * 
     */
    private final @Nullable String mdmAccount;
    /**
     * The MDM namespace to which the counters should be pushed. This is required if MDMAccount is specified
     * 
     */
    private final @Nullable String metricNameSpace;
    /**
     * The Resource ID on which the metrics should be pushed.
     * 
     */
    private final String resourceId;

    @OutputCustomType.Constructor({"counterSets","mdmAccount","metricNameSpace","resourceId"})
    private MetricConfigurationResponse(
        List<MetricCounterSetResponse> counterSets,
        @Nullable String mdmAccount,
        @Nullable String metricNameSpace,
        String resourceId) {
        this.counterSets = Objects.requireNonNull(counterSets);
        this.mdmAccount = mdmAccount;
        this.metricNameSpace = metricNameSpace;
        this.resourceId = Objects.requireNonNull(resourceId);
    }

    /**
     * Host name for the IoT hub associated to the device.
     * 
    */
    public List<MetricCounterSetResponse> getCounterSets() {
        return this.counterSets;
    }
    /**
     * The MDM account to which the counters should be pushed.
     * 
    */
    public Optional<String> getMdmAccount() {
        return Optional.ofNullable(this.mdmAccount);
    }
    /**
     * The MDM namespace to which the counters should be pushed. This is required if MDMAccount is specified
     * 
    */
    public Optional<String> getMetricNameSpace() {
        return Optional.ofNullable(this.metricNameSpace);
    }
    /**
     * The Resource ID on which the metrics should be pushed.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetricCounterSetResponse> counterSets;
        private @Nullable String mdmAccount;
        private @Nullable String metricNameSpace;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSets = defaults.counterSets;
    	      this.mdmAccount = defaults.mdmAccount;
    	      this.metricNameSpace = defaults.metricNameSpace;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setCounterSets(List<MetricCounterSetResponse> counterSets) {
            this.counterSets = Objects.requireNonNull(counterSets);
            return this;
        }

        public Builder setMdmAccount(@Nullable String mdmAccount) {
            this.mdmAccount = mdmAccount;
            return this;
        }

        public Builder setMetricNameSpace(@Nullable String metricNameSpace) {
            this.metricNameSpace = metricNameSpace;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public MetricConfigurationResponse build() {
            return new MetricConfigurationResponse(counterSets, mdmAccount, metricNameSpace, resourceId);
        }
    }
}
