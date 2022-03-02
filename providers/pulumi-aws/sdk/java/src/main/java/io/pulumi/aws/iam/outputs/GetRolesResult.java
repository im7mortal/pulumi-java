// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRolesResult {
    /**
     * Set of ARNs of the matched IAM roles.
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String nameRegex;
    /**
     * Set of Names of the matched IAM roles.
     * 
     */
    private final List<String> names;
    private final @Nullable String pathPrefix;

    @OutputCustomType.Constructor({"arns","id","nameRegex","names","pathPrefix"})
    private GetRolesResult(
        List<String> arns,
        String id,
        @Nullable String nameRegex,
        List<String> names,
        @Nullable String pathPrefix) {
        this.arns = Objects.requireNonNull(arns);
        this.id = Objects.requireNonNull(id);
        this.nameRegex = nameRegex;
        this.names = Objects.requireNonNull(names);
        this.pathPrefix = pathPrefix;
    }

    /**
     * Set of ARNs of the matched IAM roles.
     * 
    */
    public List<String> getArns() {
        return this.arns;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getNameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * Set of Names of the matched IAM roles.
     * 
    */
    public List<String> getNames() {
        return this.names;
    }
    public Optional<String> getPathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String pathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.pathPrefix = defaults.pathPrefix;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setPathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public GetRolesResult build() {
            return new GetRolesResult(arns, id, nameRegex, names, pathPrefix);
        }
    }
}
