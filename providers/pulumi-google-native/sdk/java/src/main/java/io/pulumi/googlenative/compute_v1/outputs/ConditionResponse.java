// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConditionResponse {
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String iam;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String op;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String svc;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final String sys;
    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"iam","op","svc","sys","values"})
    private ConditionResponse(
        String iam,
        String op,
        String svc,
        String sys,
        List<String> values) {
        this.iam = Objects.requireNonNull(iam);
        this.op = Objects.requireNonNull(op);
        this.svc = Objects.requireNonNull(svc);
        this.sys = Objects.requireNonNull(sys);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getIam() {
        return this.iam;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getOp() {
        return this.op;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getSvc() {
        return this.svc;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public String getSys() {
        return this.sys;
    }
    /**
     * This is deprecated and has no effect. Do not use.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iam;
        private String op;
        private String svc;
        private String sys;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder setIam(String iam) {
            this.iam = Objects.requireNonNull(iam);
            return this;
        }

        public Builder setOp(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }

        public Builder setSvc(String svc) {
            this.svc = Objects.requireNonNull(svc);
            return this;
        }

        public Builder setSys(String sys) {
            this.sys = Objects.requireNonNull(sys);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ConditionResponse build() {
            return new ConditionResponse(iam, op, svc, sys, values);
        }
    }
}
