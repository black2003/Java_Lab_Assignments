package Assignment_5;

public class SpecialEmployee extends Employee {
    public SpecialEmployee() {
    }
    @Override
    public void salaryCalculation() 
	{  
    double bw = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) * 0.45;
    setBasicWage(bw);
    double hra = (bw * 0.40);
    setHra(hra);
    double ca = (1600 / getTotalWorkingDays()) * getPaidDays();
    setConveyanceAllowances(ca);
    double ma = (1250 / getTotalWorkingDays()) * getPaidDays();
    setMedicalAllowances(ma);
    double otherAllo = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) - (bw + hra + ca + ma);
    setOtherAllowances(otherAllo);
    setTotalEarning(bw + hra + ca + ma + otherAllo);
    double esi = getTotalEarning() * 0.0075;
    setTotalEarning(getTotalEarning() + esi);
    
    double epf = bw * 0.12; 
    setEpf(epf);
    double totalDeductions = epf + getEsi(); 
    setTotalDeductions(totalDeductions);
    
    System.out.println("Total Earnings: " + getTotalEarning());
	}

}
 
 