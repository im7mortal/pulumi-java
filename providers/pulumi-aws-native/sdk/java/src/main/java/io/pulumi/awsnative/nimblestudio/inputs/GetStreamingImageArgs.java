// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStreamingImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStreamingImageArgs Empty = new GetStreamingImageArgs();

    @InputImport(name="streamingImageId", required=true)
    private final String streamingImageId;

    public String getStreamingImageId() {
        return this.streamingImageId;
    }

    /**
     * <p>The studioId. </p>
     * 
     */
    @InputImport(name="studioId", required=true)
    private final String studioId;

    public String getStudioId() {
        return this.studioId;
    }

    public GetStreamingImageArgs(
        String streamingImageId,
        String studioId) {
        this.streamingImageId = Objects.requireNonNull(streamingImageId, "expected parameter 'streamingImageId' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private GetStreamingImageArgs() {
        this.streamingImageId = null;
        this.studioId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamingImageId;
        private String studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamingImageId = defaults.streamingImageId;
    	      this.studioId = defaults.studioId;
        }

        public Builder setStreamingImageId(String streamingImageId) {
            this.streamingImageId = Objects.requireNonNull(streamingImageId);
            return this;
        }

        public Builder setStudioId(String studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }

        public GetStreamingImageArgs build() {
            return new GetStreamingImageArgs(streamingImageId, studioId);
        }
    }
}