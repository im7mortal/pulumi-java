// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPartnerRegistrationResult {
    private final @Nullable List<String> authorizedAzureSubscriptionIds;
    private final @Nullable String customerServiceUri;
    private final String id;
    private final String location;
    private final @Nullable String logoUri;
    private final @Nullable String longDescription;
    private final String name;
    private final @Nullable String partnerCustomerServiceExtension;
    private final @Nullable String partnerCustomerServiceNumber;
    private final @Nullable String partnerName;
    private final @Nullable String partnerResourceTypeDescription;
    private final @Nullable String partnerResourceTypeDisplayName;
    private final @Nullable String partnerResourceTypeName;
    private final String provisioningState;
    private final @Nullable String setupUri;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable String visibilityState;

    @OutputCustomType.Constructor({"authorizedAzureSubscriptionIds","customerServiceUri","id","location","logoUri","longDescription","name","partnerCustomerServiceExtension","partnerCustomerServiceNumber","partnerName","partnerResourceTypeDescription","partnerResourceTypeDisplayName","partnerResourceTypeName","provisioningState","setupUri","systemData","tags","type","visibilityState"})
    private GetPartnerRegistrationResult(
        @Nullable List<String> authorizedAzureSubscriptionIds,
        @Nullable String customerServiceUri,
        String id,
        String location,
        @Nullable String logoUri,
        @Nullable String longDescription,
        String name,
        @Nullable String partnerCustomerServiceExtension,
        @Nullable String partnerCustomerServiceNumber,
        @Nullable String partnerName,
        @Nullable String partnerResourceTypeDescription,
        @Nullable String partnerResourceTypeDisplayName,
        @Nullable String partnerResourceTypeName,
        String provisioningState,
        @Nullable String setupUri,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String visibilityState) {
        this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
        this.customerServiceUri = customerServiceUri;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.logoUri = logoUri;
        this.longDescription = longDescription;
        this.name = Objects.requireNonNull(name);
        this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
        this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
        this.partnerName = partnerName;
        this.partnerResourceTypeDescription = partnerResourceTypeDescription;
        this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
        this.partnerResourceTypeName = partnerResourceTypeName;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.setupUri = setupUri;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.visibilityState = visibilityState;
    }

    public List<String> getAuthorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds == null ? List.of() : this.authorizedAzureSubscriptionIds;
    }
    public Optional<String> getCustomerServiceUri() {
        return Optional.ofNullable(this.customerServiceUri);
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getLogoUri() {
        return Optional.ofNullable(this.logoUri);
    }
    public Optional<String> getLongDescription() {
        return Optional.ofNullable(this.longDescription);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPartnerCustomerServiceExtension() {
        return Optional.ofNullable(this.partnerCustomerServiceExtension);
    }
    public Optional<String> getPartnerCustomerServiceNumber() {
        return Optional.ofNullable(this.partnerCustomerServiceNumber);
    }
    public Optional<String> getPartnerName() {
        return Optional.ofNullable(this.partnerName);
    }
    public Optional<String> getPartnerResourceTypeDescription() {
        return Optional.ofNullable(this.partnerResourceTypeDescription);
    }
    public Optional<String> getPartnerResourceTypeDisplayName() {
        return Optional.ofNullable(this.partnerResourceTypeDisplayName);
    }
    public Optional<String> getPartnerResourceTypeName() {
        return Optional.ofNullable(this.partnerResourceTypeName);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSetupUri() {
        return Optional.ofNullable(this.setupUri);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVisibilityState() {
        return Optional.ofNullable(this.visibilityState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerRegistrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authorizedAzureSubscriptionIds;
        private @Nullable String customerServiceUri;
        private String id;
        private String location;
        private @Nullable String logoUri;
        private @Nullable String longDescription;
        private String name;
        private @Nullable String partnerCustomerServiceExtension;
        private @Nullable String partnerCustomerServiceNumber;
        private @Nullable String partnerName;
        private @Nullable String partnerResourceTypeDescription;
        private @Nullable String partnerResourceTypeDisplayName;
        private @Nullable String partnerResourceTypeName;
        private String provisioningState;
        private @Nullable String setupUri;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String visibilityState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerRegistrationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedAzureSubscriptionIds = defaults.authorizedAzureSubscriptionIds;
    	      this.customerServiceUri = defaults.customerServiceUri;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logoUri = defaults.logoUri;
    	      this.longDescription = defaults.longDescription;
    	      this.name = defaults.name;
    	      this.partnerCustomerServiceExtension = defaults.partnerCustomerServiceExtension;
    	      this.partnerCustomerServiceNumber = defaults.partnerCustomerServiceNumber;
    	      this.partnerName = defaults.partnerName;
    	      this.partnerResourceTypeDescription = defaults.partnerResourceTypeDescription;
    	      this.partnerResourceTypeDisplayName = defaults.partnerResourceTypeDisplayName;
    	      this.partnerResourceTypeName = defaults.partnerResourceTypeName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.setupUri = defaults.setupUri;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.visibilityState = defaults.visibilityState;
        }

        public Builder setAuthorizedAzureSubscriptionIds(@Nullable List<String> authorizedAzureSubscriptionIds) {
            this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
            return this;
        }

        public Builder setCustomerServiceUri(@Nullable String customerServiceUri) {
            this.customerServiceUri = customerServiceUri;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLogoUri(@Nullable String logoUri) {
            this.logoUri = logoUri;
            return this;
        }

        public Builder setLongDescription(@Nullable String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerCustomerServiceExtension(@Nullable String partnerCustomerServiceExtension) {
            this.partnerCustomerServiceExtension = partnerCustomerServiceExtension;
            return this;
        }

        public Builder setPartnerCustomerServiceNumber(@Nullable String partnerCustomerServiceNumber) {
            this.partnerCustomerServiceNumber = partnerCustomerServiceNumber;
            return this;
        }

        public Builder setPartnerName(@Nullable String partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public Builder setPartnerResourceTypeDescription(@Nullable String partnerResourceTypeDescription) {
            this.partnerResourceTypeDescription = partnerResourceTypeDescription;
            return this;
        }

        public Builder setPartnerResourceTypeDisplayName(@Nullable String partnerResourceTypeDisplayName) {
            this.partnerResourceTypeDisplayName = partnerResourceTypeDisplayName;
            return this;
        }

        public Builder setPartnerResourceTypeName(@Nullable String partnerResourceTypeName) {
            this.partnerResourceTypeName = partnerResourceTypeName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSetupUri(@Nullable String setupUri) {
            this.setupUri = setupUri;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVisibilityState(@Nullable String visibilityState) {
            this.visibilityState = visibilityState;
            return this;
        }

        public GetPartnerRegistrationResult build() {
            return new GetPartnerRegistrationResult(authorizedAzureSubscriptionIds, customerServiceUri, id, location, logoUri, longDescription, name, partnerCustomerServiceExtension, partnerCustomerServiceNumber, partnerName, partnerResourceTypeDescription, partnerResourceTypeDisplayName, partnerResourceTypeName, provisioningState, setupUri, systemData, tags, type, visibilityState);
        }
    }
}