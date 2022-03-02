// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SlotSwapStatusResponse {
    /**
     * The destination slot of the last swap operation.
     * 
     */
    private final String destinationSlotName;
    /**
     * The source slot of the last swap operation.
     * 
     */
    private final String sourceSlotName;
    /**
     * The time the last successful slot swap completed.
     * 
     */
    private final String timestampUtc;

    @OutputCustomType.Constructor({"destinationSlotName","sourceSlotName","timestampUtc"})
    private SlotSwapStatusResponse(
        String destinationSlotName,
        String sourceSlotName,
        String timestampUtc) {
        this.destinationSlotName = Objects.requireNonNull(destinationSlotName);
        this.sourceSlotName = Objects.requireNonNull(sourceSlotName);
        this.timestampUtc = Objects.requireNonNull(timestampUtc);
    }

    /**
     * The destination slot of the last swap operation.
     * 
    */
    public String getDestinationSlotName() {
        return this.destinationSlotName;
    }
    /**
     * The source slot of the last swap operation.
     * 
    */
    public String getSourceSlotName() {
        return this.sourceSlotName;
    }
    /**
     * The time the last successful slot swap completed.
     * 
    */
    public String getTimestampUtc() {
        return this.timestampUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotSwapStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationSlotName;
        private String sourceSlotName;
        private String timestampUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotSwapStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSlotName = defaults.destinationSlotName;
    	      this.sourceSlotName = defaults.sourceSlotName;
    	      this.timestampUtc = defaults.timestampUtc;
        }

        public Builder setDestinationSlotName(String destinationSlotName) {
            this.destinationSlotName = Objects.requireNonNull(destinationSlotName);
            return this;
        }

        public Builder setSourceSlotName(String sourceSlotName) {
            this.sourceSlotName = Objects.requireNonNull(sourceSlotName);
            return this;
        }

        public Builder setTimestampUtc(String timestampUtc) {
            this.timestampUtc = Objects.requireNonNull(timestampUtc);
            return this;
        }
        public SlotSwapStatusResponse build() {
            return new SlotSwapStatusResponse(destinationSlotName, sourceSlotName, timestampUtc);
        }
    }
}
