// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentRoleType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The wrapper that contains AWS Audit Manager role information, such as the role type and IAM ARN.
 * 
 */
public final class AssessmentRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentRoleArgs Empty = new AssessmentRoleArgs();

    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    @InputImport(name="roleType")
    private final @Nullable Input<AssessmentRoleType> roleType;

    public Input<AssessmentRoleType> getRoleType() {
        return this.roleType == null ? Input.empty() : this.roleType;
    }

    public AssessmentRoleArgs(
        @Nullable Input<String> roleArn,
        @Nullable Input<AssessmentRoleType> roleType) {
        this.roleArn = roleArn;
        this.roleType = roleType;
    }

    private AssessmentRoleArgs() {
        this.roleArn = Input.empty();
        this.roleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> roleArn;
        private @Nullable Input<AssessmentRoleType> roleType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleType = defaults.roleType;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setRoleType(@Nullable Input<AssessmentRoleType> roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder setRoleType(@Nullable AssessmentRoleType roleType) {
            this.roleType = Input.ofNullable(roleType);
            return this;
        }

        public AssessmentRoleArgs build() {
            return new AssessmentRoleArgs(roleArn, roleType);
        }
    }
}
