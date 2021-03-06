package base;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author xiaohe
 * 创建于：2015年1月29日
 * 整型输入特征，用于分类
 */
public class InstanceSetI {
	Logger logger = Logger.getLogger(InstanceSetD.class);
	
	List<InstanceI> instances = new ArrayList<InstanceI>();
	
	public InstanceSetI(){}
	
	public InstanceSetI(List<InstanceI> instances)
	{
		this.instances = instances;
	}
	
	public void add(InstanceI instance)
	{
		instances.add(instance);
	}

	public int getSize() {
		return instances.size();
	}

	public int getLength() {
		if(instances.size() > 0)
		{
			return instances.get(0).getLength();
		}
		return 0;
	}	

	public List<InstanceI> getInstances() {
		return instances;
	}

	public void setInstances(List<InstanceI> instances) {
		this.instances = instances;
	}

	
	
	public String toString()
	{
		return instances.toString();
	}
	
	public void clear()
	{		
		instances.clear();
	}
	
	public InstanceI getInstanceD(int index)
	{
		if(index>instances.size()-1)
		{
			logger.error("out of size!");
		}
		
		return instances.get(index);
	}
	
	public int getClassID(int index)
	{
		if(index>instances.size()-1)
		{
			logger.error("out of size!");
		}
		
		return instances.get(index).getType();
	}
	
	public List<Integer> getLabels()
	{
		List<Integer> labels = new ArrayList<Integer>();

		for(InstanceI instance:instances)
		{
			labels.add(instance.getType());	
		}
		
		return labels;
	}

}
