// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NonResourceAttributes {
    /**
     * Path is the URL path of the request
     * 
     */
    private final @Nullable String path;
    /**
     * Verb is the standard HTTP verb
     * 
     */
    private final @Nullable String verb;

    @OutputCustomType.Constructor({"path","verb"})
    private NonResourceAttributes(
        @Nullable String path,
        @Nullable String verb) {
        this.path = path;
        this.verb = verb;
    }

    /**
     * Path is the URL path of the request
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Verb is the standard HTTP verb
     * 
    */
    public Optional<String> getVerb() {
        return Optional.ofNullable(this.verb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourceAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable String verb;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourceAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.verb = defaults.verb;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setVerb(@Nullable String verb) {
            this.verb = verb;
            return this;
        }
        public NonResourceAttributes build() {
            return new NonResourceAttributes(path, verb);
        }
    }
}
