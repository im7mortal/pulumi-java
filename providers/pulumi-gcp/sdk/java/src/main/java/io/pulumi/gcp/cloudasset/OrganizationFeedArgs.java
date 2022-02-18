// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs;
import io.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationFeedArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationFeedArgs Empty = new OrganizationFeedArgs();

    /**
     * A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    @InputImport(name="assetNames")
    private final @Nullable Input<List<String>> assetNames;

    public Input<List<String>> getAssetNames() {
        return this.assetNames == null ? Input.empty() : this.assetNames;
    }

    /**
     * A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: "compute.googleapis.com/Disk"
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    @InputImport(name="assetTypes")
    private final @Nullable Input<List<String>> assetTypes;

    public Input<List<String>> getAssetTypes() {
        return this.assetTypes == null ? Input.empty() : this.assetTypes;
    }

    /**
     * The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing.
     * 
     */
    @InputImport(name="billingProject", required=true)
    private final Input<String> billingProject;

    public Input<String> getBillingProject() {
        return this.billingProject;
    }

    /**
     * A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<OrganizationFeedConditionArgs> condition;

    public Input<OrganizationFeedConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, and `ACCESS_POLICY`.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    @InputImport(name="feedId", required=true)
    private final Input<String> feedId;

    public Input<String> getFeedId() {
        return this.feedId;
    }

    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @InputImport(name="feedOutputConfig", required=true)
    private final Input<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig;

    public Input<OrganizationFeedFeedOutputConfigArgs> getFeedOutputConfig() {
        return this.feedOutputConfig;
    }

    /**
     * The organization this feed should be created in.
     * 
     */
    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    public OrganizationFeedArgs(
        @Nullable Input<List<String>> assetNames,
        @Nullable Input<List<String>> assetTypes,
        Input<String> billingProject,
        @Nullable Input<OrganizationFeedConditionArgs> condition,
        @Nullable Input<String> contentType,
        Input<String> feedId,
        Input<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig,
        Input<String> orgId) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.billingProject = Objects.requireNonNull(billingProject, "expected parameter 'billingProject' to be non-null");
        this.condition = condition;
        this.contentType = contentType;
        this.feedId = Objects.requireNonNull(feedId, "expected parameter 'feedId' to be non-null");
        this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig, "expected parameter 'feedOutputConfig' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
    }

    private OrganizationFeedArgs() {
        this.assetNames = Input.empty();
        this.assetTypes = Input.empty();
        this.billingProject = Input.empty();
        this.condition = Input.empty();
        this.contentType = Input.empty();
        this.feedId = Input.empty();
        this.feedOutputConfig = Input.empty();
        this.orgId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> assetNames;
        private @Nullable Input<List<String>> assetTypes;
        private Input<String> billingProject;
        private @Nullable Input<OrganizationFeedConditionArgs> condition;
        private @Nullable Input<String> contentType;
        private Input<String> feedId;
        private Input<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig;
        private Input<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.billingProject = defaults.billingProject;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedId = defaults.feedId;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.orgId = defaults.orgId;
        }

        public Builder setAssetNames(@Nullable Input<List<String>> assetNames) {
            this.assetNames = assetNames;
            return this;
        }

        public Builder setAssetNames(@Nullable List<String> assetNames) {
            this.assetNames = Input.ofNullable(assetNames);
            return this;
        }

        public Builder setAssetTypes(@Nullable Input<List<String>> assetTypes) {
            this.assetTypes = assetTypes;
            return this;
        }

        public Builder setAssetTypes(@Nullable List<String> assetTypes) {
            this.assetTypes = Input.ofNullable(assetTypes);
            return this;
        }

        public Builder setBillingProject(Input<String> billingProject) {
            this.billingProject = Objects.requireNonNull(billingProject);
            return this;
        }

        public Builder setBillingProject(String billingProject) {
            this.billingProject = Input.of(Objects.requireNonNull(billingProject));
            return this;
        }

        public Builder setCondition(@Nullable Input<OrganizationFeedConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable OrganizationFeedConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setFeedId(Input<String> feedId) {
            this.feedId = Objects.requireNonNull(feedId);
            return this;
        }

        public Builder setFeedId(String feedId) {
            this.feedId = Input.of(Objects.requireNonNull(feedId));
            return this;
        }

        public Builder setFeedOutputConfig(Input<OrganizationFeedFeedOutputConfigArgs> feedOutputConfig) {
            this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig);
            return this;
        }

        public Builder setFeedOutputConfig(OrganizationFeedFeedOutputConfigArgs feedOutputConfig) {
            this.feedOutputConfig = Input.of(Objects.requireNonNull(feedOutputConfig));
            return this;
        }

        public Builder setOrgId(Input<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder setOrgId(String orgId) {
            this.orgId = Input.of(Objects.requireNonNull(orgId));
            return this;
        }

        public OrganizationFeedArgs build() {
            return new OrganizationFeedArgs(assetNames, assetTypes, billingProject, condition, contentType, feedId, feedOutputConfig, orgId);
        }
    }
}