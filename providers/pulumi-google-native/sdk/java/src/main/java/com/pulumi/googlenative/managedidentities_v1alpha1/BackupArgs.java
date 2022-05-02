// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    /**
     * Required. Backup Id, unique name to identify the backups with the following restrictions: * Must be lowercase letters, numbers, and hyphens * Must start with a letter. * Must contain between 1-63 characters. * Must end with a number or a letter. * Must be unique within the domain.
     * 
     */
    @Import(name="backupId", required=true)
    private Output<String> backupId;

    /**
     * @return Required. Backup Id, unique name to identify the backups with the following restrictions: * Must be lowercase letters, numbers, and hyphens * Must start with a letter. * Must contain between 1-63 characters. * Must end with a number or a letter. * Must be unique within the domain.
     * 
     */
    public Output<String> backupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
    private Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId;
    }

    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private BackupArgs() {}

    private BackupArgs(BackupArgs $) {
        this.backupId = $.backupId;
        this.domainId = $.domainId;
        this.labels = $.labels;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupArgs $;

        public Builder() {
            $ = new BackupArgs();
        }

        public Builder(BackupArgs defaults) {
            $ = new BackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupId Required. Backup Id, unique name to identify the backups with the following restrictions: * Must be lowercase letters, numbers, and hyphens * Must start with a letter. * Must contain between 1-63 characters. * Must end with a number or a letter. * Must be unique within the domain.
         * 
         * @return builder
         * 
         */
        public Builder backupId(Output<String> backupId) {
            $.backupId = backupId;
            return this;
        }

        /**
         * @param backupId Required. Backup Id, unique name to identify the backups with the following restrictions: * Must be lowercase letters, numbers, and hyphens * Must start with a letter. * Must contain between 1-63 characters. * Must end with a number or a letter. * Must be unique within the domain.
         * 
         * @return builder
         * 
         */
        public Builder backupId(String backupId) {
            return backupId(Output.of(backupId));
        }

        public Builder domainId(Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param labels Optional. Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public BackupArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            return $;
        }
    }

}
