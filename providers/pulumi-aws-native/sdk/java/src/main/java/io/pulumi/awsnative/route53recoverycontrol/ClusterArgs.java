// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol;

import io.pulumi.awsnative.route53recoverycontrol.inputs.ClusterTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Name of a Cluster. You can use any non-white space character in the name
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ClusterTagArgs>> tags;

    public Input<List<ClusterTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<ClusterTagArgs>> tags) {
        this.name = name;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<ClusterTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ClusterTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ClusterTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ClusterArgs build() {
            return new ClusterArgs(name, tags);
        }
    }
}
