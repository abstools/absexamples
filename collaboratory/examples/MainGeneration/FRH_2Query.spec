CLASS[FredhopperCloudServices.QueryServiceImpl] = 2 and
CLASS[FredhopperCloudServices.LoadBalancerServiceImpl] > 0 and
CLASS[FredhopperCloudServices.PlatformServiceImpl] > 0 and
CLASS[FredhopperCloudServices.ServiceProviderImpl] > 0 and
DC[ CLASS[FredhopperCloudServices.QueryServiceImpl] > 1] = 0 and
DC[ CLASS[FredhopperCloudServices.QueryServiceImpl] > 0 and CLASS[FredhopperCloudServices.DeploymentServiceImpl] = 0 ] = 0 and
DC[ CLASS[FredhopperCloudServices.ServiceProviderImpl] > 0 and CLASS[FredhopperCloudServices.PlatformServiceImpl] = 0 ] = 0 and
DC[ CLASS[FredhopperCloudServices.QueryServiceImpl] > 0 and 
  CLASS[FredhopperCloudServices.PlatformServiceImpl] +
  CLASS[FredhopperCloudServices.LoadBalancerServiceImpl] +
  CLASS[FredhopperCloudServices.ServiceProviderImpl] +
  CLASS[FredhopperCloudServices.InfrastructureServiceImpl] > 0 ] = 0 and
DC[ CLASS[FredhopperCloudServices.LoadBalancerServiceImpl] > 0 and 
  CLASS[FredhopperCloudServices.PlatformServiceImpl] +
  CLASS[FredhopperCloudServices.DeploymentServiceImpl] +
  CLASS[FredhopperCloudServices.ServiceProviderImpl] +
  CLASS[FredhopperCloudServices.InfrastructureServiceImpl] +
  CLASS[FredhopperCloudServices.QueryServiceImpl] > 0 ] = 0 and
DC[ CLASS[FredhopperCloudServices.InfrastructureServiceImpl] > 0 and 
  CLASS[FredhopperCloudServices.PlatformServiceImpl] +
  CLASS[FredhopperCloudServices.DeploymentServiceImpl] +
  CLASS[FredhopperCloudServices.ServiceProviderImpl] +
  CLASS[FredhopperCloudServices.LoadBalancerServiceImpl] +
  CLASS[FredhopperCloudServices.QueryServiceImpl] > 0 ] = 0 and
DC[ CLASS[FredhopperCloudServices.PlatformServiceImpl] > 0 and 
  CLASS[FredhopperCloudServices.LoadBalancerServiceImpl] +
  CLASS[FredhopperCloudServices.DeploymentServiceImpl] +
  CLASS[FredhopperCloudServices.InfrastructureServiceImpl] +
  CLASS[FredhopperCloudServices.QueryServiceImpl] > 0 ] = 0
