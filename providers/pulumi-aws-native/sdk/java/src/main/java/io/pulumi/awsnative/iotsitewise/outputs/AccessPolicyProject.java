// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPolicyProject {
    /**
     * The ID of the project.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"id"})
    private AccessPolicyProject(@Nullable String id) {
        this.id = id;
    }

    /**
     * The ID of the project.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyProject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }
        public AccessPolicyProject build() {
            return new AccessPolicyProject(id);
        }
    }
}
