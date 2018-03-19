package sigaWeb.filterBean.core;

import sigaMOD.core.AbstractEntity;
import sigaSRV.exception.BusinessException;

public interface Filter<T extends AbstractEntity> {
	
	public void validar() throws BusinessException;
	
}
