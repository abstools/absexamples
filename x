





^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:192:27:Class MainSmartDeployer could not be found.
    SmartDeployInterface c1 = new MainSmartDeployer(cloudProvider);
-----------------------------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:193:1:Method deploy could not be found.
    c1.deploy();
---^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:195:42:Method getPlatformService could not be found.
    List<PlatformService> platformServices = c1.getPlatformService();
--------------------------------------------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:196:50:Method getLoadBalancerService could not be found.
    List<LoadBalancerService> loadBalancerServices = c1.getLoadBalancerService();
----------------------------------------------------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:197:43:Method getServiceProvider could not be found.
    List<ServiceProvider> serviceProviders  = c1.getServiceProvider();
---------------------------------------------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:254:29:Class AddQueryDeployer could not be found.
            SmartDeployInterface c2 = new AddQueryDeployer(cloudProvider,head(platformServices),head(loadBalancerServices),head(serviceProviders));
-------------------------------------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:255:3:Method deploy could not be found.
            c2.deploy();
-----------^
./collaboratory/examples/SmartDeploy/FRH_staging_re.abs:260:3:Method undeploy could not be found.
            c2.undeploy();
-----------^

--------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:118:39:Data constructor CPU cannot be resolved.
        T2_MICRO => map[Pair(Memory,1), Pair(CPU,1)];
--------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:118:34:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        T2_MICRO => map[Pair(Memory,1), Pair(CPU,1)];
---------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:118:18:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        T2_MICRO => map[Pair(Memory,1), Pair(CPU,1)];
-----------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:119:39:Data constructor CPU cannot be resolved.
        T2_SMALL => map[Pair(Memory,2), Pair(CPU,1)];
--------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:119:34:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        T2_SMALL => map[Pair(Memory,2), Pair(CPU,1)];
---------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:119:18:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        T2_SMALL => map[Pair(Memory,2), Pair(CPU,1)];
-----------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:120:40:Data constructor CPU cannot be resolved.
        T2_MEDIUM => map[Pair(Memory,4), Pair(CPU,2)];
---------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:120:35:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        T2_MEDIUM => map[Pair(Memory,4), Pair(CPU,2)];
----------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:120:19:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        T2_MEDIUM => map[Pair(Memory,4), Pair(CPU,2)];
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:121:39:Data constructor CPU cannot be resolved.
        M4_LARGE => map[Pair(Memory,8), Pair(CPU,2)];
--------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:121:34:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M4_LARGE => map[Pair(Memory,8), Pair(CPU,2)];
---------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:121:18:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M4_LARGE => map[Pair(Memory,8), Pair(CPU,2)];
-----------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:122:41:Data constructor CPU cannot be resolved.
        M4_XLARGE => map[Pair(Memory,16), Pair(CPU,4)];
