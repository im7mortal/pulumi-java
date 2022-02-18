// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileSingularConnectorProfileCredentials {
    /**
     * A unique alphanumeric identiﬁer used to authenticate a user, developer, or calling program to your API.
     * 
     */
    private final String apiKey;

    @OutputCustomType.Constructor({"apiKey"})
    private ConnectorProfileSingularConnectorProfileCredentials(String apiKey) {
        this.apiKey = Objects.requireNonNull(apiKey);
    }

    /**
     * A unique alphanumeric identiﬁer used to authenticate a user, developer, or calling program to your API.
     * 
     */
    public String getApiKey() {
        return this.apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSingularConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSingularConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public ConnectorProfileSingularConnectorProfileCredentials build() {
            return new ConnectorProfileSingularConnectorProfileCredentials(apiKey);
        }
    }
}