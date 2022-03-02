// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CopyProgressResponse {
    /**
     * Id of the account where the data needs to be uploaded.
     * 
     */
    private final String accountId;
    /**
     * To indicate bytes transferred.
     * 
     */
    private final Double bytesProcessed;
    /**
     * Data Account Type.
     * 
     */
    private final String dataAccountType;
    /**
     * To indicate directories errored out in the job.
     * 
     */
    private final Double directoriesErroredOut;
    /**
     * Number of files which could not be copied
     * 
     */
    private final Double filesErroredOut;
    /**
     * Number of files processed
     * 
     */
    private final Double filesProcessed;
    /**
     * To indicate directories renamed
     * 
     */
    private final Double invalidDirectoriesProcessed;
    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double invalidFileBytesUploaded;
    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double invalidFilesProcessed;
    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
     */
    private final Boolean isEnumerationInProgress;
    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double renamedContainerCount;
    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
     */
    private final String storageAccountName;
    /**
     * Total amount of data to be processed by the job.
     * 
     */
    private final Double totalBytesToProcess;
    /**
     * Total files to process
     * 
     */
    private final Double totalFilesToProcess;
    /**
     * Transfer type of data
     * 
     */
    private final String transferType;

    @OutputCustomType.Constructor({"accountId","bytesProcessed","dataAccountType","directoriesErroredOut","filesErroredOut","filesProcessed","invalidDirectoriesProcessed","invalidFileBytesUploaded","invalidFilesProcessed","isEnumerationInProgress","renamedContainerCount","storageAccountName","totalBytesToProcess","totalFilesToProcess","transferType"})
    private CopyProgressResponse(
        String accountId,
        Double bytesProcessed,
        String dataAccountType,
        Double directoriesErroredOut,
        Double filesErroredOut,
        Double filesProcessed,
        Double invalidDirectoriesProcessed,
        Double invalidFileBytesUploaded,
        Double invalidFilesProcessed,
        Boolean isEnumerationInProgress,
        Double renamedContainerCount,
        String storageAccountName,
        Double totalBytesToProcess,
        Double totalFilesToProcess,
        String transferType) {
        this.accountId = Objects.requireNonNull(accountId);
        this.bytesProcessed = Objects.requireNonNull(bytesProcessed);
        this.dataAccountType = Objects.requireNonNull(dataAccountType);
        this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut);
        this.filesErroredOut = Objects.requireNonNull(filesErroredOut);
        this.filesProcessed = Objects.requireNonNull(filesProcessed);
        this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed);
        this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded);
        this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed);
        this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress);
        this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount);
        this.storageAccountName = Objects.requireNonNull(storageAccountName);
        this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess);
        this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess);
        this.transferType = Objects.requireNonNull(transferType);
    }

    /**
     * Id of the account where the data needs to be uploaded.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * To indicate bytes transferred.
     * 
    */
    public Double getBytesProcessed() {
        return this.bytesProcessed;
    }
    /**
     * Data Account Type.
     * 
    */
    public String getDataAccountType() {
        return this.dataAccountType;
    }
    /**
     * To indicate directories errored out in the job.
     * 
    */
    public Double getDirectoriesErroredOut() {
        return this.directoriesErroredOut;
    }
    /**
     * Number of files which could not be copied
     * 
    */
    public Double getFilesErroredOut() {
        return this.filesErroredOut;
    }
    /**
     * Number of files processed
     * 
    */
    public Double getFilesProcessed() {
        return this.filesProcessed;
    }
    /**
     * To indicate directories renamed
     * 
    */
    public Double getInvalidDirectoriesProcessed() {
        return this.invalidDirectoriesProcessed;
    }
    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double getInvalidFileBytesUploaded() {
        return this.invalidFileBytesUploaded;
    }
    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double getInvalidFilesProcessed() {
        return this.invalidFilesProcessed;
    }
    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
    */
    public Boolean getIsEnumerationInProgress() {
        return this.isEnumerationInProgress;
    }
    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double getRenamedContainerCount() {
        return this.renamedContainerCount;
    }
    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Total amount of data to be processed by the job.
     * 
    */
    public Double getTotalBytesToProcess() {
        return this.totalBytesToProcess;
    }
    /**
     * Total files to process
     * 
    */
    public Double getTotalFilesToProcess() {
        return this.totalFilesToProcess;
    }
    /**
     * Transfer type of data
     * 
    */
    public String getTransferType() {
        return this.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private Double bytesProcessed;
        private String dataAccountType;
        private Double directoriesErroredOut;
        private Double filesErroredOut;
        private Double filesProcessed;
        private Double invalidDirectoriesProcessed;
        private Double invalidFileBytesUploaded;
        private Double invalidFilesProcessed;
        private Boolean isEnumerationInProgress;
        private Double renamedContainerCount;
        private String storageAccountName;
        private Double totalBytesToProcess;
        private Double totalFilesToProcess;
        private String transferType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bytesProcessed = defaults.bytesProcessed;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.directoriesErroredOut = defaults.directoriesErroredOut;
    	      this.filesErroredOut = defaults.filesErroredOut;
    	      this.filesProcessed = defaults.filesProcessed;
    	      this.invalidDirectoriesProcessed = defaults.invalidDirectoriesProcessed;
    	      this.invalidFileBytesUploaded = defaults.invalidFileBytesUploaded;
    	      this.invalidFilesProcessed = defaults.invalidFilesProcessed;
    	      this.isEnumerationInProgress = defaults.isEnumerationInProgress;
    	      this.renamedContainerCount = defaults.renamedContainerCount;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.totalBytesToProcess = defaults.totalBytesToProcess;
    	      this.totalFilesToProcess = defaults.totalFilesToProcess;
    	      this.transferType = defaults.transferType;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setBytesProcessed(Double bytesProcessed) {
            this.bytesProcessed = Objects.requireNonNull(bytesProcessed);
            return this;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setDirectoriesErroredOut(Double directoriesErroredOut) {
            this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut);
            return this;
        }

        public Builder setFilesErroredOut(Double filesErroredOut) {
            this.filesErroredOut = Objects.requireNonNull(filesErroredOut);
            return this;
        }

        public Builder setFilesProcessed(Double filesProcessed) {
            this.filesProcessed = Objects.requireNonNull(filesProcessed);
            return this;
        }

        public Builder setInvalidDirectoriesProcessed(Double invalidDirectoriesProcessed) {
            this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed);
            return this;
        }

        public Builder setInvalidFileBytesUploaded(Double invalidFileBytesUploaded) {
            this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded);
            return this;
        }

        public Builder setInvalidFilesProcessed(Double invalidFilesProcessed) {
            this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed);
            return this;
        }

        public Builder setIsEnumerationInProgress(Boolean isEnumerationInProgress) {
            this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress);
            return this;
        }

        public Builder setRenamedContainerCount(Double renamedContainerCount) {
            this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setTotalBytesToProcess(Double totalBytesToProcess) {
            this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess);
            return this;
        }

        public Builder setTotalFilesToProcess(Double totalFilesToProcess) {
            this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess);
            return this;
        }

        public Builder setTransferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }
        public CopyProgressResponse build() {
            return new CopyProgressResponse(accountId, bytesProcessed, dataAccountType, directoriesErroredOut, filesErroredOut, filesProcessed, invalidDirectoriesProcessed, invalidFileBytesUploaded, invalidFilesProcessed, isEnumerationInProgress, renamedContainerCount, storageAccountName, totalBytesToProcess, totalFilesToProcess, transferType);
        }
    }
}
