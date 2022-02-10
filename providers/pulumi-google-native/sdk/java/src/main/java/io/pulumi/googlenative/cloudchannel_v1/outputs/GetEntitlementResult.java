// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
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
    private final GoogleCloudChannelV1AssociationInfoResponse associationInfo;
    private final GoogleCloudChannelV1CommitmentSettingsResponse commitmentSettings;
    private final String createTime;
    private final String name;
    private final String offer;
    private final List<GoogleCloudChannelV1ParameterResponse> parameters;
    private final GoogleCloudChannelV1ProvisionedServiceResponse provisionedService;
    private final String provisioningState;
    private final String purchaseOrderId;
    private final List<String> suspensionReasons;
    private final GoogleCloudChannelV1TrialSettingsResponse trialSettings;
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

    public GoogleCloudChannelV1AssociationInfoResponse getAssociationInfo() {
        return this.associationInfo;
    }
    public GoogleCloudChannelV1CommitmentSettingsResponse getCommitmentSettings() {
        return this.commitmentSettings;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public String getName() {
        return this.name;
    }
    public String getOffer() {
        return this.offer;
    }
    public List<GoogleCloudChannelV1ParameterResponse> getParameters() {
        return this.parameters;
    }
    public GoogleCloudChannelV1ProvisionedServiceResponse getProvisionedService() {
        return this.provisionedService;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }
    public List<String> getSuspensionReasons() {
        return this.suspensionReasons;
    }
    public GoogleCloudChannelV1TrialSettingsResponse getTrialSettings() {
        return this.trialSettings;
    }
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