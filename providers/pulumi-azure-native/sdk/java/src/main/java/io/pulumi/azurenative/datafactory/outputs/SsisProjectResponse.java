// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SsisEnvironmentReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SsisParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisProjectResponse {
    /**
     * Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * Environment reference in project
     * 
     */
    private final @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;
    /**
     * Folder id which contains project.
     * 
     */
    private final @Nullable Double folderId;
    /**
     * Metadata id.
     * 
     */
    private final @Nullable Double id;
    /**
     * Metadata name.
     * 
     */
    private final @Nullable String name;
    /**
     * Parameters in project
     * 
     */
    private final @Nullable List<SsisParameterResponse> parameters;
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Project'.
     * 
     */
    private final String type;
    /**
     * Project version.
     * 
     */
    private final @Nullable Double version;

    @OutputCustomType.Constructor({"description","environmentRefs","folderId","id","name","parameters","type","version"})
    private SsisProjectResponse(
        @Nullable String description,
        @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs,
        @Nullable Double folderId,
        @Nullable Double id,
        @Nullable String name,
        @Nullable List<SsisParameterResponse> parameters,
        String type,
        @Nullable Double version) {
        this.description = description;
        this.environmentRefs = environmentRefs;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * Metadata description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Environment reference in project
     * 
    */
    public List<SsisEnvironmentReferenceResponse> getEnvironmentRefs() {
        return this.environmentRefs == null ? List.of() : this.environmentRefs;
    }
    /**
     * Folder id which contains project.
     * 
    */
    public Optional<Double> getFolderId() {
        return Optional.ofNullable(this.folderId);
    }
    /**
     * Metadata id.
     * 
    */
    public Optional<Double> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Metadata name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Parameters in project
     * 
    */
    public List<SsisParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The type of SSIS object metadata.
     * Expected value is 'Project'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Project version.
     * 
    */
    public Optional<Double> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisProjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable List<SsisParameterResponse> parameters;
        private String type;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisProjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentRefs = defaults.environmentRefs;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironmentRefs(@Nullable List<SsisEnvironmentReferenceResponse> environmentRefs) {
            this.environmentRefs = environmentRefs;
            return this;
        }

        public Builder setFolderId(@Nullable Double folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setParameters(@Nullable List<SsisParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }
        public SsisProjectResponse build() {
            return new SsisProjectResponse(description, environmentRefs, folderId, id, name, parameters, type, version);
        }
    }
}
