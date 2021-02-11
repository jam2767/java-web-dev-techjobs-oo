package org.launchcode.techjobs_oo.Tests;


import com.sun.jdi.IntegerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.*;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;

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

    @Before
    public void createJobObject4() {
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

//    @Before
//    public void createJobObject5() {
//        test_job5 = new Job(new Employer(), new);
//    }



    @Test
    public void testSettingJobId() {
        Assert.assertEquals(false, test_job.equals(test_job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals(3, test_job3.getId());
        Assert.assertEquals(true, test_job3.getEmployer() instanceof Employer);
        Assert.assertEquals(true, test_job3.getLocation() instanceof Location);
        Assert.assertEquals(true, test_job3.getPositionType() instanceof PositionType);
        Assert.assertEquals(true, test_job3.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("Product tester", test_job3.getName());
        Assert.assertEquals("ACME", test_job3.getEmployer().toString());
        Assert.assertEquals("Desert", test_job3.getLocation().toString());
        Assert.assertEquals("Quality control", test_job3.getPositionType().toString());
        Assert.assertEquals("Persistence", test_job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Assert.assertEquals(false, test_job3.equals(test_job4));
    }

//    @Test
//    public void testToStringReturnsBlankLines() {
//        Assert.assertEquals("\n\n", test_job4.toString());
//    }

    @Test
    public void testToStringContainsLabelAndData() {
        Assert.assertEquals("\nID: " + test_job4.getId() + "\nName: " + test_job4.getName() + "\nEmployer: " + test_job4.getEmployer() + "\nLocation: " + test_job4.getLocation() + "\nPosition Type: " + test_job4.getPositionType() + "\nCore Competency: " + test_job4.getCoreCompetency() + "\n", test_job4.toString());
    }

    @Test
    public void testToStringChecksIfFieldIsEmpty() {
        Assert.assertEquals("\nID: " + test_job2.getId() + "\nName: " + "Data not available" + "\nEmployer: " + "Data not available" + "\nLocation: " + "Data not available" + "\nPosition Type: " + "Data not available" + "\nCore Competency: " + "Data not available" + "\n", test_job2.toString());
    }
}

