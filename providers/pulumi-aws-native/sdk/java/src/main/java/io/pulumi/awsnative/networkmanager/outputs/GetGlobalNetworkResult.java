// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.outputs;

import io.pulumi.awsnative.networkmanager.outputs.GlobalNetworkTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGlobalNetworkResult {
    /**
     * The Amazon Resource Name (ARN) of the global network.
     * 
     */
    private final @Nullable String arn;
    /**
     * The description of the global network.
     * 
     */
    private final @Nullable String description;
    /**
     * The ID of the global network.
     * 
     */
    private final @Nullable String id;
    /**
     * The tags for the global network.
     * 
     */
    private final @Nullable List<GlobalNetworkTag> tags;

    @OutputCustomType.Constructor({"arn","description","id","tags"})
    private GetGlobalNetworkResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable String id,
        @Nullable List<GlobalNetworkTag> tags) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the global network.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the global network.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The ID of the global network.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The tags for the global network.
     * 
     */
    public List<GlobalNetworkTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable List<GlobalNetworkTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTags(@Nullable List<GlobalNetworkTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetGlobalNetworkResult build() {
            return new GetGlobalNetworkResult(arn, description, id, tags);
        }
    }
}
