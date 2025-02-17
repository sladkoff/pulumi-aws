// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludedRules")]
        private InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>? _excludedRules;

        /// <summary>
        /// The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See `excluded_rule` below for details. Use `rule_action_override` instead. (See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ManagedRuleGroupStatement.html#WAF-Type-ManagedRuleGroupStatement-ExcludedRules))
        /// </summary>
        [Obsolete(@"Use rule_action_override instead")]
        public InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs> ExcludedRules
        {
            get => _excludedRules ?? (_excludedRules = new InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementExcludedRuleGetArgs>());
            set => _excludedRules = value;
        }

        [Input("managedRuleGroupConfigs")]
        private InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigGetArgs>? _managedRuleGroupConfigs;

        /// <summary>
        /// Additional information that's used by a managed rule group. Only one rule attribute is allowed in each config. See Managed Rule Group Configs for more details
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigGetArgs> ManagedRuleGroupConfigs
        {
            get => _managedRuleGroupConfigs ?? (_managedRuleGroupConfigs = new InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigGetArgs>());
            set => _managedRuleGroupConfigs = value;
        }

        /// <summary>
        /// Name of the managed rule group.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("ruleActionOverrides")]
        private InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideGetArgs>? _ruleActionOverrides;

        /// <summary>
        /// Action settings to use in the place of the rule actions that are configured inside the rule group. You specify one override for each rule whose action you want to change. See `rule_action_override` below for details.
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideGetArgs> RuleActionOverrides
        {
            get => _ruleActionOverrides ?? (_ruleActionOverrides = new InputList<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideGetArgs>());
            set => _ruleActionOverrides = value;
        }

        /// <summary>
        /// Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See `statement` above for details.
        /// </summary>
        [Input("scopeDownStatement")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGetArgs>? ScopeDownStatement { get; set; }

        /// <summary>
        /// Name of the managed rule group vendor.
        /// </summary>
        [Input("vendorName", required: true)]
        public Input<string> VendorName { get; set; } = null!;

        /// <summary>
        /// Version of the managed rule group. You can set `Version_1.0` or `Version_1.1` etc. If you want to use the default version, do not set anything.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public WebAclRuleStatementManagedRuleGroupStatementGetArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementGetArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementGetArgs();
    }
}
