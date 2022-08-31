/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.ntt.b2b.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.ntt.b2b.core.constants.Nttb2bCoreConstants;
import br.com.ntt.b2b.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class Nttb2bCoreManager extends GeneratedNttb2bCoreManager
{
	public static final Nttb2bCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Nttb2bCoreManager) em.getExtension(Nttb2bCoreConstants.EXTENSIONNAME);
	}
}
