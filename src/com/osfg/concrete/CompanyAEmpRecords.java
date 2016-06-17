package com.osfg.concrete;

import com.osfg.interfaces.CompanyEmpRecords;
import com.osfg.interfaces.Iterator;
import com.osfg.models.Employee;

/**
 * 
 * @author athakur
 *
 */
public class CompanyAEmpRecords implements CompanyEmpRecords {

	private Employee[] companyEmployees = new Employee[10];
	private int index = -1;
	
	@Override
	public void addEmployee(Employee newEmployee) {
		if(index == 9) {
			throw new RuntimeException("Employees limit reached");
		}
		companyEmployees[++index] = newEmployee;
	}
	
	@Override
	public void removeEmployee(Employee oldEmployee) {
		int i = 0;
		for(;i<=index;i++) {
			if(companyEmployees[i].equals(oldEmployee)) {
				break;
			}
		}
		for(int j=i;j<=index-1;j++) {
			companyEmployees[j] = companyEmployees[j+1];
		}
		companyEmployees[index] = null;
		index --;
		
	}
	@Override
	public int getNoOfEmployees() {
		return index + 1;
	}

	@Override
	public Iterator getIterator() {
		return new CompanyAEmpRecordsIterator();
	}
	
	
	private class CompanyAEmpRecordsIterator implements Iterator {
		
		int currIndex = -1;

		@Override
		public boolean hasNext() {
			if(currIndex+1 <= index)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(currIndex+1 <= index)
				return companyEmployees[++currIndex];
			else
				return null;
		}
		
	}



}
