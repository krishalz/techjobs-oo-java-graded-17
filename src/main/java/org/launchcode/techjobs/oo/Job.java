package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }
    public void setJobId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

   // @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job otherJob = (Job) o;
        if (id != otherJob.id) return false;
        return getId() == otherJob.id;
    //    return getId() == otherJob.getId(); // && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

   // @Override
    public int hashCode() {
        return Objects.hash(getId()); //, getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    @Override
    public String toString() {
        if (this.getName() == null) {
            setName("Data not available");
        }
        return System.lineSeparator() +
                "ID: " + getId() + System.lineSeparator() +
                "Name: " + getName() + System.lineSeparator() +
                "Employer: " + getEmployer() + System.lineSeparator() +
                "Location: " + getLocation() + System.lineSeparator() +
                "Position Type: " + getPositionType() + System.lineSeparator() +
                "Core Competency: " + getCoreCompetency() + System.lineSeparator();
    }


}
