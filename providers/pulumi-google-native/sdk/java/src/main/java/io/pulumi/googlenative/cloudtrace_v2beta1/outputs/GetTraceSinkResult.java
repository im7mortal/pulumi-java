// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtrace_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudtrace_v2beta1.outputs.OutputConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTraceSinkResult {
    /**
     * The canonical sink resource name, unique within the project. Must be of the form: project/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
     */
    private final String name;
    /**
     * The export destination.
     * 
     */
    private final OutputConfigResponse outputConfig;
    /**
     * A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and write data this account will need the dataEditor role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
     * 
     */
    private final String writerIdentity;

    @OutputCustomType.Constructor({"name","outputConfig","writerIdentity"})
    private GetTraceSinkResult(
        String name,
        OutputConfigResponse outputConfig,
        String writerIdentity) {
        this.name = Objects.requireNonNull(name);
        this.outputConfig = Objects.requireNonNull(outputConfig);
        this.writerIdentity = Objects.requireNonNull(writerIdentity);
    }

    /**
     * The canonical sink resource name, unique within the project. Must be of the form: project/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The export destination.
     * 
    */
    public OutputConfigResponse getOutputConfig() {
        return this.outputConfig;
    }
    /**
     * A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and write data this account will need the dataEditor role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
     * 
    */
    public String getWriterIdentity() {
        return this.writerIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTraceSinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private OutputConfigResponse outputConfig;
        private String writerIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTraceSinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.outputConfig = defaults.outputConfig;
    	      this.writerIdentity = defaults.writerIdentity;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputConfig(OutputConfigResponse outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }

        public Builder setWriterIdentity(String writerIdentity) {
            this.writerIdentity = Objects.requireNonNull(writerIdentity);
            return this;
        }
        public GetTraceSinkResult build() {
            return new GetTraceSinkResult(name, outputConfig, writerIdentity);
        }
    }
}
