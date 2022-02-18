// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.outputs.AliasRoutingStrategy;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAliasResult {
    /**
     * Unique alias ID
     * 
     */
    private final @Nullable String aliasId;
    /**
     * A human-readable description of the alias.
     * 
     */
    private final @Nullable String description;
    /**
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * 
     */
    private final @Nullable String name;
    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message.
     * 
     */
    private final @Nullable AliasRoutingStrategy routingStrategy;

    @OutputCustomType.Constructor({"aliasId","description","name","routingStrategy"})
    private GetAliasResult(
        @Nullable String aliasId,
        @Nullable String description,
        @Nullable String name,
        @Nullable AliasRoutingStrategy routingStrategy) {
        this.aliasId = aliasId;
        this.description = description;
        this.name = name;
        this.routingStrategy = routingStrategy;
    }

    /**
     * Unique alias ID
     * 
     */
    public Optional<String> getAliasId() {
        return Optional.ofNullable(this.aliasId);
    }
    /**
     * A human-readable description of the alias.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message.
     * 
     */
    public Optional<AliasRoutingStrategy> getRoutingStrategy() {
        return Optional.ofNullable(this.routingStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aliasId;
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable AliasRoutingStrategy routingStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasId = defaults.aliasId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routingStrategy = defaults.routingStrategy;
        }

        public Builder setAliasId(@Nullable String aliasId) {
            this.aliasId = aliasId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRoutingStrategy(@Nullable AliasRoutingStrategy routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }

        public GetAliasResult build() {
            return new GetAliasResult(aliasId, description, name, routingStrategy);
        }
    }
}
