/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.ntt.b2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.ntt.b2b.fulfilmentprocess.constants.Nttb2bFulfilmentProcessConstants;

public class Nttb2bFulfilmentProcessManager extends GeneratedNttb2bFulfilmentProcessManager
{
	public static final Nttb2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Nttb2bFulfilmentProcessManager) em.getExtension(Nttb2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
