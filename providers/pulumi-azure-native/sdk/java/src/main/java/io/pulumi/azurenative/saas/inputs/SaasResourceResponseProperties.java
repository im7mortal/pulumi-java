// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.inputs;

import io.pulumi.azurenative.saas.inputs.SaasPropertiesResponseTerm;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SaasResourceResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final SaasResourceResponseProperties Empty = new SaasResourceResponseProperties();

    @InputImport(name="autoRenew")
    private final @Nullable Boolean autoRenew;

    public Optional<Boolean> getAutoRenew() {
        return this.autoRenew == null ? Optional.empty() : Optional.ofNullable(this.autoRenew);
    }

    @InputImport(name="created", required=true)
    private final String created;

    public String getCreated() {
        return this.created;
    }

    @InputImport(name="isFreeTrial")
    private final @Nullable Boolean isFreeTrial;

    public Optional<Boolean> getIsFreeTrial() {
        return this.isFreeTrial == null ? Optional.empty() : Optional.ofNullable(this.isFreeTrial);
    }

    @InputImport(name="lastModified")
    private final @Nullable String lastModified;

    public Optional<String> getLastModified() {
        return this.lastModified == null ? Optional.empty() : Optional.ofNullable(this.lastModified);
    }

    @InputImport(name="offerId")
    private final @Nullable String offerId;

    public Optional<String> getOfferId() {
        return this.offerId == null ? Optional.empty() : Optional.ofNullable(this.offerId);
    }

    @InputImport(name="paymentChannelMetadata")
    private final @Nullable Map<String,String> paymentChannelMetadata;

    public Map<String,String> getPaymentChannelMetadata() {
        return this.paymentChannelMetadata == null ? Map.of() : this.paymentChannelMetadata;
    }

    @InputImport(name="paymentChannelType")
    private final @Nullable String paymentChannelType;

    public Optional<String> getPaymentChannelType() {
        return this.paymentChannelType == null ? Optional.empty() : Optional.ofNullable(this.paymentChannelType);
    }

    @InputImport(name="publisherId")
    private final @Nullable String publisherId;

    public Optional<String> getPublisherId() {
        return this.publisherId == null ? Optional.empty() : Optional.ofNullable(this.publisherId);
    }

    @InputImport(name="publisherTestEnvironment")
    private final @Nullable String publisherTestEnvironment;

    public Optional<String> getPublisherTestEnvironment() {
        return this.publisherTestEnvironment == null ? Optional.empty() : Optional.ofNullable(this.publisherTestEnvironment);
    }

    @InputImport(name="quantity")
    private final @Nullable Double quantity;

    public Optional<Double> getQuantity() {
        return this.quantity == null ? Optional.empty() : Optional.ofNullable(this.quantity);
    }

    @InputImport(name="saasResourceName")
    private final @Nullable String saasResourceName;

    public Optional<String> getSaasResourceName() {
        return this.saasResourceName == null ? Optional.empty() : Optional.ofNullable(this.saasResourceName);
    }

    @InputImport(name="saasSessionId")
    private final @Nullable String saasSessionId;

    public Optional<String> getSaasSessionId() {
        return this.saasSessionId == null ? Optional.empty() : Optional.ofNullable(this.saasSessionId);
    }

    @InputImport(name="saasSubscriptionId")
    private final @Nullable String saasSubscriptionId;

    public Optional<String> getSaasSubscriptionId() {
        return this.saasSubscriptionId == null ? Optional.empty() : Optional.ofNullable(this.saasSubscriptionId);
    }

    @InputImport(name="skuId")
    private final @Nullable String skuId;

    public Optional<String> getSkuId() {
        return this.skuId == null ? Optional.empty() : Optional.ofNullable(this.skuId);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="term")
    private final @Nullable SaasPropertiesResponseTerm term;

    public Optional<SaasPropertiesResponseTerm> getTerm() {
        return this.term == null ? Optional.empty() : Optional.ofNullable(this.term);
    }

    @InputImport(name="termId")
    private final @Nullable String termId;

    public Optional<String> getTermId() {
        return this.termId == null ? Optional.empty() : Optional.ofNullable(this.termId);
    }

    public SaasResourceResponseProperties(
        @Nullable Boolean autoRenew,
        String created,
        @Nullable Boolean isFreeTrial,
        @Nullable String lastModified,
        @Nullable String offerId,
        @Nullable Map<String,String> paymentChannelMetadata,
        @Nullable String paymentChannelType,
        @Nullable String publisherId,
        @Nullable String publisherTestEnvironment,
        @Nullable Double quantity,
        @Nullable String saasResourceName,
        @Nullable String saasSessionId,
        @Nullable String saasSubscriptionId,
        @Nullable String skuId,
        @Nullable String status,
        @Nullable SaasPropertiesResponseTerm term,
        @Nullable String termId) {
        this.autoRenew = autoRenew;
        this.created = Objects.requireNonNull(created, "expected parameter 'created' to be non-null");
        this.isFreeTrial = isFreeTrial;
        this.lastModified = lastModified;
        this.offerId = offerId;
        this.paymentChannelMetadata = paymentChannelMetadata;
        this.paymentChannelType = paymentChannelType;
        this.publisherId = publisherId;
        this.publisherTestEnvironment = publisherTestEnvironment;
        this.quantity = quantity;
        this.saasResourceName = saasResourceName;
        this.saasSessionId = saasSessionId;
        this.saasSubscriptionId = saasSubscriptionId;
        this.skuId = skuId;
        this.status = status;
        this.term = term;
        this.termId = termId;
    }

    private SaasResourceResponseProperties() {
        this.autoRenew = null;
        this.created = null;
        this.isFreeTrial = null;
        this.lastModified = null;
        this.offerId = null;
        this.paymentChannelMetadata = Map.of();
        this.paymentChannelType = null;
        this.publisherId = null;
        this.publisherTestEnvironment = null;
        this.quantity = null;
        this.saasResourceName = null;
        this.saasSessionId = null;
        this.saasSubscriptionId = null;
        this.skuId = null;
        this.status = null;
        this.term = null;
        this.termId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SaasResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoRenew;
        private String created;
        private @Nullable Boolean isFreeTrial;
        private @Nullable String lastModified;
        private @Nullable String offerId;
        private @Nullable Map<String,String> paymentChannelMetadata;
        private @Nullable String paymentChannelType;
        private @Nullable String publisherId;
        private @Nullable String publisherTestEnvironment;
        private @Nullable Double quantity;
        private @Nullable String saasResourceName;
        private @Nullable String saasSessionId;
        private @Nullable String saasSubscriptionId;
        private @Nullable String skuId;
        private @Nullable String status;
        private @Nullable SaasPropertiesResponseTerm term;
        private @Nullable String termId;

        public Builder() {
    	      // Empty
        }

        public Builder(SaasResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.created = defaults.created;
    	      this.isFreeTrial = defaults.isFreeTrial;
    	      this.lastModified = defaults.lastModified;
    	      this.offerId = defaults.offerId;
    	      this.paymentChannelMetadata = defaults.paymentChannelMetadata;
    	      this.paymentChannelType = defaults.paymentChannelType;
    	      this.publisherId = defaults.publisherId;
    	      this.publisherTestEnvironment = defaults.publisherTestEnvironment;
    	      this.quantity = defaults.quantity;
    	      this.saasResourceName = defaults.saasResourceName;
    	      this.saasSessionId = defaults.saasSessionId;
    	      this.saasSubscriptionId = defaults.saasSubscriptionId;
    	      this.skuId = defaults.skuId;
    	      this.status = defaults.status;
    	      this.term = defaults.term;
    	      this.termId = defaults.termId;
        }

        public Builder setAutoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setIsFreeTrial(@Nullable Boolean isFreeTrial) {
            this.isFreeTrial = isFreeTrial;
            return this;
        }

        public Builder setLastModified(@Nullable String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder setOfferId(@Nullable String offerId) {
            this.offerId = offerId;
            return this;
        }

        public Builder setPaymentChannelMetadata(@Nullable Map<String,String> paymentChannelMetadata) {
            this.paymentChannelMetadata = paymentChannelMetadata;
            return this;
        }

        public Builder setPaymentChannelType(@Nullable String paymentChannelType) {
            this.paymentChannelType = paymentChannelType;
            return this;
        }

        public Builder setPublisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public Builder setPublisherTestEnvironment(@Nullable String publisherTestEnvironment) {
            this.publisherTestEnvironment = publisherTestEnvironment;
            return this;
        }

        public Builder setQuantity(@Nullable Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setSaasResourceName(@Nullable String saasResourceName) {
            this.saasResourceName = saasResourceName;
            return this;
        }

        public Builder setSaasSessionId(@Nullable String saasSessionId) {
            this.saasSessionId = saasSessionId;
            return this;
        }

        public Builder setSaasSubscriptionId(@Nullable String saasSubscriptionId) {
            this.saasSubscriptionId = saasSubscriptionId;
            return this;
        }

        public Builder setSkuId(@Nullable String skuId) {
            this.skuId = skuId;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTerm(@Nullable SaasPropertiesResponseTerm term) {
            this.term = term;
            return this;
        }

        public Builder setTermId(@Nullable String termId) {
            this.termId = termId;
            return this;
        }

        public SaasResourceResponseProperties build() {
            return new SaasResourceResponseProperties(autoRenew, created, isFreeTrial, lastModified, offerId, paymentChannelMetadata, paymentChannelType, publisherId, publisherTestEnvironment, quantity, saasResourceName, saasSessionId, saasSubscriptionId, skuId, status, term, termId);
        }
    }
}