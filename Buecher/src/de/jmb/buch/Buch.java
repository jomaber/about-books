package de.jmb.buch;

/**
 * @author Markus
 *
 */
public class Buch {
	private int mAnzSeitenGesamt;
	private int mAnzGescannteSeiten;
	private String mSeiten;
	private String mAutorOderHrsgName;
	private String mAutorOderHrsgVorname;
	private String Verlag;
	private String Jahr;
	private String Titel;
//	private PageImage  image;
//	private PdfFile pdfFile;
//	private TxtFile txtFile;
	
//	Image <--> Pdf
//	Pdf   <--> Txt
//	Image <--> Txt
	

	/**
	 * @param autorOderHrsgName
	 * @param AutorOderHrsgVorname
	 * @param titel
	 */
	public Buch(String autorOderHrsgName, String AutorOderHrsgVorname, String titel) {
		super();
		this.mAutorOderHrsgName = autorOderHrsgName;
		this.mAutorOderHrsgVorname = AutorOderHrsgVorname;
		this.Titel = titel;
		this.mAnzGescannteSeiten = 0;
		this.mAnzSeitenGesamt = 0;
		this.Jahr = "unbekanntes Jahr";
		this.mSeiten = "noch nicht gescannt";
		this.Verlag = "noch nicht genannter Verlag";

	}

	/**
	 * @return
	 */
	public String getVerlag() {
		return Verlag;
	}

	/**
	 * @param verlag
	 */
	public void setVerlag(String verlag) {
		Verlag = verlag;
	}

	/**
	 * @return
	 */
	public String getJahr() {
		return Jahr;
	}

	/**
	 * @param jahr
	 */
	public void setJahr(String jahr) {
		Jahr = jahr;
	}

	public String getTitel() {
		return Titel;
	}

	/**
	 * @param titel
	 */
	public void setTitel(String titel) {
		Titel = titel;
	}

	public int getAnzSeitenGesamt() {
		return mAnzSeitenGesamt;
	}

	/**
	 * @param anzSeitenGesamt
	 */
	public void setAnzSeitenGesamt(int anzSeitenGesamt) {
		this.mAnzSeitenGesamt = anzSeitenGesamt;
	}

	/**
	 * @return
	 */
	public int getAnzGescannteSeiten() {
		return mAnzGescannteSeiten;
	}

	public void setAnzGescannteSeiten(int anzGescannteSeiten) {
		this.mAnzGescannteSeiten = anzGescannteSeiten;
	}

	/**
	 * @return
	 */
	public String getSeiten() {
		return mSeiten;
	}

	/**
	 * @param seiten
	 */
	public void setSeiten(String seiten) {
		mSeiten = seiten;
	}

	/**
	 * @return
	 */
	public String getAutorOderHrsgName() {
		return mAutorOderHrsgName;
	}

	/**
	 * @param autorOderHrsgName
	 */
	public void setAutorOderHrsgName(String autorOderHrsgName) {
		mAutorOderHrsgName = autorOderHrsgName;
	}

	/**
	 * @return
	 */
	public String getAutorOderHrsgVorname() {
		return mAutorOderHrsgVorname;
	}

	/**
	 * @param autorOderHrsgVorname
	 */
	public void setAutorOderHrsgVorname(String autorOderHrsgVorname) {
		mAutorOderHrsgVorname = autorOderHrsgVorname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new String(
					this.mAutorOderHrsgName + ", " 
				+ this.mAutorOderHrsgVorname +  "\n\t" 
				+ this.Titel + "\n\t" 
				+ this.mSeiten);
	}

}
