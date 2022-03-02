// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.BotPropertiesResponse;
import io.pulumi.azurenative.botservice.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBotResult {
    /**
     * Entity Tag
     * 
     */
    private final @Nullable String etag;
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * The set of properties specific to bot resource
     * 
     */
    private final BotPropertiesResponse properties;
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;
    /**
     * Entity zones
     * 
     */
    private final List<String> zones;

    @OutputCustomType.Constructor({"etag","id","kind","location","name","properties","sku","tags","type","zones"})
    private GetBotResult(
        @Nullable String etag,
        String id,
        @Nullable String kind,
        @Nullable String location,
        String name,
        BotPropertiesResponse properties,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        List<String> zones) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zones = Objects.requireNonNull(zones);
    }

    /**
     * Entity Tag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Specifies the resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Required. Gets or sets the Kind of the resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The set of properties specific to bot resource
     * 
    */
    public BotPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the SKU of the resource.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Entity zones
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private BotPropertiesResponse properties;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(BotPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
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

        public Builder setZones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public GetBotResult build() {
            return new GetBotResult(etag, id, kind, location, name, properties, sku, tags, type, zones);
        }
    }
}
