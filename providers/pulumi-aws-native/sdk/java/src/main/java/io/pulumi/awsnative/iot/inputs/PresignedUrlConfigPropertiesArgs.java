// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for pre-signed S3 URLs.
 * 
 */
public final class PresignedUrlConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresignedUrlConfigPropertiesArgs Empty = new PresignedUrlConfigPropertiesArgs();

    @InputImport(name="expiresInSec")
    private final @Nullable Input<Integer> expiresInSec;

    public Input<Integer> getExpiresInSec() {
        return this.expiresInSec == null ? Input.empty() : this.expiresInSec;
    }

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public PresignedUrlConfigPropertiesArgs(
        @Nullable Input<Integer> expiresInSec,
        Input<String> roleArn) {
        this.expiresInSec = expiresInSec;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private PresignedUrlConfigPropertiesArgs() {
        this.expiresInSec = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresignedUrlConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> expiresInSec;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PresignedUrlConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresInSec = defaults.expiresInSec;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setExpiresInSec(@Nullable Input<Integer> expiresInSec) {
            this.expiresInSec = expiresInSec;
            return this;
        }

        public Builder setExpiresInSec(@Nullable Integer expiresInSec) {
            this.expiresInSec = Input.ofNullable(expiresInSec);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public PresignedUrlConfigPropertiesArgs build() {
            return new PresignedUrlConfigPropertiesArgs(expiresInSec, roleArn);
        }
    }
}
