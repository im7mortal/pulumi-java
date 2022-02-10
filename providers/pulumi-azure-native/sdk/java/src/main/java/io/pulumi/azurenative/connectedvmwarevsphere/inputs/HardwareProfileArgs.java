// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HardwareProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final HardwareProfileArgs Empty = new HardwareProfileArgs();

    @InputImport(name="memorySizeMB")
    private final @Nullable Input<Integer> memorySizeMB;

    public Input<Integer> getMemorySizeMB() {
        return this.memorySizeMB == null ? Input.empty() : this.memorySizeMB;
    }

    @InputImport(name="numCPUs")
    private final @Nullable Input<Integer> numCPUs;

    public Input<Integer> getNumCPUs() {
        return this.numCPUs == null ? Input.empty() : this.numCPUs;
    }

    @InputImport(name="numCoresPerSocket")
    private final @Nullable Input<Integer> numCoresPerSocket;

    public Input<Integer> getNumCoresPerSocket() {
        return this.numCoresPerSocket == null ? Input.empty() : this.numCoresPerSocket;
    }

    public HardwareProfileArgs(
        @Nullable Input<Integer> memorySizeMB,
        @Nullable Input<Integer> numCPUs,
        @Nullable Input<Integer> numCoresPerSocket) {
        this.memorySizeMB = memorySizeMB;
        this.numCPUs = numCPUs;
        this.numCoresPerSocket = numCoresPerSocket;
    }

    private HardwareProfileArgs() {
        this.memorySizeMB = Input.empty();
        this.numCPUs = Input.empty();
        this.numCoresPerSocket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> memorySizeMB;
        private @Nullable Input<Integer> numCPUs;
        private @Nullable Input<Integer> numCoresPerSocket;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memorySizeMB = defaults.memorySizeMB;
    	      this.numCPUs = defaults.numCPUs;
    	      this.numCoresPerSocket = defaults.numCoresPerSocket;
        }

        public Builder setMemorySizeMB(@Nullable Input<Integer> memorySizeMB) {
            this.memorySizeMB = memorySizeMB;
            return this;
        }

        public Builder setMemorySizeMB(@Nullable Integer memorySizeMB) {
            this.memorySizeMB = Input.ofNullable(memorySizeMB);
            return this;
        }

        public Builder setNumCPUs(@Nullable Input<Integer> numCPUs) {
            this.numCPUs = numCPUs;
            return this;
        }

        public Builder setNumCPUs(@Nullable Integer numCPUs) {
            this.numCPUs = Input.ofNullable(numCPUs);
            return this;
        }

        public Builder setNumCoresPerSocket(@Nullable Input<Integer> numCoresPerSocket) {
            this.numCoresPerSocket = numCoresPerSocket;
            return this;
        }

        public Builder setNumCoresPerSocket(@Nullable Integer numCoresPerSocket) {
            this.numCoresPerSocket = Input.ofNullable(numCoresPerSocket);
            return this;
        }

        public HardwareProfileArgs build() {
            return new HardwareProfileArgs(memorySizeMB, numCPUs, numCoresPerSocket);
        }
    }
}