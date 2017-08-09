package taskInterview.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by userPG on 03.04.2017.
 */
public class CompanyServiseTest {
    Company root = new Company(1, null, 10);
    Company manager = new Company(2, root, 10);
    Company dev = new Company(3, manager, 10);
    ICompanyServise service = new CompanyServiseImpl();


    @Test
    public void whenCompanySingleThenTopTheSameCompany(){

        Company result = service.getTopLevelCompany(this.root);
        assertThat(result, is(this.root));
       // long count = root.getEmployeeCount();
    }

    @Test
    public void whenCompanyInChainThenTopCompanyWithParentNull(){
        Company result = this.service.getTopLevelCompany(this.dev);
        assertThat(result, is(this.root));
    }

    @Test
    public void whenCompanySingleThenEmployeeOnlyInIt(){
        List<Company> companies = Arrays.asList(this.root);
        long result = this.service.getEmployeeCountForCompanyAndChildren(this.root, companies);
        assertThat(result, is(10L));
       }

    @Test
    public void whenThreeCompany(){
        List<Company> companies = Arrays.asList(this.root, this.manager, this.dev);
        long result = this.service.getEmployeeCountForCompanyAndChildren(this.root, companies);
        assertThat(result, is(30L));
    }
}