// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstancePoolResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price).
     * 
     */
    private final String licenseType;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The name and tier of the SKU.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource ID of the subnet to place this instance pool in.
     * 
     */
    private final String subnetId;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Count of vCores belonging to this instance pool.
     * 
     */
    private final Integer vCores;

    @OutputCustomType.Constructor({"id","licenseType","location","name","sku","subnetId","tags","type","vCores"})
    private GetInstancePoolResult(
        String id,
        String licenseType,
        String location,
        String name,
        @Nullable SkuResponse sku,
        String subnetId,
        @Nullable Map<String,String> tags,
        String type,
        Integer vCores) {
        this.id = Objects.requireNonNull(id);
        this.licenseType = Objects.requireNonNull(licenseType);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.sku = sku;
        this.subnetId = Objects.requireNonNull(subnetId);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.vCores = Objects.requireNonNull(vCores);
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price).
     * 
    */
    public String getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name and tier of the SKU.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource ID of the subnet to place this instance pool in.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Count of vCores belonging to this instance pool.
     * 
    */
    public Integer getVCores() {
        return this.vCores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancePoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String licenseType;
        private String location;
        private String name;
        private @Nullable SkuResponse sku;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private String type;
        private Integer vCores;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancePoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vCores = defaults.vCores;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLicenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
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

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
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

        public Builder setVCores(Integer vCores) {
            this.vCores = Objects.requireNonNull(vCores);
            return this;
        }
        public GetInstancePoolResult build() {
            return new GetInstancePoolResult(id, licenseType, location, name, sku, subnetId, tags, type, vCores);
        }
    }
}
