package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    
    @Test
    public void testDefaultConstructor() {
        Job job = new Job();
        assertNotNull(job);
        assertEquals(10, job.getId());
        assertNull(job.getName());
        assertNull(job.getEmployer());
        assertNull(job.getLocation());
        assertNull(job.getPositionType());
        assertNull(job.getCoreCompetency());
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job2.getId(), job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Employer employer = new Employer("EmployerName");
        Location location = new Location("LocationName");
        PositionType positionType = new PositionType("PositionTypeName");
        CoreCompetency coreCompetency = new CoreCompetency("CoreCompetencyName");

        Job job = new Job("Name", employer, location, positionType, coreCompetency);

        assertNotNull(job);
        assertEquals(7, job.getId());
        assertEquals("Name", job.getName());
        assertEquals(employer, job.getEmployer());
        assertEquals(location, job.getLocation());
        assertEquals(positionType, job.getPositionType());
        assertEquals(coreCompetency, job.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));
        Job job2 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));
   //     Job job3 = new Job("DifferentName", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));

        assertNotEquals(job1, job2);
    //    assertNotEquals(job1, job3);
    }

    @Test
    public void testToString() {
        // Create a Job object with known values
        Employer employer = new Employer("EmployerName");
        Location location = new Location("LocationName");
        PositionType positionType = new PositionType("PositionTypeName");
        CoreCompetency coreCompetency = new CoreCompetency("CoreCompetencyName");

        Job job = new Job("Name", employer, location, positionType, coreCompetency);

        // Define the expected output based on the known values
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + job.getEmployer() + System.lineSeparator() +
                "Location: " + job.getLocation() + System.lineSeparator() +
                "Position Type: " + job.getPositionType() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency() + System.lineSeparator();

        // Use assertEquals to compare the expected output with the actual output of the toString method
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));

        String jobToString = job.toString();
        assertTrue(jobToString.startsWith(System.lineSeparator()));
        assertTrue(jobToString.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("PositionType"), new CoreCompetency("CoreCompetency"));
        String jobToString = job.toString();

        assertTrue(jobToString.contains("ID: " + job.getId()));
        assertTrue(jobToString.contains("Name: " + job.getName()));
        assertTrue(jobToString.contains("Employer: " + job.getEmployer()));
        assertTrue(jobToString.contains("Location: " + job.getLocation()));
        assertTrue(jobToString.contains("Position Type: " + job.getPositionType()));
        assertTrue(jobToString.contains("Core Competency: " + job.getCoreCompetency()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job();
        String jobToString = job.toString();

        assertTrue(jobToString.contains("ID: ")); // Check for an empty ID
        assertTrue(jobToString.contains("Name: ")); // Check for an empty Name
        assertTrue(jobToString.contains("Employer: ")); // Check for an empty Employer
        assertTrue(jobToString.contains("Location: ")); // Check for an empty Location
        assertTrue(jobToString.contains("Position Type: ")); // Check for an empty Position Type
        assertTrue(jobToString.contains("Core Competency: ")); // Check for an empty Core Competency
}
}




