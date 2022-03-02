// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SourceDiskEncryptionKeyResponse {
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
     */
    private final String sourceDisk;

    @OutputCustomType.Constructor({"diskEncryptionKey","sourceDisk"})
    private SourceDiskEncryptionKeyResponse(
        CustomerEncryptionKeyResponse diskEncryptionKey,
        String sourceDisk) {
        this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
        this.sourceDisk = Objects.requireNonNull(sourceDisk);
    }

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
    */
    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceDiskEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceDiskEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder setDiskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public SourceDiskEncryptionKeyResponse build() {
            return new SourceDiskEncryptionKeyResponse(diskEncryptionKey, sourceDisk);
        }
    }
}
