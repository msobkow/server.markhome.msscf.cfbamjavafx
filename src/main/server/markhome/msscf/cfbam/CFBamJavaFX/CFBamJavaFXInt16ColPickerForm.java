// Description: Java 11 JavaFX Picker Form implementation for Int16Col.

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
 *	CFBamJavaFXInt16ColPickerForm JavaFX Picker Form implementation
 *	for Int16Col.
 */
public class CFBamJavaFXInt16ColPickerForm
extends CFBorderPane
implements ICFBamJavaFXInt16ColPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamInt16ColObj> javafxDataCollection = null;

	public CFBamJavaFXInt16ColPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamInt16ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt16ColObj> argDataCollection,
		ICFBamJavaFXInt16ColChosen whenChosen )
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
		javafxPickerPane = argSchema.getInt16ColFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsInt16Col( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamInt16ColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt16ColObj" );
		}
		((ICFBamJavaFXInt16ColPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamInt16ColObj)value );
	}

	public ICFBamInt16ColObj getJavaFXFocusAsInt16Col() {
		return( (ICFBamInt16ColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsInt16Col( ICFBamInt16ColObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamInt16ColObj> getJavaFXDataCollection() {
		ICFBamJavaFXInt16ColPaneList jplPicker = (ICFBamJavaFXInt16ColPaneList)javafxPickerPane;
		Collection<ICFBamInt16ColObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamInt16ColObj> value ) {
		ICFBamJavaFXInt16ColPaneList jplPicker = (ICFBamJavaFXInt16ColPaneList)javafxPickerPane;
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
			ICFBamJavaFXInt16ColPaneCommon jpanelCommon = (ICFBamJavaFXInt16ColPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamTableObj getJavaFXContainer() {
		ICFBamJavaFXInt16ColPaneList jplPicker = (ICFBamJavaFXInt16ColPaneList)javafxPickerPane;
		ICFBamTableObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
		ICFBamJavaFXInt16ColPaneList jplPicker = (ICFBamJavaFXInt16ColPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
