// Description: Java 11 JavaFX Picker Form implementation for NumberDef.

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
 *	CFBamJavaFXNumberDefPickerForm JavaFX Picker Form implementation
 *	for NumberDef.
 */
public class CFBamJavaFXNumberDefPickerForm
extends CFBorderPane
implements ICFBamJavaFXNumberDefPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamNumberDefObj> javafxDataCollection = null;

	public CFBamJavaFXNumberDefPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamNumberDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNumberDefObj> argDataCollection,
		ICFBamJavaFXNumberDefChosen whenChosen )
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
		javafxPickerPane = argSchema.getNumberDefFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsNumberDef( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamNumberDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamNumberDefObj" );
		}
		((ICFBamJavaFXNumberDefPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamNumberDefObj)value );
	}

	public ICFBamNumberDefObj getJavaFXFocusAsNumberDef() {
		return( (ICFBamNumberDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsNumberDef( ICFBamNumberDefObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamNumberDefObj> getJavaFXDataCollection() {
		ICFBamJavaFXNumberDefPaneList jplPicker = (ICFBamJavaFXNumberDefPaneList)javafxPickerPane;
		Collection<ICFBamNumberDefObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamNumberDefObj> value ) {
		ICFBamJavaFXNumberDefPaneList jplPicker = (ICFBamJavaFXNumberDefPaneList)javafxPickerPane;
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
			ICFBamJavaFXNumberDefPaneCommon jpanelCommon = (ICFBamJavaFXNumberDefPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamScopeObj getJavaFXContainer() {
		ICFBamJavaFXNumberDefPaneList jplPicker = (ICFBamJavaFXNumberDefPaneList)javafxPickerPane;
		ICFBamScopeObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		ICFBamJavaFXNumberDefPaneList jplPicker = (ICFBamJavaFXNumberDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
