// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultKeyResponseAttributes {
    /**
     * When the key was created.
     * 
     */
    private final @Nullable Double created;
    /**
     * Whether the key is enabled or not.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * When the key was updated.
     * 
     */
    private final @Nullable Double updated;

    @OutputCustomType.Constructor({"created","enabled","updated"})
    private KeyVaultKeyResponseAttributes(
        @Nullable Double created,
        @Nullable Boolean enabled,
        @Nullable Double updated) {
        this.created = created;
        this.enabled = enabled;
        this.updated = updated;
    }

    /**
     * When the key was created.
     * 
    */
    public Optional<Double> getCreated() {
        return Optional.ofNullable(this.created);
    }
    /**
     * Whether the key is enabled or not.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * When the key was updated.
     * 
    */
    public Optional<Double> getUpdated() {
        return Optional.ofNullable(this.updated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyResponseAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double created;
        private @Nullable Boolean enabled;
        private @Nullable Double updated;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyResponseAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.updated = defaults.updated;
        }

        public Builder setCreated(@Nullable Double created) {
            this.created = created;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setUpdated(@Nullable Double updated) {
            this.updated = updated;
            return this;
        }
        public KeyVaultKeyResponseAttributes build() {
            return new KeyVaultKeyResponseAttributes(created, enabled, updated);
        }
    }
}
