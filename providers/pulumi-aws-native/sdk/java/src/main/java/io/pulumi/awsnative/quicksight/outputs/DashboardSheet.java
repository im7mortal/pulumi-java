// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardSheet {
    /**
     * <p>The name of a sheet. This name is displayed on the sheet's tab in the QuickSight
     *             console.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>The unique identifier associated with a sheet.</p>
     * 
     */
    private final @Nullable String sheetId;

    @OutputCustomType.Constructor({"name","sheetId"})
    private DashboardSheet(
        @Nullable String name,
        @Nullable String sheetId) {
        this.name = name;
        this.sheetId = sheetId;
    }

    /**
     * <p>The name of a sheet. This name is displayed on the sheet's tab in the QuickSight
     *             console.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>The unique identifier associated with a sheet.</p>
     * 
     */
    public Optional<String> getSheetId() {
        return Optional.ofNullable(this.sheetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSheet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String sheetId;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSheet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sheetId = defaults.sheetId;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSheetId(@Nullable String sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        public DashboardSheet build() {
            return new DashboardSheet(name, sheetId);
        }
    }
}
