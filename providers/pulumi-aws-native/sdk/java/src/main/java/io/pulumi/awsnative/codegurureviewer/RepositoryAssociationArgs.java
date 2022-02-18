// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codegurureviewer;

import io.pulumi.awsnative.codegurureviewer.enums.RepositoryAssociationType;
import io.pulumi.awsnative.codegurureviewer.inputs.RepositoryAssociationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryAssociationArgs Empty = new RepositoryAssociationArgs();

    /**
     * The name of the S3 bucket associated with an associated S3 repository. It must start with `codeguru-reviewer-`.
     * 
     */
    @InputImport(name="bucketName")
    private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    @InputImport(name="connectionArn")
    private final @Nullable Input<String> connectionArn;

    public Input<String> getConnectionArn() {
        return this.connectionArn == null ? Input.empty() : this.connectionArn;
    }

    /**
     * Name of the repository to be associated.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The owner of the repository. For a Bitbucket repository, this is the username for the account that owns the repository.
     * 
     */
    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * The tags associated with a repository association.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<RepositoryAssociationTagArgs>> tags;

    public Input<List<RepositoryAssociationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of repository to be associated.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<RepositoryAssociationType> type;

    public Input<RepositoryAssociationType> getType() {
        return this.type;
    }

    public RepositoryAssociationArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<String> connectionArn,
        @Nullable Input<String> name,
        @Nullable Input<String> owner,
        @Nullable Input<List<RepositoryAssociationTagArgs>> tags,
        Input<RepositoryAssociationType> type) {
        this.bucketName = bucketName;
        this.connectionArn = connectionArn;
        this.name = name;
        this.owner = owner;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RepositoryAssociationArgs() {
        this.bucketName = Input.empty();
        this.connectionArn = Input.empty();
        this.name = Input.empty();
        this.owner = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<String> connectionArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> owner;
        private @Nullable Input<List<RepositoryAssociationTagArgs>> tags;
        private Input<RepositoryAssociationType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.connectionArn = defaults.connectionArn;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setBucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setBucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder setConnectionArn(@Nullable Input<String> connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }

        public Builder setConnectionArn(@Nullable String connectionArn) {
            this.connectionArn = Input.ofNullable(connectionArn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setTags(@Nullable Input<List<RepositoryAssociationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RepositoryAssociationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(Input<RepositoryAssociationType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(RepositoryAssociationType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public RepositoryAssociationArgs build() {
            return new RepositoryAssociationArgs(bucketName, connectionArn, name, owner, tags, type);
        }
    }
}