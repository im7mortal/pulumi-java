// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SsisVariableResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SsisEnvironmentResponse {
    /**
     * Metadata description.
     * 
     */
    private final @Nullable String description;
    /**
     * Folder id which contains environment.
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
     * The type of SSIS object metadata.
     * Expected value is 'Environment'.
     * 
     */
    private final String type;
    /**
     * Variable in environment
     * 
     */
    private final @Nullable List<SsisVariableResponse> variables;

    @OutputCustomType.Constructor({"description","folderId","id","name","type","variables"})
    private SsisEnvironmentResponse(
        @Nullable String description,
        @Nullable Double folderId,
        @Nullable Double id,
        @Nullable String name,
        String type,
        @Nullable List<SsisVariableResponse> variables) {
        this.description = description;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.type = Objects.requireNonNull(type);
        this.variables = variables;
    }

    /**
     * Metadata description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Folder id which contains environment.
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
     * The type of SSIS object metadata.
     * Expected value is 'Environment'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Variable in environment
     * 
    */
    public List<SsisVariableResponse> getVariables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisEnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private String type;
        private @Nullable List<SsisVariableResponse> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisEnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.variables = defaults.variables;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVariables(@Nullable List<SsisVariableResponse> variables) {
            this.variables = variables;
            return this;
        }
        public SsisEnvironmentResponse build() {
            return new SsisEnvironmentResponse(description, folderId, id, name, type, variables);
        }
    }
}
