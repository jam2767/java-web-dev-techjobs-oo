package org.launchcode.techjobs_oo.Tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobObject() {
        test_job = new Job();
    }

    @Before
    public void createJobObject2() {
        test_job2 = new Job();
    }

    @Before
    public void createJobObject3() {
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        Assert.assertEquals(false, test_job.equals(test_job2));
        }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals(true, test_job3.getId() == 2);
        Assert.assertEquals(true, test_job3.getEmployer() instanceof Employer);
        Assert.assertEquals(true, test_job3.getLocation() instanceof Location);
        Assert.assertEquals(true, test_job3.getPositionType() instanceof PositionType);
        Assert.assertEquals(true, test_job3.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("Product tester", test_job3.getName().getClass());
        Assert.assertEquals("ACME", test_job3.getEmployer());
        Assert.assertEquals(test_job3.getLocation(), "Desert");
        Assert.assertEquals(test_job3.getPositionType(), "Quality control");
        Assert.assertEquals(test_job3.getCoreCompetency(),"Persistence");

    }
}

