package com.ivan.practice.pattern.creationdesign.abstractfactory.gcp;

import com.ivan.practice.pattern.creationdesign.abstractfactory.Instance;
import com.ivan.practice.pattern.creationdesign.abstractfactory.Instance.Capacity;
import com.ivan.practice.pattern.creationdesign.abstractfactory.ResourceFactory;
import com.ivan.practice.pattern.creationdesign.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
