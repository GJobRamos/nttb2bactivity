/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26 de ago de 2022 17:51:58                  ---
 * ----------------------------------------------------------------
 */
package br.com.ntt.b2b.core.jalo;

import br.com.ntt.b2b.core.constants.Nttb2bCoreConstants;
import br.com.ntt.b2b.core.jalo.ApparelProduct;
import br.com.ntt.b2b.core.jalo.ApparelSizeVariantProduct;
import br.com.ntt.b2b.core.jalo.ApparelStyleVariantProduct;
import br.com.ntt.b2b.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Nttb2bCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNttb2bCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cpf", AttributeMode.INITIAL);
		tmp.put("rg", AttributeMode.INITIAL);
		tmp.put("passport", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("riskArea", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("nativeName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Language", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.cpf</code> attribute.
	 * @return the cpf - Customer CPF.
	 */
	public String getCpf(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Nttb2bCoreConstants.Attributes.Customer.CPF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.cpf</code> attribute.
	 * @return the cpf - Customer CPF.
	 */
	public String getCpf(final Customer item)
	{
		return getCpf( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.cpf</code> attribute. 
	 * @param value the cpf - Customer CPF.
	 */
	public void setCpf(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Nttb2bCoreConstants.Attributes.Customer.CPF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.cpf</code> attribute. 
	 * @param value the cpf - Customer CPF.
	 */
	public void setCpf(final Customer item, final String value)
	{
		setCpf( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Nttb2bCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Nttb2bCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Nttb2bCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Nttb2bCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Nttb2bCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.nativeName</code> attribute.
	 * @return the nativeName - Customer nativeName.
	 */
	public String getNativeName(final SessionContext ctx, final Language item)
	{
		return (String)item.getProperty( ctx, Nttb2bCoreConstants.Attributes.Language.NATIVENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.nativeName</code> attribute.
	 * @return the nativeName - Customer nativeName.
	 */
	public String getNativeName(final Language item)
	{
		return getNativeName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.nativeName</code> attribute. 
	 * @param value the nativeName - Customer nativeName.
	 */
	public void setNativeName(final SessionContext ctx, final Language item, final String value)
	{
		item.setProperty(ctx, Nttb2bCoreConstants.Attributes.Language.NATIVENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.nativeName</code> attribute. 
	 * @param value the nativeName - Customer nativeName.
	 */
	public void setNativeName(final Language item, final String value)
	{
		setNativeName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.passport</code> attribute.
	 * @return the passport - Customer Passport.
	 */
	public String getPassport(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Nttb2bCoreConstants.Attributes.Customer.PASSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.passport</code> attribute.
	 * @return the passport - Customer Passport.
	 */
	public String getPassport(final Customer item)
	{
		return getPassport( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.passport</code> attribute. 
	 * @param value the passport - Customer Passport.
	 */
	public void setPassport(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Nttb2bCoreConstants.Attributes.Customer.PASSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.passport</code> attribute. 
	 * @param value the passport - Customer Passport.
	 */
	public void setPassport(final Customer item, final String value)
	{
		setPassport( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.rg</code> attribute.
	 * @return the rg - Customer RG.
	 */
	public String getRg(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Nttb2bCoreConstants.Attributes.Customer.RG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.rg</code> attribute.
	 * @return the rg - Customer RG.
	 */
	public String getRg(final Customer item)
	{
		return getRg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.rg</code> attribute. 
	 * @param value the rg - Customer RG.
	 */
	public void setRg(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Nttb2bCoreConstants.Attributes.Customer.RG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.rg</code> attribute. 
	 * @param value the rg - Customer RG.
	 */
	public void setRg(final Customer item, final String value)
	{
		setRg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.riskArea</code> attribute.
	 * @return the riskArea - Is Risk Area.
	 */
	public Boolean isRiskArea(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, Nttb2bCoreConstants.Attributes.Address.RISKAREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.riskArea</code> attribute.
	 * @return the riskArea - Is Risk Area.
	 */
	public Boolean isRiskArea(final Address item)
	{
		return isRiskArea( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.riskArea</code> attribute. 
	 * @return the riskArea - Is Risk Area.
	 */
	public boolean isRiskAreaAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isRiskArea( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.riskArea</code> attribute. 
	 * @return the riskArea - Is Risk Area.
	 */
	public boolean isRiskAreaAsPrimitive(final Address item)
	{
		return isRiskAreaAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.riskArea</code> attribute. 
	 * @param value the riskArea - Is Risk Area.
	 */
	public void setRiskArea(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, Nttb2bCoreConstants.Attributes.Address.RISKAREA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.riskArea</code> attribute. 
	 * @param value the riskArea - Is Risk Area.
	 */
	public void setRiskArea(final Address item, final Boolean value)
	{
		setRiskArea( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.riskArea</code> attribute. 
	 * @param value the riskArea - Is Risk Area.
	 */
	public void setRiskArea(final SessionContext ctx, final Address item, final boolean value)
	{
		setRiskArea( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.riskArea</code> attribute. 
	 * @param value the riskArea - Is Risk Area.
	 */
	public void setRiskArea(final Address item, final boolean value)
	{
		setRiskArea( getSession().getSessionContext(), item, value );
	}
	
}
