package me.ankit.zooplus.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Reference;

@Entity
public class EnquiryHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	//@Reference
	//@OneToMany
	private long user_id;

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
	private Date QueryDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
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

	public Date getQueryDate() {
		return QueryDate;
	}

	public void setQueryDate(Date queryDate) {
		QueryDate = queryDate;
	}

	@Override
	public String toString() {
		return "EnquiryHistory [id=" + id + ", user_id=" + user_id + ", FromCurrency=" + FromCurrency + ", ToCurrency="
				+ ToCurrency + ", FromAmount=" + FromAmount + ", ToAmount=" + ToAmount + ", version=" + version
				+ ", QueryDate=" + QueryDate + "]";
	}

}
