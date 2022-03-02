// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BoundObjectReference {
    /**
     * API version of the referent.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
     * 
     */
    private final @Nullable String kind;
    /**
     * Name of the referent.
     * 
     */
    private final @Nullable String name;
    /**
     * UID of the referent.
     * 
     */
    private final @Nullable String uid;

    @OutputCustomType.Constructor({"apiVersion","kind","name","uid"})
    private BoundObjectReference(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable String name,
        @Nullable String uid) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.uid = uid;
    }

    /**
     * API version of the referent.
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Name of the referent.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * UID of the referent.
     * 
    */
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public BoundObjectReference build() {
            return new BoundObjectReference(apiVersion, kind, name, uid);
        }
    }
}
