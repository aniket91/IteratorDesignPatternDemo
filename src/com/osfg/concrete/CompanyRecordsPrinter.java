package com.osfg.concrete;

import com.osfg.interfaces.Iterator;
import com.osfg.models.Employee;
/**
 * 
 * @author athakur
 *
 */
public class CompanyRecordsPrinter {
	
	public void pringCompanyEMployeeRecords(CompanyAEmpRecords companyAEmpRecords, CompanyBEmpRecords companyBEmpRecords) {
		
		printRecord(companyAEmpRecords.getIterator());
		printRecord(companyBEmpRecords.getIterator());
	}
	
	private void printRecord(Iterator recordIterator) {
		while(recordIterator.hasNext()) {
			System.out.println(recordIterator.next());
		}
	}
	
	public static void main(String args[]) {
		
		CompanyAEmpRecords companyAEmpRecords = new CompanyAEmpRecords();
		companyAEmpRecords.addEmployee(new Employee("Aniket", "Android Backend", "Male"));
		companyAEmpRecords.addEmployee(new Employee("Shivam", "Android Backend", "Male"));
		companyAEmpRecords.addEmployee(new Employee("Monica", "Android Backend", "Female"));
		CompanyBEmpRecords companyBEmpRecords = new CompanyBEmpRecords();
		companyBEmpRecords.addEmployee(new Employee("Payas", "Android Agent", "Male"));
		companyBEmpRecords.addEmployee(new Employee("Zara", "Android Agent", "Female"));
		companyBEmpRecords.addEmployee(new Employee("Anuj", "Android Agent", "Male"));
		companyBEmpRecords.addEmployee(new Employee("Sudhir", "Android Agent", "Male"));
		new CompanyRecordsPrinter().pringCompanyEMployeeRecords(companyAEmpRecords, companyBEmpRecords);
	}

}
