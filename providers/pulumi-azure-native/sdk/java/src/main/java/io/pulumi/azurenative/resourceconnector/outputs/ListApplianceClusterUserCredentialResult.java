// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.outputs;

import io.pulumi.azurenative.resourceconnector.outputs.ApplianceCredentialKubeconfigResponse;
import io.pulumi.azurenative.resourceconnector.outputs.HybridConnectionConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListApplianceClusterUserCredentialResult {
    /**
     * Contains the REP (rendezvous endpoint) and “Listener” access token from notification service (NS).
     * 
     */
    private final HybridConnectionConfigResponse hybridConnectionConfig;
    /**
     * The list of appliance kubeconfigs.
     * 
     */
    private final List<ApplianceCredentialKubeconfigResponse> kubeconfigs;

    @OutputCustomType.Constructor({"hybridConnectionConfig","kubeconfigs"})
    private ListApplianceClusterUserCredentialResult(
        HybridConnectionConfigResponse hybridConnectionConfig,
        List<ApplianceCredentialKubeconfigResponse> kubeconfigs) {
        this.hybridConnectionConfig = Objects.requireNonNull(hybridConnectionConfig);
        this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
    }

    /**
     * Contains the REP (rendezvous endpoint) and “Listener” access token from notification service (NS).
     * 
    */
    public HybridConnectionConfigResponse getHybridConnectionConfig() {
        return this.hybridConnectionConfig;
    }
    /**
     * The list of appliance kubeconfigs.
     * 
    */
    public List<ApplianceCredentialKubeconfigResponse> getKubeconfigs() {
        return this.kubeconfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListApplianceClusterUserCredentialResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridConnectionConfigResponse hybridConnectionConfig;
        private List<ApplianceCredentialKubeconfigResponse> kubeconfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListApplianceClusterUserCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hybridConnectionConfig = defaults.hybridConnectionConfig;
    	      this.kubeconfigs = defaults.kubeconfigs;
        }

        public Builder setHybridConnectionConfig(HybridConnectionConfigResponse hybridConnectionConfig) {
            this.hybridConnectionConfig = Objects.requireNonNull(hybridConnectionConfig);
            return this;
        }

        public Builder setKubeconfigs(List<ApplianceCredentialKubeconfigResponse> kubeconfigs) {
            this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
            return this;
        }
        public ListApplianceClusterUserCredentialResult build() {
            return new ListApplianceClusterUserCredentialResult(hybridConnectionConfig, kubeconfigs);
        }
    }
}
