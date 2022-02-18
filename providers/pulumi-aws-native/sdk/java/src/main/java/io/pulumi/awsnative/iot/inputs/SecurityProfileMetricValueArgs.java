// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The value to be compared with the metric.
 * 
 */
public final class SecurityProfileMetricValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileMetricValueArgs Empty = new SecurityProfileMetricValueArgs();

    /**
     * If the ComparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
     * 
     */
    @InputImport(name="cidrs")
    private final @Nullable Input<List<String>> cidrs;

    public Input<List<String>> getCidrs() {
        return this.cidrs == null ? Input.empty() : this.cidrs;
    }

    /**
     * If the ComparisonOperator calls for a numeric value, use this to specify that (integer) numeric value to be compared with the metric.
     * 
     */
    @InputImport(name="count")
    private final @Nullable Input<String> count;

    public Input<String> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * The numeral value of a metric.
     * 
     */
    @InputImport(name="number")
    private final @Nullable Input<Double> number;

    public Input<Double> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    /**
     * The numeral values of a metric.
     * 
     */
    @InputImport(name="numbers")
    private final @Nullable Input<List<Double>> numbers;

    public Input<List<Double>> getNumbers() {
        return this.numbers == null ? Input.empty() : this.numbers;
    }

    /**
     * If the ComparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<Integer>> ports;

    public Input<List<Integer>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * The string values of a metric.
     * 
     */
    @InputImport(name="strings")
    private final @Nullable Input<List<String>> strings;

    public Input<List<String>> getStrings() {
        return this.strings == null ? Input.empty() : this.strings;
    }

    public SecurityProfileMetricValueArgs(
        @Nullable Input<List<String>> cidrs,
        @Nullable Input<String> count,
        @Nullable Input<Double> number,
        @Nullable Input<List<Double>> numbers,
        @Nullable Input<List<Integer>> ports,
        @Nullable Input<List<String>> strings) {
        this.cidrs = cidrs;
        this.count = count;
        this.number = number;
        this.numbers = numbers;
        this.ports = ports;
        this.strings = strings;
    }

    private SecurityProfileMetricValueArgs() {
        this.cidrs = Input.empty();
        this.count = Input.empty();
        this.number = Input.empty();
        this.numbers = Input.empty();
        this.ports = Input.empty();
        this.strings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cidrs;
        private @Nullable Input<String> count;
        private @Nullable Input<Double> number;
        private @Nullable Input<List<Double>> numbers;
        private @Nullable Input<List<Integer>> ports;
        private @Nullable Input<List<String>> strings;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.count = defaults.count;
    	      this.number = defaults.number;
    	      this.numbers = defaults.numbers;
    	      this.ports = defaults.ports;
    	      this.strings = defaults.strings;
        }

        public Builder setCidrs(@Nullable Input<List<String>> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        public Builder setCidrs(@Nullable List<String> cidrs) {
            this.cidrs = Input.ofNullable(cidrs);
            return this;
        }

        public Builder setCount(@Nullable Input<String> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable String count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setNumber(@Nullable Input<Double> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Double number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public Builder setNumbers(@Nullable Input<List<Double>> numbers) {
            this.numbers = numbers;
            return this;
        }

        public Builder setNumbers(@Nullable List<Double> numbers) {
            this.numbers = Input.ofNullable(numbers);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<Integer> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setStrings(@Nullable Input<List<String>> strings) {
            this.strings = strings;
            return this;
        }

        public Builder setStrings(@Nullable List<String> strings) {
            this.strings = Input.ofNullable(strings);
            return this;
        }

        public SecurityProfileMetricValueArgs build() {
            return new SecurityProfileMetricValueArgs(cidrs, count, number, numbers, ports, strings);
        }
    }
}
