// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementAndStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementArgs();

    /**
     * Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementArgs>> statements;

    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
     * 
     */
    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementArgs() {}

    private WebAclRuleStatementNotStatementStatementAndStatementArgs(WebAclRuleStatementNotStatementStatementAndStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementAndStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementAndStatementArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementAndStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementNotStatementStatementAndStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements Statements to combine with `AND` logic. You can use any statements that can be nested. See `statement` above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementNotStatementStatementAndStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementNotStatementStatementAndStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
