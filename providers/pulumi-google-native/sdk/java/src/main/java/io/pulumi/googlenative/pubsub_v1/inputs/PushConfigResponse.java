// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1.inputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class PushConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PushConfigResponse Empty = new PushConfigResponse();

    @InputImport(name="attributes", required=true)
    private final Map<String,String> attributes;

    public Map<String,String> getAttributes() {
        return this.attributes;
    }

    @InputImport(name="oidcToken", required=true)
    private final OidcTokenResponse oidcToken;

    public OidcTokenResponse getOidcToken() {
        return this.oidcToken;
    }

    @InputImport(name="pushEndpoint", required=true)
    private final String pushEndpoint;

    public String getPushEndpoint() {
        return this.pushEndpoint;
    }

    public PushConfigResponse(
        Map<String,String> attributes,
        OidcTokenResponse oidcToken,
        String pushEndpoint) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.oidcToken = Objects.requireNonNull(oidcToken, "expected parameter 'oidcToken' to be non-null");
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
    }

    private PushConfigResponse() {
        this.attributes = Map.of();
        this.oidcToken = null;
        this.pushEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> attributes;
        private OidcTokenResponse oidcToken;
        private String pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.oidcToken = defaults.oidcToken;
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setAttributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setOidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }

        public Builder setPushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }

        public PushConfigResponse build() {
            return new PushConfigResponse(attributes, oidcToken, pushEndpoint);
        }
    }
}