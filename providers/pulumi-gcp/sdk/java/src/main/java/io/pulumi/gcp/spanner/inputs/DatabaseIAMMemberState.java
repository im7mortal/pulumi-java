// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseIAMMemberState extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseIAMMemberState Empty = new DatabaseIAMMemberState();

    @InputImport(name="condition")
    private final @Nullable Input<DatabaseIAMMemberConditionGetArgs> condition;

    public Input<DatabaseIAMMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The name of the Spanner database.
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * (Computed) The etag of the database's IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.spanner.DatabaseIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public DatabaseIAMMemberState(
        @Nullable Input<DatabaseIAMMemberConditionGetArgs> condition,
        @Nullable Input<String> database,
        @Nullable Input<String> etag,
        @Nullable Input<String> instance,
        @Nullable Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.database = database;
        this.etag = etag;
        this.instance = instance;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private DatabaseIAMMemberState() {
        this.condition = Input.empty();
        this.database = Input.empty();
        this.etag = Input.empty();
        this.instance = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatabaseIAMMemberConditionGetArgs> condition;
        private @Nullable Input<String> database;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseIAMMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.database = defaults.database;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<DatabaseIAMMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable DatabaseIAMMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setDatabase(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public DatabaseIAMMemberState build() {
            return new DatabaseIAMMemberState(condition, database, etag, instance, member, project, role);
        }
    }
}