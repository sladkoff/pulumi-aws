// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Inputs
{

    public sealed class LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones", required: true)]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// The Availability Zones in which to enable fast snapshot restore.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// Specifies the number of oldest AMIs to deprecate. Must be an integer between `1` and `1000`.
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
        /// </summary>
        [Input("intervalUnit")]
        public Input<string>? IntervalUnit { get; set; }

        public LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs()
        {
        }
        public static new LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs Empty => new LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs();
    }
}
