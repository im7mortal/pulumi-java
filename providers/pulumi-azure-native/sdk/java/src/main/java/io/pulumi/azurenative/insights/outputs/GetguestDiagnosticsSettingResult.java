// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.DataSourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetguestDiagnosticsSettingResult {
    /**
     * the array of data source object which are configured to collect and send data
     * 
     */
    private final @Nullable List<DataSourceResponse> dataSources;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * Operating system type for the configuration
     * 
     */
    private final @Nullable String osType;
    private final @Nullable String proxySetting;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataSources","id","location","name","osType","proxySetting","tags","type"})
    private GetguestDiagnosticsSettingResult(
        @Nullable List<DataSourceResponse> dataSources,
        String id,
        String location,
        String name,
        @Nullable String osType,
        @Nullable String proxySetting,
        @Nullable Map<String,String> tags,
        String type) {
        this.dataSources = dataSources;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.osType = osType;
        this.proxySetting = proxySetting;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * the array of data source object which are configured to collect and send data
     * 
    */
    public List<DataSourceResponse> getDataSources() {
        return this.dataSources == null ? List.of() : this.dataSources;
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Operating system type for the configuration
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    public Optional<String> getProxySetting() {
        return Optional.ofNullable(this.proxySetting);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetguestDiagnosticsSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceResponse> dataSources;
        private String id;
        private String location;
        private String name;
        private @Nullable String osType;
        private @Nullable String proxySetting;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetguestDiagnosticsSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.proxySetting = defaults.proxySetting;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDataSources(@Nullable List<DataSourceResponse> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setProxySetting(@Nullable String proxySetting) {
            this.proxySetting = proxySetting;
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
        public GetguestDiagnosticsSettingResult build() {
            return new GetguestDiagnosticsSettingResult(dataSources, id, location, name, osType, proxySetting, tags, type);
        }
    }
}
