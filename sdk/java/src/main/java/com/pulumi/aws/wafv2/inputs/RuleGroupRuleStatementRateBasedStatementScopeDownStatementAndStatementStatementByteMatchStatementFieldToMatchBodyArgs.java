// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs();

    /**
     * Oversize handling tells AWS WAF what to do with a web request when the request component that the rule inspects is over the limits. Valid values include the following: `CONTINUE`, `MATCH`, `NO_MATCH`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-oversize-handling.html) for more information.
     * 
     */
    @Import(name="oversizeHandling")
    private @Nullable Output<String> oversizeHandling;

    /**
     * @return Oversize handling tells AWS WAF what to do with a web request when the request component that the rule inspects is over the limits. Valid values include the following: `CONTINUE`, `MATCH`, `NO_MATCH`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-oversize-handling.html) for more information.
     * 
     */
    public Optional<Output<String>> oversizeHandling() {
        return Optional.ofNullable(this.oversizeHandling);
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs $) {
        this.oversizeHandling = $.oversizeHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oversizeHandling Oversize handling tells AWS WAF what to do with a web request when the request component that the rule inspects is over the limits. Valid values include the following: `CONTINUE`, `MATCH`, `NO_MATCH`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-oversize-handling.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder oversizeHandling(@Nullable Output<String> oversizeHandling) {
            $.oversizeHandling = oversizeHandling;
            return this;
        }

        /**
         * @param oversizeHandling Oversize handling tells AWS WAF what to do with a web request when the request component that the rule inspects is over the limits. Valid values include the following: `CONTINUE`, `MATCH`, `NO_MATCH`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-oversize-handling.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder oversizeHandling(String oversizeHandling) {
            return oversizeHandling(Output.of(oversizeHandling));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchBodyArgs build() {
            return $;
        }
    }

}
