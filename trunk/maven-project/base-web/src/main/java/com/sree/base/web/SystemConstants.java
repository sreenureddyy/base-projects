/*package com.srit.erp.core;

import java.util.ArrayList;
import java.util.List;

import com.srit.erp.core.annotation.DocumentTypeNumbers;

public enum SystemConstants {

	SUPPLIER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Transporter" });
			list.add(new Object[] { Integer.valueOf(2), "Service Provider" });
			list.add(new Object[] { Integer.valueOf(3), "Consultant" });
			list.add(new Object[] { Integer.valueOf(4), "Supplier" });
			list.add(new Object[] { Integer.valueOf(5), "Foreign Supplier" });
			list.add(new Object[] { Integer.valueOf(6), "Distributor" });
			list.add(new Object[] { Integer.valueOf(7), "Contractor" });
			list.add(new Object[] { Integer.valueOf(1), "Transporter" });
			list.add(new Object[] { Integer.valueOf(2), "Importer" });
			list.add(new Object[] { Integer.valueOf(3), "Local" });
			list.add(new Object[] { Integer.valueOf(4), "Others" });
			list.add(new Object[] { Integer.valueOf(5), "Contractor" });
			list.add(new Object[] { Integer.valueOf(6), "Owner" });
			list.add(new Object[] { Integer.valueOf(7), "Travel Agency" });
			list.add(new Object[] { Integer.valueOf(8), "Service Provider" });
			list.add(new Object[] { Integer.valueOf(9), "Security Agency" });
			list.add(new Object[] { Integer.valueOf(10), "Broker" });
			list.add(new Object[] { Integer.valueOf(11), "Consultant" });
			list.add(new Object[] { Integer.valueOf(12), "Architect" });
			list.add(new Object[] { Integer.valueOf(13), "Client" });
			list.add(new Object[] { Integer.valueOf(14), "AMC Contractor" });
			return list;
		}
	},
	CR_DR_COMBO {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 0, "Debit" });
			list.add(new Object[] { 1, "Credit" });
			return list;
		}
	},
	REGISTRATION_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(5050001), "Registered" });
			list.add(new Object[] { Integer.valueOf(5050002),"Not Registered" });
			list.add(new Object[] { Integer.valueOf(5050003),"Under Registered" });
			return list;
		}
	},

	CUSTOMER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Individual", "Individual" });
			list.add(new Object[] { "Corporate", "Corporate" });
			list.add(new Object[] { "Group", "Group" });
			return list;
		}
	},
	Term_Type {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1),"procurementTerms.mode.special" });
			list.add(new Object[] { new Long(2),"procurementTerms.mode.general" });
			list.add(new Object[] { new Long(3),"procurementTerms.mode.penality" });
			list.add(new Object[] { new Long(4),"procurementTerms.mode.Freight" });
			return list;
		}
	},
	PROCUREMENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Imported" });
			list.add(new Object[] { Integer.valueOf(2), "Local" });
			list.add(new Object[] { Integer.valueOf(3), "Manufactured" });
			list.add(new Object[] { Integer.valueOf(4), "Service Request" });
			list.add(new Object[] { Integer.valueOf(5), "Sub Contracted" });
			list.add(new Object[] { Integer.valueOf(6), "VMI" });
			return list;
		}
	},
	FINANCE_ASSESSE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Corporate" });
			list.add(new Object[] { new Long(2), "Non Corporate" });
			return list;
		}
	},
	STOCK_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Capital" });
			list.add(new Object[] { Integer.valueOf(2), "Consumable" });
			list.add(new Object[] { Integer.valueOf(3), "Stock" });
			return list;
		}
	},
	VED_ANALYSIS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Vital" });
			list.add(new Object[] { Integer.valueOf(2), "Essential" });
			list.add(new Object[] { Integer.valueOf(3), "Desirable" });
			return list;
		}
	},
	CYCLE_COUNT_FREQUENCY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Monthly" });
			list.add(new Object[] { Integer.valueOf(2), "Weekly" });
			list.add(new Object[] { Integer.valueOf(3), "Yearly" });
			return list;
		}
	},

	STORE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			
			 * list.add(new Object[] { Integer.valueOf(1), "General" });
			 * list.add(new Object[] { Integer.valueOf(2), "Wip" });
			 * list.add(new Object[] { Integer.valueOf(3), "Reject" });
			 * list.add(new Object[] { Integer.valueOf(4), "Scrap" });
			 * list.add(new Object[] { Integer.valueOf(5), "Destroy" });
			 * list.add(new Object[] { Integer.valueOf(6), "Intransit" });
			 * list.add(new Object[] { Integer.valueOf(7), "Quality" });
			 * list.add(new Object[] { Integer.valueOf(8),
			 * "Fixed Asset Location" }); list.add(new Object[] {
			 * Integer.valueOf(9), "Fixed Asset Destroy" }); list.add(new
			 * Object[] { Integer.valueOf(10), "Finished Goods" });
			 
			list.add(new Object[] { Integer.valueOf(1), "General" });
			list.add(new Object[] { Integer.valueOf(7), "Unit" });
			list.add(new Object[] { Integer.valueOf(2), "Central" });
//			list.add(new Object[] { Integer.valueOf(3), "Other" });
			list.add(new Object[] { Integer.valueOf(6), "In Transit Store" });
			list.add(new Object[] { Integer.valueOf(5), "Consignment Store" });
			list.add(new Object[] { Integer.valueOf(8), "Preserve Store" });
			list.add(new Object[] { Integer.valueOf(9), "OT" });
//			list.add(new Object[] { Integer.valueOf(4), "Destruction Stores" });
			list.add(new Object[] { Integer.valueOf(10), "Miscellaneous" });
			list.add(new Object[] { Integer.valueOf(11), "OP Pharmacy" });
			return list;
		}
	},
	IMPREST_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Imprest-1" });
			list.add(new Object[] { new Long(2), "Other" });
			return list;
		}
	},
	REPORT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Balance Sheet" });
			list.add(new Object[] { new Long(2), "Income and Expence" });
			list.add(new Object[] { new Long(3), "Receipts and payment" });
			return list;
		}
	},
	MAPPING_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "With Account" });
			list.add(new Object[] { new Long(2), "With Out Account" });

			return list;
		}
	},

	CASH_PAYMENT_ACCOUNT_TYPENUM_BILL {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(16), "Payables" });
			return list;
		}
	},

	CASH_PAYMENT_ACCOUNT_TYPENUM_ADVA_REQ {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			return list;
		}
	},

	GENDER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Male" });
			list.add(new Object[] { Integer.valueOf(2), "Female" });
			return list;
		}
	},
	SUFFIX {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Long.valueOf(1), "Ph.D" });
			list.add(new Object[] { Long.valueOf(2), "OBE" });
			list.add(new Object[] { Long.valueOf(3), "Sr" });
			list.add(new Object[] { Long.valueOf(4), "Jr" });
			return list;
		}
	},
	CONTACT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Long.valueOf(4), "PreSales" });
			list.add(new Object[] { Long.valueOf(5), "PostSales" });
			list.add(new Object[] { Long.valueOf(179), "Passed" });
			list.add(new Object[] { Long.valueOf(1), "Billing" });
			list.add(new Object[] { Long.valueOf(2), "Shipping" });
			list.add(new Object[] { Long.valueOf(3), "Primary" });
			list.add(new Object[] { Long.valueOf(6), "Comapny" });
			return list;
		}
	},

	PREFERED_TEL_NUMBER {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Mobile1", "Mobile1" });
			list.add(new Object[] { "Mobile2", "Mobile2" });
			list.add(new Object[] { "Telephone1", "Telephone1" });
			list.add(new Object[] { "Telephone2", "Telephone2" });
			return list;
		}
	},

	PREFIX_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Mr" });
			list.add(new Object[] { Integer.valueOf(2), "Mrs" });
			list.add(new Object[] { Integer.valueOf(3), "Miss" });
			list.add(new Object[] { Integer.valueOf(4), "Dr" });
			return list;
		}
	},

	ApplicableTo {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Purchase" });
			list.add(new Object[] { Integer.valueOf(2), "Sales" });
			return list;
		}
	},

	TAXStructure_ApplicableTo {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1),"taxstructures.Purchase" });
			list.add(new Object[] { Integer.valueOf(2),	"taxstructures.Sales" });
			list.add(new Object[] { Integer.valueOf(3),"taxstructures.fixedasset.sales" });
			list.add(new Object[] { Integer.valueOf(4),"taxstructures.fixedasset.purchase" });
			return list;
		}
	},
	Rule_Type {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			//list.add(new Object[] { new Long(1),"procurementTerms.mode.early" });
			list.add(new Object[] { new Long(1),"procurementTerms.mode.ruleGeneral" });
			list.add(new Object[] { new Long(2),"procurementTerms.mode.late" });
			list.add(new Object[] { new Long(3),"procurementTerms.mode.shelfLife" });
			return list;
		}
	},

	CONTACT_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Client Visit" });
			list.add(new Object[] { new Long(2), "E-Mail" });
			list.add(new Object[] { new Long(3), "Fax" });
			list.add(new Object[] { new Long(4), "Phone" });
			list.add(new Object[] { new Long(5), "Showroom Visit" });
			return list;
		}
	},
	STORE_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Free" });
			list.add(new Object[] { new Long(2), "Occupied" });
			return list;
		}
	},

	Penalty_Appl_On {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1),"procurementTerms.mode.documentValue" });
			list.add(new Object[] { new Long(2),"procurementTerms.mode.itemValue" });
			list.add(new Object[] { new Long(3),"procurementTerms.mode.orderValue" });
			return list;
		}
	},

	COMPONENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Earning", "Earning" });
			list.add(new Object[] { "CTC", "CTC" });
			list.add(new Object[] { "Deduction", "Deduction" });
			return list;
		}
	},

	Payment_Mode {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1),"paymentterm.mode.letterofcredit" });
			list.add(new Object[] { new Integer(2),"paymentterm.mode.paymentafterdelivery" });
			list.add(new Object[] { new Integer(3),"paymentterm.mode.paymentagainstdelivery" });
			list.add(new Object[] { new Integer(4),"paymentterm.mode.paymentagainstdocument" });
			list.add(new Object[] { new Integer(5),"paymentterm.mode.paymentbeforedelivery" });
			return list;
		}
	},

	CHART_PAN_LIST {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Available" });
			list.add(new Object[] { new Long(2), "Not Available" });
			list.add(new Object[] { new Long(3), "Applied For" });
			return list;
		}
	},

	FINANCIAL_YEAR_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Monthly" });
			list.add(new Object[] { new Long(2), "Quarterly" });
			list.add(new Object[] { new Long(3), "Half Yearly" });
			return list;
		}
	},

	BAL_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Dr", "Dr" });
			list.add(new Object[] { "Cr", "Cr" });
			return list;
		}
	},

	BALTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Boolean(true), "Dr" });
			list.add(new Object[] { new Boolean(false), "Cr" });
			return list;
		}
	},

	// Default Acount Type Num

	ACCOUNT_TYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(8204), "Fixed Assets" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(8), "Purchase" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(4), "Sales" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8218), "Stock(Inventory)" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	JOURNAL_VOUCHER_ACCOUNT_TYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},
	
	SALES_VOUCHER_ACCOUNTS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	JOURNAL_VOUCHER_ACCOUNT_TYPENUM_FA {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(8204), "Fixed Assets" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	JOURNAL_VOUCHER_ACCOUNT_TYPENUM_STOCK {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			//list.add(new Object[] { new Long(8204), "Fixed Assets" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8218), "Stock(Inventory)" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	JOURNAL_VOUCHER_ACCOUNT_TYPENUM_BOTH {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(8204), "Fixed Assets" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8218), "Stock(Inventory)" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},
	//  current asset  // OTHER_EXPENDITURE = new Long(8210);
	BANK_PAYMENT_ACCOUNT_TYPENUM_WITHINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });
			return list;
		}
	},
	
	BANK_PAYMENT_ACCOUNT_TYPENUM_WITHOUTINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });
			return list;
		}
	},

	BANK_PAYMENT_ACCOUNT_TYPENUM_BILL {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(16), "Payables" });
			return list;
		}
	},
	BANK_PAYMENT_ACCOUNT_TYPENUM_ADVA_REQ {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			return list;
		}
	},
	
	BANK_PAYMENT_ACCOUNT_TYPENUM_IMPREST_SUBMISSION {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			return list;
		}
	},

	BANK_RECEIPT_ACCOUNT_TYPENUM_WITHOUTINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},
	
	BANK_RECEIPT_ACCOUNT_TYPENUM_WITHINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	CASH_PAYMENT_ACCOUNT_TYPENUM_WITHINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},
	
	CASH_PAYMENT_ACCOUNT_TYPENUM_WITHOUTINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	CASH_RECEIPT_ACCOUNT_TYPENUM_WITHOUTINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			//list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},

	CASH_RECEIPT_ACCOUNT_TYPENUM_WITHINVENTORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(64), "Asset" });
			list.add(new Object[] { new Long(2), "Cash" });
			list.add(new Object[] { new Long(1024), "Control Account" });
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8200), "Current Assets" });
			list.add(new Object[] { new Long(8201), "Current Liabilities" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8203), "Equity" });
			list.add(new Object[] { new Long(256), "Income" });
			list.add(new Object[] { new Long(8194), "INPUT TAX" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(4096), "Inventory" });
			list.add(new Object[] { new Long(8206), "Investments" });
			list.add(new Object[] { new Long(128), "Liability" });
			list.add(new Object[] { new Long(8207), "Long Term Debt" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8209), "Miscellaneous Income" });
			list.add(new Object[] { new Long(8216), "Operating Income" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8211), "Other Income" });
			list.add(new Object[] { new Long(8199), "OUTPUT TAX" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(2048), "Petty Cash" });
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(8212), "Reserves and Surplus" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8214), "Short Term Debt" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });
			list.add(new Object[] { new Long(8197),"Statutory liability- Employees" });
			list.add(new Object[] { new Long(8217), "Stock" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8198), "TDS" });

			return list;
		}
	},
	
	CONTRA_ACCOUNT_TYPENUM_BANK_TRANSFER {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			
			 * list.add(new Object[] { new Long(2), "Cash" }); list.add(new
			 * Object[] { new Long(2048), "Petty Cash" });
			 return list;
		}
	},

	CONTRA_ACCOUNT_TYPENUM_CASH_DEPOSIT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(2), "Cash" });
			
			 * list.add(new Object[] { new Long(2048), "Petty Cash" });
			 return list;
		}
	},

	CONTRA_ACCOUNT_TYPENUM_CASH_TRANSFER {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			
			 * list.add(new Object[] {new Long(1), "Bank" });
			 list.add(new Object[] { new Long(2), "Cash" });
			
			 * list.add(new Object[] { new Long(2048), "Petty Cash" });
			 return list;
		}
	},

	CONTRA_ACCOUNT_TYPENUM_CASH_WITHDRAWAL {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank" });
			list.add(new Object[] { new Long(2), "Cash" });
			
			 * list.add(new Object[] { new Long(2048), "Petty Cash" });
			 return list;
		}
	},

	PURCHASE_VOUCHER_ACCOUNT_TYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Long(8), "Purchase" });
				list.add(new Object[] {new Long(1024),"Control Account"});
				list.add(new Object[] {new Long(8192),"Cost of Sale"});
				list.add(new Object[] {new Long(8200),"Current Assets"});
				list.add(new Object[] {new Long(8201),"Current Liabilities"});
				list.add(new Object[] {new Long(512),"Expense"});
				list.add(new Object[] {new Long(8194),"INPUT TAX"});
				list.add(new Object[] {new Long(8210),"Other Expenditure"});
				list.add(new Object[] {new Long(16),"Payables"});
				list.add(new Object[] {new Long(8198),"TDS"});

			return list;
		}
	},
	
	SALES_VOUCHER_ACCOUNT_TYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Long(32), "Receivables" });
			list.add(new Object[] {new Long(32), "Receivables" });
			list.add(new Object[] {new Long(8200),"Current Assets"});
			list.add(new Object[] {new Long(8201),"Current Liabilities"});
			list.add(new Object[] {new Long(512),"Expense"});
			list.add(new Object[] {new Long(256),"Income"});
			
			list.add(new Object[] {new Long(8211),"Other income"});
			list.add(new Object[] {new Long(8199),"OUTPUT TAX"});
			list.add(new Object[] {new Long(8196),"ST OUTPUT"});
			
			list.add(new Object[] {new Long(8209),"Miscellaneous income"});
			list.add(new Object[] {new Long(8215),"Taxes"});
			list.add(new Object[] {new Long(128),"Liability"});
			return list;
		}
	},
	

	// Account Type Num for Salary Component
	ACCOUNT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(8194), "account.inputTax" });
			list.add(new Object[] { new Long(8199), "account.outputTax" });
			list.add(new Object[] { new Long(8208), "Deduction" }); // Manpower
																	// Cost
			list.add(new Object[] { new Long(8200), "Deduction" }); // Current
																	// Assest
			list.add(new Object[] { new Long(8213), "Deduction" }); // Selling/Admin
																	// Expenses
			list.add(new Object[] { new Long(8201), "Deduction" }); // Current
																	// Liablities
			list.add(new Object[] { new Long(2937), "Deduction" }); // Statutory
																	// Liability
			list.add(new Object[] { new Long(512), "Deduction" }); // Expense
			list.add(new Object[] { new Long(8198), "Deduction" }); // TDS
			list.add(new Object[] { new Long(2937), "CTC" }); // Statutory
																// Liability
			list.add(new Object[] { new Long(8208), "Earning" }); // Manpower
																	// Cost

			return list;
		}
	},
	ADJUSTMENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Stock In" });
			list.add(new Object[] { new Long(2), "Stock Out" });
			return list;
		}
	},
	INSTRUMENT_INFO_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Cheque" });
			list.add(new Object[] { new Long(2), "Demand Draft" });
			list.add(new Object[] { new Long(3), "Bank Note" });
			list.add(new Object[] { new Long(4), "Letter of Credit" });
			list.add(new Object[] { new Long(5), "Others" });
			return list;
		}
	},
	DISBURSMENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(2), "Ad-hoc Advance" });
			list.add(new Object[] { new Long(1), "PO Advance" });
			list.add(new Object[] { new Long(3), "Against Bill" });
			
			 * list.add(new Object[] { new Long(4), "Retention" }); list.add(new
			 * Object[] { new Long(5), "Work Order Advance" }); list.add(new
			 * Object[] { new Long(6), "Fixed Asset PO Advance" });
			 return list;
		}
	},
	
	DISBURSMENT_TYPE_SGPGIMS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(2), "Ad-hoc Advance" });
			//list.add(new Object[] { new Long(1), "PO Advance" });
			list.add(new Object[] { new Long(3), "Against Bill" });
			//list.add(new Object[] { new Long(4), "Work Order Advance" });
			//list.add(new Object[] { new Long(5), "Fixed Asset PO Advance" });
			list.add(new Object[] { new Long(6), "Imprest Advance Requests" });
			list.add(new Object[] { new Long(7), "Imprest Settlement Requests" });
			//list.add(new Object[] { new Long(8), "Employee Advance Payment" });
			//list.add(new Object[] { new Long(9), "Refund of Security/EMD" });
			list.add(new Object[] { new Long(10), "Payment Request" });
			return list;
		}
	},
	
	
	PAYMENTREQUEST_TYPE_SGPGIMS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { DocumentTypeNumbers.PURCHASE_ORDER, "PO Advance" });
			list.add(new Object[] { DocumentTypeNumbers.FIXEDASSET_PURCHASEORDER, "Fixed Asset PO Advance" });
			//list.add(new Object[] { DocumentTypeNumbers.IMPRESHADVREQUEST, "Imprest Advance Requests" });
			//list.add(new Object[] { DocumentTypeNumbers.IMPRESHBILLSUB, "Imprest Settlement Requests" });
			list.add(new Object[] { DocumentTypeNumbers.FA_ASSET_AMCCONTRACT, "AMC" });
			list.add(new Object[] { DocumentTypeNumbers.FA_ASSET_WORKORDER, "Work Order" });			
			return list;
		}
	},
	
	DISBURSMENT_TYPE_WITH_ADV_REQ {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(2), "Ad-hoc Advance" });
			list.add(new Object[] { new Long(1), "PO Advance" });
			list.add(new Object[] { new Long(3), "Against Bill" });
			
			 * list.add(new Object[] { new Long(4), "Retention" }); list.add(new
			 * Object[] { new Long(5), "Work Order Advance" }); list.add(new
			 * Object[] { new Long(6), "Fixed Asset PO Advance" });
			 list
					.add(new Object[] { new Long(7), "Against Advance Request" });
			return list;
		}
	},
	CHEQUE_PRINT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Auto" });
			list.add(new Object[] { new Long(2), "Manual" });
			return list;
		}
	},

	VOUCHER_TYPE {

		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Sales" });
			list.add(new Object[] { new Long(2), "Purchase" });
			list.add(new Object[] { new Long(3), "Journal" });
			list.add(new Object[] { new Long(4), "Contra" });
			list.add(new Object[] { new Long(5), "Debit Note" });

			list.add(new Object[] { new Long(6), "Credit Note" });
			list.add(new Object[] { new Long(7), "Cash Payment" });
			list.add(new Object[] { new Long(8), "Bank Payment" });
			list.add(new Object[] { new Long(9), "Receipts" });
			list.add(new Object[] { new Long(10), "Cash Receipt" });

			list.add(new Object[] { new Long(11), "Bank Receipt" });
			list.add(new Object[] { new Long(12), "Opening Balance" });
			list.add(new Object[] { new Long(13), "Petty Cash Payments" });
			list.add(new Object[] { new Long(14), "Petty Cash Receipts" });
			list.add(new Object[] { new Long(15), "AP Bank Payment" });
			list.add(new Object[] { new Long(16), "AP Bank Receipt" });
			list.add(new Object[] { new Long(17), "AP Cash Payment" });
			list.add(new Object[] { new Long(18), "AP Cash Receipt" });

			list.add(new Object[] { new Long(19), "AP Credit Note" });
			list.add(new Object[] { new Long(20), "AP Debit Note" });
			list.add(new Object[] { new Long(21), "AR Bank Payment" });
			list.add(new Object[] { new Long(22), "AR Bank Receipt" });
			list.add(new Object[] { new Long(23), "AR Cash Payment" });
			list.add(new Object[] { new Long(24), "AR Cash Receipt" });

			list.add(new Object[] { new Long(25), "AR Credit Note" });
			list.add(new Object[] { new Long(26), "AR Debit Note" });
			list.add(new Object[] { new Long(27), "CM Bank Payment" });
			list.add(new Object[] { new Long(28), "CM Bank Receipt" });
			list.add(new Object[] { new Long(29), "CM Cash Payment" });
			list.add(new Object[] { new Long(30), "CM Cash Receipt" });
			list.add(new Object[] { new Long(31), "Journal Voucher" });
			list.add(new Object[] { new Long(32),"Sales Contractual Billing" });
			list.add(new Object[] { new Long(33), "AP BillAccounting" });

			return list;
		}
	},

	CONTRA_TRANS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Bank Transfer including PLA" });
			list.add(new Object[] { new Long(2), "Cash Deposit into bank" });
			list.add(new Object[] { new Long(3), "Cash Transfer" });
			list.add(new Object[] { new Long(4), "Cash Withdrawal from bank" });
			return list;
		}
	},
	RECOVERY_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1),
					"procurement.recoverytype.flat" });
			list.add(new Object[] { new Integer(2),
					"procurement.recoverytype.prorata" });
			return list;
		}
	},
	BILL_ADJUST_ACCTYP_NUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(32), "Receivables" });
			list.add(new Object[] { new Long(16), "Payables" });
			list.add(new Object[] { new Long(8198), "TDS" });
			list.add(new Object[] { new Long(8193), "ST INPUT" });
			list.add(new Object[] { new Long(8196), "ST OUTPUT" });

			return list;
		}
	},
	BUDGET_ALLOC_ACCOUNT_TYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(8192), "Cost of Sale" });
			list.add(new Object[] { new Long(8202), "Depreciation" });
			list.add(new Object[] { new Long(512), "Expense" });
			list.add(new Object[] { new Long(8205), "Interest Expenses" });
			list.add(new Object[] { new Long(8208), "Manpower cost" });
			list.add(new Object[] { new Long(8210), "Other Expenditure" });
			list.add(new Object[] { new Long(8), "Purchase" });
			list.add(new Object[] { new Long(8213), "Selling/Admin Expenses" });
			list.add(new Object[] { new Long(8215), "Taxes" });
			list.add(new Object[] { new Long(8204), "Fixed Assets" });

			
			 * list.add(new Object[] {new Long(64),"Asset"}); list.add(new
			 * Object[] {new Long(1),"Bank"}); list.add(new Object[] {new
			 * Long(2),"Cash"}); list.add(new Object[] {new
			 * Long(1024),"Control Account"}); list.add(new Object[] {new
			 * Long(8192),"Cost of Sale"}); list.add(new Object[] {new
			 * Long(8200),"Current Assets"}); list.add(new Object[] {new
			 * Long(8201),"Current Liabilities"}); list.add(new Object[] {new
			 * Long(8202),"Depreciation"}); list.add(new Object[] {new
			 * Long(512),"Expense"}); list.add(new Object[] {new
			 * Long(8203),"Equity"}); list.add(new Object[] {new
			 * Long(8204),"Fixed Assets"}); list.add(new Object[] {new
			 * Long(256),"Income"}); list.add(new Object[] {new
			 * Long(8205),"Interest Expenses"}); list.add(new Object[] {new
			 * Long(8194),"INPUT TAX"}); list.add(new Object[] {new
			 * Long(4096),"Inventory"}); list.add(new Object[] {new
			 * Long(8206),"Investments"}); list.add(new Object[] {new
			 * Long(128),"Liability"}); list.add(new Object[] {new
			 * Long(8207),"Long Term Debt"}); list.add(new Object[] {new
			 * Long(8208),"Manpower cost"}); list.add(new Object[] {new
			 * Long(8209),"Miscellaneous Income"}); list.add(new Object[] {new
			 * Long(8216),"Operating Income"}); list.add(new Object[] {new
			 * Long(8210),"Other Expenditure"}); list.add(new Object[] {new
			 * Long(8211),"Other Income"}); list.add(new Object[] {new
			 * Long(8199),"OUTPUT TAX"}); list.add(new Object[] {new
			 * Long(16),"Payables"}); list.add(new Object[] {new
			 * Long(2048),"Petty Cash"}); list.add(new Object[] {new
			 * Long(8),"Purchase"}); list.add(new Object[] {new
			 * Long(32),"Receivables"}); list.add(new Object[] {new
			 * Long(8212),"Reserves and Surplus"}); list.add(new Object[] {new
			 * Long(8195),"Retention"}); list.add(new Object[] {new
			 * Long(4),"Sales"}); list.add(new Object[] {new
			 * Long(8213),"Selling/Admin Expenses"}); list.add(new Object[] {new
			 * Long(8214),"Short Term Debt"}); list.add(new Object[] {new
			 * Long(8193),"ST INPUT"}); list.add(new Object[] {new
			 * Long(8196),"ST OUTPUT"}); list.add(new Object[] {new
			 * Long(8197),"Statutory liability- Employees"}); list.add(new
			 * Object[] {new Long(8217),"Stock"}); list.add(new Object[] {new
			 * Long(8218),"Stock(Inventory)"}); list.add(new Object[] {new
			 * Long(8215),"Taxes"}); list.add(new Object[] {new
			 * Long(8198),"TDS"});
			 
			return list;
		}
	},
	PROPERTY_CATEGORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Residential", "Residential" });
			list.add(new Object[] { "Commercial", "Commercial" });
			return list;
		}
	},
	LEASE_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Available", "Available" });
			list.add(new Object[] { "Leased out", "Leased out" });
			list.add(new Object[] { "Yes", "Yes" });
			list.add(new Object[] { "No", "No" });
			list.add(new Object[] { "Blocked", "Blocked" });
			list.add(new Object[] { "Not Available", "Not Available" });
			return list;
		}
	},
	FOLLOW_UP_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Site Visit", "Site Visit" });
			list.add(new Object[] { "Not Interested", "Not Interested" });
			list.add(new Object[] { "Follow Up", "Follow Up" });
			list.add(new Object[] { "Agreement", "Agreement" });
			return list;
		}
	},
	PAYMENT_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Cash", "Cash" });
			list.add(new Object[] { "Cheque", "Cheque" });
			list.add(new Object[] { "DD", "DD" });
			return list;
		}
	},
	LEASERECEIPT_MODEOFPAYMENT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Cash", "Cash" });
			list.add(new Object[] { "Cheque", "Cheque" });
			list.add(new Object[] { "DD", "DD" });
			return list;
		}
	},
	BILLING_FREQUENCY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Fortnightly", "Fortnightly" });
			list.add(new Object[] { "Monthly", "Monthly" });
			list.add(new Object[] { "Quaterly", "Quaterly" });
			list.add(new Object[] { "Half Yearly", "Half Yearly" });
			list.add(new Object[] { "Yearly", "Yearly" });
			return list;
		}
	},
	LEASE_TERM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Days", "Days" });
			list.add(new Object[] { "Months", "Months" });
			list.add(new Object[] { "Years", "Years" });
			return list;
		}
	},
	FLOOR_GROUP {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "Project Wise" });
			list.add(new Object[] { 2, "Block Wise" });
			return list;
		}

	},
	DISCOUNT_GROUP {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "Project Wise" });
			list.add(new Object[] { 2, "Block Wise" });
			list.add(new Object[] { 3, "Floor Wise" });
			list.add(new Object[] { 4, "Unit Wise" });

			return list;
		}

	},
	UNIT_GROUP {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "Project Wise" });
			list.add(new Object[] { 2, "Block Wise" });
			list.add(new Object[] { 3, "Floor Wise" });
			return list;
		}

	},
	STATUTOTY_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Received", "Received" });
			list.add(new Object[] { "Pending", "Pending" });
			list.add(new Object[] { "Not Applicable", "Not Applicable" });
			return list;
		}

	},
	UNIT_LEASE_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Available", "Available" });
			list.add(new Object[] { "Lease out", "Lease out" });
			list.add(new Object[] { "on hold", "on hold" });
			return list;
		}

	},
	UNIT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1 BHK", "1 BHK" });
			list.add(new Object[] { "2 BHK", "2 BHK" });
			list.add(new Object[] { "3 BHK", "3 BHK" });
			list
					.add(new Object[] { "Religious Buliding",
							"Religious Buliding" });
			list.add(new Object[] { "Studio Apartment", "Studio Apartment" });
			return list;
		}

	},
	DEPOSIT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Refundable", "Refundable" });
			list.add(new Object[] { "Non-refundable", "Non-refundable" });
			list.add(new Object[] { "Adjustable", "Adjustable" });
			return list;
		}
	},

	PAYSHEDULE_BILLING_FREQ {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "3 Days", "3 Days" });
			list.add(new Object[] { "7 Days", "7 Days" });
			list.add(new Object[] { "15 Days", "15 Days" });
			list.add(new Object[] { "custom", "custom" });
			return list;
		}

	},
	PAYROLL_HRA_CCA_SLAB {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "HRA", "HRA" });
			list.add(new Object[] { "CCA", "CCA" });
			return list;
		}
	},
	PAYROLL_SALARYITEM_SALARYTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "salaryitem.earning" });
			list.add(new Object[] { 2, "salaryitem.deduction" });
			list.add(new Object[] { 3, "salaryitem.other" });
			return list;
		}
	},
	PAYROLL_SALARYITEM_EXPRESSIONTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list
					.add(new Object[] { "1",
							"salaryitem.expressiontype.handentry" });
			list.add(new Object[] { "2", "salaryitem.expressiontype.formula" });
			list.add(new Object[] { "3", "salaryitem.expressiontype.agent" });
			return list;
		}
	},
	PAYROLL_SALARYITEM_ROUNDOFTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "salaryitem.roundoftype.halfup" });
			list.add(new Object[] { 2, "salaryitem.roundoftype.halfdown" });
			list.add(new Object[] { 3, "salaryitem.roundoftype.noround" });
			return list;
		}
	},
	ENQ_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Direct", "Direct" });
			return list;
		}

	},
	ENQ_FEEDBACK_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Interested", "Interested" });
			list.add(new Object[] { "Not Interested", "Not Interested" });
			list.add(new Object[] { "Will Revert", "Will Revert" });
			return list;
		}

	},
	SITE_VISIT_INTEREST {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Yes", "Yes" });
			list.add(new Object[] { "No", "No" });
			return list;
		}

	},
	MONTHS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "JANUARY" });
			list.add(new Object[] { new Integer(2), "FEBRUARY" });
			list.add(new Object[] { new Integer(3), "MARCH" });
			list.add(new Object[] { new Integer(4), "APRIL" });
			list.add(new Object[] { new Integer(5), "MAY" });
			list.add(new Object[] { new Integer(6), "JUNE" });
			list.add(new Object[] { new Integer(7), "JULY" });
			list.add(new Object[] { new Integer(8), "AUGUST" });
			list.add(new Object[] { new Integer(9), "SEPTEMBER" });
			list.add(new Object[] { new Integer(10), "OCTOBER" });
			list.add(new Object[] { new Integer(11), "NOVEMBER" });
			list.add(new Object[] { new Integer(12), "DECEMBER" });
			return list;
		}
	},

	PURCHASE_INDENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1),
					"purchase.indent.type.general" });
			list.add(new Object[] { new Integer(2),
					"purchase.indent.type.cclass" });
			list.add(new Object[] { new Integer(3),
					"purchase.indent.type.serviced" });
			list.add(new Object[] { new Integer(4),
					"purchase.indent.type.import" });
			list.add(new Object[] { new Integer(5), "purchase.indent.vmi"  });
			return list;
		}
	},
	GEOGRAPHY_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Country", "Country" });
			list.add(new Object[] { "State", "State" });
			list.add(new Object[] { "City", "City" });
			list.add(new Object[] { "Location", "Location" });
			return list;
		}
	},
	PR_REQUEST_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list
					.add(new Object[] { Integer.valueOf(1),
							"Critical Requirement" });
			list.add(new Object[] { Integer.valueOf(2), "Others" });
			return list;
		}
	},
	ISSUE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "OutsideCountry" });
			list.add(new Object[] { Integer.valueOf(2), "OwnQuota" });
			list.add(new Object[] { Integer.valueOf(3), "PatientIssue" });
			list.add(new Object[] { Integer.valueOf(4), "Field Units" });
			list.add(new Object[] { Integer.valueOf(5), "Others" });
			list.add(new Object[] { Integer.valueOf(6), "Special Issue" });
			return list;
		}
	},
	DELIVERY_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Sea" });
			list.add(new Object[] { Integer.valueOf(2), "Air" });
			list.add(new Object[] { Integer.valueOf(3), "Road" });
			return list;
		}
	},
	BANK_ACCOUNT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "Saving Bank" });
			list.add(new Object[] { "2", "Current Account" });
			list.add(new Object[] { "3", "Over Draft" });
			return list;
		}
	},
	PAYROLL_FILE_UPLOAD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Hand Entry" });
			list.add(new Object[] { new Integer(2), "Override" });
			list
					.add(new Object[] { new Integer(3),
							"Reimbursement Declaration" });
			list.add(new Object[] { new Integer(4), "Reimbursements" });
			list.add(new Object[] { new Integer(5), "LOP Details" });
			return list;
		}
	},
	PAYROLL_REIMBURSEMENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1),
					"reimburse.master.type.yearly" });
			list.add(new Object[] { new Integer(2),
					"reimburse.master.type.monthly" });
			return list;
		}
	},
	COMMON_ACTIVE_LIST {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "active.true" });
			list.add(new Object[] { Integer.valueOf(0), "active.false" });
			return list;
		}
	},
	PAYBY_DATE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Normal", "Normal" });
			list.add(new Object[] { "Custom", "Custom" });
			return list;
		}
	},
	TRANSPORTATION_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "Own Transport" });
			list.add(new Object[] { "2", "Hire Transport" });
			return list;
		}
	},
	TRANSPORTMODE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "By Air" });
			list.add(new Object[] { "2", "By Road" });
			list.add(new Object[] { "3", "By Rail" });
			list.add(new Object[] { "4", "By Sea" });
			return list;
		}
	},
	ASSET_ALLOC_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "Hire", "Hire" });
			list.add(new Object[] { "Transfer", "Transfer" });
			return list;
		}
	},
	CALENDAR_WEEK_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(2), "Monday" });
			list.add(new Object[] { new Integer(3), "Tuesday" });
			list.add(new Object[] { new Integer(4), "Wednesday" });
			list.add(new Object[] { new Integer(5), "Thursday" });
			list.add(new Object[] { new Integer(6), "Friday" });
			list.add(new Object[] { new Integer(7), "Saturday" });
			list.add(new Object[] { new Integer(1), "Sunday" });
			return list;
		}
	},
	CALENDAR_DAY_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "1" });
			list.add(new Object[] { new Integer(2), "2" });
			list.add(new Object[] { new Integer(3), "3" });
			list.add(new Object[] { new Integer(4), "4" });
			list.add(new Object[] { new Integer(5), "5" });
			list.add(new Object[] { new Integer(6), "6" });
			list.add(new Object[] { new Integer(7), "7" });
			list.add(new Object[] { new Integer(8), "8" });
			list.add(new Object[] { new Integer(9), "9" });
			list.add(new Object[] { new Integer(10), "10" });
			list.add(new Object[] { new Integer(11), "11" });
			list.add(new Object[] { new Integer(12), "12" });
			list.add(new Object[] { new Integer(13), "13" });
			list.add(new Object[] { new Integer(14), "14" });
			list.add(new Object[] { new Integer(15), "15" });
			list.add(new Object[] { new Integer(16), "16" });
			list.add(new Object[] { new Integer(17), "17" });
			list.add(new Object[] { new Integer(18), "18" });
			list.add(new Object[] { new Integer(19), "19" });
			list.add(new Object[] { new Integer(20), "20" });
			list.add(new Object[] { new Integer(21), "21" });
			list.add(new Object[] { new Integer(22), "22" });
			list.add(new Object[] { new Integer(23), "23" });
			list.add(new Object[] { new Integer(24), "24" });
			list.add(new Object[] { new Integer(25), "25" });
			list.add(new Object[] { new Integer(26), "26" });
			list.add(new Object[] { new Integer(27), "27" });
			list.add(new Object[] { new Integer(28), "28" });
			list.add(new Object[] { new Integer(29), "29" });
			list.add(new Object[] { new Integer(30), "30" });
			list.add(new Object[] { new Integer(31), "31" });
			return list;
		}
	},
	TAX_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Slabwise" });
			list.add(new Object[] { new Integer(2), "SessCharge" });
			return list;
		}
	},
	ASSET_FILE_UPLOAD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Log Sheet" });
			list.add(new Object[] { new Integer(2), "Time Sheet" });
			return list;
		}
	},
	CONTACT_TYPE_ORG_STRUCT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Long.valueOf(3), "Primary" });
			list.add(new Object[] { Long.valueOf(1), "Billing" });
			list.add(new Object[] { Long.valueOf(2), "Shipping" });
			return list;
		}
	},
	SGH_REQUEST_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { Integer.valueOf(1), "Unit" });
			list.add(new Object[] { Integer.valueOf(2), "Miscellaneous" });
			return list;
		}

	},
	EMD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Cash" });
			list.add(new Object[] { new Long(2), "DD" });
			list.add(new Object[] { new Long(3), "Cheque" });
			list.add(new Object[] { new Long(4), "Pay Order" });
			return list;
		}
	},
	NIT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "New" });
			list.add(new Object[] { new Long(2), "Corrigendum" });
			return list;
		}
	},

	RATECONTRACT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Against Tender" });
			list.add(new Object[] { new Long(2), "Other" });
			return list;
		}
	},
	CHKLIST_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Sanction Proposal" });
			list.add(new Object[] { new Long(2), "Document Checklist" });
			list.add(new Object[] { new Long(3), "Technical Evaluation Template" });
			list.add(new Object[] { new Long(4), "Asset Installation" });
			list.add(new Object[] { new Long(5), "Asset Maintenance" });
			return list;
		}
	},
	LEGAL_STATUS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Company" });
			list.add(new Object[] { new Long(2), "Firm" });
			list.add(new Object[] { new Long(3), "Sole Proprietorship" });
			return list;
		}
	},
	VENDOR_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Manufacture" });
			list.add(new Object[] { new Long(2), "Exporter" });
			list.add(new Object[] { new Long(3), "Distributor" });
			return list;
		}
	},
	REG_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Reg-1" });
			list.add(new Object[] { new Long(2), "Reg-2" });
			list.add(new Object[] { new Long(3), "Reg-3" });
			return list;
		}
	},
	MODEOFPUB_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Magazine," });
			list.add(new Object[] { new Long(3), "News Paper" });
			return list;
		}
	},
	INSTRUMENTS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "CASH", "CASH" });
			list.add(new Object[] { "DD", "DD" });
			list.add(new Object[] { "CHEQUE", "CHEQUE" });
			return list;
		}
	},
	BID_SELECTION_CRITERIA {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1,"tender.bid.selection.criteria.lowprice" });
			list.add(new Object[] { 2,"tender.bid.selection.criteria.highquality" });
			list.add(new Object[] { 3,"tender.bid.selection.criteria.lowpricehigquality" });
			return list;
		}
	},
	TENDER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "tender.tendertype.globalopentender" });
			list.add(new Object[] { 2,"tender.tendertype.nationalopentender" });
			list.add(new Object[] { 3, "tender.tendertype.limitedtender" });
			list.add(new Object[] { 4, "tender.tendertype.p3" });
			list.add(new Object[] { 5, "tender.tendertype.localmarket" });
			return list;
		}
	},
	BIDDING_PROCESS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "tender.biddingprocess.singlebid" });
			list.add(new Object[] { 2, "tender.biddingprocess.twobid" });
			return list;
		}
	},
	AWARDING_PROCESS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "tender.awardingprocess.ratecontract" });
			list.add(new Object[] { 2,
					"tender.awardingprocess.sanctionproposal" });
			return list;
		}
	},
	COMMITTEE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "committee.type.prepurchase" });
			list.add(new Object[] { 2, "committee.type.purchase" });
			list.add(new Object[] { 3, "committee.type.techevaluation" });
			list.add(new Object[] { 4, "committee.type.other" });
			return list;
		}
	},
	COMMITTEE_MEMBER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			 list.add(new Object[] {1, "committee.member.type.chairman"}); 
			list.add(new Object[] { 1,"committee.member.type.specialinvitee" });
			list.add(new Object[] { 2, "committee.member.type.secretary" });
			list.add(new Object[] { 3, "committee.member.type.member" });
			return list;
		}
	},
	TENDER_MILESTONES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "tender.milestone.createdate" });
			list.add(new Object[] { 2, "tender.milestone.approvedate" });
			list.add(new Object[] { 3, "tender.milestone.pulishdate" });
			list.add(new Object[] { 4, "tender.milestone.downloadstopdate" });
			list.add(new Object[] { 5, "tender.milestone.bidsubmitlastdate" });
			list.add(new Object[] { 6,"tender.milestone.technicalevaluationdate" });
			list.add(new Object[] { 7,"tender.milestone.priceevaluationdate" });
			list.add(new Object[] { 8, "tender.milestone.awardingdate" });
			return list;
		}
	},
	TEMPLATE_QUESTION_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { "1", "Yes/No" });
			list.add(new Object[] { "2", "String" });
			return list;
		}
	},
	TENDER_MONEY_COLLECTION_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Tender Fee" });
			list.add(new Object[] { new Long(2), "EMD" });
			list.add(new Object[] { new Long(3), "Bank Guarantee" });
			return list;
		}
	},
	TENDER_MONEY_DISPOSAL_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Refund" });
			list.add(new Object[] { new Long(2), "Forfeiture" });
			list.add(new Object[] { new Long(3), "Encash" });
			return list;
		}
	},
	MASTERSHEET_FINALRATING {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { 1, "mastersheet.finalrating.accepted" });
			list.add(new Object[] { 2, "mastersheet.finalrating.rejected" });
			list.add(new Object[] { 3, "mastersheet.finalrating.waiting" });
			return list;
		}
	},
	PROCURMENT_TERMS_APPLICABLE_TO {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Purchase" });
			list.add(new Object[] { new Long(2), "Sales" });
			return list;
		}
	},
	DEPOSIT_ACCOUNTING_DEPOSIT_SOURCE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Others" });
			list.add(new Object[] { new Long(2), "Tendering/Sourcing Module" });
			list.add(new Object[] { new Long(4), "Asset Maintenance Related" });
			list.add(new Object[] { new Long(3), "Asset Warranty Related" });
			return list;
		}
	},
	DEPOSIT_ACCOUNTING_DEPOSIT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Tender Fee" });
			list.add(new Object[] { new Long(2), "EMD" });
			list.add(new Object[] { new Long(3), "Other Security Deposit" });
			return list;
		}
	},
	DEPOSIT_ACCOUNTING_INSTRUMENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "FDR" });
			list.add(new Object[] { new Long(2), "TDR" });
			list.add(new Object[] { new Long(3), "DD" });
			list.add(new Object[] { new Long(3), "Cheque" });
			return list;
		}
	},
	ITEM_DISTRIBUTION_CATEGORY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "item.distribution.unit" });
			list.add(new Object[] { new Long(2), "item.distribution.misc" });
			list.add(new Object[] { new Long(3), "item.distribution.other" });
			return list;
		}
	},
	FIXEDASSET_CONFIG_DEPRECTIATIONTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "faConfig.commissionDate" });
			list.add(new Object[] { new Long(2),"faConfig.firstDayOfCommissionMonth" });
			list.add(new Object[] { new Long(3),"faConfig.firstDayOfCommissionMonthplus1" });
			list.add(new Object[] { new Long(4), "faConfig.midmonthrule" });
			return list;
		}
	},
	ITEMCATEGORY_ROOTTYPENUM {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1),"itemcategory.inventoryType" });
			list.add(new Object[] { new Integer(2),"itemcategory.fixedasset" });
			list.add(new Object[] { new Integer(3),"itemcategory.serviceItem" });
			return list;
		}
	},
	FIXEDASSET_DEPRECIATIONMETHOD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "WDV" });
			return list;
		}
	},
	FIXEDASSET_ASSETACCOUNT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(8204), "FixedAsset Account" });
			return list;
		}
	},
	FIXEDASSET_DEPRECIATIONACCOUNT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(8202),"Depreciation Account" });
			return list;
		}
	},
	FIXEDASSET_ACCUMDEPRECACC {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(8204), "FixedAsset Account" });
			list.add(new Object[] { new Integer(8212), "Reserve And Surplus" });
			return list;
		}
	},
	FIXEDASSET_WIPACC {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(512), "Expense Account" });
			list.add(new Object[] { new Integer(8213), "Selling and Admin" });
			return list;
		}
	},
	FIXEDASSET_PROFITSALESACC {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list
					.add(new Object[] { new Integer(8211),
							"Other Income Account" });
			return list;
		}
	},
	FIXEDASSET_LIFESTATE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Acquired" });
			list.add(new Object[] { new Integer(2), "WIP" });
			list.add(new Object[] { new Integer(3), "Ready For Commissioning" });
			list.add(new Object[] { new Integer(4), "In Use" });
			list.add(new Object[] { new Integer(5), "Leased" });
			list.add(new Object[] { new Integer(6), "Retired" });
			list.add(new Object[] { new Integer(7), "Sold" });
			return list;
		}
	},
	FIXEDASSET_WORKINGSTATE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Working" });
			list.add(new Object[] { new Integer(2), "Not Working" });
			list.add(new Object[] { new Integer(3), "Sent For Repair" });
			list.add(new Object[] { new Integer(4), "Sold" });
			list.add(new Object[] { new Integer(5), "Write Off" });
			list.add(new Object[] { new Integer(6), "Gate Pass" });
			list.add(new Object[] { new Integer(7), "Issued" });
			list.add(new Object[] { new Integer(8), "Received" });
			return list;
		}
	},
	FIXEDASSET_RETIREDTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Sale" });
			list.add(new Object[] { new Integer(2), "Write Off" });
			return list;
		}
	},
	FIXEDASSET_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "In Use" });
			list.add(new Object[] { new Integer(2), "Transfered" });
			return list;
		}
	},
	FIXEDASSET_GATEPASS_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Returnable" });
			list.add(new Object[] { new Integer(2), "Non Returnable" });
			return list;
		}
	},
	LCTRANSACTION_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "LC - Opening" });
			list.add(new Object[] { new Integer(2), "LC - Acceptance" });
			list.add(new Object[] { new Integer(3), "LC - Amendment" });
			list.add(new Object[] { new Integer(4), "LC - Maturity" });
			return list;
		}
	},

	LC_MATURITY_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Partial Disbursement" });
			list.add(new Object[] { new Integer(2), "Full Disbursement" });
			return list;
		}
	},

	RS_REPORT_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Voucher Observations" });
			list.add(new Object[] { new Integer(2),
					"Purchase Order Observations" });
			return list;
		}
	},

	MODE_OF_DELIVERY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "drr.vehicle" });
			list.add(new Object[] { new Integer(2), "drr.person" });
			return list;
		}
	},
	FIXEDASSETWIP_EXPENSEACC {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(512), "Expense" });
			list.add(new Object[] { new Integer(8205), "Interest Expenses" });
			list.add(new Object[] { new Integer(8210), "Other Expenditure" });
			list.add(new Object[] { new Integer(8213),"Selling/Admin Expenses" });
			return list;
		}
	},

	STOCK_REQUEST_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "General" });
			list.add(new Object[] { new Integer(2), "Critical" });
			list.add(new Object[] { new Integer(3), "Others" });
			list.add(new Object[] { new Integer(4), "Sterilization" });
			return list;
		}
	},
	ASSET_PREVENTIVE_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Frequency" });
			list.add(new Object[] { new Integer(2), "Custom" });
			list.add(new Object[] { new Integer(3), "Calendar Day" });
			list.add(new Object[] { new Integer(4), "Calendar Week" });
			list.add(new Object[] { new Integer(5), "Meter Reading" });
			return list;
		}
	},
	ASSET_RENEWAL {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "From Due Date" });
			list.add(new Object[] { new Integer(2),"From Maintenance Complete Date" });
			return list;
		}
	},

	STOCK_ISSUE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Regular" });
			list.add(new Object[] { new Integer(2), "Consignment" });
			return list;
		}
	},
	
	ORG_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "GROUP" });
			list.add(new Object[] { new Integer(3), "BRANCH" });
			list.add(new Object[] { new Integer(2), "COMPANY" });
		    return list;
		}
	},
	
	BUDGET_HEAD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Plan/Capital" });
			list.add(new Object[] { new Integer(2), "Non Plan/Revenue" });
			return list;
		}
	},
  PRIORITY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "ROUTINE" });			
			list.add(new Object[] { new Integer(2), "HIGH" });
			list.add(new Object[] { new Integer(3), "CRITICAL" });
			return list;
		}
	},
	
	BUDGET_CHART_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(0), "BUDGET BOOK" });
			list.add(new Object[] { new Integer(2), "BUDGET TYPES" });
			list.add(new Object[] { new Integer(3), "BUDGET HEAD" });
			return list;
		}
	},
	
	DEFAULT_PRICING_METHOD_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			//list.add(new Object[] { new Integer(1), "Markup" });
			//list.add(new Object[] { new Integer(2), "Fixed Price" });
			//list.add(new Object[] { new Integer(3), "MRP" });
			list.add(new Object[] { new Integer(1), "Weighted Avg. Rate" });
			list.add(new Object[] { new Integer(2), "Rate Contract" });
		    return list;
		}
	},
		ASSET_MAINTENANCE_CRITICAL {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Critical" });
			list.add(new Object[] { new Integer(2), "Major" });
			list.add(new Object[] { new Integer(3), "Minor" });
			return list;
		}
	},
	ASSET_MAINTENANCE_REQTYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Incident Based Maintenance" });
			list.add(new Object[] { new Integer(2), "Preventive Maintenance" });
			list.add(new Object[] { new Integer(3), "AMC Maintenance" });
			return list;
		}
	},
	ASSET_MAINTENANCE_SERVICE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "WorkOrder Vendor" });
			list.add(new Object[] { new Integer(2), "Supplier" });
			list.add(new Object[] { new Integer(3), "Amc Vendor" });
			return list;
		}
	},
	AMC_MAINTENANCE_INDENT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "New AMC" });
			list.add(new Object[] { new Integer(2), "Renewal AMC" });
			return list;
		}
	},
	AMC_MAINTENANCE_AMC_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Comprehensive" });
			list.add(new Object[] { new Integer(2), "Non-Comprehensive" });
			list.add(new Object[] { new Integer(3), "Semi-Comprehensive" });
			list.add(new Object[] { new Integer(4), "Special" });
			return list;
		}
	},
	ASSET_SANCTION_REQSOURCE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "AMC Request" });
			list.add(new Object[] { new Integer(2), "Work Request" });
			return list;
		}
	},
	ASSET_WARRANTY_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Warranty Extension" });
			list.add(new Object[] { new Integer(2), "Warranty Termination" });
			return list;
		}
	},
	ASSET_MAINTENANCE_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Warranty" });
			list.add(new Object[] { new Integer(2), "AMC" });
			list.add(new Object[] { new Integer(3), "NONE" });
			return list;
		}
	},
	ASSET_SCHEDULE_FREQUENCY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Yearly" });
			list.add(new Object[] { new Long(2), "Monthly" });
			list.add(new Object[] { new Long(3), "Fortnightly" });
			list.add(new Object[] { new Long(4), "Weekly" });
			list.add(new Object[] { new Long(5), "Daily" });
			return list;
		}

	},DEPOSIT_ACCOUNTING_DISPOSAL_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "Refund" });
			list.add(new Object[] { new Long(2), "Adjust to Recovery / Forfieture" });
			return list;
		}

	},
	FEATURE_ALERT_TIME {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "alert.before" });
			list.add(new Object[] { new Long(2), "alert.after" });
			return list;
		}
	},
	FEATURE_ALERT_TO {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "alert.username" });
			list.add(new Object[] { new Long(2), "alert.groupname" });
			return list;
		}
	},
	SANCTION_SOURCE_DOCUMENTTYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {200301 ,  "TENDER" });
			list.add(new Object[] {220102 ,  "FIXEDASSET_PURCHASEREQUEST" });
			return list;
		}
	},
	FEATURE_ALERT_DURATION_UNIT {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Long(1), "alert.durationunit.minute" });
			list.add(new Object[] { new Long(2), "alert.durationunit.hour" });
			list.add(new Object[] { new Long(3), "alert.durationunit.day" });
			list.add(new Object[] { new Long(4), "alert.durationunit.number" });
			return list;
		}

	},
	ACCRUAL_TYPE_TIME{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Long(1), "Based On Time Sheet"});
			list.add(new Object[] {new Long(2), "Proportionate By Machine Run Units"});
			list.add(new Object[] {new Long(3), "Proportionate By Utilisation Units"});
			list.add(new Object[] {new Long(4), "Fixed"});
			return list;
			}
	},
	ACCRUAL_TYPE_METER{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Long(1), "Based On Time Sheet"});
			return list;
			}
	},
	INCIDENT_STATUS{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Reported"});
			list.add(new Object[] {new Integer(2), "Assigned"});
			list.add(new Object[] {new Integer(3), "Completed"});
			list.add(new Object[] {new Integer(4), "Cancelled"});
			list.add(new Object[] {new Integer(5), "Closed"});
			return list;
			}
	},
	WORKORDER_TYPE{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Internal"});
			list.add(new Object[] {new Integer(2), "External"});
			return list;
		}
	},
	AMC_PAYMENT_STATUS{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Pending"});
			list.add(new Object[] {new Integer(2), "Requested"});
			list.add(new Object[] {new Integer(3), "Paid"});
			return list;
		}
	},
	PURCHASEREQUEST_PRTYPE{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(2), "P2"});
			list.add(new Object[] {new Integer(3), "P3"});
			return list;
			}
	},
	BUDGETUTILISATTION_PAYMENT_TYPE{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Payment for Purchases"});
			list.add(new Object[] {new Integer(2), "Payment for AMC"});
			list.add(new Object[] {new Integer(3), "Other Payment"});
			return list;
			}
	},
	PURCHASEREQUEST_REQUESTTYPE{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "New"});
			list.add(new Object[] {new Integer(2), "Existing"});
			list.add(new Object[] {new Integer(3), "Upgrade"});
			return list;
			}
	},
	PR_WORKBENCH_CONVERTTO {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "pr.workbench.tenderindent"});
			list.add(new Object[] {new Integer(2), "pr.workbench.rfq"});
			return list;
		}
	},
	DEPREC_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Under Process"});
			list.add(new Object[] {new Integer(2), "Completed"});
			return list;
		}
	},
	PATIENT_CHAREGE_ACC_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Patient Registration Charge Collection"});
			//list.add(new Object[] {new Integer(2), "Patient Admission"});
			//list.add(new Object[] {new Integer(3), "Advance Amount Collection"});
			list.add(new Object[] {new Integer(4), "Advance Amount Collection"});
			list.add(new Object[] {new Integer(5), "Ped Letters"});
			return list;
		}
	},
	STOCK_CONSUMPTION_PROCESS{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Service Contract"});
			list.add(new Object[] {new Integer(2), "Work Order"});
			list.add(new Object[] {new Integer(3), "Amc Contract"});
			return list;
		}
	},
	PATIENT_RECORD_STATUS{
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Available"});
			list.add(new Object[] {new Integer(2), "Issued"});
			list.add(new Object[] {new Integer(3), "Received"});
			list.add(new Object[] {new Integer(4), "Closed"});
			list.add(new Object[] {new Integer(5), "Requested"});
			return list;
		}
	},
	MRD_TRACKING_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "mrd.created"});
			list.add(new Object[] {new Integer(2), "mrd.issued"});
			list.add(new Object[] {new Integer(3), "mrd.received"});
			return list;
		}
	},
	DIET_CLASSIFICATION {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "diet.general"});
			list.add(new Object[] {new Integer(2), "diet.private"});
			list.add(new Object[] {new Integer(3), "diet.medical"});
			list.add(new Object[] {new Integer(4), "diet.extra"});
			return list;
		}
	},
	DIET_ASSESMENT_FREQUENCY {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "dietasses.freq.1times"});
			list.add(new Object[] {new Integer(2), "dietasses.freq.2times"});
			list.add(new Object[] {new Integer(3), "dietasses.freq.3times"});
			return list;
		}
	},
	TRANSFER_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Inter Branch"});
			list.add(new Object[] {new Integer(2), "Intra Branch"});
			return list;
		}
	},
	
	FINANCE_VOUCHER_ENTRY_DATE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "System Date"});
			list.add(new Object[] {new Integer(2), "Document Date"});
			return list;
		}
	},
	SCHEDULAR_TYPES {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(0), "Simple Trigger"});
			list.add(new Object[] {new Integer(1), "Cron Trigger"});
			return list;
		}

	},
	REGISTRATION_SOURCE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(0), "Manula Registration"});
			list.add(new Object[] {new Integer(1), "Online Registation"});
			list.add(new Object[] {new Integer(2), "Telephonic Registation"});
			return list;
		}
	},
	REG_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(0), "Not Applied"});
			list.add(new Object[] {new Integer(1), "Applied"});
			list.add(new Object[] {new Integer(2), "Approved"});
			list.add(new Object[] {new Integer(3), "Rejected"});
			list.add(new Object[] {new Integer(4), "Registred"});
			return list;
		}
	},
	
	VACCINE_STATUS {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Pending" });
			list.add(new Object[] { new Integer(2), "Completed" });
			return list;
		}
	},
	
	VACCINE_BASEDON {
		public List<Object[]> getEnumConstants() {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {new Integer(1), "AD-Hoc"});
		list.add(new Object[] {new Integer(2), "Based on age"});
		list.add(new Object[] {new Integer(3), "Based on others"});
		return list;
		}
		},


		VACCINE_DURATIONTYPE {
		public List<Object[]> getEnumConstants() {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {new Integer(1), "Days"});
		list.add(new Object[] {new Integer(2), "Month"});
		list.add(new Object[] {new Integer(3), "Year"});
		return list;
		}
		},


		PREREGISTER_ADVANCE{
		public List<Object[]> getEnumConstants() {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {new Integer(1), "Hours"});
		list.add(new Object[] {new Integer(2), "Days"});
		//list.add(new Object[] {new Integer(3), "Months"});
		return list;
		}
		},

		VACCINEORDER_TYPE{
		public List<Object[]> getEnumConstants() {
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {new Integer(1), "Vaccine Group"});
		list.add(new Object[] {new Integer(2), "Vaccine"});
		//list.add(new Object[] {new Integer(3), "Months"});
		return list;
		}},
		LEAVE_TYPE{
			public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Casual Leave"});
			list.add(new Object[] {new Integer(2), "Camp Off"});
			list.add(new Object[] {new Integer(3), "Earned Leave"});
			list.add(new Object[] {new Integer(4), "Sick Leave"});
			//list.add(new Object[] {new Integer(3), "Months"});
			return list;
		}},
		LEAVE_SESSION_TYPE{
			public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "MS"});
			list.add(new Object[] {new Integer(2), "AS"});
			//list.add(new Object[] {new Integer(3), "Months"});
			return list;
		}},
		LEAVE_STATUS_TYPE{
			public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] {new Integer(1), "Applied"});
			list.add(new Object[] {new Integer(2), "Cancelled"});
			//list.add(new Object[] {new Integer(3), "Months"});
			return list;
		}},
		LEGAL_AGREEMENT_TYPE{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "New Agreement"});
				list.add(new Object[] {new Integer(2), "Renewal Agreement"});
				//list.add(new Object[] {new Integer(3), "Months"});
				return list;
		}},
		
		BANKENCASH_DISBURSETYPE{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Encashment"});
				list.add(new Object[] {new Integer(2), "Return"});
				return list;

		}},
		ITEMCATEGORY_REQ_STATUS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Not Applied"});
				list.add(new Object[] {new Integer(2), "Applied"});
				list.add(new Object[] {new Integer(3), "Approved"});
				list.add(new Object[] {new Integer(4), "Rejected"});
				return list;
		}},
		
		TASK_SCHEDULE_MODE {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] { new Integer(1), "Frequency" });
				list.add(new Object[] { new Integer(2), "Custom" });
				list.add(new Object[] { new Integer(3), "Calendar Day" });
				list.add(new Object[] { new Integer(4), "Calendar Week" });
				return list;
			}
		},
		
		COMMON_ALERT_TYPES {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "common.alert.drugexpirynotification"});
				return list;
			}
		},
		PURCHASE_ORDER_TYPE {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "po.potype.localservice"});
				list.add(new Object[] {new Integer(2), "po.potype.regular"});
				list.add(new Object[] {new Integer(3), "po.potype.importstock"});
				list.add(new Object[] {new Integer(4), "po.potype.importnonstock"});
				list.add(new Object[] {new Integer(5), "po.potype.consignment"});
				list.add(new Object[] {new Integer(6), "po.potype.againstloi"});
				return list;
			}
		},
		GOODS_RECEIPT_NOTE_TYPE {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "grn.grmtype.general"});
//				list.add(new Object[] {new Integer(2), "grn.grmtype.cashpayment"});
				list.add(new Object[] {new Integer(3), "grn.grntype.consignment"});
				return list;
			}
		},
		SERVICE_LOG_STATUS {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Completed"});
				list.add(new Object[] {new Integer(2), "Pending"});
				list.add(new Object[] {new Integer(3), "Partially Completed"});
				return list;
			}
		},
		LAB_OPERANTS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {String.valueOf("+"), "labequipment.plus"});
				list.add(new Object[] {String.valueOf("-"), "labequipment.minus"});
				list.add(new Object[] {String.valueOf("*"), "labequipment.multiply"});
				list.add(new Object[] {String.valueOf("/"), "labequipment.dividedby"});
				return list;
			}
		},
		SAMPLE_PRESERVE{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Available"});
				list.add(new Object[] {new Integer(2), "Preserved"});
				list.add(new Object[] {new Integer(3), "Discarded"});
				return list;
			}
		},
		VISIT_TYPE{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "New Visit"});
				list.add(new Object[] {new Integer(2), "FollowUp"});
				list.add(new Object[] {new Integer(3), "WalkIn"});
				list.add(new Object[] {new Integer(4), "Referral"});
				return list;
			}
		},
		BILLING_PAYMENT_MODES{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(14), "Cash"});
				list.add(new Object[] {new Integer(15), "Cheque"});
				list.add(new Object[] {new Integer(16), "Credit Card"});
				list.add(new Object[] {new Integer(17), "Ped"});
				return list;
			}
		},
		MOU_DEPOSIT_COL_STATUS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Drafted"});
				list.add(new Object[] {new Integer(2), "Send For Approval"});
				list.add(new Object[] {new Integer(3), "Approved"});
				list.add(new Object[] {new Integer(4), "Cancelled"});
				return list;	
			}
		},
		MOU_AGREEMENT_STATUS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Pending"});
				list.add(new Object[] {new Integer(2), "Pending Approval"});
				list.add(new Object[] {new Integer(3), "Approved"});
				list.add(new Object[] {new Integer(4), "Cancelled"});
				return list;	
			}
		},
		PREFIX_APPLY_TYPE{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "General Prefix"});
				list.add(new Object[] {new Integer(2), "Relation Prefix"});
				return list;
			}
		},
		REGISTER_STATUS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Pending"});
				list.add(new Object[] {new Integer(2), "Blocked"});
				list.add(new Object[] {new Integer(3), "Registration Completed"});
				return list;
			}
		},
		AGE_UNIT {
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Years"});
				list.add(new Object[] {new Integer(2), "Months"});
				list.add(new Object[] {new Integer(3), "Days"});
				return list;
			}
		},
		VisitPatientStatus{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Long(387), "Under IP"});
				list.add(new Object[] {new Integer(3351078), "Under OP"});
				list.add(new Object[] {new Integer(3351077), "Under DayCare"});
				list.add(new Object[] {new Integer(3351076), "Under Emergency"});
				list.add(new Object[] {new Integer(388), "Mark For Discharge"});
				list.add(new Object[] {new Integer(390), "Bill in Progress"});
				list.add(new Object[] {new Integer(389), "Bill Cleared"});
				list.add(new Object[] {new Integer(391), "Discharge"});
				list.add(new Object[] {new Integer(1109), "Waiting For Admission"});
				list.add(new Object[] {new Integer(1122), "Cancelled"});
				return list;
			}
		},
		MRD_FILE_STATUS{
			public List<Object[]> getEnumConstants() {
				List<Object[]> list = new ArrayList<Object[]>();
				list.add(new Object[] {new Integer(1), "Active"});
				list.add(new Object[] {new Integer(2), "Missing"});
				list.add(new Object[] {new Integer(3), "Expired"});
				list.add(new Object[] {new Integer(4), "Discarded"});
				return list;
			}},
		MRD_REQ_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "OPD Consultation" });
			list.add(new Object[] { new Integer(2), "Request For Research" });
			return list;
		}
     },
	REGISTRATION_RELATION {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Son Of" });
			list.add(new Object[] { new Integer(2), "Wife Of" });
			list.add(new Object[] { new Integer(3), "Daughter Of" });
			return list;
		}
	},
	PROJECT_TYPE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Extra mura" });
			list.add(new Object[] { new Integer(2),
					"Intramural" });
			return list;
		}
	},
	SPONSOR_REFUND_MODE {
		public List<Object[]> getEnumConstants() {
			List<Object[]> list = new ArrayList<Object[]>();
			list.add(new Object[] { new Integer(1), "Cash", "Cash" });
			list.add(new Object[] { new Integer(2), "Cheque", "Cheque" });
			list.add(new Object[] { new Integer(3), "DD", "DD" });
			return list;
		}
	};
	
	public abstract List<Object[]> getEnumConstants();
}
*/