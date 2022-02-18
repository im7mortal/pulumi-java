// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.awsnative.datasync.enums.TaskOptionsAtime;
import io.pulumi.awsnative.datasync.enums.TaskOptionsGid;
import io.pulumi.awsnative.datasync.enums.TaskOptionsLogLevel;
import io.pulumi.awsnative.datasync.enums.TaskOptionsMtime;
import io.pulumi.awsnative.datasync.enums.TaskOptionsOverwriteMode;
import io.pulumi.awsnative.datasync.enums.TaskOptionsPosixPermissions;
import io.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDeletedFiles;
import io.pulumi.awsnative.datasync.enums.TaskOptionsPreserveDevices;
import io.pulumi.awsnative.datasync.enums.TaskOptionsSecurityDescriptorCopyFlags;
import io.pulumi.awsnative.datasync.enums.TaskOptionsTaskQueueing;
import io.pulumi.awsnative.datasync.enums.TaskOptionsTransferMode;
import io.pulumi.awsnative.datasync.enums.TaskOptionsUid;
import io.pulumi.awsnative.datasync.enums.TaskOptionsVerifyMode;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the options that are available to control the behavior of a StartTaskExecution operation.
 * 
 */
public final class TaskOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskOptionsArgs Empty = new TaskOptionsArgs();

    /**
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to).
     * 
     */
    @InputImport(name="atime")
    private final @Nullable Input<TaskOptionsAtime> atime;

    public Input<TaskOptionsAtime> getAtime() {
        return this.atime == null ? Input.empty() : this.atime;
    }

    /**
     * A value that limits the bandwidth used by AWS DataSync.
     * 
     */
    @InputImport(name="bytesPerSecond")
    private final @Nullable Input<Integer> bytesPerSecond;

    public Input<Integer> getBytesPerSecond() {
        return this.bytesPerSecond == null ? Input.empty() : this.bytesPerSecond;
    }

    /**
     * The group ID (GID) of the file's owners.
     * 
     */
    @InputImport(name="gid")
    private final @Nullable Input<TaskOptionsGid> gid;

    public Input<TaskOptionsGid> getGid() {
        return this.gid == null ? Input.empty() : this.gid;
    }

    /**
     * A value that determines the types of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide.
     * 
     */
    @InputImport(name="logLevel")
    private final @Nullable Input<TaskOptionsLogLevel> logLevel;

    public Input<TaskOptionsLogLevel> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    /**
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.
     * 
     */
    @InputImport(name="mtime")
    private final @Nullable Input<TaskOptionsMtime> mtime;

    public Input<TaskOptionsMtime> getMtime() {
        return this.mtime == null ? Input.empty() : this.mtime;
    }

    /**
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * 
     */
    @InputImport(name="overwriteMode")
    private final @Nullable Input<TaskOptionsOverwriteMode> overwriteMode;

    public Input<TaskOptionsOverwriteMode> getOverwriteMode() {
        return this.overwriteMode == null ? Input.empty() : this.overwriteMode;
    }

    /**
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.
     * 
     */
    @InputImport(name="posixPermissions")
    private final @Nullable Input<TaskOptionsPosixPermissions> posixPermissions;

    public Input<TaskOptionsPosixPermissions> getPosixPermissions() {
        return this.posixPermissions == null ? Input.empty() : this.posixPermissions;
    }

    /**
     * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.
     * 
     */
    @InputImport(name="preserveDeletedFiles")
    private final @Nullable Input<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles;

    public Input<TaskOptionsPreserveDeletedFiles> getPreserveDeletedFiles() {
        return this.preserveDeletedFiles == null ? Input.empty() : this.preserveDeletedFiles;
    }

    /**
     * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.
     * 
     */
    @InputImport(name="preserveDevices")
    private final @Nullable Input<TaskOptionsPreserveDevices> preserveDevices;

    public Input<TaskOptionsPreserveDevices> getPreserveDevices() {
        return this.preserveDevices == null ? Input.empty() : this.preserveDevices;
    }

    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    @InputImport(name="securityDescriptorCopyFlags")
    private final @Nullable Input<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags;

    public Input<TaskOptionsSecurityDescriptorCopyFlags> getSecurityDescriptorCopyFlags() {
        return this.securityDescriptorCopyFlags == null ? Input.empty() : this.securityDescriptorCopyFlags;
    }

    /**
     * A value that determines whether tasks should be queued before executing the tasks.
     * 
     */
    @InputImport(name="taskQueueing")
    private final @Nullable Input<TaskOptionsTaskQueueing> taskQueueing;

    public Input<TaskOptionsTaskQueueing> getTaskQueueing() {
        return this.taskQueueing == null ? Input.empty() : this.taskQueueing;
    }

    /**
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.
     * 
     */
    @InputImport(name="transferMode")
    private final @Nullable Input<TaskOptionsTransferMode> transferMode;

    public Input<TaskOptionsTransferMode> getTransferMode() {
        return this.transferMode == null ? Input.empty() : this.transferMode;
    }

    /**
     * The user ID (UID) of the file's owner.
     * 
     */
    @InputImport(name="uid")
    private final @Nullable Input<TaskOptionsUid> uid;

    public Input<TaskOptionsUid> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.
     * 
     */
    @InputImport(name="verifyMode")
    private final @Nullable Input<TaskOptionsVerifyMode> verifyMode;

    public Input<TaskOptionsVerifyMode> getVerifyMode() {
        return this.verifyMode == null ? Input.empty() : this.verifyMode;
    }

    public TaskOptionsArgs(
        @Nullable Input<TaskOptionsAtime> atime,
        @Nullable Input<Integer> bytesPerSecond,
        @Nullable Input<TaskOptionsGid> gid,
        @Nullable Input<TaskOptionsLogLevel> logLevel,
        @Nullable Input<TaskOptionsMtime> mtime,
        @Nullable Input<TaskOptionsOverwriteMode> overwriteMode,
        @Nullable Input<TaskOptionsPosixPermissions> posixPermissions,
        @Nullable Input<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles,
        @Nullable Input<TaskOptionsPreserveDevices> preserveDevices,
        @Nullable Input<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags,
        @Nullable Input<TaskOptionsTaskQueueing> taskQueueing,
        @Nullable Input<TaskOptionsTransferMode> transferMode,
        @Nullable Input<TaskOptionsUid> uid,
        @Nullable Input<TaskOptionsVerifyMode> verifyMode) {
        this.atime = atime;
        this.bytesPerSecond = bytesPerSecond;
        this.gid = gid;
        this.logLevel = logLevel;
        this.mtime = mtime;
        this.overwriteMode = overwriteMode;
        this.posixPermissions = posixPermissions;
        this.preserveDeletedFiles = preserveDeletedFiles;
        this.preserveDevices = preserveDevices;
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
        this.taskQueueing = taskQueueing;
        this.transferMode = transferMode;
        this.uid = uid;
        this.verifyMode = verifyMode;
    }

    private TaskOptionsArgs() {
        this.atime = Input.empty();
        this.bytesPerSecond = Input.empty();
        this.gid = Input.empty();
        this.logLevel = Input.empty();
        this.mtime = Input.empty();
        this.overwriteMode = Input.empty();
        this.posixPermissions = Input.empty();
        this.preserveDeletedFiles = Input.empty();
        this.preserveDevices = Input.empty();
        this.securityDescriptorCopyFlags = Input.empty();
        this.taskQueueing = Input.empty();
        this.transferMode = Input.empty();
        this.uid = Input.empty();
        this.verifyMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskOptionsAtime> atime;
        private @Nullable Input<Integer> bytesPerSecond;
        private @Nullable Input<TaskOptionsGid> gid;
        private @Nullable Input<TaskOptionsLogLevel> logLevel;
        private @Nullable Input<TaskOptionsMtime> mtime;
        private @Nullable Input<TaskOptionsOverwriteMode> overwriteMode;
        private @Nullable Input<TaskOptionsPosixPermissions> posixPermissions;
        private @Nullable Input<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles;
        private @Nullable Input<TaskOptionsPreserveDevices> preserveDevices;
        private @Nullable Input<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags;
        private @Nullable Input<TaskOptionsTaskQueueing> taskQueueing;
        private @Nullable Input<TaskOptionsTransferMode> transferMode;
        private @Nullable Input<TaskOptionsUid> uid;
        private @Nullable Input<TaskOptionsVerifyMode> verifyMode;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atime = defaults.atime;
    	      this.bytesPerSecond = defaults.bytesPerSecond;
    	      this.gid = defaults.gid;
    	      this.logLevel = defaults.logLevel;
    	      this.mtime = defaults.mtime;
    	      this.overwriteMode = defaults.overwriteMode;
    	      this.posixPermissions = defaults.posixPermissions;
    	      this.preserveDeletedFiles = defaults.preserveDeletedFiles;
    	      this.preserveDevices = defaults.preserveDevices;
    	      this.securityDescriptorCopyFlags = defaults.securityDescriptorCopyFlags;
    	      this.taskQueueing = defaults.taskQueueing;
    	      this.transferMode = defaults.transferMode;
    	      this.uid = defaults.uid;
    	      this.verifyMode = defaults.verifyMode;
        }

        public Builder setAtime(@Nullable Input<TaskOptionsAtime> atime) {
            this.atime = atime;
            return this;
        }

        public Builder setAtime(@Nullable TaskOptionsAtime atime) {
            this.atime = Input.ofNullable(atime);
            return this;
        }

        public Builder setBytesPerSecond(@Nullable Input<Integer> bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }

        public Builder setBytesPerSecond(@Nullable Integer bytesPerSecond) {
            this.bytesPerSecond = Input.ofNullable(bytesPerSecond);
            return this;
        }

        public Builder setGid(@Nullable Input<TaskOptionsGid> gid) {
            this.gid = gid;
            return this;
        }

        public Builder setGid(@Nullable TaskOptionsGid gid) {
            this.gid = Input.ofNullable(gid);
            return this;
        }

        public Builder setLogLevel(@Nullable Input<TaskOptionsLogLevel> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable TaskOptionsLogLevel logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public Builder setMtime(@Nullable Input<TaskOptionsMtime> mtime) {
            this.mtime = mtime;
            return this;
        }

        public Builder setMtime(@Nullable TaskOptionsMtime mtime) {
            this.mtime = Input.ofNullable(mtime);
            return this;
        }

        public Builder setOverwriteMode(@Nullable Input<TaskOptionsOverwriteMode> overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }

        public Builder setOverwriteMode(@Nullable TaskOptionsOverwriteMode overwriteMode) {
            this.overwriteMode = Input.ofNullable(overwriteMode);
            return this;
        }

        public Builder setPosixPermissions(@Nullable Input<TaskOptionsPosixPermissions> posixPermissions) {
            this.posixPermissions = posixPermissions;
            return this;
        }

        public Builder setPosixPermissions(@Nullable TaskOptionsPosixPermissions posixPermissions) {
            this.posixPermissions = Input.ofNullable(posixPermissions);
            return this;
        }

        public Builder setPreserveDeletedFiles(@Nullable Input<TaskOptionsPreserveDeletedFiles> preserveDeletedFiles) {
            this.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }

        public Builder setPreserveDeletedFiles(@Nullable TaskOptionsPreserveDeletedFiles preserveDeletedFiles) {
            this.preserveDeletedFiles = Input.ofNullable(preserveDeletedFiles);
            return this;
        }

        public Builder setPreserveDevices(@Nullable Input<TaskOptionsPreserveDevices> preserveDevices) {
            this.preserveDevices = preserveDevices;
            return this;
        }

        public Builder setPreserveDevices(@Nullable TaskOptionsPreserveDevices preserveDevices) {
            this.preserveDevices = Input.ofNullable(preserveDevices);
            return this;
        }

        public Builder setSecurityDescriptorCopyFlags(@Nullable Input<TaskOptionsSecurityDescriptorCopyFlags> securityDescriptorCopyFlags) {
            this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
            return this;
        }

        public Builder setSecurityDescriptorCopyFlags(@Nullable TaskOptionsSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
            this.securityDescriptorCopyFlags = Input.ofNullable(securityDescriptorCopyFlags);
            return this;
        }

        public Builder setTaskQueueing(@Nullable Input<TaskOptionsTaskQueueing> taskQueueing) {
            this.taskQueueing = taskQueueing;
            return this;
        }

        public Builder setTaskQueueing(@Nullable TaskOptionsTaskQueueing taskQueueing) {
            this.taskQueueing = Input.ofNullable(taskQueueing);
            return this;
        }

        public Builder setTransferMode(@Nullable Input<TaskOptionsTransferMode> transferMode) {
            this.transferMode = transferMode;
            return this;
        }

        public Builder setTransferMode(@Nullable TaskOptionsTransferMode transferMode) {
            this.transferMode = Input.ofNullable(transferMode);
            return this;
        }

        public Builder setUid(@Nullable Input<TaskOptionsUid> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable TaskOptionsUid uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public Builder setVerifyMode(@Nullable Input<TaskOptionsVerifyMode> verifyMode) {
            this.verifyMode = verifyMode;
            return this;
        }

        public Builder setVerifyMode(@Nullable TaskOptionsVerifyMode verifyMode) {
            this.verifyMode = Input.ofNullable(verifyMode);
            return this;
        }

        public TaskOptionsArgs build() {
            return new TaskOptionsArgs(atime, bytesPerSecond, gid, logLevel, mtime, overwriteMode, posixPermissions, preserveDeletedFiles, preserveDevices, securityDescriptorCopyFlags, taskQueueing, transferMode, uid, verifyMode);
        }
    }
}