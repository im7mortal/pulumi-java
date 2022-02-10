// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiagnosticStoragePropertiesResponse {
    private final String authenticationType;
    private final @Nullable String connectionString;
    private final String resourceId;

    @OutputCustomType.Constructor({"authenticationType","connectionString","resourceId"})
    private DiagnosticStoragePropertiesResponse(
        String authenticationType,
        @Nullable String connectionString,
        String resourceId) {
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.connectionString = connectionString;
        this.resourceId = Objects.requireNonNull(resourceId);
    }

    public String getAuthenticationType() {
        return this.authenticationType;
    }
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticStoragePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationType;
        private @Nullable String connectionString;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticStoragePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public DiagnosticStoragePropertiesResponse build() {
            return new DiagnosticStoragePropertiesResponse(authenticationType, connectionString, resourceId);
        }
    }
}