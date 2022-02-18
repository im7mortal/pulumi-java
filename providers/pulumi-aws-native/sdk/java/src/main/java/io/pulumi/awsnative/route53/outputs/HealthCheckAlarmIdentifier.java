// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HealthCheckAlarmIdentifier {
    /**
     * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.
     * 
     */
    private final String name;
    /**
     * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in.
     * 
     */
    private final String region;

    @OutputCustomType.Constructor({"name","region"})
    private HealthCheckAlarmIdentifier(
        String name,
        String region) {
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
    }

    /**
     * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in.
     * 
     */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckAlarmIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckAlarmIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public HealthCheckAlarmIdentifier build() {
            return new HealthCheckAlarmIdentifier(name, region);
        }
    }
}
