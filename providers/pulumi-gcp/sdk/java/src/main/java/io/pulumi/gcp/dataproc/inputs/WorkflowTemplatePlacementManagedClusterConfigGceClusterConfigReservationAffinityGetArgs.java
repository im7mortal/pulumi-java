// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs();

    /**
     * Optional. Type of reservation to consume Possible values: TYPE_UNSPECIFIED, NO_RESERVATION, ANY_RESERVATION, SPECIFIC_RESERVATION
     * 
     */
    @InputImport(name="consumeReservationType")
    private final @Nullable Input<String> consumeReservationType;

    public Input<String> getConsumeReservationType() {
        return this.consumeReservationType == null ? Input.empty() : this.consumeReservationType;
    }

    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs(
        @Nullable Input<String> consumeReservationType,
        @Nullable Input<String> key,
        @Nullable Input<List<String>> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs() {
        this.consumeReservationType = Input.empty();
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consumeReservationType;
        private @Nullable Input<String> key;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(@Nullable Input<String> consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder setConsumeReservationType(@Nullable String consumeReservationType) {
            this.consumeReservationType = Input.ofNullable(consumeReservationType);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityGetArgs(consumeReservationType, key, values);
        }
    }
}