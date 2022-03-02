// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.ParameterValidationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TemplateParameterResponse {
    /**
     * Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    private final String description;
    /**
     * Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter's list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels'key' placement.clusterSelector.clusterLabels'key' placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobs'step-id'.labels'key' Jobs in the jobs list can be referenced by step-id: jobs'step-id'.hadoopJob.mainJarFileUri jobs'step-id'.hiveJob.queryFileUri jobs'step-id'.pySparkJob.mainPythonFileUri jobs'step-id'.hadoopJob.jarFileUris0 jobs'step-id'.hadoopJob.archiveUris0 jobs'step-id'.hadoopJob.fileUris0 jobs'step-id'.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs'step-id'.sparkJob.args0 Other examples: jobs'step-id'.hadoopJob.properties'key' jobs'step-id'.hadoopJob.args0 jobs'step-id'.hiveJob.scriptVariables'key' jobs'step-id'.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs'step-id'.sparkJob.args
     * 
     */
    private final List<String> fields;
    /**
     * Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    private final String name;
    /**
     * Optional. Validation rules to be applied to this parameter's value.
     * 
     */
    private final ParameterValidationResponse validation;

    @OutputCustomType.Constructor({"description","fields","name","validation"})
    private TemplateParameterResponse(
        String description,
        List<String> fields,
        String name,
        ParameterValidationResponse validation) {
        this.description = Objects.requireNonNull(description);
        this.fields = Objects.requireNonNull(fields);
        this.name = Objects.requireNonNull(name);
        this.validation = Objects.requireNonNull(validation);
    }

    /**
     * Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter's list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels'key' placement.clusterSelector.clusterLabels'key' placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobs'step-id'.labels'key' Jobs in the jobs list can be referenced by step-id: jobs'step-id'.hadoopJob.mainJarFileUri jobs'step-id'.hiveJob.queryFileUri jobs'step-id'.pySparkJob.mainPythonFileUri jobs'step-id'.hadoopJob.jarFileUris0 jobs'step-id'.hadoopJob.archiveUris0 jobs'step-id'.hadoopJob.fileUris0 jobs'step-id'.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs'step-id'.sparkJob.args0 Other examples: jobs'step-id'.hadoopJob.properties'key' jobs'step-id'.hadoopJob.args0 jobs'step-id'.hiveJob.scriptVariables'key' jobs'step-id'.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs'step-id'.sparkJob.args
     * 
    */
    public List<String> getFields() {
        return this.fields;
    }
    /**
     * Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Validation rules to be applied to this parameter's value.
     * 
    */
    public ParameterValidationResponse getValidation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<String> fields;
        private String name;
        private ParameterValidationResponse validation;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.validation = defaults.validation;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFields(List<String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValidation(ParameterValidationResponse validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }
        public TemplateParameterResponse build() {
            return new TemplateParameterResponse(description, fields, name, validation);
        }
    }
}
