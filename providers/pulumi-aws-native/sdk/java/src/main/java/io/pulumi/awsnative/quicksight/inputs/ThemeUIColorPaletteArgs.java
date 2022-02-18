// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The theme colors that apply to UI and to charts, excluding data colors. The colors
 *             description is a hexadecimal color code that consists of six alphanumerical characters,
 *             prefixed with <code>#</code>, for example #37BFF5. For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes in Amazon QuickSight</a> in the <i>Amazon QuickSight User
 *                 Guide.</i>
 *         </p>
 * 
 */
public final class ThemeUIColorPaletteArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeUIColorPaletteArgs Empty = new ThemeUIColorPaletteArgs();

    /**
     * <p>This color is that applies to selected states and buttons.</p>
     * 
     */
    @InputImport(name="accent")
    private final @Nullable Input<String> accent;

    public Input<String> getAccent() {
        return this.accent == null ? Input.empty() : this.accent;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             accent color.</p>
     * 
     */
    @InputImport(name="accentForeground")
    private final @Nullable Input<String> accentForeground;

    public Input<String> getAccentForeground() {
        return this.accentForeground == null ? Input.empty() : this.accentForeground;
    }

    /**
     * <p>The color that applies to error messages.</p>
     * 
     */
    @InputImport(name="danger")
    private final @Nullable Input<String> danger;

    public Input<String> getDanger() {
        return this.danger == null ? Input.empty() : this.danger;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             error color.</p>
     * 
     */
    @InputImport(name="dangerForeground")
    private final @Nullable Input<String> dangerForeground;

    public Input<String> getDangerForeground() {
        return this.dangerForeground == null ? Input.empty() : this.dangerForeground;
    }

    /**
     * <p>The color that applies to the names of fields that are identified as
     *             dimensions.</p>
     * 
     */
    @InputImport(name="dimension")
    private final @Nullable Input<String> dimension;

    public Input<String> getDimension() {
        return this.dimension == null ? Input.empty() : this.dimension;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             dimension color.</p>
     * 
     */
    @InputImport(name="dimensionForeground")
    private final @Nullable Input<String> dimensionForeground;

    public Input<String> getDimensionForeground() {
        return this.dimensionForeground == null ? Input.empty() : this.dimensionForeground;
    }

    /**
     * <p>The color that applies to the names of fields that are identified as measures.</p>
     * 
     */
    @InputImport(name="measure")
    private final @Nullable Input<String> measure;

    public Input<String> getMeasure() {
        return this.measure == null ? Input.empty() : this.measure;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             measure color.</p>
     * 
     */
    @InputImport(name="measureForeground")
    private final @Nullable Input<String> measureForeground;

    public Input<String> getMeasureForeground() {
        return this.measureForeground == null ? Input.empty() : this.measureForeground;
    }

    /**
     * <p>The background color that applies to visuals and other high emphasis UI.</p>
     * 
     */
    @InputImport(name="primaryBackground")
    private final @Nullable Input<String> primaryBackground;

    public Input<String> getPrimaryBackground() {
        return this.primaryBackground == null ? Input.empty() : this.primaryBackground;
    }

    /**
     * <p>The color of text and other foreground elements that appear over the primary
     *             background regions, such as grid lines, borders, table banding, icons, and so on.</p>
     * 
     */
    @InputImport(name="primaryForeground")
    private final @Nullable Input<String> primaryForeground;

    public Input<String> getPrimaryForeground() {
        return this.primaryForeground == null ? Input.empty() : this.primaryForeground;
    }

    /**
     * <p>The background color that applies to the sheet background and sheet controls.</p>
     * 
     */
    @InputImport(name="secondaryBackground")
    private final @Nullable Input<String> secondaryBackground;

    public Input<String> getSecondaryBackground() {
        return this.secondaryBackground == null ? Input.empty() : this.secondaryBackground;
    }

    /**
     * <p>The foreground color that applies to any sheet title, sheet control text, or UI that
     *             appears over the secondary background.</p>
     * 
     */
    @InputImport(name="secondaryForeground")
    private final @Nullable Input<String> secondaryForeground;

    public Input<String> getSecondaryForeground() {
        return this.secondaryForeground == null ? Input.empty() : this.secondaryForeground;
    }

    /**
     * <p>The color that applies to success messages, for example the check mark for a
     *             successful download.</p>
     * 
     */
    @InputImport(name="success")
    private final @Nullable Input<String> success;

    public Input<String> getSuccess() {
        return this.success == null ? Input.empty() : this.success;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             success color.</p>
     * 
     */
    @InputImport(name="successForeground")
    private final @Nullable Input<String> successForeground;

    public Input<String> getSuccessForeground() {
        return this.successForeground == null ? Input.empty() : this.successForeground;
    }

    /**
     * <p>This color that applies to warning and informational messages.</p>
     * 
     */
    @InputImport(name="warning")
    private final @Nullable Input<String> warning;

    public Input<String> getWarning() {
        return this.warning == null ? Input.empty() : this.warning;
    }

    /**
     * <p>The foreground color that applies to any text or other elements that appear over the
     *             warning color.</p>
     * 
     */
    @InputImport(name="warningForeground")
    private final @Nullable Input<String> warningForeground;

    public Input<String> getWarningForeground() {
        return this.warningForeground == null ? Input.empty() : this.warningForeground;
    }

    public ThemeUIColorPaletteArgs(
        @Nullable Input<String> accent,
        @Nullable Input<String> accentForeground,
        @Nullable Input<String> danger,
        @Nullable Input<String> dangerForeground,
        @Nullable Input<String> dimension,
        @Nullable Input<String> dimensionForeground,
        @Nullable Input<String> measure,
        @Nullable Input<String> measureForeground,
        @Nullable Input<String> primaryBackground,
        @Nullable Input<String> primaryForeground,
        @Nullable Input<String> secondaryBackground,
        @Nullable Input<String> secondaryForeground,
        @Nullable Input<String> success,
        @Nullable Input<String> successForeground,
        @Nullable Input<String> warning,
        @Nullable Input<String> warningForeground) {
        this.accent = accent;
        this.accentForeground = accentForeground;
        this.danger = danger;
        this.dangerForeground = dangerForeground;
        this.dimension = dimension;
        this.dimensionForeground = dimensionForeground;
        this.measure = measure;
        this.measureForeground = measureForeground;
        this.primaryBackground = primaryBackground;
        this.primaryForeground = primaryForeground;
        this.secondaryBackground = secondaryBackground;
        this.secondaryForeground = secondaryForeground;
        this.success = success;
        this.successForeground = successForeground;
        this.warning = warning;
        this.warningForeground = warningForeground;
    }

    private ThemeUIColorPaletteArgs() {
        this.accent = Input.empty();
        this.accentForeground = Input.empty();
        this.danger = Input.empty();
        this.dangerForeground = Input.empty();
        this.dimension = Input.empty();
        this.dimensionForeground = Input.empty();
        this.measure = Input.empty();
        this.measureForeground = Input.empty();
        this.primaryBackground = Input.empty();
        this.primaryForeground = Input.empty();
        this.secondaryBackground = Input.empty();
        this.secondaryForeground = Input.empty();
        this.success = Input.empty();
        this.successForeground = Input.empty();
        this.warning = Input.empty();
        this.warningForeground = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeUIColorPaletteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accent;
        private @Nullable Input<String> accentForeground;
        private @Nullable Input<String> danger;
        private @Nullable Input<String> dangerForeground;
        private @Nullable Input<String> dimension;
        private @Nullable Input<String> dimensionForeground;
        private @Nullable Input<String> measure;
        private @Nullable Input<String> measureForeground;
        private @Nullable Input<String> primaryBackground;
        private @Nullable Input<String> primaryForeground;
        private @Nullable Input<String> secondaryBackground;
        private @Nullable Input<String> secondaryForeground;
        private @Nullable Input<String> success;
        private @Nullable Input<String> successForeground;
        private @Nullable Input<String> warning;
        private @Nullable Input<String> warningForeground;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeUIColorPaletteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accent = defaults.accent;
    	      this.accentForeground = defaults.accentForeground;
    	      this.danger = defaults.danger;
    	      this.dangerForeground = defaults.dangerForeground;
    	      this.dimension = defaults.dimension;
    	      this.dimensionForeground = defaults.dimensionForeground;
    	      this.measure = defaults.measure;
    	      this.measureForeground = defaults.measureForeground;
    	      this.primaryBackground = defaults.primaryBackground;
    	      this.primaryForeground = defaults.primaryForeground;
    	      this.secondaryBackground = defaults.secondaryBackground;
    	      this.secondaryForeground = defaults.secondaryForeground;
    	      this.success = defaults.success;
    	      this.successForeground = defaults.successForeground;
    	      this.warning = defaults.warning;
    	      this.warningForeground = defaults.warningForeground;
        }

        public Builder setAccent(@Nullable Input<String> accent) {
            this.accent = accent;
            return this;
        }

        public Builder setAccent(@Nullable String accent) {
            this.accent = Input.ofNullable(accent);
            return this;
        }

        public Builder setAccentForeground(@Nullable Input<String> accentForeground) {
            this.accentForeground = accentForeground;
            return this;
        }

        public Builder setAccentForeground(@Nullable String accentForeground) {
            this.accentForeground = Input.ofNullable(accentForeground);
            return this;
        }

        public Builder setDanger(@Nullable Input<String> danger) {
            this.danger = danger;
            return this;
        }

        public Builder setDanger(@Nullable String danger) {
            this.danger = Input.ofNullable(danger);
            return this;
        }

        public Builder setDangerForeground(@Nullable Input<String> dangerForeground) {
            this.dangerForeground = dangerForeground;
            return this;
        }

        public Builder setDangerForeground(@Nullable String dangerForeground) {
            this.dangerForeground = Input.ofNullable(dangerForeground);
            return this;
        }

        public Builder setDimension(@Nullable Input<String> dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setDimension(@Nullable String dimension) {
            this.dimension = Input.ofNullable(dimension);
            return this;
        }

        public Builder setDimensionForeground(@Nullable Input<String> dimensionForeground) {
            this.dimensionForeground = dimensionForeground;
            return this;
        }

        public Builder setDimensionForeground(@Nullable String dimensionForeground) {
            this.dimensionForeground = Input.ofNullable(dimensionForeground);
            return this;
        }

        public Builder setMeasure(@Nullable Input<String> measure) {
            this.measure = measure;
            return this;
        }

        public Builder setMeasure(@Nullable String measure) {
            this.measure = Input.ofNullable(measure);
            return this;
        }

        public Builder setMeasureForeground(@Nullable Input<String> measureForeground) {
            this.measureForeground = measureForeground;
            return this;
        }

        public Builder setMeasureForeground(@Nullable String measureForeground) {
            this.measureForeground = Input.ofNullable(measureForeground);
            return this;
        }

        public Builder setPrimaryBackground(@Nullable Input<String> primaryBackground) {
            this.primaryBackground = primaryBackground;
            return this;
        }

        public Builder setPrimaryBackground(@Nullable String primaryBackground) {
            this.primaryBackground = Input.ofNullable(primaryBackground);
            return this;
        }

        public Builder setPrimaryForeground(@Nullable Input<String> primaryForeground) {
            this.primaryForeground = primaryForeground;
            return this;
        }

        public Builder setPrimaryForeground(@Nullable String primaryForeground) {
            this.primaryForeground = Input.ofNullable(primaryForeground);
            return this;
        }

        public Builder setSecondaryBackground(@Nullable Input<String> secondaryBackground) {
            this.secondaryBackground = secondaryBackground;
            return this;
        }

        public Builder setSecondaryBackground(@Nullable String secondaryBackground) {
            this.secondaryBackground = Input.ofNullable(secondaryBackground);
            return this;
        }

        public Builder setSecondaryForeground(@Nullable Input<String> secondaryForeground) {
            this.secondaryForeground = secondaryForeground;
            return this;
        }

        public Builder setSecondaryForeground(@Nullable String secondaryForeground) {
            this.secondaryForeground = Input.ofNullable(secondaryForeground);
            return this;
        }

        public Builder setSuccess(@Nullable Input<String> success) {
            this.success = success;
            return this;
        }

        public Builder setSuccess(@Nullable String success) {
            this.success = Input.ofNullable(success);
            return this;
        }

        public Builder setSuccessForeground(@Nullable Input<String> successForeground) {
            this.successForeground = successForeground;
            return this;
        }

        public Builder setSuccessForeground(@Nullable String successForeground) {
            this.successForeground = Input.ofNullable(successForeground);
            return this;
        }

        public Builder setWarning(@Nullable Input<String> warning) {
            this.warning = warning;
            return this;
        }

        public Builder setWarning(@Nullable String warning) {
            this.warning = Input.ofNullable(warning);
            return this;
        }

        public Builder setWarningForeground(@Nullable Input<String> warningForeground) {
            this.warningForeground = warningForeground;
            return this;
        }

        public Builder setWarningForeground(@Nullable String warningForeground) {
            this.warningForeground = Input.ofNullable(warningForeground);
            return this;
        }

        public ThemeUIColorPaletteArgs build() {
            return new ThemeUIColorPaletteArgs(accent, accentForeground, danger, dangerForeground, dimension, dimensionForeground, measure, measureForeground, primaryBackground, primaryForeground, secondaryBackground, secondaryForeground, success, successForeground, warning, warningForeground);
        }
    }
}
