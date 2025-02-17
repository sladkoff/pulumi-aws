// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class BudgetActionActionThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetActionActionThresholdArgs Empty = new BudgetActionActionThresholdArgs();

    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    @Import(name="actionThresholdType", required=true)
    private Output<String> actionThresholdType;

    /**
     * @return The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    public Output<String> actionThresholdType() {
        return this.actionThresholdType;
    }

    /**
     * The threshold of a notification.
     * 
     */
    @Import(name="actionThresholdValue", required=true)
    private Output<Double> actionThresholdValue;

    /**
     * @return The threshold of a notification.
     * 
     */
    public Output<Double> actionThresholdValue() {
        return this.actionThresholdValue;
    }

    private BudgetActionActionThresholdArgs() {}

    private BudgetActionActionThresholdArgs(BudgetActionActionThresholdArgs $) {
        this.actionThresholdType = $.actionThresholdType;
        this.actionThresholdValue = $.actionThresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetActionActionThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetActionActionThresholdArgs $;

        public Builder() {
            $ = new BudgetActionActionThresholdArgs();
        }

        public Builder(BudgetActionActionThresholdArgs defaults) {
            $ = new BudgetActionActionThresholdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionThresholdType The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder actionThresholdType(Output<String> actionThresholdType) {
            $.actionThresholdType = actionThresholdType;
            return this;
        }

        /**
         * @param actionThresholdType The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder actionThresholdType(String actionThresholdType) {
            return actionThresholdType(Output.of(actionThresholdType));
        }

        /**
         * @param actionThresholdValue The threshold of a notification.
         * 
         * @return builder
         * 
         */
        public Builder actionThresholdValue(Output<Double> actionThresholdValue) {
            $.actionThresholdValue = actionThresholdValue;
            return this;
        }

        /**
         * @param actionThresholdValue The threshold of a notification.
         * 
         * @return builder
         * 
         */
        public Builder actionThresholdValue(Double actionThresholdValue) {
            return actionThresholdValue(Output.of(actionThresholdValue));
        }

        public BudgetActionActionThresholdArgs build() {
            $.actionThresholdType = Objects.requireNonNull($.actionThresholdType, "expected parameter 'actionThresholdType' to be non-null");
            $.actionThresholdValue = Objects.requireNonNull($.actionThresholdValue, "expected parameter 'actionThresholdValue' to be non-null");
            return $;
        }
    }

}
