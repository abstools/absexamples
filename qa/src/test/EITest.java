/**
 * Copyright (c) 2009-2011, The HATS Consortium. All rights reserved.
 * This file is licensed under the terms of the Modified BSD License.
 */
package test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import abs.frontend.FrontendTest;
import abs.frontend.ast.Model;

@RunWith(Parameterized.class)
public class EITest extends FrontendTest {

    /* Render filename and product in JUnit output via test name */
    @Parameters(name="{0}, {1}")
    public static Collection<?> data() {
        final Object[][] data = new Object[][] {
	    /* Regenerate with:
	       find .. -name "*.abs" -exec echo ", { \"{}\", null }" \;
	       TODO: find everything in Java instead, or use ANT.
	    */
 { "../collaboratory/deliverables/D3.3.2/CoFloCo.abs", null }
, { "../collaboratory/deliverables/D3.3.2/DataTransmitted.abs", null }
, { "../collaboratory/deliverables/D3.3.2/InterProcedural.abs", null }
, { "../collaboratory/deliverables/D3.3.2/Noncumulative.abs", null }
, { "../collaboratory/deliverables/D3.3.2/Parallel.abs", null }
, { "../collaboratory/deliverables/D3.3.2/Performance.abs", null }
, { "../collaboratory/deliverables/D3.3.2/Timed.abs", null }
, { "../collaboratory/deliverables/D3.3.2/VendingMachine.abs", null }
, { "../collaboratory/deliverables/D3.3.2/VendingMachine_init.abs", null }
, { "../collaboratory/deliverables/D3.3.2/VendingMachine_init_2.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_analyz_Union.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_9.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_b.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_b1.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_b2.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_b3.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_correttaTerminazione.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_d.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_deadlock.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_e.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_first_new_deadlock.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_g.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_infinit.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_infinitBis.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_livelock.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_mutuolockCorretto.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_sat.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_schedulerChoise.abs", null }
, { "../collaboratory/examples/Deadlock/BOL/Test_Inference_schedulerChoiseBis.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/await_chain.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/AwaitCond.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/dead_await.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/dead_interfaces_paper.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/dead_interfaces_paper_variant.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/false_await_chain.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/false_dead1.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/false_dead2.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/future_fields.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/localFields.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/no_dead_await.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/no_dead_await2.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/paper_dead.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/paper_dead2.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/paper_ex.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/paper_no_dead.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/syncCall.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/syncs_again.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/taskFresh.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/using_lists.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/virtual_calls_deadlock.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/virtual_calls_deadlock2.abs", null }
, { "../collaboratory/examples/Deadlock/UCM/virtual_calls_nodeadlock.abs", null }
, { "../collaboratory/examples/MainGeneration/FRH_2Query.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/deadlock_with_loop_inside.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/deadlock_with_nested_loop_inside.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/fake_deadlock_with_loop_inside.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/fake_deadlock_with_nested_loop_inside.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_importance_of_MHPgraph.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_maybe_not_executed.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_non_unique_getX.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop_and_if.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_loop_before.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_nested_loop.abs", null }
, { "../collaboratory/examples/MHP/Boolean_awaits/no_deadlock_with_nested_loop_if.abs", null }
, { "../collaboratory/examples/MHP/case_studies/ReplicationSystem.abs", null }
, { "../collaboratory/examples/MHP/case_studies/TradingSystem.abs", null }
, { "../collaboratory/examples/MHP/interprocedural/interproc_0.abs", null }
, { "../collaboratory/examples/MHP/interprocedural/interproc_1.abs", null }
, { "../collaboratory/examples/MHP/interprocedural/interproc_2.abs", null }
, { "../collaboratory/examples/MHP/interprocedural/interproc_3.abs", null }
, { "../collaboratory/examples/MHP/priorities/emmi1.abs", null }
, { "../collaboratory/examples/MHP/priorities/emmi2.abs", null }
, { "../collaboratory/examples/MHP/priorities/Prio1.abs", null }
, { "../collaboratory/examples/MHP/priorities/Prio2.abs", null }
, { "../collaboratory/examples/MHP/priorities/Prio3.abs", null }
, { "../collaboratory/examples/MHP/priorities/Running.abs", null }
, { "../collaboratory/examples/Misc/BookShop.abs", null }
, { "../collaboratory/examples/Misc/BoundedBuffer.abs", null }
, { "../collaboratory/examples/Misc/Chat.abs", null }
, { "../collaboratory/examples/Misc/DemoExample.abs", null }
, { "../collaboratory/examples/Misc/fullTradingSystem.abs", null }
, { "../collaboratory/examples/Misc/MailServer.abs", null }
, { "../collaboratory/examples/Misc/PeerToPeer.abs", null }
, { "../collaboratory/examples/Misc/ReplicationSystem.abs", null }
, { "../collaboratory/examples/Misc/VendingMachine.abs", null }
, { "../collaboratory/examples/ResourceUsage/CostCenters/CostCenters.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/BookShop.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/BoundedBuffer.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/Chat.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/DistHT.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/MailServer.abs", null }
, { "../collaboratory/examples/ResourceUsage/ParallelCost/PeerToPeer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/BookShop.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/BoundedBuffer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/BoundedBufferRep.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/Chat.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/DistHT.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/MailServer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/MailServerRep.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/PeerToPeer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PeakCost/PeerToPeerRep.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/BookShop.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/BoundedBuffer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/Chat.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/MailServer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/PeerToPeer.abs", null }
, { "../collaboratory/examples/ResourceUsage/PerformanceIndicators/TradingSystem.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/BookShop.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/BoundedBuffer.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/Chat.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/DistHT.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/MailServer.abs", null }
, { "../collaboratory/examples/ResourceUsage/Traffic/PeerToPeer.abs", null }
, { "../collaboratory/examples/SmartDeploy/FRH_staging_re.abs", null }
, { "../collaboratory/examples/Termination/ReplicationSystem.abs", null }
, { "../collaboratory/examples/Termination/Running1.abs", null }
, { "../collaboratory/examples/Termination/Running2.abs", null }
, { "../collaboratory/examples/Termination/Running3.abs", null }
, { "../collaboratory/examples/Termination/Running4.abs", null }
, { "../collaboratory/examples/Termination/Test.abs", null }
, { "../collaboratory/examples/TestCaseGeneration/Atbrox_5.abs", null }
, { "../collaboratory/examples/TestCaseGeneration/Fact.abs", null }
, { "../collaboratory/examples/TestCaseGeneration/Forte14v2.abs", null }
, { "../collaboratory/examples/TestCaseGeneration/IFM16.abs", null }
, { "../collaboratory/review_2nd_year/erlbackend/Arithm.abs", null }
, { "../collaboratory/review_2nd_year/erlbackend/FredhopperCloudServices_NoDeltas_v2.abs", null }
, { "../collaboratory/review_2nd_year/erlbackend/HelloWorld.abs", null }
, { "../collaboratory/review_2nd_year/erlbackend/NewYearsEve2.abs", null }
, { "../collaboratory/review_2nd_year/saco/Noncumulative.abs", null }
, { "../collaboratory/review_2nd_year/saco/Parallel.abs", null }
, { "../collaboratory/review_2nd_year/saco/Performance.abs", null }
	};

        return Arrays.asList(data);
    }

    final private String input;
    final protected String product;
    protected Model m;

    public EITest(String input, String product) {
        this.input = input;
        this.product = product;
    }

    @Test
    public void test() throws Exception {
        m = parse(input);
    }

    protected Model parse(String input) throws Exception {
        return assertTypeCheckFileOk(input, true);
    }
}
