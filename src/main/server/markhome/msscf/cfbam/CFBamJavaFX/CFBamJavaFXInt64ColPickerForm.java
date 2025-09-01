// Description: Java 11 JavaFX Picker Form implementation for Int64Col.

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
 *	CFBamJavaFXInt64ColPickerForm JavaFX Picker Form implementation
 *	for Int64Col.
 */
public class CFBamJavaFXInt64ColPickerForm
extends CFBorderPane
implements ICFBamJavaFXInt64ColPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamInt64ColObj> javafxDataCollection = null;

	public CFBamJavaFXInt64ColPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamInt64ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt64ColObj> argDataCollection,
		ICFBamJavaFXInt64ColChosen whenChosen )
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
		javafxPickerPane = argSchema.getInt64ColFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsInt64Col( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamInt64ColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt64ColObj" );
		}
		((ICFBamJavaFXInt64ColPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamInt64ColObj)value );
	}

	public ICFBamInt64ColObj getJavaFXFocusAsInt64Col() {
		return( (ICFBamInt64ColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsInt64Col( ICFBamInt64ColObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamInt64ColObj> getJavaFXDataCollection() {
		ICFBamJavaFXInt64ColPaneList jplPicker = (ICFBamJavaFXInt64ColPaneList)javafxPickerPane;
		Collection<ICFBamInt64ColObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamInt64ColObj> value ) {
		ICFBamJavaFXInt64ColPaneList jplPicker = (ICFBamJavaFXInt64ColPaneList)javafxPickerPane;
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
			ICFBamJavaFXInt64ColPaneCommon jpanelCommon = (ICFBamJavaFXInt64ColPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamTableObj getJavaFXContainer() {
		ICFBamJavaFXInt64ColPaneList jplPicker = (ICFBamJavaFXInt64ColPaneList)javafxPickerPane;
		ICFBamTableObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
		ICFBamJavaFXInt64ColPaneList jplPicker = (ICFBamJavaFXInt64ColPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
