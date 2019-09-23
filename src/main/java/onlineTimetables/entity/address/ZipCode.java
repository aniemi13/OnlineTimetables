package onlineTimetables.entity.address;

public class ZipCode {
	private int firstElement;
	private int secondElement;

	public ZipCode(int firstElement, int secondElement) {
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}

	public int getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(int firstElement) {
		this.firstElement = firstElement;
	}

	public int getSecondElement() {
		return secondElement;
	}

	public void setSecondElement(int secondElement) {
		this.secondElement = secondElement;
	}

	@Override
	public String toString() {
		return firstElement + "-" + secondElement;
	}

	@Override
	public boolean equals(Object obj) {
		ZipCode zipCode = (ZipCode) obj;
		if (zipCode.getFirstElement() == firstElement && zipCode.getSecondElement() == secondElement)
			return true;
		return false;
	}

}
