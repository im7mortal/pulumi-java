// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.FrameworkControlControlScopeProperties;
import io.pulumi.awsnative.backup.outputs.FrameworkControlInputParameter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrameworkControl {
    /**
     * A list of ParameterName and ParameterValue pairs.
     * 
     */
    private final @Nullable List<FrameworkControlInputParameter> controlInputParameters;
    /**
     * The name of a control. This name is between 1 and 256 characters.
     * 
     */
    private final String controlName;
    /**
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    private final @Nullable FrameworkControlControlScopeProperties controlScope;

    @OutputCustomType.Constructor({"controlInputParameters","controlName","controlScope"})
    private FrameworkControl(
        @Nullable List<FrameworkControlInputParameter> controlInputParameters,
        String controlName,
        @Nullable FrameworkControlControlScopeProperties controlScope) {
        this.controlInputParameters = controlInputParameters;
        this.controlName = Objects.requireNonNull(controlName);
        this.controlScope = controlScope;
    }

    /**
     * A list of ParameterName and ParameterValue pairs.
     * 
     */
    public List<FrameworkControlInputParameter> getControlInputParameters() {
        return this.controlInputParameters == null ? List.of() : this.controlInputParameters;
    }
    /**
     * The name of a control. This name is between 1 and 256 characters.
     * 
     */
    public String getControlName() {
        return this.controlName;
    }
    /**
     * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    public Optional<FrameworkControlControlScopeProperties> getControlScope() {
        return Optional.ofNullable(this.controlScope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FrameworkControlInputParameter> controlInputParameters;
        private String controlName;
        private @Nullable FrameworkControlControlScopeProperties controlScope;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlInputParameters = defaults.controlInputParameters;
    	      this.controlName = defaults.controlName;
    	      this.controlScope = defaults.controlScope;
        }

        public Builder setControlInputParameters(@Nullable List<FrameworkControlInputParameter> controlInputParameters) {
            this.controlInputParameters = controlInputParameters;
            return this;
        }

        public Builder setControlName(String controlName) {
            this.controlName = Objects.requireNonNull(controlName);
            return this;
        }

        public Builder setControlScope(@Nullable FrameworkControlControlScopeProperties controlScope) {
            this.controlScope = controlScope;
            return this;
        }

        public FrameworkControl build() {
            return new FrameworkControl(controlInputParameters, controlName, controlScope);
        }
    }
}
