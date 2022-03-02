// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.RemotePrivateEndpointConnectionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * Etag identifies change in the resource.
     * 
     */
    private final String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Core resource properties
     * 
     */
    private final RemotePrivateEndpointConnectionResponse properties;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","type"})
    private GetPrivateEndpointConnectionResult(
        String etag,
        String id,
        String name,
        RemotePrivateEndpointConnectionResponse properties,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Etag identifies change in the resource.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Core resource properties
     * 
    */
    public RemotePrivateEndpointConnectionResponse getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private RemotePrivateEndpointConnectionResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setProperties(RemotePrivateEndpointConnectionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(etag, id, name, properties, type);
        }
    }
}
