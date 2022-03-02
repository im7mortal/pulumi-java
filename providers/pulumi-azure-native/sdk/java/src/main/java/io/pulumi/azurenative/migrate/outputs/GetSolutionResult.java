// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.SolutionPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSolutionResult {
    /**
     * Gets or sets the ETAG for optimistic concurrency control.
     * 
     */
    private final @Nullable String etag;
    /**
     * Gets the relative URL to get to this REST resource.
     * 
     */
    private final String id;
    /**
     * Gets the name of this REST resource.
     * 
     */
    private final String name;
    /**
     * Gets or sets the properties of the solution.
     * 
     */
    private final SolutionPropertiesResponse properties;
    /**
     * Gets the type of this REST resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","type"})
    private GetSolutionResult(
        @Nullable String etag,
        String id,
        String name,
        SolutionPropertiesResponse properties,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets or sets the ETAG for optimistic concurrency control.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Gets the relative URL to get to this REST resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets the name of this REST resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the properties of the solution.
     * 
    */
    public SolutionPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets the type of this REST resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String name;
        private SolutionPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(SolutionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSolutionResult build() {
            return new GetSolutionResult(etag, id, name, properties, type);
        }
    }
}
