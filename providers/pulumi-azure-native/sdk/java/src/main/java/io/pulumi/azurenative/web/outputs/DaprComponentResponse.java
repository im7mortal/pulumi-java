// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.DaprMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DaprComponentResponse {
    /**
     * Component metadata
     * 
     */
    private final @Nullable List<DaprMetadataResponse> metadata;
    /**
     * Component name
     * 
     */
    private final @Nullable String name;
    /**
     * Component type
     * 
     */
    private final @Nullable String type;
    /**
     * Component version
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"metadata","name","type","version"})
    private DaprComponentResponse(
        @Nullable List<DaprMetadataResponse> metadata,
        @Nullable String name,
        @Nullable String type,
        @Nullable String version) {
        this.metadata = metadata;
        this.name = name;
        this.type = type;
        this.version = version;
    }

    /**
     * Component metadata
     * 
    */
    public List<DaprMetadataResponse> getMetadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }
    /**
     * Component name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Component type
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Component version
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DaprMetadataResponse> metadata;
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setMetadata(@Nullable List<DaprMetadataResponse> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DaprComponentResponse build() {
            return new DaprComponentResponse(metadata, name, type, version);
        }
    }
}
