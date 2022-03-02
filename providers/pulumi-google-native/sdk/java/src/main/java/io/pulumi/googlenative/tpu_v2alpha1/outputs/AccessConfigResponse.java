// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AccessConfigResponse {
    /**
     * An external IP address associated with the TPU worker.
     * 
     */
    private final String externalIp;

    @OutputCustomType.Constructor({"externalIp"})
    private AccessConfigResponse(String externalIp) {
        this.externalIp = Objects.requireNonNull(externalIp);
    }

    /**
     * An external IP address associated with the TPU worker.
     * 
    */
    public String getExternalIp() {
        return this.externalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public AccessConfigResponse build() {
            return new AccessConfigResponse(externalIp);
        }
    }
}
