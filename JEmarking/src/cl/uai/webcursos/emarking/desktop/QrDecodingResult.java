/**
 * 
 */
package cl.uai.webcursos.emarking.desktop;

/**
 * @author Jorge Villalón
 *
 */
public class QrDecodingResult {

	private int userid = 0;
	private int courseid = 0;
	private int exampage = 0;
	private String output = null;
	private String filename = null;
	private boolean rotated = false;
	private boolean flipped = false;
	private boolean success = false;
	private String backfilename;
	
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the rotated
	 */
	public boolean isRotated() {
		return rotated;
	}

	/**
	 * @param rotated the rotated to set
	 */
	public void setRotated(boolean rotated) {
		this.rotated = rotated;
	}

	/**
	 * @return the flipped
	 */
	public boolean isFlipped() {
		return flipped;
	}

	/**
	 * @param flipped the flipped to set
	 */
	public void setFlipped(boolean flipped) {
		this.flipped = flipped;
	}

	/**
	 * @return the courseid
	 */
	public int getCourseid() {
		return courseid;
	}
	
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @param courseid the courseid to set
	 */
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	/**
	 * @param exampage the exampage to set
	 */
	public void setExampage(int exampage) {
		this.exampage = exampage;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @return the exampage
	 */
	public int getExampage() {
		return exampage;
	}
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	public String getBackfilename() {
		return backfilename;
	}

	public void setBackfilename(String backfilename) {
		this.backfilename = backfilename;
	}
}
