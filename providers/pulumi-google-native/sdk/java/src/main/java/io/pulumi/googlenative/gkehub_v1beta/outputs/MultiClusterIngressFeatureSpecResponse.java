// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MultiClusterIngressFeatureSpecResponse {
    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    private final String configMembership;

    @OutputCustomType.Constructor({"configMembership"})
    private MultiClusterIngressFeatureSpecResponse(String configMembership) {
        this.configMembership = Objects.requireNonNull(configMembership);
    }

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
    */
    public String getConfigMembership() {
        return this.configMembership;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterIngressFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configMembership;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterIngressFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMembership = defaults.configMembership;
        }

        public Builder setConfigMembership(String configMembership) {
            this.configMembership = Objects.requireNonNull(configMembership);
            return this;
        }
        public MultiClusterIngressFeatureSpecResponse build() {
            return new MultiClusterIngressFeatureSpecResponse(configMembership);
        }
    }
}
