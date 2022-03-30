import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HRDepartment implements HRCodes {

    ArrayList<Employee> employeeList=new ArrayList<Employee>();

    public void addEmployee(int employeeId, String name, int role)
    {
        Employee e= new Employee(employeeId,name,role);
        employeeList.add(e);
    }

    public void printAllEmployees()
    {
        for(int index=0; index<employeeList.size();index++)
        {
            System.out.println("Details for employee"+index+1);
            System.out.println("Name of employee");
            System.out.println(employeeList.get(index).getName());
            System.out.println("EmployeeId of employee");
            System.out.println(employeeList.get(index).getEmployeeId());
            System.out.println("Role of employee");
            System.out.println(employeeList.get(index).getRole());
            System.out.println("Promotion Date of employee");
            System.out.println(employeeList.get(index).getPromotionDate());
            System.out.println("Appraisal History of employee");
            System.out.println(employeeList.get(index).getAppraisalHistory());
        }
    }
    public Employee findEmployee(int employeeId)
    {
        for(int index=0;index<employeeList.size();index++)
        {
            if(employeeId==employeeList.get(index).getEmployeeId())
            {
                return employeeList.get(index);
            }
        }
        return null;
    }

    public boolean recordEmployeeAppraisal(int employeeId, Date appraisalDate, int score)
    {
        boolean employeefound=false;
        for(int index=0;index<employeeList.size();index++)
        {
            if(employeeId==employeeList.get(index).getEmployeeId())
            {
                employeefound=true;
                EmployeeAppraisal ea= new EmployeeAppraisal(appraisalDate,score);
                ArrayList<EmployeeAppraisal> eaList=new ArrayList<EmployeeAppraisal>();
                eaList.add(ea);
                employeeList.get(index).setAppraisalHistory(eaList);
            }
        }
        return employeefound;
    }

    public boolean promoteEmployee(int employeeId)
    {
        boolean promoteEmployee=false;
        for(int index=0;index<employeeList.size();index++)
        {
            if(employeeId==employeeList.get(index).getEmployeeId())
            {
                if(employeeList.get(index).getRole()!=EXECUTIVE) {
                    ArrayList<EmployeeAppraisal> eaList = new ArrayList<EmployeeAppraisal>();
                    eaList = employeeList.get(index).getAppraisalHistory();
                    int lastScore = eaList.get(eaList.size() - 1).getAppraisalScore();
                    int secondLastScore = eaList.get(eaList.size() - 2).getAppraisalScore();
                    if (lastScore == EXCEEDED_EXPECTATIONS && secondLastScore == EXCEEDED_EXPECTATIONS) {
                        //getting last year date
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new Date());
                        calendar.add(Calendar.YEAR, -1);
                        Date date = calendar.getTime();
                        //getting last appraisal date
                        Date lastPromotionDate = employeeList.get(index).getPromotionDate();
                        if (lastPromotionDate.before(date)) {
                            if (employeeList.get(index).getRole() == TESTER) {
                                employeeList.get(index).setRole(DEVELOPER);
                            } else if (employeeList.get(index).getRole() == DEVELOPER) {
                                employeeList.get(index).setRole(DESIGNER);
                            } else if (employeeList.get(index).getRole() == DESIGNER) {
                                employeeList.get(index).setRole(MANAGER);
                            } else if (employeeList.get(index).getRole() == MANAGER) {
                                employeeList.get(index).setRole(EXECUTIVE);
                            }
                            promoteEmployee=true;
                            //getting today's date
                            Calendar calendar1 = Calendar.getInstance();
                            calendar.setTime(new Date());
                            Date date1 = calendar.getTime();
                            employeeList.get(index).setPromotionDate(date1);
                        }
                        else
                        {
                            break;
                        }

                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        return promoteEmployee;
    }


}
