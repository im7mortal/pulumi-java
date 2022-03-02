// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobLocationResponse {
    /**
     * Access credentials for the blob, if applicable (e.g. blob specified by storage account connection string + blob URI)
     * 
     */
    private final @Nullable String credentials;
    /**
     * The URI from which the blob is accessible from. For example, aml://abc for system assets or https://xyz for user assets or payload.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"credentials","uri"})
    private BlobLocationResponse(
        @Nullable String credentials,
        String uri) {
        this.credentials = credentials;
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Access credentials for the blob, if applicable (e.g. blob specified by storage account connection string + blob URI)
     * 
    */
    public Optional<String> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The URI from which the blob is accessible from. For example, aml://abc for system assets or https://xyz for user assets or payload.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String credentials;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.uri = defaults.uri;
        }

        public Builder setCredentials(@Nullable String credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public BlobLocationResponse build() {
            return new BlobLocationResponse(credentials, uri);
        }
    }
}
