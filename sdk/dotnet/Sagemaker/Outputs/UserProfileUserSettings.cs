// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class UserProfileUserSettings
    {
        /// <summary>
        /// The Canvas app settings. See Canvas App Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsCanvasAppSettings? CanvasAppSettings;
        /// <summary>
        /// The execution role ARN for the user.
        /// </summary>
        public readonly string ExecutionRole;
        /// <summary>
        /// The Jupyter server's app settings. See Jupyter Server App Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsJupyterServerAppSettings? JupyterServerAppSettings;
        /// <summary>
        /// The kernel gateway app settings. See Kernel Gateway App Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsKernelGatewayAppSettings? KernelGatewayAppSettings;
        /// <summary>
        /// The RSession app settings. See RSession App Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsRSessionAppSettings? RSessionAppSettings;
        /// <summary>
        /// The security groups.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// The sharing settings. See Sharing Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsSharingSettings? SharingSettings;
        /// <summary>
        /// The TensorBoard app settings. See TensorBoard App Settings below.
        /// </summary>
        public readonly Outputs.UserProfileUserSettingsTensorBoardAppSettings? TensorBoardAppSettings;

        [OutputConstructor]
        private UserProfileUserSettings(
            Outputs.UserProfileUserSettingsCanvasAppSettings? canvasAppSettings,

            string executionRole,

            Outputs.UserProfileUserSettingsJupyterServerAppSettings? jupyterServerAppSettings,

            Outputs.UserProfileUserSettingsKernelGatewayAppSettings? kernelGatewayAppSettings,

            Outputs.UserProfileUserSettingsRSessionAppSettings? rSessionAppSettings,

            ImmutableArray<string> securityGroups,

            Outputs.UserProfileUserSettingsSharingSettings? sharingSettings,

            Outputs.UserProfileUserSettingsTensorBoardAppSettings? tensorBoardAppSettings)
        {
            CanvasAppSettings = canvasAppSettings;
            ExecutionRole = executionRole;
            JupyterServerAppSettings = jupyterServerAppSettings;
            KernelGatewayAppSettings = kernelGatewayAppSettings;
            RSessionAppSettings = rSessionAppSettings;
            SecurityGroups = securityGroups;
            SharingSettings = sharingSettings;
            TensorBoardAppSettings = tensorBoardAppSettings;
        }
    }
}
