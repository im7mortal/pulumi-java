// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceOptionsResponse {
    /**
     * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    private final String connectVersion;
    /**
     * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    private final String k8sVersion;
    /**
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions <1.16.
     * 
     */
    private final Boolean v1beta1Crd;

    @OutputCustomType.Constructor({"connectVersion","k8sVersion","v1beta1Crd"})
    private ResourceOptionsResponse(
        String connectVersion,
        String k8sVersion,
        Boolean v1beta1Crd) {
        this.connectVersion = Objects.requireNonNull(connectVersion);
        this.k8sVersion = Objects.requireNonNull(k8sVersion);
        this.v1beta1Crd = Objects.requireNonNull(v1beta1Crd);
    }

    /**
     * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
    */
    public String getConnectVersion() {
        return this.connectVersion;
    }
    /**
     * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
    */
    public String getK8sVersion() {
        return this.k8sVersion;
    }
    /**
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions <1.16.
     * 
    */
    public Boolean getV1beta1Crd() {
        return this.v1beta1Crd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectVersion;
        private String k8sVersion;
        private Boolean v1beta1Crd;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVersion = defaults.connectVersion;
    	      this.k8sVersion = defaults.k8sVersion;
    	      this.v1beta1Crd = defaults.v1beta1Crd;
        }

        public Builder setConnectVersion(String connectVersion) {
            this.connectVersion = Objects.requireNonNull(connectVersion);
            return this;
        }

        public Builder setK8sVersion(String k8sVersion) {
            this.k8sVersion = Objects.requireNonNull(k8sVersion);
            return this;
        }

        public Builder setV1beta1Crd(Boolean v1beta1Crd) {
            this.v1beta1Crd = Objects.requireNonNull(v1beta1Crd);
            return this;
        }
        public ResourceOptionsResponse build() {
            return new ResourceOptionsResponse(connectVersion, k8sVersion, v1beta1Crd);
        }
    }
}
