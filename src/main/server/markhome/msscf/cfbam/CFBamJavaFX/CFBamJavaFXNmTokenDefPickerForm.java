// Description: Java 11 JavaFX Picker Form implementation for NmTokenDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXNmTokenDefPickerForm JavaFX Picker Form implementation
 *	for NmTokenDef.
 */
public class CFBamJavaFXNmTokenDefPickerForm
extends CFBorderPane
implements ICFBamJavaFXNmTokenDefPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamNmTokenDefObj> javafxDataCollection = null;

	public CFBamJavaFXNmTokenDefPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamNmTokenDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNmTokenDefObj> argDataCollection,
		ICFBamJavaFXNmTokenDefChosen whenChosen )
	{
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		if( whenChosen == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				6,
				"whenChosen" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javafxPickerPane = argSchema.getNmTokenDefFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsNmTokenDef( argFocus );
		setJavaFXDataCollection( argDataCollection );
		setJavaFXContainer( argContainer );
		setCenter( javafxPickerPane );
		setPaneMode( CFPane.PaneMode.View );
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public void forceCancelAndClose() {
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
	}

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamNmTokenDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamNmTokenDefObj" );
		}
		((ICFBamJavaFXNmTokenDefPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamNmTokenDefObj)value );
	}

	public ICFBamNmTokenDefObj getJavaFXFocusAsNmTokenDef() {
		return( (ICFBamNmTokenDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsNmTokenDef( ICFBamNmTokenDefObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamNmTokenDefObj> getJavaFXDataCollection() {
		ICFBamJavaFXNmTokenDefPaneList jplPicker = (ICFBamJavaFXNmTokenDefPaneList)javafxPickerPane;
		Collection<ICFBamNmTokenDefObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamNmTokenDefObj> value ) {
		ICFBamJavaFXNmTokenDefPaneList jplPicker = (ICFBamJavaFXNmTokenDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXDataCollection( value );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		if( value != CFPane.PaneMode.View ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				"PickerForms only support PaneMode View" );
		}
		super.setPaneMode( value );
		if( javafxPickerPane != null ) {
			ICFBamJavaFXNmTokenDefPaneCommon jpanelCommon = (ICFBamJavaFXNmTokenDefPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamScopeObj getJavaFXContainer() {
		ICFBamJavaFXNmTokenDefPaneList jplPicker = (ICFBamJavaFXNmTokenDefPaneList)javafxPickerPane;
		ICFBamScopeObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		ICFBamJavaFXNmTokenDefPaneList jplPicker = (ICFBamJavaFXNmTokenDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
