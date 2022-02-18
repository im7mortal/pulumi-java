// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPolicyPortal {
    /**
     * The ID of the portal.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"id"})
    private AccessPolicyPortal(@Nullable String id) {
        this.id = id;
    }

    /**
     * The ID of the portal.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyPortal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyPortal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public AccessPolicyPortal build() {
            return new AccessPolicyPortal(id);
        }
    }
}
