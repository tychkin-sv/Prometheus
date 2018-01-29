package taskInterview.company;

import java.util.List;

/**
 * Created by userPG on 03.04.2017.
 */
public class CompanyServiseImpl implements ICompanyServise {

    @Override
    public Company getTopLevelCompany(Company child) {
        Company result = child;
        if(child.getParent() != null){
        result = this.getTopLevelCompany(child.getParent());
}
        return result;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long result = company.getEmployeeCount();
        for (Company comp: companies) {
            System.out.println(comp.toString());
            if (comp.getParent() != null && comp.getParent().equals(company)) {
            result += comp.getParent().getEmployeeCount();
        }
        }
        return result;
    }
}
