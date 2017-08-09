package taskInterview.company;

/**
 * Created by userPG on 03.04.2017.
 */
public class Company {
    private final int id;
    private final Company parent;
    private final long employeeCount;

    public Company(final int id, final Company parent, final long employeeCount) {
        this.id = id;
        this.parent = parent;
        this.employeeCount = employeeCount;
    }

    public Company getParent() {
        return this.parent;
    }

    public long getEmployeeCount() {
        return this.employeeCount;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (ob instanceof Company) {
            Company other = (Company) ob;
            return this.id == other.id;
        }
        return false;
    }
}
