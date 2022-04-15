// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.ConfigMapKeySelector;
import io.pulumi.kubernetes.core_v1.outputs.ObjectFieldSelector;
import io.pulumi.kubernetes.core_v1.outputs.ResourceFieldSelector;
import io.pulumi.kubernetes.core_v1.outputs.SecretKeySelector;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvVarSource {
    /**
     * Selects a key of a ConfigMap.
     * 
     */
    private final @Nullable ConfigMapKeySelector configMapKeyRef;
    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    private final @Nullable ObjectFieldSelector fieldRef;
    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    private final @Nullable ResourceFieldSelector resourceFieldRef;
    /**
     * Selects a key of a secret in the pod's namespace
     * 
     */
    private final @Nullable SecretKeySelector secretKeyRef;

    @CustomType.Constructor
    private EnvVarSource(
        @CustomType.Parameter("configMapKeyRef") @Nullable ConfigMapKeySelector configMapKeyRef,
        @CustomType.Parameter("fieldRef") @Nullable ObjectFieldSelector fieldRef,
        @CustomType.Parameter("resourceFieldRef") @Nullable ResourceFieldSelector resourceFieldRef,
        @CustomType.Parameter("secretKeyRef") @Nullable SecretKeySelector secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * Selects a key of a ConfigMap.
     * 
    */
    public Optional<ConfigMapKeySelector> configMapKeyRef() {
        return Optional.ofNullable(this.configMapKeyRef);
    }
    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
    */
    public Optional<ObjectFieldSelector> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }
    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
    */
    public Optional<ResourceFieldSelector> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }
    /**
     * Selects a key of a secret in the pod's namespace
     * 
    */
    public Optional<SecretKeySelector> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigMapKeySelector configMapKeyRef;
        private @Nullable ObjectFieldSelector fieldRef;
        private @Nullable ResourceFieldSelector resourceFieldRef;
        private @Nullable SecretKeySelector secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.fieldRef = defaults.fieldRef;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder configMapKeyRef(@Nullable ConfigMapKeySelector configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }
        public Builder fieldRef(@Nullable ObjectFieldSelector fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public Builder resourceFieldRef(@Nullable ResourceFieldSelector resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }
        public Builder secretKeyRef(@Nullable SecretKeySelector secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }        public EnvVarSource build() {
            return new EnvVarSource(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
        }
    }
}
