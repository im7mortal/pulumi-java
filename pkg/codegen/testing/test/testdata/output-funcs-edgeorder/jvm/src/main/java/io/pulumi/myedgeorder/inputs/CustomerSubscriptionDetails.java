// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.myedgeorder.inputs.CustomerSubscriptionRegisteredFeatures;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerSubscriptionDetails extends io.pulumi.resources.InvokeArgs {

    public static final CustomerSubscriptionDetails Empty = new CustomerSubscriptionDetails();

    @InputImport(name="locationPlacementId")
    private final @Nullable String locationPlacementId;

    public Optional<String> getLocationPlacementId() {
        return this.locationPlacementId == null ? Optional.empty() : Optional.ofNullable(this.locationPlacementId);
    }

    @InputImport(name="quotaId", required=true)
    private final String quotaId;

    public String getQuotaId() {
        return this.quotaId;
    }

    @InputImport(name="registeredFeatures")
    private final @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures;

    public List<CustomerSubscriptionRegisteredFeatures> getRegisteredFeatures() {
        return this.registeredFeatures == null ? List.of() : this.registeredFeatures;
    }

    public CustomerSubscriptionDetails(
        @Nullable String locationPlacementId,
        String quotaId,
        @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures) {
        this.locationPlacementId = locationPlacementId;
        this.quotaId = Objects.requireNonNull(quotaId, "expected parameter 'quotaId' to be non-null");
        this.registeredFeatures = registeredFeatures;
    }

    private CustomerSubscriptionDetails() {
        this.locationPlacementId = null;
        this.quotaId = null;
        this.registeredFeatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerSubscriptionDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String locationPlacementId;
        private String quotaId;
        private @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerSubscriptionDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationPlacementId = defaults.locationPlacementId;
    	      this.quotaId = defaults.quotaId;
    	      this.registeredFeatures = defaults.registeredFeatures;
        }

        public Builder setLocationPlacementId(@Nullable String locationPlacementId) {
            this.locationPlacementId = locationPlacementId;
            return this;
        }

        public Builder setQuotaId(String quotaId) {
            this.quotaId = Objects.requireNonNull(quotaId);
            return this;
        }

        public Builder setRegisteredFeatures(@Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures) {
            this.registeredFeatures = registeredFeatures;
            return this;
        }

        public CustomerSubscriptionDetails build() {
            return new CustomerSubscriptionDetails(locationPlacementId, quotaId, registeredFeatures);
        }
    }
}
