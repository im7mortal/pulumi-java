// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.assuredworkloads_v1.enums.WorkloadComplianceRegime;
import com.pulumi.googlenative.assuredworkloads_v1.inputs.GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs;
import com.pulumi.googlenative.assuredworkloads_v1.inputs.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @Import(name="billingAccount")
    private @Nullable Output<String> billingAccount;

    /**
     * @return Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    public Optional<Output<String>> billingAccount() {
        return Optional.ofNullable(this.billingAccount);
    }

    /**
     * Immutable. Compliance Regime associated with this workload.
     * 
     */
    @Import(name="complianceRegime", required=true)
    private Output<WorkloadComplianceRegime> complianceRegime;

    /**
     * @return Immutable. Compliance Regime associated with this workload.
     * 
     */
    public Output<WorkloadComplianceRegime> complianceRegime() {
        return this.complianceRegime;
    }

    /**
     * The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    @Import(name="enableSovereignControls")
    private @Nullable Output<Boolean> enableSovereignControls;

    /**
     * @return Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
     * 
     */
    public Optional<Output<Boolean>> enableSovereignControls() {
        return Optional.ofNullable(this.enableSovereignControls);
    }

    /**
     * Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update &amp; Delete operations.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update &amp; Delete operations.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     * @deprecated
     * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     */
    @Deprecated /* Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field. */
    @Import(name="kmsSettings")
    private @Nullable Output<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings;

    /**
     * @return Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     * @deprecated
     * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
     * 
     */
    @Deprecated /* Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field. */
    public Optional<Output<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs>> kmsSettings() {
        return Optional.ofNullable(this.kmsSettings);
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels applied to the workload.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    @Import(name="provisionedResourcesParent")
    private @Nullable Output<String> provisionedResourcesParent;

    /**
     * @return Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
     * 
     */
    public Optional<Output<String>> provisionedResourcesParent() {
        return Optional.ofNullable(this.provisionedResourcesParent);
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @Import(name="resourceSettings")
    private @Nullable Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings;

    /**
     * @return Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    public Optional<Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>>> resourceSettings() {
        return Optional.ofNullable(this.resourceSettings);
    }

    private WorkloadArgs() {}

    private WorkloadArgs(WorkloadArgs $) {
        this.billingAccount = $.billingAccount;
        this.complianceRegime = $.complianceRegime;
        this.displayName = $.displayName;
        this.enableSovereignControls = $.enableSovereignControls;
        this.etag = $.etag;
        this.externalId = $.externalId;
        this.kmsSettings = $.kmsSettings;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.provisionedResourcesParent = $.provisionedResourcesParent;
        this.resourceSettings = $.resourceSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadArgs $;

        public Builder() {
            $ = new WorkloadArgs();
        }

        public Builder(WorkloadArgs defaults) {
            $ = new WorkloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccount Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            $.billingAccount = billingAccount;
            return this;
        }

        /**
         * @param billingAccount Optional. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`.
         * 
         * @return builder
         * 
         */
        public Builder billingAccount(String billingAccount) {
            return billingAccount(Output.of(billingAccount));
        }

        /**
         * @param complianceRegime Immutable. Compliance Regime associated with this workload.
         * 
         * @return builder
         * 
         */
        public Builder complianceRegime(Output<WorkloadComplianceRegime> complianceRegime) {
            $.complianceRegime = complianceRegime;
            return this;
        }

        /**
         * @param complianceRegime Immutable. Compliance Regime associated with this workload.
         * 
         * @return builder
         * 
         */
        public Builder complianceRegime(WorkloadComplianceRegime complianceRegime) {
            return complianceRegime(Output.of(complianceRegime));
        }

        /**
         * @param displayName The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableSovereignControls Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
         * 
         * @return builder
         * 
         */
        public Builder enableSovereignControls(@Nullable Output<Boolean> enableSovereignControls) {
            $.enableSovereignControls = enableSovereignControls;
            return this;
        }

        /**
         * @param enableSovereignControls Optional. Indicates the sovereignty status of the given workload. Currently meant to be used by Europe/Canada customers.
         * 
         * @return builder
         * 
         */
        public Builder enableSovereignControls(Boolean enableSovereignControls) {
            return enableSovereignControls(Output.of(enableSovereignControls));
        }

        /**
         * @param etag Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update &amp; Delete operations.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. ETag of the workload, it is calculated on the basis of the Workload contents. It will be used in Update &amp; Delete operations.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param externalId Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId Optional. A identifier associated with the workload and underlying projects which allows for the break down of billing costs for a workload. The value provided for the identifier will add a label to the workload and contained projects with the identifier as the value.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param kmsSettings Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         * @return builder
         * 
         * @deprecated
         * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         */
        @Deprecated /* Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field. */
        public Builder kmsSettings(@Nullable Output<GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs> kmsSettings) {
            $.kmsSettings = kmsSettings;
            return this;
        }

        /**
         * @param kmsSettings Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         * @return builder
         * 
         * @deprecated
         * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
         * 
         */
        @Deprecated /* Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS CMEK key is provisioned. This field is deprecated as of Feb 28, 2022. In order to create a Keyring, callers should specify, ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field. */
        public Builder kmsSettings(GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsArgs kmsSettings) {
            return kmsSettings(Output.of(kmsSettings));
        }

        /**
         * @param labels Optional. Labels applied to the workload.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Labels applied to the workload.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional. The resource name of the workload. Format: organizations/{organization}/locations/{location}/workloads/{workload} Read-only.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param provisionedResourcesParent Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
         * 
         * @return builder
         * 
         */
        public Builder provisionedResourcesParent(@Nullable Output<String> provisionedResourcesParent) {
            $.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }

        /**
         * @param provisionedResourcesParent Input only. The parent resource for the resources managed by this Assured Workload. May be either empty or a folder resource which is a child of the Workload parent. If not specified all resources are created under the parent organization. Format: folders/{folder_id}
         * 
         * @return builder
         * 
         */
        public Builder provisionedResourcesParent(String provisionedResourcesParent) {
            return provisionedResourcesParent(Output.of(provisionedResourcesParent));
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(@Nullable Output<List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs>> resourceSettings) {
            $.resourceSettings = resourceSettings;
            return this;
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(List<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs> resourceSettings) {
            return resourceSettings(Output.of(resourceSettings));
        }

        /**
         * @param resourceSettings Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder resourceSettings(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs... resourceSettings) {
            return resourceSettings(List.of(resourceSettings));
        }

        public WorkloadArgs build() {
            $.complianceRegime = Objects.requireNonNull($.complianceRegime, "expected parameter 'complianceRegime' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
