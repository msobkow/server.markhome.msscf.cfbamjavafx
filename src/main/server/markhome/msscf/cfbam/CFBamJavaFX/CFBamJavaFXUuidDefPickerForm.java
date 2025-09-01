// Description: Java 11 JavaFX Picker Form implementation for UuidDef.

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
 *	CFBamJavaFXUuidDefPickerForm JavaFX Picker Form implementation
 *	for UuidDef.
 */
public class CFBamJavaFXUuidDefPickerForm
extends CFBorderPane
implements ICFBamJavaFXUuidDefPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamUuidDefObj> javafxDataCollection = null;

	public CFBamJavaFXUuidDefPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamUuidDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen )
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
		javafxPickerPane = argSchema.getUuidDefFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsUuidDef( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamUuidDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUuidDefObj" );
		}
		((ICFBamJavaFXUuidDefPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamUuidDefObj)value );
	}

	public ICFBamUuidDefObj getJavaFXFocusAsUuidDef() {
		return( (ICFBamUuidDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUuidDef( ICFBamUuidDefObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamUuidDefObj> getJavaFXDataCollection() {
		ICFBamJavaFXUuidDefPaneList jplPicker = (ICFBamJavaFXUuidDefPaneList)javafxPickerPane;
		Collection<ICFBamUuidDefObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamUuidDefObj> value ) {
		ICFBamJavaFXUuidDefPaneList jplPicker = (ICFBamJavaFXUuidDefPaneList)javafxPickerPane;
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
			ICFBamJavaFXUuidDefPaneCommon jpanelCommon = (ICFBamJavaFXUuidDefPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamScopeObj getJavaFXContainer() {
		ICFBamJavaFXUuidDefPaneList jplPicker = (ICFBamJavaFXUuidDefPaneList)javafxPickerPane;
		ICFBamScopeObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		ICFBamJavaFXUuidDefPaneList jplPicker = (ICFBamJavaFXUuidDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
