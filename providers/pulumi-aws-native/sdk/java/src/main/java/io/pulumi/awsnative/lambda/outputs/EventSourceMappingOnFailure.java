// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingOnFailure {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    private final @Nullable String destination;

    @OutputCustomType.Constructor({"destination"})
    private EventSourceMappingOnFailure(@Nullable String destination) {
        this.destination = destination;
    }

    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingOnFailure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public EventSourceMappingOnFailure build() {
            return new EventSourceMappingOnFailure(destination);
        }
    }
}
