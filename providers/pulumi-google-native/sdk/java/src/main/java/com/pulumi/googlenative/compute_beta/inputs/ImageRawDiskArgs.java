// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.ImageRawDiskContainerType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters of the raw disk image.
 * 
 */
public final class ImageRawDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRawDiskArgs Empty = new ImageRawDiskArgs();

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    @Import(name="containerType")
    private @Nullable Output<ImageRawDiskContainerType> containerType;

    /**
     * @return The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    public Optional<Output<ImageRawDiskContainerType>> containerType() {
        return Optional.ofNullable(this.containerType);
    }

    /**
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
     * 
     * @deprecated
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
     * 
     */
    @Deprecated /* [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created. */
    @Import(name="sha1Checksum")
    private @Nullable Output<String> sha1Checksum;

    /**
     * @return [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
     * 
     * @deprecated
     * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
     * 
     */
    @Deprecated /* [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created. */
    public Optional<Output<String>> sha1Checksum() {
        return Optional.ofNullable(this.sha1Checksum);
    }

    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private ImageRawDiskArgs() {}

    private ImageRawDiskArgs(ImageRawDiskArgs $) {
        this.containerType = $.containerType;
        this.sha1Checksum = $.sha1Checksum;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRawDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRawDiskArgs $;

        public Builder() {
            $ = new ImageRawDiskArgs();
        }

        public Builder(ImageRawDiskArgs defaults) {
            $ = new ImageRawDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerType The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         */
        public Builder containerType(@Nullable Output<ImageRawDiskContainerType> containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param containerType The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         */
        public Builder containerType(ImageRawDiskContainerType containerType) {
            return containerType(Output.of(containerType));
        }

        /**
         * @param sha1Checksum [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         * @deprecated
         * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
         * 
         */
        @Deprecated /* [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created. */
        public Builder sha1Checksum(@Nullable Output<String> sha1Checksum) {
            $.sha1Checksum = sha1Checksum;
            return this;
        }

        /**
         * @param sha1Checksum [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         * @deprecated
         * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
         * 
         */
        @Deprecated /* [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created. */
        public Builder sha1Checksum(String sha1Checksum) {
            return sha1Checksum(Output.of(sha1Checksum));
        }

        /**
         * @param source The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public ImageRawDiskArgs build() {
            return $;
        }
    }

}
