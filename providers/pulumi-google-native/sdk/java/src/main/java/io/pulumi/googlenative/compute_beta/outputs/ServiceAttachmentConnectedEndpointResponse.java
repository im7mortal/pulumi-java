// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceAttachmentConnectedEndpointResponse {
    /**
     * The url of a connected endpoint.
     * 
     */
    private final String endpoint;
    /**
     * The PSC connection id of the connected endpoint.
     * 
     */
    private final String pscConnectionId;
    /**
     * The status of a connected endpoint to this service attachment.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"endpoint","pscConnectionId","status"})
    private ServiceAttachmentConnectedEndpointResponse(
        String endpoint,
        String pscConnectionId,
        String status) {
        this.endpoint = Objects.requireNonNull(endpoint);
        this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The url of a connected endpoint.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The PSC connection id of the connected endpoint.
     * 
    */
    public String getPscConnectionId() {
        return this.pscConnectionId;
    }
    /**
     * The status of a connected endpoint to this service attachment.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConnectedEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String pscConnectionId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConnectedEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.status = defaults.status;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setPscConnectionId(String pscConnectionId) {
            this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ServiceAttachmentConnectedEndpointResponse build() {
            return new ServiceAttachmentConnectedEndpointResponse(endpoint, pscConnectionId, status);
        }
    }
}
