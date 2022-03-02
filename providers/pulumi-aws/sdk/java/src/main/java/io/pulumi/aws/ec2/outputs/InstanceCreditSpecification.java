// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceCreditSpecification {
    /**
     * Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    private final @Nullable String cpuCredits;

    @OutputCustomType.Constructor({"cpuCredits"})
    private InstanceCreditSpecification(@Nullable String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
    */
    public Optional<String> getCpuCredits() {
        return Optional.ofNullable(this.cpuCredits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceCreditSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpuCredits;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceCreditSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        public Builder setCpuCredits(@Nullable String cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }
        public InstanceCreditSpecification build() {
            return new InstanceCreditSpecification(cpuCredits);
        }
    }
}
