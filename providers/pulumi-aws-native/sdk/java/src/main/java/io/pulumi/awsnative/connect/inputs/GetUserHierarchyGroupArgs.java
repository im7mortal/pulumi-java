// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserHierarchyGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserHierarchyGroupArgs Empty = new GetUserHierarchyGroupArgs();

    /**
     * The Amazon Resource Name (ARN) for the user hierarchy group.
     * 
     */
    @InputImport(name="userHierarchyGroupArn", required=true)
    private final String userHierarchyGroupArn;

    public String getUserHierarchyGroupArn() {
        return this.userHierarchyGroupArn;
    }

    public GetUserHierarchyGroupArgs(String userHierarchyGroupArn) {
        this.userHierarchyGroupArn = Objects.requireNonNull(userHierarchyGroupArn, "expected parameter 'userHierarchyGroupArn' to be non-null");
    }

    private GetUserHierarchyGroupArgs() {
        this.userHierarchyGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserHierarchyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userHierarchyGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserHierarchyGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userHierarchyGroupArn = defaults.userHierarchyGroupArn;
        }

        public Builder setUserHierarchyGroupArn(String userHierarchyGroupArn) {
            this.userHierarchyGroupArn = Objects.requireNonNull(userHierarchyGroupArn);
            return this;
        }

        public GetUserHierarchyGroupArgs build() {
            return new GetUserHierarchyGroupArgs(userHierarchyGroupArn);
        }
    }
}
