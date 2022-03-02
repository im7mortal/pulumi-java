// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.outputs;

import io.pulumi.azurenative.certificateregistration.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppServiceCertificateOrderCertificateResult {
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Key Vault resource Id.
     * 
     */
    private final @Nullable String keyVaultId;
    /**
     * Key Vault secret name.
     * 
     */
    private final @Nullable String keyVaultSecretName;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Status of the Key Vault secret.
     * 
     */
    private final String provisioningState;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","keyVaultId","keyVaultSecretName","kind","location","name","provisioningState","systemData","tags","type"})
    private GetAppServiceCertificateOrderCertificateResult(
        String id,
        @Nullable String keyVaultId,
        @Nullable String keyVaultSecretName,
        @Nullable String kind,
        String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Key Vault resource Id.
     * 
    */
    public Optional<String> getKeyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * Key Vault secret name.
     * 
    */
    public Optional<String> getKeyVaultSecretName() {
        return Optional.ofNullable(this.keyVaultSecretName);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Status of the Key Vault secret.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceCertificateOrderCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultSecretName;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceCertificateOrderCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAppServiceCertificateOrderCertificateResult build() {
            return new GetAppServiceCertificateOrderCertificateResult(id, keyVaultId, keyVaultSecretName, kind, location, name, provisioningState, systemData, tags, type);
        }
    }
}
