// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReservationAffinityResponse {
    /**
     * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    private final String consumeReservationType;
    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
     */
    private final String key;
    /**
     * Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or "projects/different-project/reservations/some-reservation-name" to target a shared reservation in the same zone but in a different project.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"consumeReservationType","key","values"})
    private ReservationAffinityResponse(
        String consumeReservationType,
        String key,
        List<String> values) {
        this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
        this.key = Objects.requireNonNull(key);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
    */
    public String getConsumeReservationType() {
        return this.consumeReservationType;
    }
    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or "projects/different-project/reservations/some-reservation-name" to target a shared reservation in the same zone but in a different project.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumeReservationType;
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ReservationAffinityResponse build() {
            return new ReservationAffinityResponse(consumeReservationType, key, values);
        }
    }
}
