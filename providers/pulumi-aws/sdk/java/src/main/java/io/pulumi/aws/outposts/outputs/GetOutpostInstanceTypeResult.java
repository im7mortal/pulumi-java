// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOutpostInstanceTypeResult {
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceType;
    private final @Nullable List<String> preferredInstanceTypes;

    @OutputCustomType.Constructor({"arn","id","instanceType","preferredInstanceTypes"})
    private GetOutpostInstanceTypeResult(
        String arn,
        String id,
        String instanceType,
        @Nullable List<String> preferredInstanceTypes) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.preferredInstanceTypes = preferredInstanceTypes;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getInstanceType() {
        return this.instanceType;
    }
    public List<String> getPreferredInstanceTypes() {
        return this.preferredInstanceTypes == null ? List.of() : this.preferredInstanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostInstanceTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String instanceType;
        private @Nullable List<String> preferredInstanceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostInstanceTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.instanceType = defaults.instanceType;
    	      this.preferredInstanceTypes = defaults.preferredInstanceTypes;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPreferredInstanceTypes(@Nullable List<String> preferredInstanceTypes) {
            this.preferredInstanceTypes = preferredInstanceTypes;
            return this;
        }
        public GetOutpostInstanceTypeResult build() {
            return new GetOutpostInstanceTypeResult(arn, id, instanceType, preferredInstanceTypes);
        }
    }
}
