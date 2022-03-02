// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerImage {
    /**
     * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
     * 
     */
    private final List<String> names;
    /**
     * The size of the image in bytes.
     * 
     */
    private final @Nullable Integer sizeBytes;

    @OutputCustomType.Constructor({"names","sizeBytes"})
    private ContainerImage(
        List<String> names,
        @Nullable Integer sizeBytes) {
        this.names = Objects.requireNonNull(names);
        this.sizeBytes = sizeBytes;
    }

    /**
     * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
     * 
    */
    public List<String> getNames() {
        return this.names;
    }
    /**
     * The size of the image in bytes.
     * 
    */
    public Optional<Integer> getSizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> names;
        private @Nullable Integer sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setSizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public ContainerImage build() {
            return new ContainerImage(names, sizeBytes);
        }
    }
}
