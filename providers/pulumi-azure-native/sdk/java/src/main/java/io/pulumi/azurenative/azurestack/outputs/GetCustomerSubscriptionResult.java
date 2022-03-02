// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCustomerSubscriptionResult {
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * ID of the resource.
     * 
     */
    private final String id;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * Tenant Id.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of Resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","tenantId","type"})
    private GetCustomerSubscriptionResult(
        @Nullable String etag,
        String id,
        String name,
        @Nullable String tenantId,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Tenant Id.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of Resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String name;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCustomerSubscriptionResult build() {
            return new GetCustomerSubscriptionResult(etag, id, name, tenantId, type);
        }
    }
}
