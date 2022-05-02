// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The script interpreter to use.
     * 
     */
    @EnumType
    public enum OSPolicyResourceExecResourceExecInterpreter {
        /**
         * Invalid value, the request will return validation error.
         * 
         */
        InterpreterUnspecified("INTERPRETER_UNSPECIFIED"),
        /**
         * If an interpreter is not specified, the source is executed directly. This execution, without an interpreter, only succeeds for executables and scripts that have shebang lines.
         * 
         */
        None("NONE"),
        /**
         * Indicates that the script runs with `/bin/sh` on Linux and `cmd.exe` on Windows.
         * 
         */
        Shell("SHELL"),
        /**
         * Indicates that the script runs with PowerShell.
         * 
         */
        Powershell("POWERSHELL");

        private final String value;

        OSPolicyResourceExecResourceExecInterpreter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OSPolicyResourceExecResourceExecInterpreter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
