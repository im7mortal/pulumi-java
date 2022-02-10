// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1.inputs.CertificateProviderInstanceArgs;
import io.pulumi.googlenative.networksecurity_v1.inputs.GoogleCloudNetworksecurityV1GrpcEndpointArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ValidationCAArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidationCAArgs Empty = new ValidationCAArgs();

    @InputImport(name="certificateProviderInstance")
    private final @Nullable Input<CertificateProviderInstanceArgs> certificateProviderInstance;

    public Input<CertificateProviderInstanceArgs> getCertificateProviderInstance() {
        return this.certificateProviderInstance == null ? Input.empty() : this.certificateProviderInstance;
    }

    @InputImport(name="grpcEndpoint")
    private final @Nullable Input<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint;

    public Input<GoogleCloudNetworksecurityV1GrpcEndpointArgs> getGrpcEndpoint() {
        return this.grpcEndpoint == null ? Input.empty() : this.grpcEndpoint;
    }

    public ValidationCAArgs(
        @Nullable Input<CertificateProviderInstanceArgs> certificateProviderInstance,
        @Nullable Input<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint) {
        this.certificateProviderInstance = certificateProviderInstance;
        this.grpcEndpoint = grpcEndpoint;
    }

    private ValidationCAArgs() {
        this.certificateProviderInstance = Input.empty();
        this.grpcEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationCAArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateProviderInstanceArgs> certificateProviderInstance;
        private @Nullable Input<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationCAArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        public Builder setCertificateProviderInstance(@Nullable Input<CertificateProviderInstanceArgs> certificateProviderInstance) {
            this.certificateProviderInstance = certificateProviderInstance;
            return this;
        }

        public Builder setCertificateProviderInstance(@Nullable CertificateProviderInstanceArgs certificateProviderInstance) {
            this.certificateProviderInstance = Input.ofNullable(certificateProviderInstance);
            return this;
        }

        public Builder setGrpcEndpoint(@Nullable Input<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }

        public Builder setGrpcEndpoint(@Nullable GoogleCloudNetworksecurityV1GrpcEndpointArgs grpcEndpoint) {
            this.grpcEndpoint = Input.ofNullable(grpcEndpoint);
            return this;
        }

        public ValidationCAArgs build() {
            return new ValidationCAArgs(certificateProviderInstance, grpcEndpoint);
        }
    }
}