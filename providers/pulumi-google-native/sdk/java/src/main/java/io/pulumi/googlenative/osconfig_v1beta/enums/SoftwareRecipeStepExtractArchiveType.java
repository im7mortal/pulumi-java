// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SoftwareRecipeStepExtractArchiveType {
        ArchiveTypeUnspecified("ARCHIVE_TYPE_UNSPECIFIED"),
        Tar("TAR"),
        TarGzip("TAR_GZIP"),
        TarBzip("TAR_BZIP"),
        TarLzma("TAR_LZMA"),
        TarXz("TAR_XZ"),
        Zip("ZIP");

        private final String value;

        SoftwareRecipeStepExtractArchiveType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SoftwareRecipeStepExtractArchiveType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }