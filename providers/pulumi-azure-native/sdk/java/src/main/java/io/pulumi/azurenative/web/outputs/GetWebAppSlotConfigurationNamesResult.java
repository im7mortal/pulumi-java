// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSlotConfigurationNamesResult {
    /**
     * List of application settings names.
     * 
     */
    private final @Nullable List<String> appSettingNames;
    /**
     * List of external Azure storage account identifiers.
     * 
     */
    private final @Nullable List<String> azureStorageConfigNames;
    /**
     * List of connection string names.
     * 
     */
    private final @Nullable List<String> connectionStringNames;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"appSettingNames","azureStorageConfigNames","connectionStringNames","id","kind","name","type"})
    private GetWebAppSlotConfigurationNamesResult(
        @Nullable List<String> appSettingNames,
        @Nullable List<String> azureStorageConfigNames,
        @Nullable List<String> connectionStringNames,
        String id,
        @Nullable String kind,
        String name,
        String type) {
        this.appSettingNames = appSettingNames;
        this.azureStorageConfigNames = azureStorageConfigNames;
        this.connectionStringNames = connectionStringNames;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of application settings names.
     * 
    */
    public List<String> getAppSettingNames() {
        return this.appSettingNames == null ? List.of() : this.appSettingNames;
    }
    /**
     * List of external Azure storage account identifiers.
     * 
    */
    public List<String> getAzureStorageConfigNames() {
        return this.azureStorageConfigNames == null ? List.of() : this.azureStorageConfigNames;
    }
    /**
     * List of connection string names.
     * 
    */
    public List<String> getConnectionStringNames() {
        return this.connectionStringNames == null ? List.of() : this.connectionStringNames;
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
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

    public static Builder builder(GetWebAppSlotConfigurationNamesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> appSettingNames;
        private @Nullable List<String> azureStorageConfigNames;
        private @Nullable List<String> connectionStringNames;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSlotConfigurationNamesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettingNames = defaults.appSettingNames;
    	      this.azureStorageConfigNames = defaults.azureStorageConfigNames;
    	      this.connectionStringNames = defaults.connectionStringNames;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setAppSettingNames(@Nullable List<String> appSettingNames) {
            this.appSettingNames = appSettingNames;
            return this;
        }

        public Builder setAzureStorageConfigNames(@Nullable List<String> azureStorageConfigNames) {
            this.azureStorageConfigNames = azureStorageConfigNames;
            return this;
        }

        public Builder setConnectionStringNames(@Nullable List<String> connectionStringNames) {
            this.connectionStringNames = connectionStringNames;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppSlotConfigurationNamesResult build() {
            return new GetWebAppSlotConfigurationNamesResult(appSettingNames, azureStorageConfigNames, connectionStringNames, id, kind, name, type);
        }
    }
}
