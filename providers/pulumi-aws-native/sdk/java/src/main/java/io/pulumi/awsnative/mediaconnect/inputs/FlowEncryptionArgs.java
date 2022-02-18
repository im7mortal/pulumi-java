// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowEncryptionKeyType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the encryption of the flow.
 * 
 */
public final class FlowEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowEncryptionArgs Empty = new FlowEncryptionArgs();

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @InputImport(name="algorithm")
    private final @Nullable Input<FlowEncryptionAlgorithm> algorithm;

    public Input<FlowEncryptionAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
     * 
     */
    @InputImport(name="constantInitializationVector")
    private final @Nullable Input<String> constantInitializationVector;

    public Input<String> getConstantInitializationVector() {
        return this.constantInitializationVector == null ? Input.empty() : this.constantInitializationVector;
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="deviceId")
    private final @Nullable Input<String> deviceId;

    public Input<String> getDeviceId() {
        return this.deviceId == null ? Input.empty() : this.deviceId;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @InputImport(name="keyType")
    private final @Nullable Input<FlowEncryptionKeyType> keyType;

    public Input<FlowEncryptionKeyType> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    @InputImport(name="secretArn")
    private final @Nullable Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn == null ? Input.empty() : this.secretArn;
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public FlowEncryptionArgs(
        @Nullable Input<FlowEncryptionAlgorithm> algorithm,
        @Nullable Input<String> constantInitializationVector,
        @Nullable Input<String> deviceId,
        @Nullable Input<FlowEncryptionKeyType> keyType,
        @Nullable Input<String> region,
        @Nullable Input<String> resourceId,
        Input<String> roleArn,
        @Nullable Input<String> secretArn,
        @Nullable Input<String> url) {
        this.algorithm = algorithm;
        this.constantInitializationVector = constantInitializationVector;
        this.deviceId = deviceId;
        this.keyType = keyType;
        this.region = region;
        this.resourceId = resourceId;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretArn = secretArn;
        this.url = url;
    }

    private FlowEncryptionArgs() {
        this.algorithm = Input.empty();
        this.constantInitializationVector = Input.empty();
        this.deviceId = Input.empty();
        this.keyType = Input.empty();
        this.region = Input.empty();
        this.resourceId = Input.empty();
        this.roleArn = Input.empty();
        this.secretArn = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowEncryptionAlgorithm> algorithm;
        private @Nullable Input<String> constantInitializationVector;
        private @Nullable Input<String> deviceId;
        private @Nullable Input<FlowEncryptionKeyType> keyType;
        private @Nullable Input<String> region;
        private @Nullable Input<String> resourceId;
        private Input<String> roleArn;
        private @Nullable Input<String> secretArn;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.deviceId = defaults.deviceId;
    	      this.keyType = defaults.keyType;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.roleArn = defaults.roleArn;
    	      this.secretArn = defaults.secretArn;
    	      this.url = defaults.url;
        }

        public Builder setAlgorithm(@Nullable Input<FlowEncryptionAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable FlowEncryptionAlgorithm algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setConstantInitializationVector(@Nullable Input<String> constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = Input.ofNullable(constantInitializationVector);
            return this;
        }

        public Builder setDeviceId(@Nullable Input<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder setDeviceId(@Nullable String deviceId) {
            this.deviceId = Input.ofNullable(deviceId);
            return this;
        }

        public Builder setKeyType(@Nullable Input<FlowEncryptionKeyType> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setKeyType(@Nullable FlowEncryptionKeyType keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setSecretArn(@Nullable Input<String> secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = Input.ofNullable(secretArn);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public FlowEncryptionArgs build() {
            return new FlowEncryptionArgs(algorithm, constantInitializationVector, deviceId, keyType, region, resourceId, roleArn, secretArn, url);
        }
    }
}
