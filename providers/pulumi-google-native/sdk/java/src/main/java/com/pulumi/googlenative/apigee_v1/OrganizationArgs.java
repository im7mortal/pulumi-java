// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee_v1.enums.OrganizationBillingType;
import com.pulumi.googlenative.apigee_v1.enums.OrganizationRuntimeType;
import com.pulumi.googlenative.apigee_v1.enums.OrganizationType;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AddonsConfigArgs;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1PropertiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    /**
     * Addon configurations of the Apigee organization.
     * 
     */
    @Import(name="addonsConfig")
    private @Nullable Output<GoogleCloudApigeeV1AddonsConfigArgs> addonsConfig;

    /**
     * @return Addon configurations of the Apigee organization.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1AddonsConfigArgs>> addonsConfig() {
        return Optional.ofNullable(this.addonsConfig);
    }

    /**
     * DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     * @deprecated
     * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
    @Import(name="analyticsRegion", required=true)
    private Output<String> analyticsRegion;

    /**
     * @return DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     * @deprecated
     * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
    public Output<String> analyticsRegion() {
        return this.analyticsRegion;
    }

    /**
     * Not used by Apigee.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<List<String>> attributes;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Optional<Output<List<String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    @Import(name="billingType")
    private @Nullable Output<OrganizationBillingType> billingType;

    /**
     * @return Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    public Optional<Output<OrganizationBillingType>> billingType() {
        return Optional.ofNullable(this.billingType);
    }

    /**
     * Not used by Apigee.
     * 
     */
    @Import(name="customerName")
    private @Nullable Output<String> customerName;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Optional<Output<String>> customerName() {
        return Optional.ofNullable(this.customerName);
    }

    /**
     * Description of the Apigee organization.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Apigee organization.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required. Name of the GCP project in which to associate the Apigee organization. Pass the information as a query parameter using the following structure in your request: `projects/`
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return Required. Name of the GCP project in which to associate the Apigee organization. Pass the information as a query parameter using the following structure in your request: `projects/`
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * Configuration for the Portals settings.
     * 
     */
    @Import(name="portalDisabled")
    private @Nullable Output<Boolean> portalDisabled;

    /**
     * @return Configuration for the Portals settings.
     * 
     */
    public Optional<Output<Boolean>> portalDisabled() {
        return Optional.ofNullable(this.portalDisabled);
    }

    /**
     * Properties defined in the Apigee organization profile.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<GoogleCloudApigeeV1PropertiesArgs> properties;

    /**
     * @return Properties defined in the Apigee organization profile.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1PropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
     * 
     */
    @Import(name="runtimeDatabaseEncryptionKeyName")
    private @Nullable Output<String> runtimeDatabaseEncryptionKeyName;

    /**
     * @return Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public Optional<Output<String>> runtimeDatabaseEncryptionKeyName() {
        return Optional.ofNullable(this.runtimeDatabaseEncryptionKeyName);
    }

    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    @Import(name="runtimeType", required=true)
    private Output<OrganizationRuntimeType> runtimeType;

    /**
     * @return Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    public Output<OrganizationRuntimeType> runtimeType() {
        return this.runtimeType;
    }

    /**
     * Not used by Apigee.
     * 
     */
    @Import(name="type")
    private @Nullable Output<OrganizationType> type;

    /**
     * @return Not used by Apigee.
     * 
     */
    public Optional<Output<OrganizationType>> type() {
        return Optional.ofNullable(this.type);
    }

    private OrganizationArgs() {}

    private OrganizationArgs(OrganizationArgs $) {
        this.addonsConfig = $.addonsConfig;
        this.analyticsRegion = $.analyticsRegion;
        this.attributes = $.attributes;
        this.authorizedNetwork = $.authorizedNetwork;
        this.billingType = $.billingType;
        this.customerName = $.customerName;
        this.description = $.description;
        this.displayName = $.displayName;
        this.parent = $.parent;
        this.portalDisabled = $.portalDisabled;
        this.properties = $.properties;
        this.runtimeDatabaseEncryptionKeyName = $.runtimeDatabaseEncryptionKeyName;
        this.runtimeType = $.runtimeType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationArgs $;

        public Builder() {
            $ = new OrganizationArgs();
        }

        public Builder(OrganizationArgs defaults) {
            $ = new OrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addonsConfig Addon configurations of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder addonsConfig(@Nullable Output<GoogleCloudApigeeV1AddonsConfigArgs> addonsConfig) {
            $.addonsConfig = addonsConfig;
            return this;
        }

        /**
         * @param addonsConfig Addon configurations of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder addonsConfig(GoogleCloudApigeeV1AddonsConfigArgs addonsConfig) {
            return addonsConfig(Output.of(addonsConfig));
        }

        /**
         * @param analyticsRegion DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         * @return builder
         * 
         * @deprecated
         * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         */
        @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
        public Builder analyticsRegion(Output<String> analyticsRegion) {
            $.analyticsRegion = analyticsRegion;
            return this;
        }

        /**
         * @param analyticsRegion DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         * @return builder
         * 
         * @deprecated
         * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         */
        @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
        public Builder analyticsRegion(String analyticsRegion) {
            return analyticsRegion(Output.of(analyticsRegion));
        }

        /**
         * @param attributes Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<List<String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param attributes Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param authorizedNetwork Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param billingType Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
         * 
         * @return builder
         * 
         */
        public Builder billingType(@Nullable Output<OrganizationBillingType> billingType) {
            $.billingType = billingType;
            return this;
        }

        /**
         * @param billingType Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
         * 
         * @return builder
         * 
         */
        public Builder billingType(OrganizationBillingType billingType) {
            return billingType(Output.of(billingType));
        }

        /**
         * @param customerName Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder customerName(@Nullable Output<String> customerName) {
            $.customerName = customerName;
            return this;
        }

        /**
         * @param customerName Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder customerName(String customerName) {
            return customerName(Output.of(customerName));
        }

        /**
         * @param description Description of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name for the Apigee organization. Unused, but reserved for future use.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name for the Apigee organization. Unused, but reserved for future use.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param parent Required. Name of the GCP project in which to associate the Apigee organization. Pass the information as a query parameter using the following structure in your request: `projects/`
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent Required. Name of the GCP project in which to associate the Apigee organization. Pass the information as a query parameter using the following structure in your request: `projects/`
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param portalDisabled Configuration for the Portals settings.
         * 
         * @return builder
         * 
         */
        public Builder portalDisabled(@Nullable Output<Boolean> portalDisabled) {
            $.portalDisabled = portalDisabled;
            return this;
        }

        /**
         * @param portalDisabled Configuration for the Portals settings.
         * 
         * @return builder
         * 
         */
        public Builder portalDisabled(Boolean portalDisabled) {
            return portalDisabled(Output.of(portalDisabled));
        }

        /**
         * @param properties Properties defined in the Apigee organization profile.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<GoogleCloudApigeeV1PropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties defined in the Apigee organization profile.
         * 
         * @return builder
         * 
         */
        public Builder properties(GoogleCloudApigeeV1PropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param runtimeDatabaseEncryptionKeyName Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
         * 
         * @return builder
         * 
         */
        public Builder runtimeDatabaseEncryptionKeyName(@Nullable Output<String> runtimeDatabaseEncryptionKeyName) {
            $.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
            return this;
        }

        /**
         * @param runtimeDatabaseEncryptionKeyName Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
         * 
         * @return builder
         * 
         */
        public Builder runtimeDatabaseEncryptionKeyName(String runtimeDatabaseEncryptionKeyName) {
            return runtimeDatabaseEncryptionKeyName(Output.of(runtimeDatabaseEncryptionKeyName));
        }

        /**
         * @param runtimeType Runtime type of the Apigee organization based on the Apigee subscription purchased.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(Output<OrganizationRuntimeType> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType Runtime type of the Apigee organization based on the Apigee subscription purchased.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(OrganizationRuntimeType runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param type Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<OrganizationType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Not used by Apigee.
         * 
         * @return builder
         * 
         */
        public Builder type(OrganizationType type) {
            return type(Output.of(type));
        }

        public OrganizationArgs build() {
            $.analyticsRegion = Objects.requireNonNull($.analyticsRegion, "expected parameter 'analyticsRegion' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.runtimeType = Objects.requireNonNull($.runtimeType, "expected parameter 'runtimeType' to be non-null");
            return $;
        }
    }

}
