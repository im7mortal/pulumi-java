// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1AssociationInfoResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CommitmentSettingsResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ParameterResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ProvisionedServiceResponse;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1TrialSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEntitlementResult {
    /**
     * Association information to other entitlements.
     * 
     */
    private final GoogleCloudChannelV1AssociationInfoResponse associationInfo;
    /**
     * Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
     */
    private final GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings;
    /**
     * The time at which the entitlement is created.
     * 
     */
    private final String createTime;
    /**
     * Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
     */
    private final String name;
    /**
     * The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
     */
    private final String offer;
    /**
     * Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
     */
    private final List<GoogleCloudChannelV1ParameterResponse> parameters;
    /**
     * Service provisioning details for the entitlement.
     * 
     */
    private final GoogleCloudChannelV1ProvisionedServiceResponse provisionedService;
    /**
     * Current provisioning state of the entitlement.
     * 
     */
    private final String provisioningState;
    /**
     * Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
     * 
     */
    private final String purchaseOrderId;
    /**
     * Enumerable of all current suspension reasons for an entitlement.
     * 
     */
    private final List<String> suspensionReasons;
    /**
     * Settings for trial offers.
     * 
     */
    private final GoogleCloudChannelV1TrialSettingsResponse trialSettings;
    /**
     * The time at which the entitlement is updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"associationInfo","commitmentSettings","createTime","name","offer","parameters","provisionedService","provisioningState","purchaseOrderId","suspensionReasons","trialSettings","updateTime"})
    private GetEntitlementResult(
        GoogleCloudChannelV1AssociationInfoResponse associationInfo,
        GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings,
        String createTime,
        String name,
        String offer,
        List<GoogleCloudChannelV1ParameterResponse> parameters,
        GoogleCloudChannelV1ProvisionedServiceResponse provisionedService,
        String provisioningState,
        String purchaseOrderId,
        List<String> suspensionReasons,
        GoogleCloudChannelV1TrialSettingsResponse trialSettings,
        String updateTime) {
        this.associationInfo = Objects.requireNonNull(associationInfo);
        this.commitmentSettings = Objects.requireNonNull(commitmentSettings);
        this.createTime = Objects.requireNonNull(createTime);
        this.name = Objects.requireNonNull(name);
        this.offer = Objects.requireNonNull(offer);
        this.parameters = Objects.requireNonNull(parameters);
        this.provisionedService = Objects.requireNonNull(provisionedService);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.purchaseOrderId = Objects.requireNonNull(purchaseOrderId);
        this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
        this.trialSettings = Objects.requireNonNull(trialSettings);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * Association information to other entitlements.
     * 
    */
    public GoogleCloudChannelV1AssociationInfoResponse getAssociationInfo() {
        return this.associationInfo;
    }
    /**
     * Commitment settings for a commitment-based Offer. Required for commitment based offers.
     * 
    */
    public GoogleCloudChannelV1CommitmentSettingsResponse getCommitmentSettings() {
        return this.commitmentSettings;
    }
    /**
     * The time at which the entitlement is created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Resource name of an entitlement in the form: accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The offer resource name for which the entitlement is to be created. Takes the form: accounts/{account_id}/offers/{offer_id}.
     * 
    */
    public String getOffer() {
        return this.offer;
    }
    /**
     * Extended entitlement parameters. When creating an entitlement, valid parameter names and values are defined in the Offer.parameter_definitions. The response may include the following output-only Parameters: - assigned_units: The number of licenses assigned to users. - max_units: The maximum assignable units for a flexible offer. - num_units: The total commitment for commitment-based offers.
     * 
    */
    public List<GoogleCloudChannelV1ParameterResponse> getParameters() {
        return this.parameters;
    }
    /**
     * Service provisioning details for the entitlement.
     * 
    */
    public GoogleCloudChannelV1ProvisionedServiceResponse getProvisionedService() {
        return this.provisionedService;
    }
    /**
     * Current provisioning state of the entitlement.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Optional. This purchase order (PO) information is for resellers to use for their company tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
     * 
    */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }
    /**
     * Enumerable of all current suspension reasons for an entitlement.
     * 
    */
    public List<String> getSuspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * Settings for trial offers.
     * 
    */
    public GoogleCloudChannelV1TrialSettingsResponse getTrialSettings() {
        return this.trialSettings;
    }
    /**
     * The time at which the entitlement is updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntitlementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1AssociationInfoResponse associationInfo;
        private GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings;
        private String createTime;
        private String name;
        private String offer;
        private List<GoogleCloudChannelV1ParameterResponse> parameters;
        private GoogleCloudChannelV1ProvisionedServiceResponse provisionedService;
        private String provisioningState;
        private String purchaseOrderId;
        private List<String> suspensionReasons;
        private GoogleCloudChannelV1TrialSettingsResponse trialSettings;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntitlementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationInfo = defaults.associationInfo;
    	      this.commitmentSettings = defaults.commitmentSettings;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.offer = defaults.offer;
    	      this.parameters = defaults.parameters;
    	      this.provisionedService = defaults.provisionedService;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purchaseOrderId = defaults.purchaseOrderId;
    	      this.suspensionReasons = defaults.suspensionReasons;
    	      this.trialSettings = defaults.trialSettings;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAssociationInfo(GoogleCloudChannelV1AssociationInfoResponse associationInfo) {
            this.associationInfo = Objects.requireNonNull(associationInfo);
            return this;
        }

        public Builder setCommitmentSettings(GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings) {
            this.commitmentSettings = Objects.requireNonNull(commitmentSettings);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOffer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }

        public Builder setParameters(List<GoogleCloudChannelV1ParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setProvisionedService(GoogleCloudChannelV1ProvisionedServiceResponse provisionedService) {
            this.provisionedService = Objects.requireNonNull(provisionedService);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPurchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = Objects.requireNonNull(purchaseOrderId);
            return this;
        }

        public Builder setSuspensionReasons(List<String> suspensionReasons) {
            this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
            return this;
        }

        public Builder setTrialSettings(GoogleCloudChannelV1TrialSettingsResponse trialSettings) {
            this.trialSettings = Objects.requireNonNull(trialSettings);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetEntitlementResult build() {
            return new GetEntitlementResult(associationInfo, commitmentSettings, createTime, name, offer, parameters, provisionedService, provisioningState, purchaseOrderId, suspensionReasons, trialSettings, updateTime);
        }
    }
}
