// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ComponentTransformResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComponentTransformResponse Empty = new ComponentTransformResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="originalTransform", required=true)
    private final String originalTransform;

    public String getOriginalTransform() {
        return this.originalTransform;
    }

    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ComponentTransformResponse(
        String name,
        String originalTransform,
        String userName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.originalTransform = Objects.requireNonNull(originalTransform, "expected parameter 'originalTransform' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ComponentTransformResponse() {
        this.name = null;
        this.originalTransform = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentTransformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransform;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentTransformResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransform = defaults.originalTransform;
    	      this.userName = defaults.userName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginalTransform(String originalTransform) {
            this.originalTransform = Objects.requireNonNull(originalTransform);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public ComponentTransformResponse build() {
            return new ComponentTransformResponse(name, originalTransform, userName);
        }
    }
}