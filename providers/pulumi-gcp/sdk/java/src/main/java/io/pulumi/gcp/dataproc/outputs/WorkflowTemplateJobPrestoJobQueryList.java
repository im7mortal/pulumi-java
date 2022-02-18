// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WorkflowTemplateJobPrestoJobQueryList {
    /**
     * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: "hiveJob": { "queryList": { "queries": } }
     * 
     */
    private final List<String> queries;

    @OutputCustomType.Constructor({"queries"})
    private WorkflowTemplateJobPrestoJobQueryList(List<String> queries) {
        this.queries = Objects.requireNonNull(queries);
    }

    /**
     * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: "hiveJob": { "queryList": { "queries": } }
     * 
     */
    public List<String> getQueries() {
        return this.queries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPrestoJobQueryList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> queries;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPrestoJobQueryList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
        }

        public Builder setQueries(List<String> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }

        public WorkflowTemplateJobPrestoJobQueryList build() {
            return new WorkflowTemplateJobPrestoJobQueryList(queries);
        }
    }
}