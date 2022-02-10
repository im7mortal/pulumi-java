// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingAvailabilityResponse;
import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingCompleteOperationResponse;
import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingErrorManagementResponse;
import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingFormatResponse;
import io.pulumi.azurenative.customerinsights.outputs.ConnectorMappingStructureResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorMappingPropertiesResponse {
    private final ConnectorMappingAvailabilityResponse availability;
    private final ConnectorMappingCompleteOperationResponse completeOperation;
    private final ConnectorMappingErrorManagementResponse errorManagement;
    private final @Nullable String fileFilter;
    private final @Nullable String folderPath;
    private final ConnectorMappingFormatResponse format;
    private final @Nullable Boolean hasHeader;
    private final List<ConnectorMappingStructureResponse> structure;

    @OutputCustomType.Constructor({"availability","completeOperation","errorManagement","fileFilter","folderPath","format","hasHeader","structure"})
    private ConnectorMappingPropertiesResponse(
        ConnectorMappingAvailabilityResponse availability,
        ConnectorMappingCompleteOperationResponse completeOperation,
        ConnectorMappingErrorManagementResponse errorManagement,
        @Nullable String fileFilter,
        @Nullable String folderPath,
        ConnectorMappingFormatResponse format,
        @Nullable Boolean hasHeader,
        List<ConnectorMappingStructureResponse> structure) {
        this.availability = Objects.requireNonNull(availability);
        this.completeOperation = Objects.requireNonNull(completeOperation);
        this.errorManagement = Objects.requireNonNull(errorManagement);
        this.fileFilter = fileFilter;
        this.folderPath = folderPath;
        this.format = Objects.requireNonNull(format);
        this.hasHeader = hasHeader;
        this.structure = Objects.requireNonNull(structure);
    }

    public ConnectorMappingAvailabilityResponse getAvailability() {
        return this.availability;
    }
    public ConnectorMappingCompleteOperationResponse getCompleteOperation() {
        return this.completeOperation;
    }
    public ConnectorMappingErrorManagementResponse getErrorManagement() {
        return this.errorManagement;
    }
    public Optional<String> getFileFilter() {
        return Optional.ofNullable(this.fileFilter);
    }
    public Optional<String> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    public ConnectorMappingFormatResponse getFormat() {
        return this.format;
    }
    public Optional<Boolean> getHasHeader() {
        return Optional.ofNullable(this.hasHeader);
    }
    public List<ConnectorMappingStructureResponse> getStructure() {
        return this.structure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorMappingAvailabilityResponse availability;
        private ConnectorMappingCompleteOperationResponse completeOperation;
        private ConnectorMappingErrorManagementResponse errorManagement;
        private @Nullable String fileFilter;
        private @Nullable String folderPath;
        private ConnectorMappingFormatResponse format;
        private @Nullable Boolean hasHeader;
        private List<ConnectorMappingStructureResponse> structure;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.completeOperation = defaults.completeOperation;
    	      this.errorManagement = defaults.errorManagement;
    	      this.fileFilter = defaults.fileFilter;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.hasHeader = defaults.hasHeader;
    	      this.structure = defaults.structure;
        }

        public Builder setAvailability(ConnectorMappingAvailabilityResponse availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }

        public Builder setCompleteOperation(ConnectorMappingCompleteOperationResponse completeOperation) {
            this.completeOperation = Objects.requireNonNull(completeOperation);
            return this;
        }

        public Builder setErrorManagement(ConnectorMappingErrorManagementResponse errorManagement) {
            this.errorManagement = Objects.requireNonNull(errorManagement);
            return this;
        }

        public Builder setFileFilter(@Nullable String fileFilter) {
            this.fileFilter = fileFilter;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFormat(ConnectorMappingFormatResponse format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setHasHeader(@Nullable Boolean hasHeader) {
            this.hasHeader = hasHeader;
            return this;
        }

        public Builder setStructure(List<ConnectorMappingStructureResponse> structure) {
            this.structure = Objects.requireNonNull(structure);
            return this;
        }

        public ConnectorMappingPropertiesResponse build() {
            return new ConnectorMappingPropertiesResponse(availability, completeOperation, errorManagement, fileFilter, folderPath, format, hasHeader, structure);
        }
    }
}