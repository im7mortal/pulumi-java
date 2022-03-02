// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.azurenative.managedservices.outputs.RegistrationAssignmentPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRegistrationAssignmentResult {
    /**
     * The fully qualified path of the registration assignment.
     * 
     */
    private final String id;
    /**
     * Name of the registration assignment.
     * 
     */
    private final String name;
    /**
     * Properties of a registration assignment.
     * 
     */
    private final RegistrationAssignmentPropertiesResponse properties;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetRegistrationAssignmentResult(
        String id,
        String name,
        RegistrationAssignmentPropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The fully qualified path of the registration assignment.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the registration assignment.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of a registration assignment.
     * 
    */
    public RegistrationAssignmentPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private RegistrationAssignmentPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(RegistrationAssignmentPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRegistrationAssignmentResult build() {
            return new GetRegistrationAssignmentResult(id, name, properties, type);
        }
    }
}
