// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomDomainPropertiesResponse Empty = new CustomDomainPropertiesResponse();

    @InputImport(name="appName", required=true)
    private final String appName;

    public String getAppName() {
        return this.appName;
    }

    @InputImport(name="certName")
    private final @Nullable String certName;

    public Optional<String> getCertName() {
        return this.certName == null ? Optional.empty() : Optional.ofNullable(this.certName);
    }

    @InputImport(name="thumbprint")
    private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public CustomDomainPropertiesResponse(
        String appName,
        @Nullable String certName,
        @Nullable String thumbprint) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.certName = certName;
        this.thumbprint = thumbprint;
    }

    private CustomDomainPropertiesResponse() {
        this.appName = null;
        this.certName = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private @Nullable String certName;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.certName = defaults.certName;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setAppName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setCertName(@Nullable String certName) {
            this.certName = certName;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public CustomDomainPropertiesResponse build() {
            return new CustomDomainPropertiesResponse(appName, certName, thumbprint);
        }
    }
}