// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeModuleArgs Empty = new EdgeModuleArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="edgeModuleName")
    private final @Nullable Input<String> edgeModuleName;

    public Input<String> getEdgeModuleName() {
        return this.edgeModuleName == null ? Input.empty() : this.edgeModuleName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public EdgeModuleArgs(
        Input<String> accountName,
        @Nullable Input<String> edgeModuleName,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.edgeModuleName = edgeModuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private EdgeModuleArgs() {
        this.accountName = Input.empty();
        this.edgeModuleName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> edgeModuleName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.edgeModuleName = defaults.edgeModuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setEdgeModuleName(@Nullable Input<String> edgeModuleName) {
            this.edgeModuleName = edgeModuleName;
            return this;
        }

        public Builder setEdgeModuleName(@Nullable String edgeModuleName) {
            this.edgeModuleName = Input.ofNullable(edgeModuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public EdgeModuleArgs build() {
            return new EdgeModuleArgs(accountName, edgeModuleName, resourceGroupName);
        }
    }
}