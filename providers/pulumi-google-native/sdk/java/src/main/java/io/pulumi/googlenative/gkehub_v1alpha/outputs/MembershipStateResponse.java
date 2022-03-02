// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MembershipStateResponse {
    /**
     * The current state of the Membership resource.
     * 
     */
    private final String code;

    @OutputCustomType.Constructor({"code"})
    private MembershipStateResponse(String code) {
        this.code = Objects.requireNonNull(code);
    }

    /**
     * The current state of the Membership resource.
     * 
    */
    public String getCode() {
        return this.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public MembershipStateResponse build() {
            return new MembershipStateResponse(code);
        }
    }
}