----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:122:36:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M4_XLARGE => map[Pair(Memory,16), Pair(CPU,4)];
-----------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:122:19:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M4_XLARGE => map[Pair(Memory,16), Pair(CPU,4)];
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:123:42:Data constructor CPU cannot be resolved.
        M4_2XLARGE => map[Pair(Memory,32), Pair(CPU,8)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:123:37:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M4_2XLARGE => map[Pair(Memory,32), Pair(CPU,8)];
------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:123:20:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M4_2XLARGE => map[Pair(Memory,32), Pair(CPU,8)];
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:124:44:Data constructor CPU cannot be resolved.
        M4_10XLARGE => map[Pair(Memory,160), Pair(CPU,40)];
-------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:124:39:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M4_10XLARGE => map[Pair(Memory,160), Pair(CPU,40)];
--------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:124:21:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M4_10XLARGE => map[Pair(Memory,160), Pair(CPU,40)];
--------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:125:48:Data constructor CPU cannot be resolved.
        M3_MEDIUM => map[Pair(Memory,3750/1000), Pair(CPU,1)];
-----------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:125:43:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M3_MEDIUM => map[Pair(Memory,3750/1000), Pair(CPU,1)];
------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:125:19:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Rat>.
        M3_MEDIUM => map[Pair(Memory,3750/1000), Pair(CPU,1)];
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:126:47:Data constructor CPU cannot be resolved.
        M3_LARGE => map[Pair(Memory,7500/1000), Pair(CPU,2)];
----------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:126:42:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M3_LARGE => map[Pair(Memory,7500/1000), Pair(CPU,2)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:126:18:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Rat>.
        M3_LARGE => map[Pair(Memory,7500/1000), Pair(CPU,2)];
-----------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:127:41:Data constructor CPU cannot be resolved.
        M3_XLARGE => map[Pair(Memory,15), Pair(CPU,4)];
----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:127:36:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M3_XLARGE => map[Pair(Memory,15), Pair(CPU,4)];
-----------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:127:19:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M3_XLARGE => map[Pair(Memory,15), Pair(CPU,4)];
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:128:42:Data constructor CPU cannot be resolved.
        M3_2XLARGE => map[Pair(Memory,30), Pair(CPU,8)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:128:37:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        M3_2XLARGE => map[Pair(Memory,30), Pair(CPU,8)];
------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:128:20:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        M3_2XLARGE => map[Pair(Memory,30), Pair(CPU,8)];
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:129:47:Data constructor CPU cannot be resolved.
        C4_LARGE => map[Pair(Memory,3750/1000), Pair(CPU,2)];
----------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:129:42:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        C4_LARGE => map[Pair(Memory,3750/1000), Pair(CPU,2)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:129:18:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Rat>.
        C4_LARGE => map[Pair(Memory,3750/1000), Pair(CPU,2)];
-----------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:130:48:Data constructor CPU cannot be resolved.
        C4_XLARGE => map[Pair(Memory,7500/1000), Pair(CPU,4)];
-----------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:130:43:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        C4_XLARGE => map[Pair(Memory,7500/1000), Pair(CPU,4)];
------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:130:19:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Rat>.
        C4_XLARGE => map[Pair(Memory,7500/1000), Pair(CPU,4)];
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:131:42:Data constructor CPU cannot be resolved.
        C4_2XLARGE => map[Pair(Memory,15), Pair(CPU,8)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:131:37:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        C4_2XLARGE => map[Pair(Memory,15), Pair(CPU,8)];
------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:131:20:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        C4_2XLARGE => map[Pair(Memory,15), Pair(CPU,8)];
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:132:42:Data constructor CPU cannot be resolved.
        C4_4XLARGE => map[Pair(Memory,30), Pair(CPU,16)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:132:37:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        C4_4XLARGE => map[Pair(Memory,30), Pair(CPU,16)];
------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:132:20:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        C4_4XLARGE => map[Pair(Memory,30), Pair(CPU,16)];
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:133:42:Data constructor CPU cannot be resolved.
        C4_8XLARGE => map[Pair(Memory,60), Pair(CPU,36)];
-----------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:133:37:Type <UNKNOWN> does not match declared type <UNKNOWN>.
        C4_8XLARGE => map[Pair(Memory,60), Pair(CPU,36)];
------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:133:20:Type ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Pair<ABS.DC.Resourcetype,ABS.StdLib.Int>.
        C4_8XLARGE => map[Pair(Memory,60), Pair(CPU,36)];
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:151:28:Data constructor CPU cannot be resolved.
        Fut<InfRat> cf = dc!total(CPU);
---------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:151:19:Type <UNKNOWN> does not match declared type ABS.DC.Resourcetype.
        Fut<InfRat> cf = dc!total(CPU);
------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:180:59:Data constructor CPU cannot be resolved.
                dc = new DeploymentComponent(intToString(id), map[Pair(CPU, cpuamount)]);
----------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:180:54:Type <UNKNOWN> does not match declared type <UNKNOWN>.
                dc = new DeploymentComponent(intToString(id), map[Pair(CPU, cpuamount)]);
-----------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:180:50:Type ABS.StdLib.List<ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int>> does not match declared type ABS.StdLib.List<ABS.StdLib.Pair<Unbound Type,Unbound Type>>.
                dc = new DeploymentComponent(intToString(id), map[Pair(CPU, cpuamount)]);
-------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:180:9:Type ABS.StdLib.Map<<UNKNOWN>,ABS.StdLib.Int> does not match declared type ABS.StdLib.Map<ABS.DC.Resourcetype,ABS.StdLib.Rat>.
                dc = new DeploymentComponent(intToString(id), map[Pair(CPU, cpuamount)]);
--------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:188:60:Data constructor CPU cannot be resolved.
                    Fut<Unit> inf = dc!incrementResources(cpuamount - cpu, CPU); inf.get;
--------------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:188:21:Type <UNKNOWN> does not match declared type ABS.DC.Resourcetype.
                    Fut<Unit> inf = dc!incrementResources(cpuamount - cpu, CPU); inf.get;
-----------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:295:29:Data constructor CPU cannot be resolved.
        Fut<InfRat> fdt = dc!total(CPU);
----------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:295:20:Type <UNKNOWN> does not match declared type ABS.DC.Resourcetype.
        Fut<InfRat> fdt = dc!total(CPU);
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1250:55:Data constructor CPU cannot be resolved.
                Triple<Id, Resourcetype, Rat> h = Triple(fst(lat), CPU, snd(lat));
------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1250:38:Type <UNKNOWN> does not match declared type <UNKNOWN>.
                Triple<Id, Resourcetype, Rat> h = Triple(fst(lat), CPU, snd(lat));
-------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1389:29:Data constructor CPU cannot be resolved.
        Fut<InfRat> fdt = dc!total(CPU);
----------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1389:20:Type <UNKNOWN> does not match declared type ABS.DC.Resourcetype.
        Fut<InfRat> fdt = dc!total(CPU);
-------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1430:68:Data constructor CPU cannot be resolved.
    CustomerConfig c1 = Pair("c1", list[Pair(Config(FAS, list[map[Pair(CPU,5)]]), 1)]);
----------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1430:63:Type <UNKNOWN> does not match declared type <UNKNOWN>.
    CustomerConfig c1 = Pair("c1", list[Pair(Config(FAS, list[map[Pair(CPU,5)]]), 1)]);
-----------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1430:59:Type ABS.StdLib.List<ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int>> does not match declared type ABS.StdLib.List<ABS.StdLib.Pair<Unbound Type,Unbound Type>>.
    CustomerConfig c1 = Pair("c1", list[Pair(Config(FAS, list[map[Pair(CPU,5)]]), 1)]);
-------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1433:72:Data constructor CPU cannot be resolved.
    CustomerConfig c2 = Pair("c2", list[Pair(Config(SUGGEST, list[map[Pair(CPU,1)]]), 1)]);
--------------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1433:67:Type <UNKNOWN> does not match declared type <UNKNOWN>.
    CustomerConfig c2 = Pair("c2", list[Pair(Config(SUGGEST, list[map[Pair(CPU,1)]]), 1)]);
---------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1433:63:Type ABS.StdLib.List<ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int>> does not match declared type ABS.StdLib.List<ABS.StdLib.Pair<Unbound Type,Unbound Type>>.
    CustomerConfig c2 = Pair("c2", list[Pair(Config(SUGGEST, list[map[Pair(CPU,1)]]), 1)]);
-----------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1436:68:Data constructor CPU cannot be resolved.
    CustomerConfig c3 = Pair("c3", list[Pair(Config(FAS, list[map[Pair(CPU,4)]]), 1)]);
----------------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1436:63:Type <UNKNOWN> does not match declared type <UNKNOWN>.
    CustomerConfig c3 = Pair("c3", list[Pair(Config(FAS, list[map[Pair(CPU,4)]]), 1)]);
-----------------------------------------------------------------^
./collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs:1436:59:Type ABS.StdLib.List<ABS.StdLib.Pair<<UNKNOWN>,ABS.StdLib.Int>> does not match declared type ABS.StdLib.List<ABS.StdLib.Pair<Unbound Type,Unbound Type>>.
    CustomerConfig c3 = Pair("c3", list[Pair(Config(FAS, list[map[Pair(CPU,4)]]), 1)]);
-------------------------------------------------------------^
./collaboratory/review_2nd_year/saco/Noncumulative.abs:1:0:Warning: no main block found.
module FMNoncu; 
^
./collaboratory/review_2nd_year/saco/Parallel.abs:1:0:Warning: no main block found.
module Parallel;
^
./collaboratory/review_2nd_year/saco/Performance.abs:1:0:Warning: no main block found.
module DemoTraffic;
^
