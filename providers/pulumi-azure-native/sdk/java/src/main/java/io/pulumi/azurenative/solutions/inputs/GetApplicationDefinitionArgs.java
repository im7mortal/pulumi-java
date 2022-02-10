// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationDefinitionArgs Empty = new GetApplicationDefinitionArgs();

    @InputImport(name="applicationDefinitionName", required=true)
    private final String applicationDefinitionName;

    public String getApplicationDefinitionName() {
        return this.applicationDefinitionName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetApplicationDefinitionArgs(
        String applicationDefinitionName,
        String resourceGroupName) {
        this.applicationDefinitionName = Objects.requireNonNull(applicationDefinitionName, "expected parameter 'applicationDefinitionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetApplicationDefinitionArgs() {
        this.applicationDefinitionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationDefinitionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDefinitionName = defaults.applicationDefinitionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setApplicationDefinitionName(String applicationDefinitionName) {
            this.applicationDefinitionName = Objects.requireNonNull(applicationDefinitionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetApplicationDefinitionArgs build() {
            return new GetApplicationDefinitionArgs(applicationDefinitionName, resourceGroupName);
        }
    }
}