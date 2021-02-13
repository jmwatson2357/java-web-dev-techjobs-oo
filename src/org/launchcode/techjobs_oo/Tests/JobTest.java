package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job job_one;
    Job job_two;
    Job job_three;
    Job job_four;
    Job job_five;
    @Before
    public void createFirstJob(){
        job_one = new Job();
    }
    @Before
    public void createSecondJob(){
        job_two = new Job();
    }
    @Before
    public void createThirdJob() {
        job_three = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
    }
    @Before
    public void createFourthJob() {
        job_four = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
    }
    @Before
    public void createFifthJob() {
        job_five = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
    }
    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }
    @Test
    public void testSettingJobId(){
        assertTrue(job_one.getId() - job_two.getId() == 1);
    }
    @Test
    public void testJobConstructorSetsAlFields(){
        assertEquals("Product tester", job_three.getName());
        assertEquals("ACME", job_three.getEmployer().toString());
        assertEquals("Desert", job_three.getLocation().toString());
        assertEquals("Quality control", job_three.getPositionType().toString());
        assertEquals("Persistence", job_three.getCoreCompetency().toString());
    }
    @Test
    public void testJobsForEquality(){
        assertTrue(job_three.getName() == job_four.getName());
        assertTrue(job_three.getEmployer().toString() == job_four.getEmployer().toString());
        assertTrue(job_three.getLocation().toString() == job_four.getLocation().toString());
        assertTrue(job_three.getPositionType().toString() == job_four.getPositionType().toString());
        assertTrue(job_three.getCoreCompetency().toString() == job_four.getCoreCompetency().toString());
    }
    @Test
    public void testForFirstLineBlank(){
        assertTrue(job_five.toString().startsWith(" "));
    }
    @Test
    public void testForLastLineBlank(){
        assertTrue(job_five.toString().endsWith(" "));
    }
    @Test
    public void testForLabels(){
        String j5_check = job_five.toString();
        assertTrue(j5_check.contains("ID:"));
    }
    @Test
    public void testJobForBlankField(){
        assertEquals("Data not available", job_five.getLocation().toString());
    }
    @Test
    public void testForEmptyJob(){
        assertEquals("OOPS! This job does not seem to exist.", job_one.getName());
    }


}
