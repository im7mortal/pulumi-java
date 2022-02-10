// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BucketCorsItemResponse {
    private final Integer maxAgeSeconds;
    private final List<String> method;
    private final List<String> origin;
    private final List<String> responseHeader;

    @OutputCustomType.Constructor({"maxAgeSeconds","method","origin","responseHeader"})
    private BucketCorsItemResponse(
        Integer maxAgeSeconds,
        List<String> method,
        List<String> origin,
        List<String> responseHeader) {
        this.maxAgeSeconds = Objects.requireNonNull(maxAgeSeconds);
        this.method = Objects.requireNonNull(method);
        this.origin = Objects.requireNonNull(origin);
        this.responseHeader = Objects.requireNonNull(responseHeader);
    }

    public Integer getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    public List<String> getMethod() {
        return this.method;
    }
    public List<String> getOrigin() {
        return this.origin;
    }
    public List<String> getResponseHeader() {
        return this.responseHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxAgeSeconds;
        private List<String> method;
        private List<String> origin;
        private List<String> responseHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.method = defaults.method;
    	      this.origin = defaults.origin;
    	      this.responseHeader = defaults.responseHeader;
        }

        public Builder setMaxAgeSeconds(Integer maxAgeSeconds) {
            this.maxAgeSeconds = Objects.requireNonNull(maxAgeSeconds);
            return this;
        }

        public Builder setMethod(List<String> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setOrigin(List<String> origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }

        public Builder setResponseHeader(List<String> responseHeader) {
            this.responseHeader = Objects.requireNonNull(responseHeader);
            return this;
        }

        public BucketCorsItemResponse build() {
            return new BucketCorsItemResponse(maxAgeSeconds, method, origin, responseHeader);
        }
    }
}