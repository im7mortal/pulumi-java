// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class HintArgs extends io.pulumi.resources.ResourceArgs {

    public static final HintArgs Empty = new HintArgs();

    @InputImport(name="humanReadableName", required=true)
    private final Input<String> humanReadableName;

    public Input<String> getHumanReadableName() {
        return this.humanReadableName;
    }

    public HintArgs(Input<String> humanReadableName) {
        this.humanReadableName = Objects.requireNonNull(humanReadableName, "expected parameter 'humanReadableName' to be non-null");
    }

    private HintArgs() {
        this.humanReadableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(HintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder setHumanReadableName(Input<String> humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }

        public Builder setHumanReadableName(String humanReadableName) {
            this.humanReadableName = Input.of(Objects.requireNonNull(humanReadableName));
            return this;
        }

        public HintArgs build() {
            return new HintArgs(humanReadableName);
        }
    }
}