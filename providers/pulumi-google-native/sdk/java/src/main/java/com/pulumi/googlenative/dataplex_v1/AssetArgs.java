// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1AssetDiscoverySpecArgs;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1AssetResourceSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetArgs Empty = new AssetArgs();

    /**
     * Required. Asset identifier. This ID will be used to generate names such as table names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique within the zone.
     * 
     */
    @Import(name="assetId", required=true)
    private Output<String> assetId;

    /**
     * @return Required. Asset identifier. This ID will be used to generate names such as table names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique within the zone.
     * 
     */
    public Output<String> assetId() {
        return this.assetId;
    }

    /**
     * Optional. Description of the asset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the asset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    @Import(name="discoverySpec")
    private @Nullable Output<GoogleCloudDataplexV1AssetDiscoverySpecArgs> discoverySpec;

    /**
     * @return Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1AssetDiscoverySpecArgs>> discoverySpec() {
        return Optional.ofNullable(this.discoverySpec);
    }

    /**
     * Optional. User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Optional. User defined labels for the asset.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User defined labels for the asset.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="lakeId", required=true)
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specification of the resource that is referenced by this asset.
     * 
     */
    @Import(name="resourceSpec", required=true)
    private Output<GoogleCloudDataplexV1AssetResourceSpecArgs> resourceSpec;

    /**
     * @return Specification of the resource that is referenced by this asset.
     * 
     */
    public Output<GoogleCloudDataplexV1AssetResourceSpecArgs> resourceSpec() {
        return this.resourceSpec;
    }

    /**
     * Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    /**
     * @return Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private AssetArgs() {}

    private AssetArgs(AssetArgs $) {
        this.assetId = $.assetId;
        this.description = $.description;
        this.discoverySpec = $.discoverySpec;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.resourceSpec = $.resourceSpec;
        this.validateOnly = $.validateOnly;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetArgs $;

        public Builder() {
            $ = new AssetArgs();
        }

        public Builder(AssetArgs defaults) {
            $ = new AssetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetId Required. Asset identifier. This ID will be used to generate names such as table names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique within the zone.
         * 
         * @return builder
         * 
         */
        public Builder assetId(Output<String> assetId) {
            $.assetId = assetId;
            return this;
        }

        /**
         * @param assetId Required. Asset identifier. This ID will be used to generate names such as table names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique within the zone.
         * 
         * @return builder
         * 
         */
        public Builder assetId(String assetId) {
            return assetId(Output.of(assetId));
        }

        /**
         * @param description Optional. Description of the asset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the asset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param discoverySpec Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(@Nullable Output<GoogleCloudDataplexV1AssetDiscoverySpecArgs> discoverySpec) {
            $.discoverySpec = discoverySpec;
            return this;
        }

        /**
         * @param discoverySpec Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(GoogleCloudDataplexV1AssetDiscoverySpecArgs discoverySpec) {
            return discoverySpec(Output.of(discoverySpec));
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Optional. User defined labels for the asset.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User defined labels for the asset.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder lakeId(Output<String> lakeId) {
            $.lakeId = lakeId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            return lakeId(Output.of(lakeId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceSpec Specification of the resource that is referenced by this asset.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(Output<GoogleCloudDataplexV1AssetResourceSpecArgs> resourceSpec) {
            $.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * @param resourceSpec Specification of the resource that is referenced by this asset.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(GoogleCloudDataplexV1AssetResourceSpecArgs resourceSpec) {
            return resourceSpec(Output.of(resourceSpec));
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public AssetArgs build() {
            $.assetId = Objects.requireNonNull($.assetId, "expected parameter 'assetId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.resourceSpec = Objects.requireNonNull($.resourceSpec, "expected parameter 'resourceSpec' to be non-null");
            return $;
        }
    }

}
