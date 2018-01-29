package taskInterview.company;

import java.util.List;

/**
 * Created by userPG on 03.04.2017.
 */
public interface ICompanyServise {

Company getTopLevelCompany(Company child);

long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);

}
