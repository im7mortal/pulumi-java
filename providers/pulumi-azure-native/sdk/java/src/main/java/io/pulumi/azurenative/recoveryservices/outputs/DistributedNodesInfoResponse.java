// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.ErrorDetailResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributedNodesInfoResponse {
    /**
     * Error Details if the Status is non-success.
     * 
     */
    private final @Nullable ErrorDetailResponse errorDetail;
    /**
     * Name of the node under a distributed container.
     * 
     */
    private final @Nullable String nodeName;
    /**
     * Status of this Node.
     * Failed | Succeeded
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"errorDetail","nodeName","status"})
    private DistributedNodesInfoResponse(
        @Nullable ErrorDetailResponse errorDetail,
        @Nullable String nodeName,
        @Nullable String status) {
        this.errorDetail = errorDetail;
        this.nodeName = nodeName;
        this.status = status;
    }

    /**
     * Error Details if the Status is non-success.
     * 
    */
    public Optional<ErrorDetailResponse> getErrorDetail() {
        return Optional.ofNullable(this.errorDetail);
    }
    /**
     * Name of the node under a distributed container.
     * 
    */
    public Optional<String> getNodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * Status of this Node.
     * Failed | Succeeded
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributedNodesInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorDetailResponse errorDetail;
        private @Nullable String nodeName;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributedNodesInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetail = defaults.errorDetail;
    	      this.nodeName = defaults.nodeName;
    	      this.status = defaults.status;
        }

        public Builder setErrorDetail(@Nullable ErrorDetailResponse errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public DistributedNodesInfoResponse build() {
            return new DistributedNodesInfoResponse(errorDetail, nodeName, status);
        }
    }
}
