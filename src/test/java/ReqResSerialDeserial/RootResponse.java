package ReqResSerialDeserial;

import java.util.ArrayList;

public class RootResponse {
	 private float page;
	 private float per_page;
	 private float total;
	 private float total_pages;
	 ArrayList < DataPojo > data = new ArrayList < DataPojo > ();
	 SupportPojo SupportObject;


	 // Getter Methods 

	 public float getPage() {
	  return page;
	 }

	 public float getPer_page() {
	  return per_page;
	 }

	 public float getTotal() {
	  return total;
	 }

	 public float getTotal_pages() {
	  return total_pages;
	 }

	 public ArrayList<DataPojo> getData() {
		return data;
	}

	public void setData(ArrayList<DataPojo> data) {
		this.data = data;
	}

	public SupportPojo getSupport() {
	  return SupportObject;
	 }

	 // Setter Methods 

	 public void setPage(float page) {
	  this.page = page;
	 }

	 public void setPer_page(float per_page) {
	  this.per_page = per_page;
	 }

	 public void setTotal(float total) {
	  this.total = total;
	 }

	 public void setTotal_pages(float total_pages) {
	  this.total_pages = total_pages;
	 }

	 public void setSupport(SupportPojo supportObject) {
	  this.SupportObject = supportObject;
	 }
	
		}


