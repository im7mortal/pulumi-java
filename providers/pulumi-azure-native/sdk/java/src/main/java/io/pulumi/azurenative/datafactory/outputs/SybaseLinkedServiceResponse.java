// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SybaseLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * AuthenticationType to be used for connection.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
     */
    private final Object database;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password for authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Schema name for connection. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object schema;
    /**
     * Server name for connection. Type: string (or Expression with resultType string).
     * 
     */
    private final Object server;
    /**
     * Type of linked service.
     * Expected value is 'Sybase'.
     * 
     */
    private final String type;
    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"annotations","authenticationType","connectVia","database","description","encryptedCredential","parameters","password","schema","server","type","username"})
    private SybaseLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object database,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object schema,
        Object server,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.database = Objects.requireNonNull(database);
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.schema = schema;
        this.server = Objects.requireNonNull(server);
        this.type = Objects.requireNonNull(type);
        this.username = username;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * AuthenticationType to be used for connection.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
    */
    public Object getDatabase() {
        return this.database;
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password for authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Schema name for connection. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Server name for connection. Type: string (or Expression with resultType string).
     * 
    */
    public Object getServer() {
        return this.server;
    }
    /**
     * Type of linked service.
     * Expected value is 'Sybase'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SybaseLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object database;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object schema;
        private Object server;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(SybaseLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.schema = defaults.schema;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDatabase(Object database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder setServer(Object server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public SybaseLinkedServiceResponse build() {
            return new SybaseLinkedServiceResponse(annotations, authenticationType, connectVia, database, description, encryptedCredential, parameters, password, schema, server, type, username);
        }
    }
}
