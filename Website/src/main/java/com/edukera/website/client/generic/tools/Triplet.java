package com.edukera.website.client.generic.tools;

public class Triplet<T1, T2, T3> {

	private T1 mFirst;
	private T2 mSecond;
	private T3 mThird;
	
	public Triplet() {
		mFirst = null;
		mSecond = null;
		mThird = null;
	}
	
	public Triplet(T1 iFirst, T2 iSecond, T3 iThird) {
		mFirst = iFirst;
		mSecond = iSecond;
		mThird = iThird;
	}
	
	public T1 getFirst() {
		return mFirst;
	}
	
	public T2 getSecond() {
		return mSecond;
	}
	
	public T3 getThird() {
		return mThird;
	}
	
	public void setFirst(T1 iFirst) {
		mFirst = iFirst;
	}
	
	public void setSecond(T2 iSecond) {
		mSecond = iSecond;
	}
	
	public void setThird(T3 iThird) {
		mThird = iThird;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		@SuppressWarnings("unchecked")
//		Triplet<T1, T2, T3> lObj = (Triplet<T1, T2, T3>) obj;
//		if (lObj == null) {
//			return false;
//		}
//		if (mFirst == null && lObj.getFirst() != null) {
//			return false;
//		}
//		if (mSecond == null && lObj.getSecond() != null) {
//			return false;
//		}
//		if (mThird == null && lObj.getThird() != null) {
//			return false;
//		}
//		
//		if (mFirst == null && mSecond == null && mThird == null) {
//			return true;
//		}
//		
//		return mFirst.equals(lObj.getFirst()) 
//				&& mSecond.equals(lObj.getSecond()) 
//				&& mThird.equals(lObj.getThird());
//	}
//
//	public int hashCode() {
//		if (mFirst == null && mSecond == null && mThird == null) {
//			return 0;
//		}
//		
//		if (mFirst == null) {
//			return mSecond.hashCode();
//		}
//		if (mSecond == null) {
//			return mFirst.hashCode();
//		}
//		
//		return mFirst.hashCode() + mSecond.hashCode();
//	}
	
	public String toString() {
		return mFirst.toString() + ", " + mSecond.toString() + ", " + mThird.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mFirst == null) ? 0 : mFirst.hashCode());
		result = prime * result + ((mSecond == null) ? 0 : mSecond.hashCode());
		result = prime * result + ((mThird == null) ? 0 : mThird.hashCode());
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
		Triplet<?, ?, ?> other = (Triplet<?, ?, ?>) obj;
		if (mFirst == null) {
			if (other.mFirst != null)
				return false;
		} else if (!mFirst.equals(other.mFirst))
			return false;
		if (mSecond == null) {
			if (other.mSecond != null)
				return false;
		} else if (!mSecond.equals(other.mSecond))
			return false;
		if (mThird == null) {
			if (other.mThird != null)
				return false;
		} else if (!mThird.equals(other.mThird))
			return false;
		return true;
	}
}
