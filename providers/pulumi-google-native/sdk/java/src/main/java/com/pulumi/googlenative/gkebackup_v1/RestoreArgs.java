// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestoreArgs Empty = new RestoreArgs();

    /**
     * Immutable. The Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
     * 
     */
    @Import(name="backup", required=true)
    private Output<String> backup;

    /**
     * @return Immutable. The Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
     * 
     */
    public Output<String> backup() {
        return this.backup;
    }

    /**
     * User specified descriptive string for this Restore.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User specified descriptive string for this Restore.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * GCP Labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return GCP Labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Required. The client-provided short name for the Restore resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of Restores in this RestorePlan.
     * 
     */
    @Import(name="restoreId", required=true)
    private Output<String> restoreId;

    /**
     * @return Required. The client-provided short name for the Restore resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of Restores in this RestorePlan.
     * 
     */
    public Output<String> restoreId() {
        return this.restoreId;
    }

    @Import(name="restorePlanId", required=true)
    private Output<String> restorePlanId;

    public Output<String> restorePlanId() {
        return this.restorePlanId;
    }

    private RestoreArgs() {}

    private RestoreArgs(RestoreArgs $) {
        this.backup = $.backup;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.restoreId = $.restoreId;
        this.restorePlanId = $.restorePlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestoreArgs $;

        public Builder() {
            $ = new RestoreArgs();
        }

        public Builder(RestoreArgs defaults) {
            $ = new RestoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backup Immutable. The Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
         * 
         * @return builder
         * 
         */
        public Builder backup(Output<String> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup Immutable. The Backup used as the source from which this Restore will restore. Note that this Backup must be a sub-resource of the RestorePlan&#39;s backup_plan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*{@literal /}backups/*.
         * 
         * @return builder
         * 
         */
        public Builder backup(String backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param description User specified descriptive string for this Restore.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User specified descriptive string for this Restore.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels GCP Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels GCP Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param restoreId Required. The client-provided short name for the Restore resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of Restores in this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder restoreId(Output<String> restoreId) {
            $.restoreId = restoreId;
            return this;
        }

        /**
         * @param restoreId Required. The client-provided short name for the Restore resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of Restores in this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder restoreId(String restoreId) {
            return restoreId(Output.of(restoreId));
        }

        public Builder restorePlanId(Output<String> restorePlanId) {
            $.restorePlanId = restorePlanId;
            return this;
        }

        public Builder restorePlanId(String restorePlanId) {
            return restorePlanId(Output.of(restorePlanId));
        }

        public RestoreArgs build() {
            $.backup = Objects.requireNonNull($.backup, "expected parameter 'backup' to be non-null");
            $.restoreId = Objects.requireNonNull($.restoreId, "expected parameter 'restoreId' to be non-null");
            $.restorePlanId = Objects.requireNonNull($.restorePlanId, "expected parameter 'restorePlanId' to be non-null");
            return $;
        }
    }

}
