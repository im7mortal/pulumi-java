// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportableExceptionResponse {
    /**
     * Actionable steps for this exception
     * 
     */
    private final @Nullable String actionableMessage;
    /**
     * The path to the file where exception occurred
     * 
     */
    private final String filePath;
    /**
     * Coded numerical value that is assigned to a specific exception
     * 
     */
    private final Integer hResult;
    /**
     * The line number where exception occurred
     * 
     */
    private final String lineNumber;
    /**
     * Error message
     * 
     */
    private final String message;
    /**
     * Stack trace
     * 
     */
    private final String stackTrace;

    @OutputCustomType.Constructor({"actionableMessage","filePath","hResult","lineNumber","message","stackTrace"})
    private ReportableExceptionResponse(
        @Nullable String actionableMessage,
        String filePath,
        Integer hResult,
        String lineNumber,
        String message,
        String stackTrace) {
        this.actionableMessage = actionableMessage;
        this.filePath = Objects.requireNonNull(filePath);
        this.hResult = Objects.requireNonNull(hResult);
        this.lineNumber = Objects.requireNonNull(lineNumber);
        this.message = Objects.requireNonNull(message);
        this.stackTrace = Objects.requireNonNull(stackTrace);
    }

    /**
     * Actionable steps for this exception
     * 
    */
    public Optional<String> getActionableMessage() {
        return Optional.ofNullable(this.actionableMessage);
    }
    /**
     * The path to the file where exception occurred
     * 
    */
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * Coded numerical value that is assigned to a specific exception
     * 
    */
    public Integer getHResult() {
        return this.hResult;
    }
    /**
     * The line number where exception occurred
     * 
    */
    public String getLineNumber() {
        return this.lineNumber;
    }
    /**
     * Error message
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Stack trace
     * 
    */
    public String getStackTrace() {
        return this.stackTrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportableExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionableMessage;
        private String filePath;
        private Integer hResult;
        private String lineNumber;
        private String message;
        private String stackTrace;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportableExceptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionableMessage = defaults.actionableMessage;
    	      this.filePath = defaults.filePath;
    	      this.hResult = defaults.hResult;
    	      this.lineNumber = defaults.lineNumber;
    	      this.message = defaults.message;
    	      this.stackTrace = defaults.stackTrace;
        }

        public Builder setActionableMessage(@Nullable String actionableMessage) {
            this.actionableMessage = actionableMessage;
            return this;
        }

        public Builder setFilePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setHResult(Integer hResult) {
            this.hResult = Objects.requireNonNull(hResult);
            return this;
        }

        public Builder setLineNumber(String lineNumber) {
            this.lineNumber = Objects.requireNonNull(lineNumber);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setStackTrace(String stackTrace) {
            this.stackTrace = Objects.requireNonNull(stackTrace);
            return this;
        }
        public ReportableExceptionResponse build() {
            return new ReportableExceptionResponse(actionableMessage, filePath, hResult, lineNumber, message, stackTrace);
        }
    }
}
