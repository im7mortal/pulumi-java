// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.ClusterGetPropertiesResponse;
import io.pulumi.azurenative.hdinsight.outputs.ClusterIdentityResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    private final @Nullable String etag;
    private final String id;
    private final @Nullable ClusterIdentityResponse identity;
    private final @Nullable String location;
    private final String name;
    private final ClusterGetPropertiesResponse properties;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","identity","location","name","properties","tags","type"})
    private GetClusterResult(
        @Nullable String etag,
        String id,
        @Nullable ClusterIdentityResponse identity,
        @Nullable String location,
        String name,
        ClusterGetPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public Optional<ClusterIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public ClusterGetPropertiesResponse getProperties() {
        return this.properties;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable ClusterIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private ClusterGetPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ClusterIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ClusterGetPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(etag, id, identity, location, name, properties, tags, type);
        }
    }
}