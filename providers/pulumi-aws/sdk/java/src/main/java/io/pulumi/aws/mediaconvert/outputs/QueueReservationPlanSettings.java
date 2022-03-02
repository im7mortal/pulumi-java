// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediaconvert.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QueueReservationPlanSettings {
    /**
     * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
     */
    private final String commitment;
    /**
     * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
     */
    private final String renewalType;
    /**
     * Specifies the number of reserved transcode slots (RTS) for queue.
     * 
     */
    private final Integer reservedSlots;

    @OutputCustomType.Constructor({"commitment","renewalType","reservedSlots"})
    private QueueReservationPlanSettings(
        String commitment,
        String renewalType,
        Integer reservedSlots) {
        this.commitment = Objects.requireNonNull(commitment);
        this.renewalType = Objects.requireNonNull(renewalType);
        this.reservedSlots = Objects.requireNonNull(reservedSlots);
    }

    /**
     * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
    */
    public String getCommitment() {
        return this.commitment;
    }
    /**
     * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
    */
    public String getRenewalType() {
        return this.renewalType;
    }
    /**
     * Specifies the number of reserved transcode slots (RTS) for queue.
     * 
    */
    public Integer getReservedSlots() {
        return this.reservedSlots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueReservationPlanSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String renewalType;
        private Integer reservedSlots;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueReservationPlanSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.renewalType = defaults.renewalType;
    	      this.reservedSlots = defaults.reservedSlots;
        }

        public Builder setCommitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }

        public Builder setRenewalType(String renewalType) {
            this.renewalType = Objects.requireNonNull(renewalType);
            return this;
        }

        public Builder setReservedSlots(Integer reservedSlots) {
            this.reservedSlots = Objects.requireNonNull(reservedSlots);
            return this;
        }
        public QueueReservationPlanSettings build() {
            return new QueueReservationPlanSettings(commitment, renewalType, reservedSlots);
        }
    }
}
