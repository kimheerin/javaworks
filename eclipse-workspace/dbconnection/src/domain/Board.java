package domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

public class Board implements Serializable {
	
	private static final long serializableID = 1111L; 

	private int bno;
	private String bittle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfileName;
	private Blob bfileData;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBittle() {
		return bittle;
	}
	public void setBittle(String bittle) {
		this.bittle = bittle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getBfileName() {
		return bfileName;
	}
	public void setBfileName(String bfileName) {
		this.bfileName = bfileName;
	}
	public Blob getBfileData() {
		return bfileData;
	}
	public void setBfileData(Blob bfiledData) {
		this.bfileData = bfiledData;
	}
	public static long getSerializableid() {
		return serializableID;
	}
	//DTO 생성
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", bittle=" + bittle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bdate=" + bdate + ", bfileName=" + bfileName + ", bfildData=" + bfileData + "]";
	}
	
	

}//class
