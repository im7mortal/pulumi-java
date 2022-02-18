// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataIntegrationScheduleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataIntegrationScheduleConfigArgs Empty = new DataIntegrationScheduleConfigArgs();

    /**
     * The start date for objects to import in the first flow run. Epoch or ISO timestamp format is supported.
     * 
     */
    @InputImport(name="firstExecutionFrom", required=true)
    private final Input<String> firstExecutionFrom;

    public Input<String> getFirstExecutionFrom() {
        return this.firstExecutionFrom;
    }

    /**
     * The name of the object to pull from the data source.
     * 
     */
    @InputImport(name="object", required=true)
    private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    /**
     * How often the data should be pulled from data source.
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
    private final Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public DataIntegrationScheduleConfigArgs(
        Input<String> firstExecutionFrom,
        Input<String> object,
        Input<String> scheduleExpression) {
        this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom, "expected parameter 'firstExecutionFrom' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private DataIntegrationScheduleConfigArgs() {
        this.firstExecutionFrom = Input.empty();
        this.object = Input.empty();
        this.scheduleExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataIntegrationScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> firstExecutionFrom;
        private Input<String> object;
        private Input<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DataIntegrationScheduleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firstExecutionFrom = defaults.firstExecutionFrom;
    	      this.object = defaults.object;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setFirstExecutionFrom(Input<String> firstExecutionFrom) {
            this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom);
            return this;
        }

        public Builder setFirstExecutionFrom(String firstExecutionFrom) {
            this.firstExecutionFrom = Input.of(Objects.requireNonNull(firstExecutionFrom));
            return this;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }

        public Builder setScheduleExpression(Input<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Input.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }

        public DataIntegrationScheduleConfigArgs build() {
            return new DataIntegrationScheduleConfigArgs(firstExecutionFrom, object, scheduleExpression);
        }
    }
}
