package Assignment_5;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public abstract class Employee {
   Scanner sc;
   private String empName;
   private String empAddress;
   private String empDesignation;
   private String empDept;
   private String doj;
   private String bankName;
   private long UAN;
   private long PF_NO;
   private long ESINo;
   private long empId;
   private long bankAcctNo;
   private int totalWorkingDays;
   private int paidDays;
   private int leavesTaken;
   private int lopDays;
   private double grosswage;
   private double totalEarning;
   private double totalDeductions;
   private double basicWage;
   private double hra;
   private double conveyanceAllowances;
   private double medicalAllowances;
   private double otherAllowances;
   private double epf;
   private double esi;
   private double pt;
   private double loanRecovery;

   public Employee() {
      this.sc = new Scanner(System.in);
   }

   public String getEmpName() {
      return this.empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getEmpAddress() {
      return this.empAddress;
   }

   public void setEmpAddress(String empAddress) {
      this.empAddress = empAddress;
   }

   public String getEmpDesignation() {
      return this.empDesignation;
   }

   public void setEmpDesignation(String empDesignation) {
      this.empDesignation = empDesignation;
   }

   public String getEmpDept() {
      return this.empDept;
   }

   public void setEmpDept(String empDept) {
      this.empDept = empDept;
   }

   public String getDoj() {
      return this.doj;
   }

   public void setDoj(String doj) {
      this.doj = doj;
   }

   public String getBankName() {
      return this.bankName;
   }

   public void setBankName(String bankName) {
      this.bankName = bankName;
   }

   public long getUAN() {
      return this.UAN;
   }

   public void setUAN(long UAN) {
      this.UAN = UAN;
   }

   public long getPF_NO() {
      return this.PF_NO;
   }

   public void setPF_NO(long PF_NO) {
      this.PF_NO = PF_NO;
   }

   public long getESINo() {
      return this.ESINo;
   }

   public void setESINo(long ESINo) {
      this.ESINo = ESINo;
   }

   public long getEmpId() {
      return this.empId;
   }

   public void setEmpId(long empId) {
      this.empId = empId;
   }

   public long getBankAcctNo() {
      return this.bankAcctNo;
   }

   public void setBankAcctNo(long bankAcctNo) {
      this.bankAcctNo = bankAcctNo;
   }

   public int getTotalWorkingDays() {
      return this.totalWorkingDays;
   }

   public void setTotalWorkingDays(int totalWorkingDays) {
      this.totalWorkingDays = totalWorkingDays;
   }

   public int getPaidDays() {
      return this.paidDays;
   }

   public void setPaidDays(int paidDays) {
      this.paidDays = paidDays;
   }

   public int getLeavesTaken() {
      return this.leavesTaken;
   }

   public void setLeavesTaken(int leavesTaken) {
      this.leavesTaken = leavesTaken;
   }

   public int getLopDays() {
      return this.lopDays;
   }

   public void setLopDays(int lopDays) {
      this.lopDays = lopDays;
   }

   public double getGrosswage() {
      return this.grosswage;
   }

   public void setGrosswage(double grosswage) {
      this.grosswage = grosswage;
   }

   public double getTotalEarning() {
      return this.totalEarning;
   }

   public void setTotalEarning(double totalEarning) {
      this.totalEarning = totalEarning;
   }

   public double getTotalDeductions() {
      return this.totalDeductions;
   }

   public void setTotalDeductions(double totalDeductions) {
      this.totalDeductions = totalDeductions;
   }

   public double getBasicWage() {
      return this.basicWage;
   }

   public void setBasicWage(double basicWage) {
      this.basicWage = basicWage;
   }

   public double getHra() {
      return this.hra;
   }

   public void setHra(double hra) {
      this.hra = hra;
   }

   public double getConveyanceAllowances() {
      return this.conveyanceAllowances;
   }

   public void setConveyanceAllowances(double conveyanceAllowances) {
      this.conveyanceAllowances = conveyanceAllowances;
   }

   public double getMedicalAllowances() {
      return this.medicalAllowances;
   }

   public void setMedicalAllowances(double medicalAllowances) {
      this.medicalAllowances = medicalAllowances;
   }

   public double getOtherAllowances() {
      return this.otherAllowances;
   }

   public void setOtherAllowances(double otherAllowances) {
      this.otherAllowances = otherAllowances;
   }

   public double getEpf() {
      return this.epf;
   }

   public void setEpf(double epf) {
      this.epf = epf;
   }

   public double getEsi() {
      return this.esi;
   }

   public void setEsi(double esi) {
      this.esi = esi;
   }

   public double getPt() {
      return this.pt;
   }

   public void setPt(double pt) {
      this.pt = pt;
   }

   public double getLoanRecovery() {
      return this.loanRecovery;
   }

   public void setLoanRecovery(double loanRecovery) {
      this.loanRecovery = loanRecovery;
   }

   public abstract void salaryCalculation();

   public void getEmployeeDetails() {
      System.out.println("Employee Id");
      long eid = this.sc.nextLong();
      this.setEmpId(eid);
      System.out.println("Employee Name");
      String ename = this.sc.next();
      this.setEmpName(ename);
      System.out.println("Employee Designation");
      String d = this.sc.next();
      this.setEmpDesignation(d);
      System.out.println("Employee Department");
      String dept = this.sc.next();
      this.setEmpDept(dept);
      System.out.println("Employee DOj");
      String doj = this.sc.next();
      this.setDoj(doj);
      System.out.println("Employee UAN");
      long u = this.sc.nextLong();
      this.setUAN(u);
      System.out.println("Employee PF Number");
      long pf = this.sc.nextLong();
      this.setPF_NO(pf);
      System.out.println("Employee ESI Number");
      long esi = this.sc.nextLong();
      this.setEsi((double)esi);
      System.out.println("Employee Bank Name");
      String bn = this.sc.next();
      this.setBankName(bn);
      System.out.println("Employee Bank Account No");
      long acct = this.sc.nextLong();
      this.setBankAcctNo(acct);
      System.out.println("Employee Gross Wage");
      double gw = this.sc.nextDouble();
      this.setGrosswage(gw);
      this.setTotalWorkingDays(30);
      this.setLopDays(1);
      this.setPaidDays(this.getTotalWorkingDays() - this.getLopDays());
      System.out.println("Employee leaves taken");
      int lt = this.sc.nextInt();
      this.setLeavesTaken(lt);
   }

   public void displayEmployeeDetails() {
      System.out.println(String.format("%-20s %s", "Employee ID:", this.empId));
      System.out.println(String.format("%-20s %s", "Employee Name:", this.empName));
      System.out.println(String.format("%-20s %s", "Designation:", this.empDesignation));
      System.out.println(String.format("%-20s %s", "Department:", this.empDept));
      System.out.println(String.format("%-20s %s", "Date of Joining:", this.doj));
      System.out.println(String.format("%-20s %s", "UAN:", this.UAN));
      System.out.println(String.format("%-20s %s", "PF Number:", this.PF_NO));
      System.out.println(String.format("%-20s %s", "ESI Number:", this.ESINo));
      System.out.println(String.format("%-20s %s", "Bank Name:", this.bankName));
      System.out.println(String.format("%-20s %s", "Bank Account Number:", this.bankAcctNo));
      System.out.println(String.format("%-20s %s", "Total Working Days:", this.totalWorkingDays));
      System.out.println(String.format("%-20s %s", "Paid Days:", this.paidDays));
      System.out.println(String.format("%-20s %s", "Leaves Taken:", this.leavesTaken));
      System.out.println(String.format("%-20s %s", "Loss of Pay Days:", this.lopDays));
      System.out.println(String.format("%-20s %s", "Gross Wage:", this.grosswage));
      System.out.println(String.format("%-20s %s", "Total Earnings:", this.totalEarning));
      System.out.println(String.format("%-20s %s", "Total Deductions:", this.totalDeductions));
      System.out.println(String.format("%-20s %s", "Basic Wage:", this.basicWage));
      System.out.println(String.format("%-20s %s", "HRA:", this.hra));
      System.out.println(String.format("%-20s %s", "Conveyance Allowances:", this.conveyanceAllowances));
      System.out.println(String.format("%-20s %s", "Medical Allowances:", this.medicalAllowances));
      System.out.println(String.format("%-20s %s", "Other Allowances:", this.otherAllowances));
      System.out.println(String.format("%-20s %s", "EPF:", this.epf));
      System.out.println(String.format("%-20s %s", "ESI:", this.esi));
      System.out.println(String.format("%-20s %s", "PT:", this.pt));
      System.out.println(String.format("%-20s %s", "Loan Recovery:", this.loanRecovery));
   }
}

