package me.ankit.zooplus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class EnquiryHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	
	@ManyToOne // (mappedBy = "enquiries")
	@JoinColumn(name="user_id")
	private Users user;
	//private List<Users> users_list= new ArrayList<>();
		
	@NotNull
	private String FromCurrency;

	@NotNull
	private String ToCurrency;

	@NotNull
	private float FromAmount;

	@NotNull
	private float ToAmount;

	@NotNull
	private int version;

	@NotNull
	private String QueryDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return FromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		FromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return ToCurrency;
	}

	public void setToCurrency(String toCurrency) {
		ToCurrency = toCurrency;
	}

	public float getFromAmount() {
		return FromAmount;
	}

	public void setFromAmount(float fromAmount) {
		FromAmount = fromAmount;
	}

	public float getToAmount() {
		return ToAmount;
	}

	public void setToAmount(float toAmount) {
		ToAmount = toAmount;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getQueryDate() {
		return QueryDate;
	}

	public void setQueryDate(String queryDate) {
		QueryDate = queryDate;
	}
	
	
	public EnquiryHistory() {}
	

	public EnquiryHistory(/*long id, Users user_id, */@NotNull String fromCurrency, @NotNull String toCurrency,
			@NotNull float fromAmount, @NotNull float toAmount, @NotNull int version, @NotNull String queryDate) {
		super();
		//this.id = id;
		//this.user_id = user_id;
		FromCurrency = fromCurrency;
		ToCurrency = toCurrency;
		FromAmount = fromAmount;
		ToAmount = toAmount;
		this.version = version;
		QueryDate = queryDate;
	}
/*
	@Override
	public String toString() {
		return "EnquiryHistory [id=" + id + ", user=" + user_id + ", FromCurrency=" + FromCurrency + ", ToCurrency="
				+ ToCurrency + ", FromAmount=" + FromAmount + ", ToAmount=" + ToAmount + ", version=" + version
				+ ", QueryDate=" + QueryDate + "]";
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnquiryHistory other = (EnquiryHistory) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
