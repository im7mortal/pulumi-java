// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.outputs;

import io.pulumi.azurenative.maps.outputs.MapsAccountPropertiesResponse;
import io.pulumi.azurenative.maps.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetAccountResult {
    /**
     * The fully qualified Maps Account resource identifier.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final String location;
    /**
     * The name of the Maps Account, which is unique within a Resource Group.
     * 
     */
    private final String name;
    /**
     * The map account properties.
     * 
     */
    private final MapsAccountPropertiesResponse properties;
    /**
     * The SKU of this account.
     * 
     */
    private final SkuResponse sku;
    /**
     * Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Azure resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","sku","tags","type"})
    private GetAccountResult(
        String id,
        String location,
        String name,
        MapsAccountPropertiesResponse properties,
        SkuResponse sku,
        Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = Objects.requireNonNull(sku);
        this.tags = Objects.requireNonNull(tags);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The fully qualified Maps Account resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the Maps Account, which is unique within a Resource Group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The map account properties.
     * 
    */
    public MapsAccountPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The SKU of this account.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Gets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private MapsAccountPropertiesResponse properties;
        private SkuResponse sku;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setProperties(MapsAccountPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(id, location, name, properties, sku, tags, type);
        }
    }
}
