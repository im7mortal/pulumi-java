// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gkehub_v1beta.outputs.AppDevExperienceFeatureSpecResponse;
import io.pulumi.googlenative.gkehub_v1beta.outputs.MultiClusterIngressFeatureSpecResponse;
import java.util.Objects;

@OutputCustomType
public final class CommonFeatureSpecResponse {
    /**
     * Appdevexperience specific spec.
     * 
     */
    private final AppDevExperienceFeatureSpecResponse appdevexperience;
    /**
     * Multicluster Ingress-specific spec.
     * 
     */
    private final MultiClusterIngressFeatureSpecResponse multiclusteringress;

    @OutputCustomType.Constructor({"appdevexperience","multiclusteringress"})
    private CommonFeatureSpecResponse(
        AppDevExperienceFeatureSpecResponse appdevexperience,
        MultiClusterIngressFeatureSpecResponse multiclusteringress) {
        this.appdevexperience = Objects.requireNonNull(appdevexperience);
        this.multiclusteringress = Objects.requireNonNull(multiclusteringress);
    }

    /**
     * Appdevexperience specific spec.
     * 
    */
    public AppDevExperienceFeatureSpecResponse getAppdevexperience() {
        return this.appdevexperience;
    }
    /**
     * Multicluster Ingress-specific spec.
     * 
    */
    public MultiClusterIngressFeatureSpecResponse getMulticlusteringress() {
        return this.multiclusteringress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDevExperienceFeatureSpecResponse appdevexperience;
        private MultiClusterIngressFeatureSpecResponse multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder setAppdevexperience(AppDevExperienceFeatureSpecResponse appdevexperience) {
            this.appdevexperience = Objects.requireNonNull(appdevexperience);
            return this;
        }

        public Builder setMulticlusteringress(MultiClusterIngressFeatureSpecResponse multiclusteringress) {
            this.multiclusteringress = Objects.requireNonNull(multiclusteringress);
            return this;
        }
        public CommonFeatureSpecResponse build() {
            return new CommonFeatureSpecResponse(appdevexperience, multiclusteringress);
        }
    }
}
