// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Inputs
{

    public sealed class FileCacheLustreConfigurationMetadataConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
        /// </summary>
        [Input("storageCapacity", required: true)]
        public Input<int> StorageCapacity { get; set; } = null!;

        public FileCacheLustreConfigurationMetadataConfigurationGetArgs()
        {
        }
        public static new FileCacheLustreConfigurationMetadataConfigurationGetArgs Empty => new FileCacheLustreConfigurationMetadataConfigurationGetArgs();
    }
}
