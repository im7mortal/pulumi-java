// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListOpenShiftClusterAdminCredentialsResult {
    /**
     * The base64-encoded kubeconfig file.
     * 
     */
    private final @Nullable String kubeconfig;

    @OutputCustomType.Constructor({"kubeconfig"})
    private ListOpenShiftClusterAdminCredentialsResult(@Nullable String kubeconfig) {
        this.kubeconfig = kubeconfig;
    }

    /**
     * The base64-encoded kubeconfig file.
     * 
    */
    public Optional<String> getKubeconfig() {
        return Optional.ofNullable(this.kubeconfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListOpenShiftClusterAdminCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kubeconfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ListOpenShiftClusterAdminCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubeconfig = defaults.kubeconfig;
        }

        public Builder setKubeconfig(@Nullable String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }
        public ListOpenShiftClusterAdminCredentialsResult build() {
            return new ListOpenShiftClusterAdminCredentialsResult(kubeconfig);
        }
    }
}
