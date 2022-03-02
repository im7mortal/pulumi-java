// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.outputs;

import io.pulumi.azurenative.marketplace.outputs.PlanResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateStoreOfferResult {
    /**
     * Private store offer creation date
     * 
     */
    private final String createdAt;
    /**
     * Identifier for purposes of race condition
     * 
     */
    private final @Nullable String eTag;
    /**
     * Icon File Uris
     * 
     */
    private final @Nullable Map<String,String> iconFileUris;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * Private store offer modification date
     * 
     */
    private final String modifiedAt;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * It will be displayed prominently in the marketplace
     * 
     */
    private final String offerDisplayName;
    /**
     * Offer plans
     * 
     */
    private final @Nullable List<PlanResponse> plans;
    /**
     * Private store unique id
     * 
     */
    private final String privateStoreId;
    /**
     * Publisher name that will be displayed prominently in the marketplace
     * 
     */
    private final String publisherDisplayName;
    /**
     * Plan ids limitation for this offer
     * 
     */
    private final @Nullable List<String> specificPlanIdsLimitation;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Offers unique id
     * 
     */
    private final String uniqueOfferId;
    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
     */
    private final @Nullable Boolean updateSuppressedDueIdempotence;

    @OutputCustomType.Constructor({"createdAt","eTag","iconFileUris","id","modifiedAt","name","offerDisplayName","plans","privateStoreId","publisherDisplayName","specificPlanIdsLimitation","type","uniqueOfferId","updateSuppressedDueIdempotence"})
    private GetPrivateStoreOfferResult(
        String createdAt,
        @Nullable String eTag,
        @Nullable Map<String,String> iconFileUris,
        String id,
        String modifiedAt,
        String name,
        String offerDisplayName,
        @Nullable List<PlanResponse> plans,
        String privateStoreId,
        String publisherDisplayName,
        @Nullable List<String> specificPlanIdsLimitation,
        String type,
        String uniqueOfferId,
        @Nullable Boolean updateSuppressedDueIdempotence) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.eTag = eTag;
        this.iconFileUris = iconFileUris;
        this.id = Objects.requireNonNull(id);
        this.modifiedAt = Objects.requireNonNull(modifiedAt);
        this.name = Objects.requireNonNull(name);
        this.offerDisplayName = Objects.requireNonNull(offerDisplayName);
        this.plans = plans;
        this.privateStoreId = Objects.requireNonNull(privateStoreId);
        this.publisherDisplayName = Objects.requireNonNull(publisherDisplayName);
        this.specificPlanIdsLimitation = specificPlanIdsLimitation;
        this.type = Objects.requireNonNull(type);
        this.uniqueOfferId = Objects.requireNonNull(uniqueOfferId);
        this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
    }

    /**
     * Private store offer creation date
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Identifier for purposes of race condition
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Icon File Uris
     * 
    */
    public Map<String,String> getIconFileUris() {
        return this.iconFileUris == null ? Map.of() : this.iconFileUris;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Private store offer modification date
     * 
    */
    public String getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * It will be displayed prominently in the marketplace
     * 
    */
    public String getOfferDisplayName() {
        return this.offerDisplayName;
    }
    /**
     * Offer plans
     * 
    */
    public List<PlanResponse> getPlans() {
        return this.plans == null ? List.of() : this.plans;
    }
    /**
     * Private store unique id
     * 
    */
    public String getPrivateStoreId() {
        return this.privateStoreId;
    }
    /**
     * Publisher name that will be displayed prominently in the marketplace
     * 
    */
    public String getPublisherDisplayName() {
        return this.publisherDisplayName;
    }
    /**
     * Plan ids limitation for this offer
     * 
    */
    public List<String> getSpecificPlanIdsLimitation() {
        return this.specificPlanIdsLimitation == null ? List.of() : this.specificPlanIdsLimitation;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Offers unique id
     * 
    */
    public String getUniqueOfferId() {
        return this.uniqueOfferId;
    }
    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
    */
    public Optional<Boolean> getUpdateSuppressedDueIdempotence() {
        return Optional.ofNullable(this.updateSuppressedDueIdempotence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreOfferResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private @Nullable String eTag;
        private @Nullable Map<String,String> iconFileUris;
        private String id;
        private String modifiedAt;
        private String name;
        private String offerDisplayName;
        private @Nullable List<PlanResponse> plans;
        private String privateStoreId;
        private String publisherDisplayName;
        private @Nullable List<String> specificPlanIdsLimitation;
        private String type;
        private String uniqueOfferId;
        private @Nullable Boolean updateSuppressedDueIdempotence;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreOfferResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.eTag = defaults.eTag;
    	      this.iconFileUris = defaults.iconFileUris;
    	      this.id = defaults.id;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.name = defaults.name;
    	      this.offerDisplayName = defaults.offerDisplayName;
    	      this.plans = defaults.plans;
    	      this.privateStoreId = defaults.privateStoreId;
    	      this.publisherDisplayName = defaults.publisherDisplayName;
    	      this.specificPlanIdsLimitation = defaults.specificPlanIdsLimitation;
    	      this.type = defaults.type;
    	      this.uniqueOfferId = defaults.uniqueOfferId;
    	      this.updateSuppressedDueIdempotence = defaults.updateSuppressedDueIdempotence;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setIconFileUris(@Nullable Map<String,String> iconFileUris) {
            this.iconFileUris = iconFileUris;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setModifiedAt(String modifiedAt) {
            this.modifiedAt = Objects.requireNonNull(modifiedAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOfferDisplayName(String offerDisplayName) {
            this.offerDisplayName = Objects.requireNonNull(offerDisplayName);
            return this;
        }

        public Builder setPlans(@Nullable List<PlanResponse> plans) {
            this.plans = plans;
            return this;
        }

        public Builder setPrivateStoreId(String privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }

        public Builder setPublisherDisplayName(String publisherDisplayName) {
            this.publisherDisplayName = Objects.requireNonNull(publisherDisplayName);
            return this;
        }

        public Builder setSpecificPlanIdsLimitation(@Nullable List<String> specificPlanIdsLimitation) {
            this.specificPlanIdsLimitation = specificPlanIdsLimitation;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueOfferId(String uniqueOfferId) {
            this.uniqueOfferId = Objects.requireNonNull(uniqueOfferId);
            return this;
        }

        public Builder setUpdateSuppressedDueIdempotence(@Nullable Boolean updateSuppressedDueIdempotence) {
            this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
            return this;
        }
        public GetPrivateStoreOfferResult build() {
            return new GetPrivateStoreOfferResult(createdAt, eTag, iconFileUris, id, modifiedAt, name, offerDisplayName, plans, privateStoreId, publisherDisplayName, specificPlanIdsLimitation, type, uniqueOfferId, updateSuppressedDueIdempotence);
        }
    }
}
