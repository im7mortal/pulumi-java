// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineThumbnailConfigPermission {
    /**
     * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    private final @Nullable List<String> accesses;
    /**
     * The AWS user or group that you want to have access to thumbnail files.
     * 
     */
    private final @Nullable String grantee;
    /**
     * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    private final @Nullable String granteeType;

    @OutputCustomType.Constructor({"accesses","grantee","granteeType"})
    private PipelineThumbnailConfigPermission(
        @Nullable List<String> accesses,
        @Nullable String grantee,
        @Nullable String granteeType) {
        this.accesses = accesses;
        this.grantee = grantee;
        this.granteeType = granteeType;
    }

    /**
     * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
    */
    public List<String> getAccesses() {
        return this.accesses == null ? List.of() : this.accesses;
    }
    /**
     * The AWS user or group that you want to have access to thumbnail files.
     * 
    */
    public Optional<String> getGrantee() {
        return Optional.ofNullable(this.grantee);
    }
    /**
     * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
    */
    public Optional<String> getGranteeType() {
        return Optional.ofNullable(this.granteeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineThumbnailConfigPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accesses;
        private @Nullable String grantee;
        private @Nullable String granteeType;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineThumbnailConfigPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.grantee = defaults.grantee;
    	      this.granteeType = defaults.granteeType;
        }

        public Builder setAccesses(@Nullable List<String> accesses) {
            this.accesses = accesses;
            return this;
        }

        public Builder setGrantee(@Nullable String grantee) {
            this.grantee = grantee;
            return this;
        }

        public Builder setGranteeType(@Nullable String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public PipelineThumbnailConfigPermission build() {
            return new PipelineThumbnailConfigPermission(accesses, grantee, granteeType);
        }
    }
}
