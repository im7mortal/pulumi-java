// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex_v1.enums.ZoneType;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1ZoneDiscoverySpecArgs;
import com.pulumi.googlenative.dataplex_v1.inputs.GoogleCloudDataplexV1ZoneResourceSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneArgs Empty = new ZoneArgs();

    /**
     * Optional. Description of the zone.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the zone.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Specification of the discovery feature applied to data in this zone.
     * 
     */
    @Import(name="discoverySpec")
    private @Nullable Output<GoogleCloudDataplexV1ZoneDiscoverySpecArgs> discoverySpec;

    /**
     * @return Optional. Specification of the discovery feature applied to data in this zone.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1ZoneDiscoverySpecArgs>> discoverySpec() {
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
     * Optional. User defined labels for the zone.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User defined labels for the zone.
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
     * Specification of the resources that are referenced by the assets within this zone.
     * 
     */
    @Import(name="resourceSpec", required=true)
    private Output<GoogleCloudDataplexV1ZoneResourceSpecArgs> resourceSpec;

    /**
     * @return Specification of the resources that are referenced by the assets within this zone.
     * 
     */
    public Output<GoogleCloudDataplexV1ZoneResourceSpecArgs> resourceSpec() {
        return this.resourceSpec;
    }

    /**
     * Immutable. The type of the zone.
     * 
     */
    @Import(name="type", required=true)
    private Output<ZoneType> type;

    /**
     * @return Immutable. The type of the zone.
     * 
     */
    public Output<ZoneType> type() {
        return this.type;
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

    /**
     * Required. Zone identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique across all lakes from all locations in a project. * Must not be one of the reserved IDs (i.e. &#34;default&#34;, &#34;global-temp&#34;)
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return Required. Zone identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique across all lakes from all locations in a project. * Must not be one of the reserved IDs (i.e. &#34;default&#34;, &#34;global-temp&#34;)
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ZoneArgs() {}

    private ZoneArgs(ZoneArgs $) {
        this.description = $.description;
        this.discoverySpec = $.discoverySpec;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.resourceSpec = $.resourceSpec;
        this.type = $.type;
        this.validateOnly = $.validateOnly;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneArgs $;

        public Builder() {
            $ = new ZoneArgs();
        }

        public Builder(ZoneArgs defaults) {
            $ = new ZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the zone.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the zone.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param discoverySpec Optional. Specification of the discovery feature applied to data in this zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(@Nullable Output<GoogleCloudDataplexV1ZoneDiscoverySpecArgs> discoverySpec) {
            $.discoverySpec = discoverySpec;
            return this;
        }

        /**
         * @param discoverySpec Optional. Specification of the discovery feature applied to data in this zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(GoogleCloudDataplexV1ZoneDiscoverySpecArgs discoverySpec) {
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
         * @param labels Optional. User defined labels for the zone.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User defined labels for the zone.
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
         * @param resourceSpec Specification of the resources that are referenced by the assets within this zone.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(Output<GoogleCloudDataplexV1ZoneResourceSpecArgs> resourceSpec) {
            $.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * @param resourceSpec Specification of the resources that are referenced by the assets within this zone.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(GoogleCloudDataplexV1ZoneResourceSpecArgs resourceSpec) {
            return resourceSpec(Output.of(resourceSpec));
        }

        /**
         * @param type Immutable. The type of the zone.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<ZoneType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Immutable. The type of the zone.
         * 
         * @return builder
         * 
         */
        public Builder type(ZoneType type) {
            return type(Output.of(type));
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

        /**
         * @param zoneId Required. Zone identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique across all lakes from all locations in a project. * Must not be one of the reserved IDs (i.e. &#34;default&#34;, &#34;global-temp&#34;)
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Required. Zone identifier. This ID will be used to generate names such as database and dataset names when publishing metadata to Hive Metastore and BigQuery. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must end with a number or a letter. * Must be between 1-63 characters. * Must be unique across all lakes from all locations in a project. * Must not be one of the reserved IDs (i.e. &#34;default&#34;, &#34;global-temp&#34;)
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZoneArgs build() {
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.resourceSpec = Objects.requireNonNull($.resourceSpec, "expected parameter 'resourceSpec' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
