package CollectionFw;

import java.time.LocalDate;
import java.util.Objects;

public class MobileSetDemo implements Comparable<MobileSetDemo>{
	private String modelName;
	private Integer price;
	private LocalDate mfgDate;
	
	public MobileSetDemo(String modelName, Integer price, LocalDate mfgDate) {

		this.modelName = modelName;
		this.price = price;
		this.mfgDate = mfgDate;
	}

	public String getModelName() {
		return modelName;
	}

	

	@Override
	public int hashCode() {
		return modelName.hashCode();
	}

	public int compareTo(MobileSetDemo m) {
		if(price>m.price) {
			return 1;
		}else if(price<m.price) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileSetDemo other = (MobileSetDemo) obj;
		return Objects.equals(mfgDate, other.mfgDate) && Objects.equals(modelName, other.modelName)
				&& Objects.equals(price, other.price);
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "MobileSetDemo [modelName=" + modelName + ", price=" + price + ", mfgDate=" + mfgDate + "]\n";
	}
	
	
	
	
}
