// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.DataTransferServiceResourcePropertiesResponse;
import io.pulumi.azurenative.documentdb.outputs.SqlDedicatedGatewayServiceResourcePropertiesResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    /**
     * The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * The name of the database account.
     * 
     */
    private final String name;
    /**
     * Services response resource.
     * 
     */
    private final Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse> properties;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetServiceResult(
        String id,
        String name,
        Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse> properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The unique resource identifier of the database account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the database account.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Services response resource.
     * 
    */
    public Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(id, name, properties, type);
        }
    }
}
