package Company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class jcompanypayroll {


			public static void main(String[] args) throws IOException {
				
					Scanner scan = new Scanner(System.in);

					    //Basic info
						String name = "Jose Crisostomo"; 
						String birthday = "February 14, 1988";
						String address = "17/85 Stracke Via Suite 042, Poblacion, Las PiÃ±as 4783 Dinagat Islands";
						String status = "Regular";
						String position = "HR Manager";
						String phonenumber = "918-621-603"; 
						String supervisor = "N/A"; 
						String sss = "49-1632020-8";
						String philhealth = "382189453145";
						String tin = "317-674-022-000";
						String pagibig = "441093369646";

						
						///////////////////////////////////////////////////////////////////////////////

						
						//Headline
					    System.out.println("___________________J&J Company Payroll___________________");
					    //user input of employee number
						System.out.println("      ");

						System.out.print("Type your Employee Number:");
						int employeeid = scan.nextInt(); 

						if(employeeid == 10001)				
						{ 
						
						System.out.println("      ");
						System.out.println("__________________ Employee Information__________________");
						System.out.println("      ");

						
						
						//Employee Information
					    System.out.println("Name:" + name); 
					    System.out.println("Status:" + status); 
					    System.out.println("Position:" + position);
					    System.out.println("Immediate Supervisor:" + supervisor);
					    System.out.println("   "); 
					    System.out.println("_____________________Basic Information_____________________"); 
					    System.out.println("   "); 
					    System.out.println("Birthday:" + birthday); 
					    System.out.println("Address:" + address); 
					    System.out.println("Phone Number:" + phonenumber);
					    System.out.println("____________________________________________________________"); 
					    System.out.println("   ");
					    System.out.println("SSS #:" + sss);
					    System.out.println("Philhealth #:" + philhealth);
					    System.out.println("Tin #:" + tin);
					    System.out.println("Pag-ibig # :" + pagibig);
					    System.out.println("   ");
					    
					    
					    
					    //Total Hours Worked
					    System.out.println("_____________________Total Hours Worked______________________"); 
					    System.out.println("   ");
					    System.out.println("September 2022"); 
					    System.out.println("   ");
					    System.out.println("From 1/9/2022 To 1/13/2022");
					    System.out.println("   ");   
					    
					    
					    
					    //Total hours worked user input
					    System.out.print("1/9/2022:");
					    int day1 = scan.nextInt(); 
					    System.out.print("1/10/2022:");
					    int day2 = scan.nextInt(); 
					    System.out.print("1/11/2022:");
					    int day3 = scan.nextInt(); 
					    System.out.print("1/12/2022:");
					    int day4 = scan.nextInt(); 
					    System.out.print("1/13/2022:");
					    int day5 = scan.nextInt(); 
					    int totalhours = day1 +day2+day3+day4+day5; 
					    System.out.println("   ");
					    System.out.println("Total:" + totalhours);
					    System.out.println("   ");

					    
					    //Gross Income 
					    System.out.println("_____________________Gross Income_____________________________"); 
					    System.out.println("   ");
					    System.out.println("September 2022"); 
					    System.out.println("   ");
					    System.out.println("From 1/9/2022 To 1/13/2022");
					    
					    
					    int standardhours = 40; //per week
					    double rate = 1.20; //overtime
					    double basicpay=0;
					    double weeklygross=0;
					    double overtimehours=0;
					    double ot=0; 
					    
					    System.out.print("Type your Hourly Rate:");
					    double hourlyrate = scan.nextDouble(); 
					    
					    
					    // no overtime
					    if (totalhours <= standardhours) { weeklygross=totalhours*hourlyrate; 
					    System.out.println("No Overtime");
					    }   
					    
					    
					    // with overtime
					    else {  basicpay= standardhours*hourlyrate; 
					    overtimehours = totalhours-standardhours; 
					    System.out.println("Overtime Hour(s):" + overtimehours);
					    ot = (hourlyrate*rate*overtimehours); 
					    weeklygross= (basicpay + ot);
					    
					    //total weekly gross income
					    } 
					    System.out.println("");
					    System.out.println("Total Weekly Gross Income:" + weeklygross); //weekly
					   
					    
					    
					    //net income
					    System.out.println("   ");
					    System.out.println("_______________________Net Income_________________________________"); 
					    System.out.println("   ");
					    System.out.println("September 2022"); 
					    System.out.println("   ");
					    System.out.println("From 1/9/2022 To 1/13/2022");
					    System.out.println("   ");
					    System.out.println("Government Mandatory Deductions");
					 
					    double basicsalary = (21*8*hourlyrate); //x21 days x8hours
					    
					    //x sss
					    //y philhealth
					    //z pagibig
					    // withholding tax
					    
					    
					    //SSS
					    double x=0; 
					    
					    if (basicsalary > 24750) x=1125; 
					    else if (basicsalary > 24250 && basicsalary <= 24750) x = 1102.50;
					    else if (basicsalary > 23750 && basicsalary <= 24250) x = 1080;
					    
					    System.out.println("SSS:" + sss(x,21,5)); //weekly
					    
					    
					    //Philhealth
					    double y=0;
					    
					    if (basicsalary >= 10000) y=(basicsalary*0.03)/2;
					  
					    System.out.println("Philhealth:" + philhealth(y,21,5)); //weekly
					    
					   
					    
					    //Pag-ibig
					    double z=0;
					    
					    if (basicsalary >= 1000 && basicsalary <=1500 ) z= (basicsalary*0.01); 
					    else if (basicsalary > 1500) z= (basicsalary*0.02);		
					    
					    System.out.println("Pag-ibig:" + pagibig(z,21,5)); //weekly
					    
					    
					    
					    //Total Government Deduction
					   
					    double mdeduct = mdeduction(x, y, z); //monthly
					    double wdeduct = wdeduction(x,y,z,21,5); //weekly
					    System.out.println("Total Weekly Deduction:" + wdeduct); 

					    //Total Net Income without Tax

					    System.out.println("");
					    double netwithouttax = weeklygross-wdeduct; //weekly 
					    System.out.println("Total Weekly Net Income (without Tax):" + netwithouttax); //without tax

					    //Total Net Income withholding Tax

					    double tobetax = basicsalary-mdeduct;
					    double taxcomp = tobetax + 2500; //above 33333 computation
					    double taxrate=0;

					    if (tobetax <= 20832 ) System.out.println("no withholding tax");
					    else if (tobetax >= 20833 && tobetax <= 33333) taxrate=(tobetax-20833)*0.20;
					    else if (tobetax > 33333 && tobetax <= 66667) taxrate= (taxcomp-33333)*0.25;

					    System.out.println("");
					    System.out.println("Tax:" + tax(taxrate,21,5)); //weekly tax amount
					    System.out.println("");
					    double netwithtax = tobetax-taxrate;
					    System.out.println("Total Weekly Net Income:" + net(netwithtax,21,5)); // with tax net income


					    //  create a file called "JEmployeeDetails.txt"
					    File file = new File("JEmployeeDetails.txt");
					    file.createNewFile();

					    
					    /*
					     * write to the file the following information in Employee.txt
					     * J&J Company Payroll
					     * Employee Number:
					     * Name:
					     * Status:
					     * Position:
					     * Immediate Supervisor:
					     * Birthday:
					     * 
					     * Hours Worked from 1/9/2022-1/13/2022:
					     * 1/9/2022:
					     * 1/10/2022:
					     * 1/11/2022:
					     * 1/12/2022:
					     * 1/13/2022:
					     * 
					     * Total Hours Worked: 
					     * Hourly Rate:
					     * 
					     * Gross Income:
					     * 
					     * SSS:
					     * Philhealth:
					     * Pag-ibig:
					     * Total Government Deduction:
					     * 
					     * 
					     * Total Net Income (without Tax):
					     * 
					     * Withholding Tax: 
					     * Total Net Income 
					     * 
					     */

					    FileWriter writer = new FileWriter(file);
					    writer.write("J&J Company Payroll" + "\n");
					    writer.write("\n");
					    writer.write("Employee Number: " + employeeid + "\n");
					    writer.write("Name: " + name+ "\n");
					    writer.write("Status: " + status+ "\n");
					    writer.write("Position: " + position+ "\n");
					    writer.write("Immediate Supervisor: " + supervisor+ "\n");
					    writer.write("Birthday: " + birthday+ "\n");
					    writer.write("\n");
					    writer.write("Hours Worked from 1/9/2022-1/13/2022:" + "\n");
					    writer.write("1/9/2022:" + day1 + "\n" );
					    writer.write("1/10/2022:" + day2 + "\n");
					    writer.write("1/11/2022:" + day3 + "\n");
					    writer.write("1/12/2022:" + day4 + "\n");
					    writer.write("1/13/2022:" + day5 + "\n");
					    writer.write("\n");
					    writer.write("Total Hours Worked: " + totalhours + "\n");
					    writer.write("Hourly Rate: " + hourlyrate+ "\n");
					    writer.write("\n");
					    writer.write("Gross Income: " + weeklygross+ "\n");
					    writer.write("\n");
					    writer.write("SSS:" + sss(x,21,5) + "\n");
					    writer.write("Philhealth:" + philhealth(y,21,5) + "\n");
					    writer.write("Pag-ibig:" + pagibig(z,21,5) + "\n");
					    writer.write("Total Government Deduction:" + wdeduct + "\n");
					    writer.write("\n");
					    writer.write("Net Income (without Tax): " + netwithouttax + "\n");
					    writer.write("\n");
					    writer.write("Tax:" + tax(taxrate,21,5) + "\n");
					    writer.write("Total Net Income" + net(netwithtax,21,5) + "\n");
					    writer.close();

					    // close scanner
					    scan.close();

						} else { System.out.println("No Employee ID Found"); }

					}

					//sss 
					static double sss(double x, double mdays, double wdays) 
					{
					    return (x/mdays)*wdays;   
					}
					//philhealth
					static double philhealth(double y, double mdays, double wdays) 
					{ 
					    return (y/mdays)*wdays;   
					}
					//pagibig
					static double pagibig(double z, double mdays, double wdays) 
					{ 
					    return (z/mdays)*wdays;
					}

					//monthly government deduction  
					static double mdeduction(double x, double y, double z) 
					{ 
					    return (x + y + z);
					}

					//weekly government deduction  
					static double wdeduction(double x, double y, double z, double mdays, double wdays) 
					{ 
					    return (x + y + z)/mdays*(wdays);
					}

					//witholding tax amount
					static double tax(double num1, double mdays, double wdays) 
					{ 
					    return (num1/mdays)*(wdays);
					}

					//total net and tax deduct
					static double net(double num1, double mdays, double wdays) 
					{ 
					    return (num1/mdays)*(wdays);
						
						
					}
					}
				
				

