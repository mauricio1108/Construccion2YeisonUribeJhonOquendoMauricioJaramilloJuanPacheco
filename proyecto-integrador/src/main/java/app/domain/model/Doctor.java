package app.domain.model;

public class Doctor {
	
	private String id;
    private String name;
    private String specialty;
    private String licenseNumber;

    public Doctor() {
    }

    public Doctor(String id, String name, String specialty, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}

