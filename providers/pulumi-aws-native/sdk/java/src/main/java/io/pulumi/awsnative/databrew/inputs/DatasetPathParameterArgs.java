// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate dataset parameter name with its definition.
 * 
 */
public final class DatasetPathParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetPathParameterArgs Empty = new DatasetPathParameterArgs();

    @InputImport(name="datasetParameter", required=true)
    private final Input<DatasetParameterArgs> datasetParameter;

    public Input<DatasetParameterArgs> getDatasetParameter() {
        return this.datasetParameter;
    }

    @InputImport(name="pathParameterName", required=true)
    private final Input<String> pathParameterName;

    public Input<String> getPathParameterName() {
        return this.pathParameterName;
    }

    public DatasetPathParameterArgs(
        Input<DatasetParameterArgs> datasetParameter,
        Input<String> pathParameterName) {
        this.datasetParameter = Objects.requireNonNull(datasetParameter, "expected parameter 'datasetParameter' to be non-null");
        this.pathParameterName = Objects.requireNonNull(pathParameterName, "expected parameter 'pathParameterName' to be non-null");
    }

    private DatasetPathParameterArgs() {
        this.datasetParameter = Input.empty();
        this.pathParameterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasetParameterArgs> datasetParameter;
        private Input<String> pathParameterName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetParameter = defaults.datasetParameter;
    	      this.pathParameterName = defaults.pathParameterName;
        }

        public Builder setDatasetParameter(Input<DatasetParameterArgs> datasetParameter) {
            this.datasetParameter = Objects.requireNonNull(datasetParameter);
            return this;
        }

        public Builder setDatasetParameter(DatasetParameterArgs datasetParameter) {
            this.datasetParameter = Input.of(Objects.requireNonNull(datasetParameter));
            return this;
        }

        public Builder setPathParameterName(Input<String> pathParameterName) {
            this.pathParameterName = Objects.requireNonNull(pathParameterName);
            return this;
        }

        public Builder setPathParameterName(String pathParameterName) {
            this.pathParameterName = Input.of(Objects.requireNonNull(pathParameterName));
            return this;
        }

        public DatasetPathParameterArgs build() {
            return new DatasetPathParameterArgs(datasetParameter, pathParameterName);
        }
    }
}
