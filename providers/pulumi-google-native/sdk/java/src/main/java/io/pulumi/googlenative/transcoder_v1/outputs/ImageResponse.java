// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.NormalizedCoordinateResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageResponse {
    /**
     * Target image opacity. Valid values are from `1.0` (solid, default) to `0.0` (transparent), exclusive. Set this to a value greater than `0.0`.
     * 
     */
    private final Double alpha;
    /**
     * Normalized image resolution, based on output video resolution. Valid values: `0.0`–`1.0`. To respect the original image aspect ratio, set either `x` or `y` to `0.0`. To use the original image resolution, set both `x` and `y` to `0.0`.
     * 
     */
    private final NormalizedCoordinateResponse resolution;
    /**
     * URI of the JPEG image in Cloud Storage. For example, `gs://bucket/inputs/image.jpeg`. JPEG is the only supported image type.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"alpha","resolution","uri"})
    private ImageResponse(
        Double alpha,
        NormalizedCoordinateResponse resolution,
        String uri) {
        this.alpha = Objects.requireNonNull(alpha);
        this.resolution = Objects.requireNonNull(resolution);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Target image opacity. Valid values are from `1.0` (solid, default) to `0.0` (transparent), exclusive. Set this to a value greater than `0.0`.
     * 
    */
    public Double getAlpha() {
        return this.alpha;
    }
    /**
     * Normalized image resolution, based on output video resolution. Valid values: `0.0`–`1.0`. To respect the original image aspect ratio, set either `x` or `y` to `0.0`. To use the original image resolution, set both `x` and `y` to `0.0`.
     * 
    */
    public NormalizedCoordinateResponse getResolution() {
        return this.resolution;
    }
    /**
     * URI of the JPEG image in Cloud Storage. For example, `gs://bucket/inputs/image.jpeg`. JPEG is the only supported image type.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double alpha;
        private NormalizedCoordinateResponse resolution;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpha = defaults.alpha;
    	      this.resolution = defaults.resolution;
    	      this.uri = defaults.uri;
        }

        public Builder setAlpha(Double alpha) {
            this.alpha = Objects.requireNonNull(alpha);
            return this;
        }

        public Builder setResolution(NormalizedCoordinateResponse resolution) {
            this.resolution = Objects.requireNonNull(resolution);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ImageResponse build() {
            return new ImageResponse(alpha, resolution, uri);
        }
    }
}
