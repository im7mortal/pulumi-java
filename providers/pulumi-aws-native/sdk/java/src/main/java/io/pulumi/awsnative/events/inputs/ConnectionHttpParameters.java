// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.awsnative.events.inputs.ConnectionParameter;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionHttpParameters extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionHttpParameters Empty = new ConnectionHttpParameters();

    @InputImport(name="bodyParameters")
    private final @Nullable List<ConnectionParameter> bodyParameters;

    public List<ConnectionParameter> getBodyParameters() {
        return this.bodyParameters == null ? List.of() : this.bodyParameters;
    }

    @InputImport(name="headerParameters")
    private final @Nullable List<ConnectionParameter> headerParameters;

    public List<ConnectionParameter> getHeaderParameters() {
        return this.headerParameters == null ? List.of() : this.headerParameters;
    }

    @InputImport(name="queryStringParameters")
    private final @Nullable List<ConnectionParameter> queryStringParameters;

    public List<ConnectionParameter> getQueryStringParameters() {
        return this.queryStringParameters == null ? List.of() : this.queryStringParameters;
    }

    public ConnectionHttpParameters(
        @Nullable List<ConnectionParameter> bodyParameters,
        @Nullable List<ConnectionParameter> headerParameters,
        @Nullable List<ConnectionParameter> queryStringParameters) {
        this.bodyParameters = bodyParameters;
        this.headerParameters = headerParameters;
        this.queryStringParameters = queryStringParameters;
    }

    private ConnectionHttpParameters() {
        this.bodyParameters = List.of();
        this.headerParameters = List.of();
        this.queryStringParameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionHttpParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionParameter> bodyParameters;
        private @Nullable List<ConnectionParameter> headerParameters;
        private @Nullable List<ConnectionParameter> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionHttpParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyParameters = defaults.bodyParameters;
    	      this.headerParameters = defaults.headerParameters;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder setBodyParameters(@Nullable List<ConnectionParameter> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }

        public Builder setHeaderParameters(@Nullable List<ConnectionParameter> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        public Builder setQueryStringParameters(@Nullable List<ConnectionParameter> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }

        public ConnectionHttpParameters build() {
            return new ConnectionHttpParameters(bodyParameters, headerParameters, queryStringParameters);
        }
    }
}