// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1AsyncQueryResultResponse {
    /**
     * Query result will be unaccessable after this time.
     * 
     */
    private final String expires;
    /**
     * Self link of the query results. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
     * 
     */
    private final String self;

    @OutputCustomType.Constructor({"expires","self"})
    private GoogleCloudApigeeV1AsyncQueryResultResponse(
        String expires,
        String self) {
        this.expires = Objects.requireNonNull(expires);
        this.self = Objects.requireNonNull(self);
    }

    /**
     * Query result will be unaccessable after this time.
     * 
    */
    public String getExpires() {
        return this.expires;
    }
    /**
     * Self link of the query results. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd/result`
     * 
    */
    public String getSelf() {
        return this.self;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AsyncQueryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expires;
        private String self;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AsyncQueryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expires = defaults.expires;
    	      this.self = defaults.self;
        }

        public Builder setExpires(String expires) {
            this.expires = Objects.requireNonNull(expires);
            return this;
        }

        public Builder setSelf(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }
        public GoogleCloudApigeeV1AsyncQueryResultResponse build() {
            return new GoogleCloudApigeeV1AsyncQueryResultResponse(expires, self);
        }
    }
}
