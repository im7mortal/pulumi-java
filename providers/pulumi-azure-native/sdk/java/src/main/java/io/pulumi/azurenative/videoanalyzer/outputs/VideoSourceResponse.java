// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.VideoSequenceAbsoluteTimeMarkersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VideoSourceResponse {
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    private final String name;
    /**
     * Describes a sequence of datetime ranges. The video source only picks up recorded media within these ranges.
     * 
     */
    private final VideoSequenceAbsoluteTimeMarkersResponse timeSequences;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSource'.
     * 
     */
    private final String type;
    /**
     * Name of the Video Analyzer video resource to be used as the source.
     * 
     */
    private final String videoName;

    @OutputCustomType.Constructor({"name","timeSequences","type","videoName"})
    private VideoSourceResponse(
        String name,
        VideoSequenceAbsoluteTimeMarkersResponse timeSequences,
        String type,
        String videoName) {
        this.name = Objects.requireNonNull(name);
        this.timeSequences = Objects.requireNonNull(timeSequences);
        this.type = Objects.requireNonNull(type);
        this.videoName = Objects.requireNonNull(videoName);
    }

    /**
     * Node name. Must be unique within the topology.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes a sequence of datetime ranges. The video source only picks up recorded media within these ranges.
     * 
    */
    public VideoSequenceAbsoluteTimeMarkersResponse getTimeSequences() {
        return this.timeSequences;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSource'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Name of the Video Analyzer video resource to be used as the source.
     * 
    */
    public String getVideoName() {
        return this.videoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private VideoSequenceAbsoluteTimeMarkersResponse timeSequences;
        private String type;
        private String videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeSequences = defaults.timeSequences;
    	      this.type = defaults.type;
    	      this.videoName = defaults.videoName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTimeSequences(VideoSequenceAbsoluteTimeMarkersResponse timeSequences) {
            this.timeSequences = Objects.requireNonNull(timeSequences);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVideoName(String videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }
        public VideoSourceResponse build() {
            return new VideoSourceResponse(name, timeSequences, type, videoName);
        }
    }
}
