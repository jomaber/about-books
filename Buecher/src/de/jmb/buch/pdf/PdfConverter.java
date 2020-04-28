package de.jmb.buch.pdf;


public class PdfConverter {
	static private String [] mPages;
	static private int mCurrentPageNo;
	public PdfConverter(String pPage) {
		super();
		this.mPages[mCurrentPageNo++] = pPage;
	}


	public int getNumberOfPages() {
		// TODO Auto-generated method stub
		return mCurrentPageNo;
	}
	

}
