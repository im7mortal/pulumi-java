// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HttpsTriggerResponse {
    private final String securityLevel;
    private final String url;

    @OutputCustomType.Constructor({"securityLevel","url"})
    private HttpsTriggerResponse(
        String securityLevel,
        String url) {
        this.securityLevel = Objects.requireNonNull(securityLevel);
        this.url = Objects.requireNonNull(url);
    }

    public String getSecurityLevel() {
        return this.securityLevel;
    }
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpsTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityLevel;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpsTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder setSecurityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public HttpsTriggerResponse build() {
            return new HttpsTriggerResponse(securityLevel, url);
        }
    }
}