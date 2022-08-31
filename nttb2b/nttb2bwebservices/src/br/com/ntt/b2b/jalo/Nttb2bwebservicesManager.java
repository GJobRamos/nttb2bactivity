/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.ntt.b2b.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import br.com.ntt.b2b.constants.Nttb2bwebservicesConstants;

public class Nttb2bwebservicesManager extends GeneratedNttb2bwebservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger( Nttb2bwebservicesManager.class.getName() );
	
	public static final Nttb2bwebservicesManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Nttb2bwebservicesManager) em.getExtension(Nttb2bwebservicesConstants.EXTENSIONNAME);
	}
	
}
