// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * [Deprecated] Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     */
    @EnumType
    public enum AttachedDiskInitializeParamsInterface {
        Nvme("NVME"),
        Scsi("SCSI"),
        Unspecified("UNSPECIFIED");

        private final String value;

        AttachedDiskInitializeParamsInterface(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AttachedDiskInitializeParamsInterface[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
