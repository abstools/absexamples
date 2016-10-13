/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved.
 * This file is licensed under the terms of the Modified BSD License.
 */
package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import abs.frontend.FrontendTest;
import abs.frontend.ast.Model;
import static abs.ABSTest.Config.*;

@RunWith(LabelledParameterized.class)
public class EITest extends FrontendTest {

    /* Render filename and product in JUnit output via test name */
    @Parameters(name="{0}, {1}")
    public static Collection<?> data() {
        final Object[][] data = new Object[][] {
	    /* Regenerate with:
	       find .. -name "*.abs" -exec echo ", { new String[] {\"{}\"}, null }" \;
	       Then weed out special cases like SmartDeploy.
	       TODO: find everything in Java instead, or use ANT -- but the special casing will be tricky.
	    */
 { new String[] {"../collaboratory/deliverables/D3.3.2/CoFloCo.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/DataTransmitted.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/InterProcedural.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/Noncumulative.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/Parallel.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/Performance.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/Timed.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/VendingMachine.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/VendingMachine_init.abs"}, null }
, { new String[] {"../collaboratory/deliverables/D3.3.2/VendingMachine_init_2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/factorial.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/MultiPingPong.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/philosophers2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/philosophersN.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/PingPong.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/SchedulerChoice.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/BOL/uglyChain.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/await_chain.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/AwaitCond.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/dead_await.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/dead_interfaces_paper.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/dead_interfaces_paper_variant.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/Deadlock.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/false_await_chain.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/false_dead1.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/false_dead2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/future_fields.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/localFields.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/no_dead_await.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/no_dead_await2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/NoDeadlock.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/paper_dead.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/paper_dead2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/paper_ex.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/syncCall.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/syncs_again.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/taskFresh.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/using_lists.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/virtual_calls_deadlock.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/virtual_calls_deadlock2.abs"}, null }
, { new String[] {"../collaboratory/examples/Deadlock/UCM/virtual_calls_nodeadlock.abs"}, null }
, { new String[] {"../collaboratory/examples/DeploymentComponent/ElasticDeployment/model1.abs"}, null }
, { new String[] {"../collaboratory/examples/DeploymentComponent/ElasticDeployment/model2.abs"}, null }
, { new String[] {"../collaboratory/examples/DeploymentComponent/ElasticDeployment/model3.abs"}, null }
, { new String[] {"../collaboratory/examples/DeploymentComponent/ElasticDeployment/model4.abs"}, null }
, { new String[] {"../collaboratory/examples/DeploymentComponent/ElasticDeployment/model5.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/deadlock_with_loop_inside.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/deadlock_with_nested_loop_inside.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/fake_deadlock_with_loop_inside.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/fake_deadlock_with_nested_loop_inside.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_importance_of_MHPgraph.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_maybe_not_executed.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_non_unique_getX.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop_and_if.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop_before.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_nested_loop.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_nested_loop_if.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/case_studies/ReplicationSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/case_studies/TradingSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/interprocedural/interproc_1.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/interprocedural/interproc_2.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/interprocedural/interproc_3.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/emmi1.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/emmi2.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/Prio1.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/Prio2.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/Prio3.abs"}, null }
, { new String[] {"../collaboratory/examples/MHP/priorities/Running.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/BookShop.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/BoundedBuffer.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/Chat.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/DemoExample.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/fullTradingSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/MailServer.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/PeerToPeer.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/ReplicationSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/Misc/VendingMachine.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/CostCenters/CostCenters.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/BookShop.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/BoundedBuffer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/Chat.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/DistHT.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/MailServer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/ParallelCost/PeerToPeer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/BookShop.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/BoundedBuffer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/BoundedBufferRep.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/Chat.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/DistHT.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/MailServer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/MailServerRep.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/PeerToPeer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PeakCost/PeerToPeerRep.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/BookShop.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/BoundedBuffer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/Chat.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/MailServer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/PeerToPeer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/PerformanceIndicators/TradingSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/BookShop.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/BoundedBuffer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/Chat.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/DistHT.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/MailServer.abs"}, null }
, { new String[] {"../collaboratory/examples/ResourceUsage/Traffic/PeerToPeer.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/ReplicationSystem.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/Running1.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/Running2.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/Running3.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/Running4.abs"}, null }
, { new String[] {"../collaboratory/examples/Termination/Test.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/Atbrox5.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/Atbrox7.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/DBProtocol.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/Fact.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/Forte14v2.abs"}, null }
, { new String[] {"../collaboratory/examples/TestCaseGeneration/PPDP16.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/erlbackend/Arithm.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/erlbackend/HelloWorld.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/erlbackend/NewYearsEve2.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/saco/Noncumulative.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/saco/Parallel.abs"}, null }
, { new String[] {"../collaboratory/review_2nd_year/saco/Performance.abs"}, null }
, { new String[] { "../collaboratory/examples/SmartDeploy/Monitor.abs", "../collaboratory/examples/SmartDeploy/FredhopperCloudServices_NoDeltas_v2_CloudProvider.abs", "../collaboratory/examples/SmartDeploy/Degradation.abs" } , null }
	};

        return Arrays.asList(data);
    }

    final private String[] input;
    final protected String product;
    protected Model m;

    public EITest(String[] input, String product) {
        this.input = input;
        this.product = product;
    }

    @Test
    public void test() throws Exception {
        m = parse(input);
    }

    protected Model parse(String[] input) throws Exception {
        return assertParseFilesOk(new HashSet(Arrays.asList(input)), TYPE_CHECK, WITH_STD_LIB);
    }
}
