// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MoveCollectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MoveCollectionPropertiesArgs Empty = new MoveCollectionPropertiesArgs();

    @InputImport(name="sourceRegion", required=true)
    private final Input<String> sourceRegion;

    public Input<String> getSourceRegion() {
        return this.sourceRegion;
    }

    @InputImport(name="targetRegion", required=true)
    private final Input<String> targetRegion;

    public Input<String> getTargetRegion() {
        return this.targetRegion;
    }

    public MoveCollectionPropertiesArgs(
        Input<String> sourceRegion,
        Input<String> targetRegion) {
        this.sourceRegion = Objects.requireNonNull(sourceRegion, "expected parameter 'sourceRegion' to be non-null");
        this.targetRegion = Objects.requireNonNull(targetRegion, "expected parameter 'targetRegion' to be non-null");
    }

    private MoveCollectionPropertiesArgs() {
        this.sourceRegion = Input.empty();
        this.targetRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveCollectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourceRegion;
        private Input<String> targetRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveCollectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceRegion = defaults.sourceRegion;
    	      this.targetRegion = defaults.targetRegion;
        }

        public Builder setSourceRegion(Input<String> sourceRegion) {
            this.sourceRegion = Objects.requireNonNull(sourceRegion);
            return this;
        }

        public Builder setSourceRegion(String sourceRegion) {
            this.sourceRegion = Input.of(Objects.requireNonNull(sourceRegion));
            return this;
        }

        public Builder setTargetRegion(Input<String> targetRegion) {
            this.targetRegion = Objects.requireNonNull(targetRegion);
            return this;
        }

        public Builder setTargetRegion(String targetRegion) {
            this.targetRegion = Input.of(Objects.requireNonNull(targetRegion));
            return this;
        }

        public MoveCollectionPropertiesArgs build() {
            return new MoveCollectionPropertiesArgs(sourceRegion, targetRegion);
        }
    }
}