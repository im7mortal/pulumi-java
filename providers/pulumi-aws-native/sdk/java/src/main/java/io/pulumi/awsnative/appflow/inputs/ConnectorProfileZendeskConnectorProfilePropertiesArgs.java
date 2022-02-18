// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileZendeskConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileZendeskConnectorProfilePropertiesArgs Empty = new ConnectorProfileZendeskConnectorProfilePropertiesArgs();

    /**
     * The location of the Zendesk resource
     * 
     */
    @InputImport(name="instanceUrl", required=true)
    private final Input<String> instanceUrl;

    public Input<String> getInstanceUrl() {
        return this.instanceUrl;
    }

    public ConnectorProfileZendeskConnectorProfilePropertiesArgs(Input<String> instanceUrl) {
        this.instanceUrl = Objects.requireNonNull(instanceUrl, "expected parameter 'instanceUrl' to be non-null");
    }

    private ConnectorProfileZendeskConnectorProfilePropertiesArgs() {
        this.instanceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileZendeskConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileZendeskConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder setInstanceUrl(Input<String> instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }

        public Builder setInstanceUrl(String instanceUrl) {
            this.instanceUrl = Input.of(Objects.requireNonNull(instanceUrl));
            return this;
        }

        public ConnectorProfileZendeskConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileZendeskConnectorProfilePropertiesArgs(instanceUrl);
        }
    }
}
