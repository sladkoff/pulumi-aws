// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs Empty = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs();

    /**
     * Maximum. Set to `0` to exclude instance types with accelerators.
     * 
     */
    @Import(name="max")
    private @Nullable Output<Integer> max;

    /**
     * @return Maximum. Set to `0` to exclude instance types with accelerators.
     * 
     */
    public Optional<Output<Integer>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Minimum.
     * 
     */
    @Import(name="min")
    private @Nullable Output<Integer> min;

    /**
     * @return Minimum.
     * 
     */
    public Optional<Output<Integer>> min() {
        return Optional.ofNullable(this.min);
    }

    private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs() {}

    private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs $;

        public Builder() {
            $ = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs();
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs defaults) {
            $ = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max Maximum. Set to `0` to exclude instance types with accelerators.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Integer> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max Maximum. Set to `0` to exclude instance types with accelerators.
         * 
         * @return builder
         * 
         */
        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<Integer> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsBaselineEbsBandwidthMbpsArgs build() {
            return $;
        }
    }

}
