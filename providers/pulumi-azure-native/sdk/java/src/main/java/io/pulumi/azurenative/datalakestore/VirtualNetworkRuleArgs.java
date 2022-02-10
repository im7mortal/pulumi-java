// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="subnetId", required=true)
    private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    @InputImport(name="virtualNetworkRuleName")
    private final @Nullable Input<String> virtualNetworkRuleName;

    public Input<String> getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName == null ? Input.empty() : this.virtualNetworkRuleName;
    }

    public VirtualNetworkRuleArgs(
        Input<String> accountName,
        Input<String> resourceGroupName,
        Input<String> subnetId,
        @Nullable Input<String> virtualNetworkRuleName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.virtualNetworkRuleName = virtualNetworkRuleName;
    }

    private VirtualNetworkRuleArgs() {
        this.accountName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subnetId = Input.empty();
        this.virtualNetworkRuleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> resourceGroupName;
        private Input<String> subnetId;
        private @Nullable Input<String> virtualNetworkRuleName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnetId = defaults.subnetId;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
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

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable Input<String> virtualNetworkRuleName) {
            this.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Input.ofNullable(virtualNetworkRuleName);
            return this;
        }

        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(accountName, resourceGroupName, subnetId, virtualNetworkRuleName);
        }
    }
}