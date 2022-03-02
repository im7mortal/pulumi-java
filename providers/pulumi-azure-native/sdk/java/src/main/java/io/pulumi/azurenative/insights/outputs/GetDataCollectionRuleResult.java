// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.DataCollectionRuleResponseDataSources;
import io.pulumi.azurenative.insights.outputs.DataCollectionRuleResponseDestinations;
import io.pulumi.azurenative.insights.outputs.DataFlowResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataCollectionRuleResult {
    /**
     * The specification of data flows.
     * 
     */
    private final @Nullable List<DataFlowResponse> dataFlows;
    /**
     * The specification of data sources.
     * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * 
     */
    private final @Nullable DataCollectionRuleResponseDataSources dataSources;
    /**
     * Description of the data collection rule.
     * 
     */
    private final @Nullable String description;
    /**
     * The specification of destinations.
     * 
     */
    private final @Nullable DataCollectionRuleResponseDestinations destinations;
    /**
     * Resource entity tag (ETag).
     * 
     */
    private final String etag;
    /**
     * Fully qualified ID of the resource.
     * 
     */
    private final String id;
    /**
     * The immutable ID of this data collection rule. This property is READ-ONLY.
     * 
     */
    private final String immutableId;
    /**
     * The kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * The geo-location where the resource lives.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The resource provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataFlows","dataSources","description","destinations","etag","id","immutableId","kind","location","name","provisioningState","tags","type"})
    private GetDataCollectionRuleResult(
        @Nullable List<DataFlowResponse> dataFlows,
        @Nullable DataCollectionRuleResponseDataSources dataSources,
        @Nullable String description,
        @Nullable DataCollectionRuleResponseDestinations destinations,
        String etag,
        String id,
        String immutableId,
        @Nullable String kind,
        String location,
        String name,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type) {
        this.dataFlows = dataFlows;
        this.dataSources = dataSources;
        this.description = description;
        this.destinations = destinations;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.immutableId = Objects.requireNonNull(immutableId);
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The specification of data flows.
     * 
    */
    public List<DataFlowResponse> getDataFlows() {
        return this.dataFlows == null ? List.of() : this.dataFlows;
    }
    /**
     * The specification of data sources.
     * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * 
    */
    public Optional<DataCollectionRuleResponseDataSources> getDataSources() {
        return Optional.ofNullable(this.dataSources);
    }
    /**
     * Description of the data collection rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The specification of destinations.
     * 
    */
    public Optional<DataCollectionRuleResponseDestinations> getDestinations() {
        return Optional.ofNullable(this.destinations);
    }
    /**
     * Resource entity tag (ETag).
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The immutable ID of this data collection rule. This property is READ-ONLY.
     * 
    */
    public String getImmutableId() {
        return this.immutableId;
    }
    /**
     * The kind of the resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The geo-location where the resource lives.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataFlowResponse> dataFlows;
        private @Nullable DataCollectionRuleResponseDataSources dataSources;
        private @Nullable String description;
        private @Nullable DataCollectionRuleResponseDestinations destinations;
        private String etag;
        private String id;
        private String immutableId;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlows = defaults.dataFlows;
    	      this.dataSources = defaults.dataSources;
    	      this.description = defaults.description;
    	      this.destinations = defaults.destinations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.immutableId = defaults.immutableId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDataFlows(@Nullable List<DataFlowResponse> dataFlows) {
            this.dataFlows = dataFlows;
            return this;
        }

        public Builder setDataSources(@Nullable DataCollectionRuleResponseDataSources dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinations(@Nullable DataCollectionRuleResponseDestinations destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImmutableId(String immutableId) {
            this.immutableId = Objects.requireNonNull(immutableId);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        public GetDataCollectionRuleResult build() {
            return new GetDataCollectionRuleResult(dataFlows, dataSources, description, destinations, etag, id, immutableId, kind, location, name, provisioningState, tags, type);
        }
    }
}
