// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageProfileResponse {
    /**
     * Size of file share
     * 
     */
    private final @Nullable Integer diskSizeInGB;
    /**
     * Name of the mounted file share. 63 characters or less, lowercase alphabet, numbers, and -
     * 
     */
    private final @Nullable String fileShareName;
    /**
     * Full resource ID of storage account.
     * 
     */
    private final @Nullable String storageAccountResourceId;

    @OutputCustomType.Constructor({"diskSizeInGB","fileShareName","storageAccountResourceId"})
    private StorageProfileResponse(
        @Nullable Integer diskSizeInGB,
        @Nullable String fileShareName,
        @Nullable String storageAccountResourceId) {
        this.diskSizeInGB = diskSizeInGB;
        this.fileShareName = fileShareName;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    /**
     * Size of file share
     * 
    */
    public Optional<Integer> getDiskSizeInGB() {
        return Optional.ofNullable(this.diskSizeInGB);
    }
    /**
     * Name of the mounted file share. 63 characters or less, lowercase alphabet, numbers, and -
     * 
    */
    public Optional<String> getFileShareName() {
        return Optional.ofNullable(this.fileShareName);
    }
    /**
     * Full resource ID of storage account.
     * 
    */
    public Optional<String> getStorageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeInGB;
        private @Nullable String fileShareName;
        private @Nullable String storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeInGB = defaults.diskSizeInGB;
    	      this.fileShareName = defaults.fileShareName;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder setDiskSizeInGB(@Nullable Integer diskSizeInGB) {
            this.diskSizeInGB = diskSizeInGB;
            return this;
        }

        public Builder setFileShareName(@Nullable String fileShareName) {
            this.fileShareName = fileShareName;
            return this;
        }

        public Builder setStorageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }
        public StorageProfileResponse build() {
            return new StorageProfileResponse(diskSizeInGB, fileShareName, storageAccountResourceId);
        }
    }
}
