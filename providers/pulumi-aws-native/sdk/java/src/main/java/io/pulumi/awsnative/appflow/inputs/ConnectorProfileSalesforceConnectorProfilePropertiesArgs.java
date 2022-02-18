// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSalesforceConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSalesforceConnectorProfilePropertiesArgs Empty = new ConnectorProfileSalesforceConnectorProfilePropertiesArgs();

    /**
     * The location of the Salesforce resource
     * 
     */
    @InputImport(name="instanceUrl")
    private final @Nullable Input<String> instanceUrl;

    public Input<String> getInstanceUrl() {
        return this.instanceUrl == null ? Input.empty() : this.instanceUrl;
    }

    @InputImport(name="isSandboxEnvironment")
    private final @Nullable Input<Boolean> isSandboxEnvironment;

    public Input<Boolean> getIsSandboxEnvironment() {
        return this.isSandboxEnvironment == null ? Input.empty() : this.isSandboxEnvironment;
    }

    public ConnectorProfileSalesforceConnectorProfilePropertiesArgs(
        @Nullable Input<String> instanceUrl,
        @Nullable Input<Boolean> isSandboxEnvironment) {
        this.instanceUrl = instanceUrl;
        this.isSandboxEnvironment = isSandboxEnvironment;
    }

    private ConnectorProfileSalesforceConnectorProfilePropertiesArgs() {
        this.instanceUrl = Input.empty();
        this.isSandboxEnvironment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSalesforceConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceUrl;
        private @Nullable Input<Boolean> isSandboxEnvironment;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSalesforceConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
    	      this.isSandboxEnvironment = defaults.isSandboxEnvironment;
        }

        public Builder setInstanceUrl(@Nullable Input<String> instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        public Builder setInstanceUrl(@Nullable String instanceUrl) {
            this.instanceUrl = Input.ofNullable(instanceUrl);
            return this;
        }

        public Builder setIsSandboxEnvironment(@Nullable Input<Boolean> isSandboxEnvironment) {
            this.isSandboxEnvironment = isSandboxEnvironment;
            return this;
        }

        public Builder setIsSandboxEnvironment(@Nullable Boolean isSandboxEnvironment) {
            this.isSandboxEnvironment = Input.ofNullable(isSandboxEnvironment);
            return this;
        }

        public ConnectorProfileSalesforceConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileSalesforceConnectorProfilePropertiesArgs(instanceUrl, isSandboxEnvironment);
        }
    }
}
