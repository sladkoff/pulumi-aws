// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsCaptionSelectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When specified this field indicates the three letter language code of the caption track to extract from the source.
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// Name of the Channel.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("selectorSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsArgs>? SelectorSettings { get; set; }

        public ChannelInputAttachmentInputSettingsCaptionSelectorArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsCaptionSelectorArgs Empty => new ChannelInputAttachmentInputSettingsCaptionSelectorArgs();
    }
}
