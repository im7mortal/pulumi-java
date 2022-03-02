// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class Vp9CodecSettingsResponse {
    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
     * 
     */
    private final Integer bitrateBps;
    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. *Note*: This field is not supported.
     * 
     */
    private final Integer crfLevel;
    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    private final Double frameRate;
    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    private final String gopDuration;
    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    private final Integer gopFrameCount;
    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    private final Integer heightPixels;
    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    private final String pixelFormat;
    /**
     * Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
     * 
     */
    private final String profile;
    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
     * 
     */
    private final String rateControlMode;
    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    private final Integer widthPixels;

    @OutputCustomType.Constructor({"bitrateBps","crfLevel","frameRate","gopDuration","gopFrameCount","heightPixels","pixelFormat","profile","rateControlMode","widthPixels"})
    private Vp9CodecSettingsResponse(
        Integer bitrateBps,
        Integer crfLevel,
        Double frameRate,
        String gopDuration,
        Integer gopFrameCount,
        Integer heightPixels,
        String pixelFormat,
        String profile,
        String rateControlMode,
        Integer widthPixels) {
        this.bitrateBps = Objects.requireNonNull(bitrateBps);
        this.crfLevel = Objects.requireNonNull(crfLevel);
        this.frameRate = Objects.requireNonNull(frameRate);
        this.gopDuration = Objects.requireNonNull(gopDuration);
        this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
        this.heightPixels = Objects.requireNonNull(heightPixels);
        this.pixelFormat = Objects.requireNonNull(pixelFormat);
        this.profile = Objects.requireNonNull(profile);
        this.rateControlMode = Objects.requireNonNull(rateControlMode);
        this.widthPixels = Objects.requireNonNull(widthPixels);
    }

    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
     * 
    */
    public Integer getBitrateBps() {
        return this.bitrateBps;
    }
    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. *Note*: This field is not supported.
     * 
    */
    public Integer getCrfLevel() {
        return this.crfLevel;
    }
    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
    */
    public Double getFrameRate() {
        return this.frameRate;
    }
    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
    */
    public String getGopDuration() {
        return this.gopDuration;
    }
    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
    */
    public Integer getGopFrameCount() {
        return this.gopFrameCount;
    }
    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
    */
    public Integer getHeightPixels() {
        return this.heightPixels;
    }
    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
    */
    public String getPixelFormat() {
        return this.pixelFormat;
    }
    /**
     * Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
     * 
    */
    public String getProfile() {
        return this.profile;
    }
    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
     * 
    */
    public String getRateControlMode() {
        return this.rateControlMode;
    }
    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
    */
    public Integer getWidthPixels() {
        return this.widthPixels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Vp9CodecSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrateBps;
        private Integer crfLevel;
        private Double frameRate;
        private String gopDuration;
        private Integer gopFrameCount;
        private Integer heightPixels;
        private String pixelFormat;
        private String profile;
        private String rateControlMode;
        private Integer widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(Vp9CodecSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder setBitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder setCrfLevel(Integer crfLevel) {
            this.crfLevel = Objects.requireNonNull(crfLevel);
            return this;
        }

        public Builder setFrameRate(Double frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }

        public Builder setGopDuration(String gopDuration) {
            this.gopDuration = Objects.requireNonNull(gopDuration);
            return this;
        }

        public Builder setGopFrameCount(Integer gopFrameCount) {
            this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
            return this;
        }

        public Builder setHeightPixels(Integer heightPixels) {
            this.heightPixels = Objects.requireNonNull(heightPixels);
            return this;
        }

        public Builder setPixelFormat(String pixelFormat) {
            this.pixelFormat = Objects.requireNonNull(pixelFormat);
            return this;
        }

        public Builder setProfile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }

        public Builder setRateControlMode(String rateControlMode) {
            this.rateControlMode = Objects.requireNonNull(rateControlMode);
            return this;
        }

        public Builder setWidthPixels(Integer widthPixels) {
            this.widthPixels = Objects.requireNonNull(widthPixels);
            return this;
        }
        public Vp9CodecSettingsResponse build() {
            return new Vp9CodecSettingsResponse(bitrateBps, crfLevel, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, profile, rateControlMode, widthPixels);
        }
    }
}
