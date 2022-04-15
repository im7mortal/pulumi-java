// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceSubresourceScale {
    /**
     * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
     */
    private final @Nullable String labelSelectorPath;
    /**
     * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
     */
    private final String specReplicasPath;
    /**
     * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
     */
    private final String statusReplicasPath;

    @CustomType.Constructor
    private CustomResourceSubresourceScale(
        @CustomType.Parameter("labelSelectorPath") @Nullable String labelSelectorPath,
        @CustomType.Parameter("specReplicasPath") String specReplicasPath,
        @CustomType.Parameter("statusReplicasPath") String statusReplicasPath) {
        this.labelSelectorPath = labelSelectorPath;
        this.specReplicasPath = specReplicasPath;
        this.statusReplicasPath = statusReplicasPath;
    }

    /**
     * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     * 
    */
    public Optional<String> labelSelectorPath() {
        return Optional.ofNullable(this.labelSelectorPath);
    }
    /**
     * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     * 
    */
    public String specReplicasPath() {
        return this.specReplicasPath;
    }
    /**
     * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     * 
    */
    public String statusReplicasPath() {
        return this.statusReplicasPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresourceScale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String labelSelectorPath;
        private String specReplicasPath;
        private String statusReplicasPath;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresourceScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelectorPath = defaults.labelSelectorPath;
    	      this.specReplicasPath = defaults.specReplicasPath;
    	      this.statusReplicasPath = defaults.statusReplicasPath;
        }

        public Builder labelSelectorPath(@Nullable String labelSelectorPath) {
            this.labelSelectorPath = labelSelectorPath;
            return this;
        }
        public Builder specReplicasPath(String specReplicasPath) {
            this.specReplicasPath = Objects.requireNonNull(specReplicasPath);
            return this;
        }
        public Builder statusReplicasPath(String statusReplicasPath) {
            this.statusReplicasPath = Objects.requireNonNull(statusReplicasPath);
            return this;
        }        public CustomResourceSubresourceScale build() {
            return new CustomResourceSubresourceScale(labelSelectorPath, specReplicasPath, statusReplicasPath);
        }
    }
}
