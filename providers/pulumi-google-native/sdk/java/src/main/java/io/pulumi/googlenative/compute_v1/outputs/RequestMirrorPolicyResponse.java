// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RequestMirrorPolicyResponse {
    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final String backendService;

    @OutputCustomType.Constructor({"backendService"})
    private RequestMirrorPolicyResponse(String backendService) {
        this.backendService = Objects.requireNonNull(backendService);
    }

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
    */
    public String getBackendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public RequestMirrorPolicyResponse build() {
            return new RequestMirrorPolicyResponse(backendService);
        }
    }
}
