// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DicomStoreStreamConfigBigqueryDestination {
    /**
     * a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * 
     */
    private final String tableUri;

    @OutputCustomType.Constructor({"tableUri"})
    private DicomStoreStreamConfigBigqueryDestination(String tableUri) {
        this.tableUri = Objects.requireNonNull(tableUri);
    }

    /**
     * a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * 
    */
    public String getTableUri() {
        return this.tableUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreStreamConfigBigqueryDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreStreamConfigBigqueryDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableUri = defaults.tableUri;
        }

        public Builder setTableUri(String tableUri) {
            this.tableUri = Objects.requireNonNull(tableUri);
            return this;
        }
        public DicomStoreStreamConfigBigqueryDestination build() {
            return new DicomStoreStreamConfigBigqueryDestination(tableUri);
        }
    }
}
