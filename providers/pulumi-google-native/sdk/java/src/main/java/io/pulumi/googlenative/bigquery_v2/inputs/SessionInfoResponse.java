// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SessionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SessionInfoResponse Empty = new SessionInfoResponse();

    @InputImport(name="sessionId", required=true)
    private final String sessionId;

    public String getSessionId() {
        return this.sessionId;
    }

    public SessionInfoResponse(String sessionId) {
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
    }

    private SessionInfoResponse() {
        this.sessionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sessionId;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sessionId = defaults.sessionId;
        }

        public Builder setSessionId(String sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }

        public SessionInfoResponse build() {
            return new SessionInfoResponse(sessionId);
        }
    }
}