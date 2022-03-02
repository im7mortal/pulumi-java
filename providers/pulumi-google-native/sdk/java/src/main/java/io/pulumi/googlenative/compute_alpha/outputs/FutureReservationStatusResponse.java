// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FutureReservationStatusResponse {
    /**
     * Fully qualified urls of the automatically created reservations at start_time.
     * 
     */
    private final List<String> autoCreatedReservations;
    /**
     * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state. This count also includes capacity delivered as part of existing matching reservations.
     * 
     */
    private final String fulfilledCount;
    /**
     * Time when Future Reservation would become LOCKED, after which no modifications to Future Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING state at this time.
     * 
     */
    private final String lockTime;
    /**
     * Current state of this Future Reservation
     * 
     */
    private final String procurementStatus;

    @OutputCustomType.Constructor({"autoCreatedReservations","fulfilledCount","lockTime","procurementStatus"})
    private FutureReservationStatusResponse(
        List<String> autoCreatedReservations,
        String fulfilledCount,
        String lockTime,
        String procurementStatus) {
        this.autoCreatedReservations = Objects.requireNonNull(autoCreatedReservations);
        this.fulfilledCount = Objects.requireNonNull(fulfilledCount);
        this.lockTime = Objects.requireNonNull(lockTime);
        this.procurementStatus = Objects.requireNonNull(procurementStatus);
    }

    /**
     * Fully qualified urls of the automatically created reservations at start_time.
     * 
    */
    public List<String> getAutoCreatedReservations() {
        return this.autoCreatedReservations;
    }
    /**
     * This count indicates the fulfilled capacity so far. This is set during "PROVISIONING" state. This count also includes capacity delivered as part of existing matching reservations.
     * 
    */
    public String getFulfilledCount() {
        return this.fulfilledCount;
    }
    /**
     * Time when Future Reservation would become LOCKED, after which no modifications to Future Reservation will be allowed. Applicable only after the Future Reservation is in the APPROVED state. The lock_time is an RFC3339 string. The procurement_status will transition to PROCURING state at this time.
     * 
    */
    public String getLockTime() {
        return this.lockTime;
    }
    /**
     * Current state of this Future Reservation
     * 
    */
    public String getProcurementStatus() {
        return this.procurementStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> autoCreatedReservations;
        private String fulfilledCount;
        private String lockTime;
        private String procurementStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreatedReservations = defaults.autoCreatedReservations;
    	      this.fulfilledCount = defaults.fulfilledCount;
    	      this.lockTime = defaults.lockTime;
    	      this.procurementStatus = defaults.procurementStatus;
        }

        public Builder setAutoCreatedReservations(List<String> autoCreatedReservations) {
            this.autoCreatedReservations = Objects.requireNonNull(autoCreatedReservations);
            return this;
        }

        public Builder setFulfilledCount(String fulfilledCount) {
            this.fulfilledCount = Objects.requireNonNull(fulfilledCount);
            return this;
        }

        public Builder setLockTime(String lockTime) {
            this.lockTime = Objects.requireNonNull(lockTime);
            return this;
        }

        public Builder setProcurementStatus(String procurementStatus) {
            this.procurementStatus = Objects.requireNonNull(procurementStatus);
            return this;
        }
        public FutureReservationStatusResponse build() {
            return new FutureReservationStatusResponse(autoCreatedReservations, fulfilledCount, lockTime, procurementStatus);
        }
    }
}
