// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetResource;
import io.pulumi.awsnative.route53recoveryreadiness.outputs.ResourceSetTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceSetResult {
    /**
     * The Amazon Resource Name (ARN) of the resource set.
     * 
     */
    private final @Nullable String resourceSetArn;
    /**
     * A list of resource objects in the resource set.
     * 
     */
    private final @Nullable List<ResourceSetResource> resources;
    /**
     * A tag to associate with the parameters for a resource set.
     * 
     */
    private final @Nullable List<ResourceSetTag> tags;

    @OutputCustomType.Constructor({"resourceSetArn","resources","tags"})
    private GetResourceSetResult(
        @Nullable String resourceSetArn,
        @Nullable List<ResourceSetResource> resources,
        @Nullable List<ResourceSetTag> tags) {
        this.resourceSetArn = resourceSetArn;
        this.resources = resources;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource set.
     * 
     */
    public Optional<String> getResourceSetArn() {
        return Optional.ofNullable(this.resourceSetArn);
    }
    /**
     * A list of resource objects in the resource set.
     * 
     */
    public List<ResourceSetResource> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * A tag to associate with the parameters for a resource set.
     * 
     */
    public List<ResourceSetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceSetArn;
        private @Nullable List<ResourceSetResource> resources;
        private @Nullable List<ResourceSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSetArn = defaults.resourceSetArn;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder setResourceSetArn(@Nullable String resourceSetArn) {
            this.resourceSetArn = resourceSetArn;
            return this;
        }

        public Builder setResources(@Nullable List<ResourceSetResource> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setTags(@Nullable List<ResourceSetTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetResourceSetResult build() {
            return new GetResourceSetResult(resourceSetArn, resources, tags);
        }
    }
}
