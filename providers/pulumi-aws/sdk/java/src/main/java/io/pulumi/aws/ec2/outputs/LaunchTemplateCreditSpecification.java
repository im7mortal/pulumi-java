// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchTemplateCreditSpecification {
    /**
     * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    private final @Nullable String cpuCredits;

    @OutputCustomType.Constructor({"cpuCredits"})
    private LaunchTemplateCreditSpecification(@Nullable String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
    */
    public Optional<String> getCpuCredits() {
        return Optional.ofNullable(this.cpuCredits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCreditSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpuCredits;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateCreditSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        public Builder setCpuCredits(@Nullable String cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }
        public LaunchTemplateCreditSpecification build() {
            return new LaunchTemplateCreditSpecification(cpuCredits);
        }
    }
}
