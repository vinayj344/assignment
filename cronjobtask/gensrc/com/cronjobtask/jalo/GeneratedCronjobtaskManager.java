/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 23, 2018 5:50:17 PM                     ---
 * ----------------------------------------------------------------
 */
package com.cronjobtask.jalo;

import com.cronjobtask.constants.CronjobtaskConstants;
import com.cronjobtask.jalo.CountCustomerRegisteredCronjob;
import com.cronjobtask.jalo.TimeCompletionCronjob;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CronjobtaskManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCronjobtaskManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public CountCustomerRegisteredCronjob createCountCustomerRegisteredCronjob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CronjobtaskConstants.TC.COUNTCUSTOMERREGISTEREDCRONJOB );
			return (CountCustomerRegisteredCronjob)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CountCustomerRegisteredCronjob : "+e.getMessage(), 0 );
		}
	}
	
	public CountCustomerRegisteredCronjob createCountCustomerRegisteredCronjob(final Map attributeValues)
	{
		return createCountCustomerRegisteredCronjob( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeCompletionCronjob createTimeCompletionCronjob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CronjobtaskConstants.TC.TIMECOMPLETIONCRONJOB );
			return (TimeCompletionCronjob)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TimeCompletionCronjob : "+e.getMessage(), 0 );
		}
	}
	
	public TimeCompletionCronjob createTimeCompletionCronjob(final Map attributeValues)
	{
		return createTimeCompletionCronjob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CronjobtaskConstants.EXTENSIONNAME;
	}
	
}
