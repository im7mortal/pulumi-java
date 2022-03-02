// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectorResult {
    /**
     * ID of the connector.
     * 
     */
    private final Integer connectorId;
    /**
     * Name of the connector.
     * 
     */
    private final @Nullable String connectorName;
    /**
     * The connector properties.
     * 
     */
    private final Map<String,Object> connectorProperties;
    /**
     * Type of connector.
     * 
     */
    private final String connectorType;
    /**
     * The created time.
     * 
     */
    private final String created;
    /**
     * Description of the connector.
     * 
     */
    private final @Nullable String description;
    /**
     * Display name of the connector.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * If this is an internal connector.
     * 
     */
    private final @Nullable Boolean isInternal;
    /**
     * The last modified time.
     * 
     */
    private final String lastModified;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * State of connector.
     * 
     */
    private final String state;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"connectorId","connectorName","connectorProperties","connectorType","created","description","displayName","id","isInternal","lastModified","name","state","tenantId","type"})
    private GetConnectorResult(
        Integer connectorId,
        @Nullable String connectorName,
        Map<String,Object> connectorProperties,
        String connectorType,
        String created,
        @Nullable String description,
        @Nullable String displayName,
        String id,
        @Nullable Boolean isInternal,
        String lastModified,
        String name,
        String state,
        String tenantId,
        String type) {
        this.connectorId = Objects.requireNonNull(connectorId);
        this.connectorName = connectorName;
        this.connectorProperties = Objects.requireNonNull(connectorProperties);
        this.connectorType = Objects.requireNonNull(connectorType);
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.isInternal = isInternal;
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ID of the connector.
     * 
    */
    public Integer getConnectorId() {
        return this.connectorId;
    }
    /**
     * Name of the connector.
     * 
    */
    public Optional<String> getConnectorName() {
        return Optional.ofNullable(this.connectorName);
    }
    /**
     * The connector properties.
     * 
    */
    public Map<String,Object> getConnectorProperties() {
        return this.connectorProperties;
    }
    /**
     * Type of connector.
     * 
    */
    public String getConnectorType() {
        return this.connectorType;
    }
    /**
     * The created time.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Description of the connector.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Display name of the connector.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * If this is an internal connector.
     * 
    */
    public Optional<Boolean> getIsInternal() {
        return Optional.ofNullable(this.isInternal);
    }
    /**
     * The last modified time.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of connector.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The hub name.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
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

    public static Builder builder(GetConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer connectorId;
        private @Nullable String connectorName;
        private Map<String,Object> connectorProperties;
        private String connectorType;
        private String created;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Boolean isInternal;
        private String lastModified;
        private String name;
        private String state;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorId = defaults.connectorId;
    	      this.connectorName = defaults.connectorName;
    	      this.connectorProperties = defaults.connectorProperties;
    	      this.connectorType = defaults.connectorType;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.isInternal = defaults.isInternal;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setConnectorId(Integer connectorId) {
            this.connectorId = Objects.requireNonNull(connectorId);
            return this;
        }

        public Builder setConnectorName(@Nullable String connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        public Builder setConnectorProperties(Map<String,Object> connectorProperties) {
            this.connectorProperties = Objects.requireNonNull(connectorProperties);
            return this;
        }

        public Builder setConnectorType(String connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsInternal(@Nullable Boolean isInternal) {
            this.isInternal = isInternal;
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectorResult build() {
            return new GetConnectorResult(connectorId, connectorName, connectorProperties, connectorType, created, description, displayName, id, isInternal, lastModified, name, state, tenantId, type);
        }
    }
}
