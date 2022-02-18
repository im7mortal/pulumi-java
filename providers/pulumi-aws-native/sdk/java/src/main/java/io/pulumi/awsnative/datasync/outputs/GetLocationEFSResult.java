// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.outputs.LocationEFSTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationEFSResult {
    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    private final @Nullable String locationArn;
    /**
     * The URL of the EFS location that was described.
     * 
     */
    private final @Nullable String locationUri;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LocationEFSTag> tags;

    @OutputCustomType.Constructor({"locationArn","locationUri","tags"})
    private GetLocationEFSResult(
        @Nullable String locationArn,
        @Nullable String locationUri,
        @Nullable List<LocationEFSTag> tags) {
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
     * 
     */
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    /**
     * The URL of the EFS location that was described.
     * 
     */
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    public List<LocationEFSTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationEFSResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable List<LocationEFSTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationEFSResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.tags = defaults.tags;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setTags(@Nullable List<LocationEFSTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetLocationEFSResult build() {
            return new GetLocationEFSResult(locationArn, locationUri, tags);
        }
    }
}