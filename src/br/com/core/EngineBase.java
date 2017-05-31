package br.com.core;

public abstract class EngineBase<T,M> {

	protected Class<T> key;
	protected Class<M> recordClass;
	
	public EngineBase(Class<T> key,Class<M> recordClass) {
		this.key=key;
		this.recordClass = recordClass;
		
	}

	public Class<T> getKey() {
		return key;
	}

	public void setKey(Class<T> key) {
		this.key = key;
	}

	public Class<M> getRecordClass() {
		return recordClass;
	}

	public void setRecordClass(Class<M> recordClass) {
		this.recordClass = recordClass;
	}

	

	
}
